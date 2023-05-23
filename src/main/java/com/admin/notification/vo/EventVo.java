package com.admin.notification.vo;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class EventVo {

    private String id;

    private String eventName;
    private List<ChannelMetaDataVo> channelMetaData;
}
