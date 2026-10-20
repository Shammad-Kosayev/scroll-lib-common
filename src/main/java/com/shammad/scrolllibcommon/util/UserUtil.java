package com.shammad.scrolllibcommon.util;

import com.shammad.scrolllibcommon.domain.entity.UserEntity;
import org.springframework.stereotype.Component;

@Component
public class UserUtil {

    private final static UserEntity userEntity = new UserEntity(1);

    public static UserEntity getActiveUser() {
        return userEntity;
    }
}
