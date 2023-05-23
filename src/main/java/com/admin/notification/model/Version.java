package com.admin.notification.model;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Version {

    private String id;
    private String versionName;
    private boolean active;
}
