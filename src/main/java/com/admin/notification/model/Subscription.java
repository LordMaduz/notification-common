package com.admin.notification.model;

import com.admin.notification.model.enums.Channel;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class Subscription {

    private String eventId;
    private List<Channel> channels;
}
