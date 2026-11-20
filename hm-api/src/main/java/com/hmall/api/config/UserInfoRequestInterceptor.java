package com.hmall.api.config;

import com.hmall.common.utils.UserContext;
import feign.RequestInterceptor;
import feign.RequestTemplate;

public class UserInfoRequestInterceptor implements RequestInterceptor {

    @Override
    public void apply(RequestTemplate template) {
        Long userId = UserContext.getUser();
        if (userId == null) {
            return;
        }
        template.header("user-info", userId.toString());
    }
}
