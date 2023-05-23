package com.admin.notification.model.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Channel {
    EMAIL("EMAIL"),
    SMS("SMS"),
    API("API");
    private final String type;



}
