package com.heinzelman.connector.keys;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


public interface KeyILevRepo extends CrudRepository<KeyILev, Long> {
    Optional<KeyILev> findByName( String name );
}
