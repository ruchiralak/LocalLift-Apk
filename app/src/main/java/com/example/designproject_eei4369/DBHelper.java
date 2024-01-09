package com.example.designproject_eei4369;


import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

//The code defines a class called DBHelper which extends SQLiteOpenHelper to handle database operations.
public class DBHelper extends SQLiteOpenHelper {

    //The class defines constants for the database name, table name, and column names.
    public static final String DATABASE_NAME = "Locallift.db";
    public static final String TABLE_NAME = "register";

    public static final String COL_1 = "ID";
    public static final String COL_2 = "USERNAME";
    public static final String COL_3 = "EMAIL";
    public static final String COL_4 = "PASSWORD";
    public static final String COL_5 = "CONFIRMPASSWORD";

    //The constructor of the class initializes the database with the specified name and version.
    public DBHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    //The onCreate method is overridden and executed when the database is created for the first time. It creates a table with
    // columns for ID, username, email, password, and confirm password.
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("Create table " + TABLE_NAME + "(ID INTEGER PRIMARY KEY AUTOINCREMENT, "
                + "USERNAME TEXT,EMAIL TEXT,PASSWORD TEXT,CONFIRMPASSWORD TEXT )");
    }

    //The onUpgrade method is overridden and executed when the database needs to be upgraded. It drops the existing table and recreates it.
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }

    //The insertData method inserts a new row of data into the table with the provided username, email, password, and confirm password values.
    public boolean insertData(String userName, String email, String password, String confirmPassword) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_2, userName);
        contentValues.put(COL_3, email);
        contentValues.put(COL_4, password);
        contentValues.put(COL_5, confirmPassword);

        long results = db.insert(TABLE_NAME, null, contentValues);

        if(results == -1)
            return false;
        else
            return true;
    }
   /* public Cursor getAllData(){
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor results = db.rawQuery("select * from " + TABLE_NAME, null);
        return results;
    }*/

    //The updateData method updates an existing row in the table with the provided username, password, and confirm password values.
    public boolean updateData( String userName, String password , String confirmpassword) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COL_2,userName);
        contentValues.put(COL_4,password);
        contentValues.put(COL_5,confirmpassword);
        db.update(TABLE_NAME,contentValues,"USERNAME = ?", new String[] {userName});
        return true;
    }
    /*
    public Integer deleteData(String id){
        SQLiteDatabase db = this.getWritableDatabase();
        return db.delete(TABLE_NAME, "id = ?", new String[] {id});
    }*/

    /*public Cursor getLoginData(String id) {

        SQLiteDatabase db = this.getReadableDatabase();


        Cursor result = db.query(TABLE_NAME, new String[]{"USERNAME", "PASSWORD"}, "USERNAME = ?", new String[]{id}, null, null, null);

        return result;
    }*/

    //The checkusername method checks if a username already exists in the table. It returns true if the username exists, and false otherwise.
    public Boolean checkusername(String username) {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery("select * from register where username=?", new String[]{username});
        if (cursor.getCount() > 0)
            return true;
        else
            return false;

    }

    //The checkusernamepassword method checks if a username and password combination exists in the table.
    // It returns true if the combination exists, and false otherwise.
    public Boolean checkusernamepassword(String username, String password) {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery("select * from register where username=? and password=?" , new String[]{username,password});
        if (cursor.getCount() > 0)
            return true;
        else
            return false;

    }

}

