package com.youengineering.teamdayspringboot;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface YouEngineerRepository extends CrudRepository<YouEngineer, Integer> {

}
