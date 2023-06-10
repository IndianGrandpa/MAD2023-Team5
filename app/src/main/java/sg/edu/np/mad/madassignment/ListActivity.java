package sg.edu.np.mad.madassignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Random;

public class ListActivity extends AppCompatActivity {
    private String TITLE = "List Activity";
    private String RandomNumber(){
        Random random = new Random();
        int randomValue = random.nextInt(100000);
        return Integer.toString(randomValue);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        dbhandler db = new dbhandler(this, null, null, 1);

        ArrayList<User> dataList;
        dataList = db.getUsers();


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        RecyclerView recyclerView = findViewById(R.id.recycler);
        Adapter userinfo = new Adapter(dataList);

        LinearLayoutManager mLayoutManager = new LinearLayoutManager(ListActivity.this);

        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(userinfo);


    }