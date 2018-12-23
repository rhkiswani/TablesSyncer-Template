package com.sample.tables.syncer.repos;

import com.sample.tables.syncer.entities.TaskDefinitionMirror;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskDefinitionMirrorRepository extends CrudRepository<TaskDefinitionMirror, Long> {

}
