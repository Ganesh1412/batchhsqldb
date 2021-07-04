package com.sampledb.repository;

import com.sampledb.domain.Data;
import org.springframework.data.repository.CrudRepository;

public interface DataRepository extends CrudRepository<Data, Long> {



}
