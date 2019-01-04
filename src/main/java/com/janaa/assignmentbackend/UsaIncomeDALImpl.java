package com.janaa.assignmentbackend;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.BasicQuery;
import org.springframework.stereotype.Component;

@Component
public class UsaIncomeDALImpl implements USAIncomeDAL{

	@Autowired
	private MongoTemplate mongoTemplate;
	
	@Override
	public List<USAIncome> getUsers(String queryString, Pageable pageable) {
		BasicQuery query = new BasicQuery(queryString);
		query.with(pageable);
		return mongoTemplate.find(query, USAIncome.class);
	}

}
