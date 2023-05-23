package com.admin.notification.model.document;

import com.admin.notification.model.Subscription;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;
import org.springframework.data.couchbase.core.mapping.id.GeneratedValue;
import org.springframework.data.couchbase.core.mapping.id.GenerationStrategy;
import org.springframework.data.couchbase.repository.Collection;

import java.util.List;

import static com.admin.notification.contants.Constant.NOTIFICATION_COLLECTION;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document
@Collection(NOTIFICATION_COLLECTION)
public class User {

    @Id
    @GeneratedValue(strategy = GenerationStrategy.UNIQUE)
    private String id;

    private String name;

    private List<Subscription> subscriptions;
}
