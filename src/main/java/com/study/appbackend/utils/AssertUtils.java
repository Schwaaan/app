package com.study.appbackend.utils;

import com.study.appbackend.config.exceptions.ObjectNotFoundException;

import java.util.Optional;

public abstract class AssertUtils {

    public static <T> T found(Optional<T> object, String message) {
        if (object.isPresent()) {
            return object.get();
        }
        throw new ObjectNotFoundException(message);
    }

}
