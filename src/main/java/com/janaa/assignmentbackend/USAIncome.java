package com.janaa.assignmentbackend;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "usa_income")
public class USAIncome {

	@Field(value = "row")
	private Integer rowNumber;
	
	@Id
	@Field(value = "_id")
	private ObjectId _id;

	@Field(value = "capital-loss")
	private Integer capitalLoss;
	@Field(value = "capital-gain")
	private Integer capitalGain;
	private Integer race;
	@Field(value = "native-country")
	private Integer nativeCountry;
	@Field(value = "hours-per-week")
	private Integer hoursPerWeek;
	@Field(value = "Male")
	private Integer isMale;
	@Field(value = "educational-num")
	private Integer yearsOfEducation;
	@Field(value = ">50K")
	private Integer incomeGreaterThan50K;
	private Integer fnlwgt;
	private Integer workclass;
	@Field(value = "marital-status")
	private Integer maritalStatus;
	private Integer age;

	public USAIncome() {

	}

	public USAIncome(Integer rowNumber, ObjectId _id, Integer capitalLoss, Integer capitalGain, Integer race,
			Integer nativeCountry, Integer hoursPerWeek, Integer isMale, Integer yearsOfEducation,
			Integer incomeGreaterThan50K, Integer fnlwgt, Integer workclass, Integer maritalStatus, Integer age) {
		super();
		this.rowNumber = rowNumber;
		this._id = _id;
		this.capitalLoss = capitalLoss;
		this.capitalGain = capitalGain;
		this.race = race;
		this.nativeCountry = nativeCountry;
		this.hoursPerWeek = hoursPerWeek;
		this.isMale = isMale;
		this.yearsOfEducation = yearsOfEducation;
		this.incomeGreaterThan50K = incomeGreaterThan50K;
		this.fnlwgt = fnlwgt;
		this.workclass = workclass;
		this.maritalStatus = maritalStatus;
		this.age = age;
	}

	public Integer getCapitalLoss() {
		return capitalLoss;
	}

	public void setCapitalLoss(Integer capitalLoss) {
		this.capitalLoss = capitalLoss;
	}

	public Integer getCapitalGain() {
		return capitalGain;
	}

	public void setCapitalGain(Integer capitalGain) {
		this.capitalGain = capitalGain;
	}

	public Integer getRace() {
		return race;
	}

	public void setRace(Integer race) {
		this.race = race;
	}

	public Integer getNativeCountry() {
		return nativeCountry;
	}

	public void setNativeCountry(Integer nativeCountry) {
		this.nativeCountry = nativeCountry;
	}

	public Integer getHoursPerWeek() {
		return hoursPerWeek;
	}

	public void setHoursPerWeek(Integer hoursPerWeek) {
		this.hoursPerWeek = hoursPerWeek;
	}

	public Integer getIsMale() {
		return isMale;
	}

	public void setIsMale(Integer isMale) {
		this.isMale = isMale;
	}

	public Integer getYearsOfEducation() {
		return yearsOfEducation;
	}

	public void setYearsOfEducation(Integer yearsOfEducation) {
		this.yearsOfEducation = yearsOfEducation;
	}

	public Integer getIncomeGreaterThan50K() {
		return incomeGreaterThan50K;
	}

	public void setIncomeGreaterThan50K(Integer incomeGreaterThan50K) {
		this.incomeGreaterThan50K = incomeGreaterThan50K;
	}

	public Integer getFnlwgt() {
		return fnlwgt;
	}

	public void setFnlwgt(Integer fnlwgt) {
		this.fnlwgt = fnlwgt;
	}

	public Integer getWorkclass() {
		return workclass;
	}

	public void setWorkclass(Integer workclass) {
		this.workclass = workclass;
	}

	public Integer getRowNumber() {
		return rowNumber;
	}

	public void setRowNumber(Integer rowNumber) {
		this.rowNumber = rowNumber;
	}

	public Integer getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(Integer maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public ObjectId get_id() {
		return _id;
	}

	public void set_id(ObjectId _id) {
		this._id = _id;
	}

}
