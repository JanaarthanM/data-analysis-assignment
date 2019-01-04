package com.janaa.assignmentbackend;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface USAIncomeRepository extends MongoRepository<USAIncome, Integer>{
	
}
