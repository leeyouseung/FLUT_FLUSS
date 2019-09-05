package com.example.flut_fluss.manager.sqlite;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.flut_fluss.manager.Token;
import com.example.flut_fluss.model.User;

public class CurrentUser extends SQLiteOpenHelper {

    private Context context;

    public CurrentUser(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);

        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("CREATE TABLE User (token TEXT PRIMARY KEY, userId String, userPassword TEXT, userName String, " +
                "phoneNumber TEXT, bankAccount TEXT, flutAccount TEXT);");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public void insert(User user) {

        SQLiteDatabase db = getWritableDatabase();

        db.execSQL("INSERT INTO User VALUES('" + new Token(context).getToken() + "'  ,  " + user.getId() + "  ,  '" +
                user.getPassword() + "'  ,  '" + user.getName() + "' , '" + user.getPhoneNumber() + "'  ,  '" +
                user.getBankAccount() + "'  ,  '" + user.getFlutAccount() + "');");

        db.close();
    }

    public void delete() {

        SQLiteDatabase db = getWritableDatabase();

        db.execSQL("DELETE FROM User WHERE token='" + new Token(context).getToken() + "';");
        db.close();
    }

    public User getResult() {

        SQLiteDatabase db = getReadableDatabase();

        String userId  = null;
        String userPassword = null;
        String userName = null;
        String phoneNumber = null;
        String bankAccount = null;
        String flutAccount = null;

        User user = new User();

        Cursor cursor = db.rawQuery("SELECT * FROM User WHERE token='" + new Token(context).getToken()+"'", null);

        while (cursor.moveToNext()) {

            userId = cursor.getString(cursor.getColumnIndex("userId"));
            userPassword = cursor.getString(cursor.getColumnIndex("userPassword"));
            userName = cursor.getString(cursor.getColumnIndex("name"));
            phoneNumber = cursor.getString(cursor.getColumnIndex("phoneNumber"));
            bankAccount = cursor.getString(cursor.getColumnIndex("bankAccount"));
            flutAccount = cursor.getString(cursor.getColumnIndex("flutAccount"));

            user = new User(userId, userPassword, userName, phoneNumber, bankAccount, flutAccount);
        }

        return user;
    }
}

