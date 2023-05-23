package com.admin.notification.util;

import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class Util {


    public static String getUUID() {
        return UUID.randomUUID().toString();
    }

    public static String getUniqueID(String text) {
        return text.concat("_").concat(getUUID());
    }
}
