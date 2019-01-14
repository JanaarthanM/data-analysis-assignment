package com.janaa.assignmentbackend;

import static org.mockito.Mockito.when;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;


@RunWith(MockitoJUnitRunner.class)
public class UsaIncomeDalImplTest {

	@Mock
	private MongoTemplate mongoTemplate;
	
	@Mock
	private Query query;
	
	@Mock
	private Pageable pageable;
	
	@InjectMocks
	UsaIncomeDALImpl impl;
	
	@Test
	public void getQuery() {
		when(mongoTemplate.find(query, USAIncome.class)).thenReturn(Arrays.asList(new USAIncome()));
		List<USAIncome> list = impl.getUsers("{isMale:1}", pageable);
		assertNotNull(list);
	}

}
