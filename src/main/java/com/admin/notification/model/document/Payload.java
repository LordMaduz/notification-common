package com.admin.notification.model.document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;
import org.springframework.data.couchbase.core.mapping.id.GeneratedValue;
import org.springframework.data.couchbase.core.mapping.id.GenerationStrategy;
import org.springframework.data.couchbase.repository.Collection;

import static com.admin.notification.contants.Constant.NOTIFICATION_COLLECTION;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document()
@Collection(NOTIFICATION_COLLECTION)
public class Payload {

    @Id
    @GeneratedValue(strategy = GenerationStrategy.UNIQUE)
    private String id;
    private String eventId;
    private String templateId;
    private String versionId;
    private String body;
    private String type;
}
