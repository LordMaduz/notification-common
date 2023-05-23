package com.admin.notification.repo;

import com.admin.notification.model.document.User;
import org.springframework.data.couchbase.repository.DynamicProxyable;
import org.springframework.data.couchbase.repository.ReactiveCouchbaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends ReactiveCouchbaseRepository<User, String>, DynamicProxyable<EventRepository> {
}
