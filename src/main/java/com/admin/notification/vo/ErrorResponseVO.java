package com.admin.notification.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@AllArgsConstructor
public class ErrorResponseVO {
    private String message;
    private Integer code;
}
