package com.admin.notification.repo;

import com.admin.notification.model.document.Payload;
import org.springframework.data.couchbase.repository.DynamicProxyable;
import org.springframework.data.couchbase.repository.ReactiveCouchbaseRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;


@Repository
public interface PayloadRepository extends ReactiveCouchbaseRepository<Payload, String>, DynamicProxyable<EventRepository> {

    Mono<Payload> findByEventIdAndTemplateIdAndVersionId(String eventId, String templateId, String versionId);

    Mono<Payload> deleteByEventId(String templateId);


}
