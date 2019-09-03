//package com.example.flut_fluss.network.api;
//
//import com.example.flut_fluss.model.User;
//
//import java.util.List;
//
//import io.reactivex.Single;
//import retrofit2.Call;
//import retrofit2.Response;
//import retrofit2.http.GET;
//import retrofit2.http.Header;
//import retrofit2.http.Path;
//
//public interface UserApi {
//
//    @GET("/member/study/{studyIdx}")
//    Single<retrofit2.Response<Response<List<User>>>> getStudyMember(@Header("x-access-token") String token,
//                                                                    @Path("studyIdx") Integer studyIdx);
//
//    @GET("/member/study/{studyIdx}")
//    Call<Response<List<User>>> getStudyMemberTeacher(@Header("x-access-token") String token,
//                                                       @Path("studyIdx") Integer studyIdx);
//}
