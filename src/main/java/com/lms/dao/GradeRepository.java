package com.lms.dao;

import com.lms.model.Grade;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface GradeRepository extends MongoRepository<Grade, String>, GradeRepositoryExtended {
}
