package com.admin.notification.vo;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class SubscriptionVo {
    private String eventId;
    private List<String> channels;
}
