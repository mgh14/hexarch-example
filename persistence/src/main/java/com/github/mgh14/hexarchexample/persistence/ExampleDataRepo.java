package com.github.mgh14.hexarchexample.persistence;

import com.github.mgh14.hexarchexample.port.Persister;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@SuppressWarnings("unused")
public interface ExampleDataRepo extends Persister, JpaRepository<Object, Object> {}
