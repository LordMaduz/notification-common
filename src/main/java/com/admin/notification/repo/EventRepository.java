package com.admin.notification.repo;

import com.admin.notification.model.document.Event;
import org.springframework.data.couchbase.repository.DynamicProxyable;
import org.springframework.data.couchbase.repository.ReactiveCouchbaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends ReactiveCouchbaseRepository<Event, String>, DynamicProxyable<EventRepository> {

}
