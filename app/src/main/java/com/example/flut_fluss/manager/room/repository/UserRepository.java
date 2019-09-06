//package com.example.flut_fluss.manager.room.repository;
//
//import android.app.Application;
//import android.os.AsyncTask;
//
//import androidx.lifecycle.LiveData;
//
//import com.example.flut_fluss.manager.room.dao.UserDao;
//import com.example.flut_fluss.manager.room.database.UserDatabase;
//import com.example.flut_fluss.manager.room.model.User;
//
//
//import java.util.List;
//
//public class UserRepository {
//
//    private UserDao userDao;
//    private LiveData<List<User>> userInfo;
//
//    public UserRepository(Application application) {
//
//        UserDatabase userDatabase = UserDatabase.getInstance(application);
//
//        userDao = userDatabase.userDao();
//        userInfo = userDao.getUserInfo();
//    }
//
//    public void insert(User user) {
//
//        new InsertUserAsyncTask(userDao).execute(user);
//    }
//
//    public LiveData<List<User>> getUserInfo() {
//
//        return userInfo;
//    }
//
//    private static class InsertUserAsyncTask extends AsyncTask<User, Void, Void> {
//
//        private UserDao userDao;
//        private InsertUserAsyncTask(UserDao userDao) {
//
//            this.userDao = userDao;
//        }
//
//        @Override
//        protected Void doInBackground(User... users) {
//
//            userDao.insert(users[0]);
//
//            return null;
//        }
//    }
//}
