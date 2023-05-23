package com.admin.notification.model;


import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.util.List;


@Data
@Builder
public class Template implements Serializable {

    private String templateId;
    private String templateName;
    private List<Version> versions;

}
