package com.codeko.moments.data.network;

import com.codeko.moments.data.network.model.BlogResponse;
import com.codeko.moments.data.network.model.LoginRequest;
import com.codeko.moments.data.network.model.LoginResponse;
import com.codeko.moments.data.network.model.LogoutResponse;
import com.codeko.moments.data.network.model.OpenSourceResponse;

import io.reactivex.Observable;

/**
 * Created by nvcuong on 10/5/17.
 */

public interface ApiHelper {

    ApiHeader getApiHeader();

    Observable<LoginResponse> doGoogleLoginApiCall(LoginRequest.GoogleLoginRequest request);

    Observable<LoginResponse> doFacebookLoginApiCall(LoginRequest.FacebookLoginRequest request);

    Observable<LoginResponse> doServerLoginApiCall(LoginRequest.ServerLoginRequest request);

    Observable<LogoutResponse> doLogoutApiCall();

    Observable<BlogResponse> getBlogApiCall();

    Observable<OpenSourceResponse> getOpenSourceApiCall();
}
