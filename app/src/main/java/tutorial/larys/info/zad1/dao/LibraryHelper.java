package tutorial.larys.info.zad1.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by piotr on 27.04.16.
 */
public class LibraryHelper extends SQLiteOpenHelper {

    private static LibraryHelper instance;

    private static final String DATABASE_NAME = "library";
    private static final int VERSION = 1;


    public static LibraryHelper getInstance(Context context) {
        if (instance == null)
            instance = new LibraryHelper(context, DATABASE_NAME, null, VERSION);

        return instance;
    }

    private LibraryHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        Log.d("database", "onCreate start");
        recreateDB(db);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    private void recreateDB(SQLiteDatabase db) {
        db.execSQL("drop table if exists user");
        db.execSQL("create table user (id integer primary key autoincrement not null, name TEXT, surname TEXT");

    }


}
