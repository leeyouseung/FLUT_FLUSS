package com.example.flut_fluss.model.database;

import android.content.Context;
import android.os.AsyncTask;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;

import com.example.flut_fluss.model.dao.UserDao;
import com.example.flut_fluss.model.User;

@Database(entities = {User.class}, version = 1)
public abstract class UserDatabase extends androidx.room.RoomDatabase {

    private static UserDatabase sInstance;

    public abstract UserDao userDao();

    public static synchronized UserDatabase getInstance(Context context) {

        if(sInstance == null) {

            sInstance = Room.databaseBuilder(context.getApplicationContext(), UserDatabase.class, "user_database")
                    .fallbackToDestructiveMigration()
                    .addCallback(userCallback)
                    .build();
        }

        return sInstance;
    }

    private static UserDatabase.Callback userCallback = new RoomDatabase.Callback() {
        @Override
        public void onCreate(@NonNull SupportSQLiteDatabase db) {
            super.onCreate(db);

            new PopulateDbAsyncTask(sInstance).execute();
        }
    };

    private static class PopulateDbAsyncTask extends AsyncTask<Void, Void, Void> {

        private UserDao userDao;

        private PopulateDbAsyncTask(UserDatabase db) {

            userDao = db.userDao();
        }

        @Override
        protected Void doInBackground(Void... voids) {

            userDao.insert(new User("abcd", "1234", "이유승",
                    "123-1234-123124-123", "123-1234-1234-12", "010-1234-1234"));

            return null;
        }
    }
}