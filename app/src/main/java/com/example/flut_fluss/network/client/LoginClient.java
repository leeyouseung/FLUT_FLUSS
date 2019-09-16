package com.example.flut_fluss.network.client;

import com.example.flut_fluss.base.BaseClient;
import com.example.flut_fluss.model.Login;
import com.example.flut_fluss.network.api.LoginApi;
import com.example.flut_fluss.network.request.LoginRequest;

import org.json.JSONObject;

import java.util.Objects;

import io.reactivex.Single;

public class LoginClient extends BaseClient<LoginApi> {

    @Override
    protected Class api() {

        return LoginApi.class;
    }

    public Single<Login> login(LoginRequest loginRequest) {

        return api.login(loginRequest).map(response -> {

            if (!response.isSuccessful()) {

                JSONObject errorBody = new JSONObject(Objects
                        .requireNonNull(
                                response.errorBody()).string());

                throw new Exception(errorBody.getString("message"));
            }

            if (response.body().getStatus() == 200) {

                Login login = new Login(response.body().getData().getToken(), response.body().getData().getUser());

                return login;
            }
            else if (response.body().getStatus() == 400) {

                throw new Exception("로그인 오류");
            }
            else {

                throw new Exception(response.body().getMessage());
            }
        });
    }
}
