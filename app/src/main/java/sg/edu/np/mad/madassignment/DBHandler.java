package sg.edu.np.mad.madassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;

public class DBHandler extends SQLiteOpenHelper {
    private String TITLE = "DB Handler";
    @Override
    protected void onCreate(SQLiteDatabase db) {
    }
}