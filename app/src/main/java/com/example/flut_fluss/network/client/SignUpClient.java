package com.example.flut_fluss.network.client;

import com.example.flut_fluss.base.BaseClient;
import com.example.flut_fluss.network.api.SignUpApi;
import com.example.flut_fluss.network.request.SignUpRequest;

import org.json.JSONObject;

import java.util.Objects;

import io.reactivex.Single;

public class SignUpClient extends BaseClient<SignUpApi> {

    @Override
    protected Class api() {

        return SignUpApi.class;
    }

    public Single<String> signup(SignUpRequest signUpRequest) {

        return api.signup(signUpRequest).map(response -> {

            if (!response.isSuccessful()) {
                JSONObject errorBody = new JSONObject(Objects
                        .requireNonNull(
                                response.errorBody()).string());

                throw new Exception(errorBody.getString("message"));
            }

            if (response.body().getStatus() == 200) {

                return response.body().getMessage();
            }
            else if (response.body().getStatus() == 401) {

                throw new Exception("아이디가 중복되었습니다.");
            }
            else {

                throw new Exception(response.body().getMessage());
            }

        });
    }
}
