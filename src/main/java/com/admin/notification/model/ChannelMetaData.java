package com.admin.notification.model;

import com.admin.notification.model.enums.Channel;
import lombok.Builder;
import lombok.Data;

import java.util.Map;

@Builder
@Data
public class ChannelMetaData {


    private String channelId;
    private Channel channelType;
    private Map<String,Object> configuration;
    private Template template;

}
