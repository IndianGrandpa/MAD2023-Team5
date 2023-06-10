package sg.edu.np.mad.madassignment;

import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ViewHolder extends RecyclerView.ViewHolder {
    private String TITLE = "View Holder";
    TextView name;
    TextView description;
    ImageView profilepicture;

    public ViewHolder(View v) {
        super(v);
        profilepicture = v.findViewById(R.id.profilepic);
        name = itemView.findViewById(R.id.Title);
        description = itemView.findViewById(R.id.Description);
    }
}
}