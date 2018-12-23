package com.sample.tables.syncer.repos;

import com.sample.tables.syncer.entities.TaskDefinition;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskDefinitionRepository extends CrudRepository<TaskDefinition, Long> {

}
