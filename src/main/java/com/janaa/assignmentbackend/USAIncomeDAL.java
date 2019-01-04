package com.janaa.assignmentbackend;

import java.util.List;

import org.springframework.data.domain.Pageable;

public interface USAIncomeDAL {

	public List<USAIncome> getUsers(String queryString, Pageable pageable);
}
