package com.healthcare.payments.repository;

import com.healthcare.payments.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
