package com.admin.notification.vo;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TemplateVO {

    private String payload;
    private String templateName;
    private String templateId;
    private String version;
    private String versionId;

    private String payloadType;

}
