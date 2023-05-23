package com.admin.notification.vo;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@NoArgsConstructor
public class ChannelMetaDataVo {

    private String channelId;
    private String channelType;
    private Map<String,Object> configuration;
}
