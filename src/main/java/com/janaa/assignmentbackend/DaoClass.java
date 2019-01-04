package com.janaa.assignmentbackend;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DaoClass {

	private USAIncomeRepository dao;

	public DaoClass(USAIncomeRepository dao) {
		super();
		this.dao = dao;
	}

	@Autowired
	private UsaIncomeDALImpl dal;

	@GetMapping("/getusers/{queryString}")
	public List<USAIncome> getUsers(Pageable pageable, @PathVariable String queryString) {
		return dal.getUsers(queryString, pageable);
	}

}
