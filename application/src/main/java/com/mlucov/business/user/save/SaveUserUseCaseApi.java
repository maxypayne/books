package com.mlucov.business.user.save;

import com.mlucov.business.user.models.SaveUserInput;

public interface SaveUserUseCaseApi {
    public Long createUser(SaveUserInput input);
}
