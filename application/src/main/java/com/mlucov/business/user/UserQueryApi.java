package com.mlucov.business.user;

import com.mlucov.business.user.models.UserDetailsOutput;

public interface UserQueryApi {
    UserDetailsOutput getUserDetailsByEmail(String email);
    UserDetailsOutput getUserDetailsById(Long id);
}
