package com.example.flut_fluss.model.database;

import android.content.Context;
import android.os.AsyncTask;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;

//import com.example.flut_fluss.model.dao.UserDao;
import com.example.flut_fluss.model.User;

@Database(entities = {User.class}, version = 1)
public abstract class UserDatabase extends androidx.room.RoomDatabase {

    private static UserDatabase sInstance;

//    public abstract UserDao userDao();

    public static synchronized UserDatabase getInstance(Context context) {

        if(sInstance == null) {

            sInstance = Room.databaseBuilder(context.getApplicationContext(), UserDatabase.class, "user_database")
                    .fallbackToDestructiveMigration()
                    .addCallback(roomCallback)
                    .build();
        }

        return sInstance;
    }

    private static RoomDatabase.Callback roomCallback = new RoomDatabase.Callback() {
        @Override
        public void onCreate(@NonNull SupportSQLiteDatabase db) {
            super.onCreate(db);

            new PopulateDbAsyncTask(sInstance).execute();
        }
    };

    private static class PopulateDbAsyncTask extends AsyncTask<Void, Void, Void> {

//        private UserDao userDao;

        private PopulateDbAsyncTask(UserDatabase db) {

//            userDao = db.userDao();
        }

        @Override
        protected Void doInBackground(Void... voids) {

            // 내부 디비 값 가져오기

            return null;
        }
    }
}