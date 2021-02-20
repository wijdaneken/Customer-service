package org.sid.customerservice.repository;

import org.sid.customerservice.entities.customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface customerRepository extends JpaRepository<customer,Long> {
}
