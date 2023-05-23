package com.admin.notification.util;

import com.google.gson.Gson;
import org.apache.commons.text.StringEscapeUtils;
import org.springframework.stereotype.Component;

@Component
public class JSONUtil<T> {

    private static final Gson gson = new Gson();
    private String formatJson(String json) {
        String cleanJson = json.replaceAll("^\"|\"$", "");
        return StringEscapeUtils.unescapeJava(cleanJson);
    }

    public T convertTo(String json, Class<T> type) {
        return gson.fromJson(formatJson(json), type);
    }
}
