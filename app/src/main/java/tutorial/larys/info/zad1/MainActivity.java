package tutorial.larys.info.zad1;

import android.app.Activity;
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

import tutorial.larys.info.zad1.dao.LibraryHelper;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LibraryHelper dataLibraryHelper = LibraryHelper.getInstance(getApplicationContext());
        SQLiteDatabase db = dataLibraryHelper.getWritableDatabase();
        ContentValues values = new ContentValues();
    }
}
