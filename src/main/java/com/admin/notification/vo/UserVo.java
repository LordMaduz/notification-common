package com.admin.notification.vo;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserVo {

    private String  id;
    private String name;
    private SubscriptionVo subscription;

}
