package com.example.export.model;

import java.util.ArrayList;
import java.util.List;

public class QueryParameter {
	
	private List<QueryParameterValue> parameterValues=new ArrayList<>();
	private DatabaseQuery databaseQuery;
	private int name;
	private int queryParamSequenceNumber;
	private String dataType;
	private String defaultValue;
	private boolean isNullable;
	private long minValue;
	private long maxValue;
	private long maxLength;
	private String parameterRegex;
	public List<QueryParameterValue> getParameterValues() {
		return parameterValues;
	}
	public void setParameterValues(List<QueryParameterValue> parameterValues) {
		this.parameterValues = parameterValues;
	}
	public DatabaseQuery getDatabaseQuery() {
		return databaseQuery;
	}
	public void setDatabaseQuery(DatabaseQuery databaseQuery) {
		this.databaseQuery = databaseQuery;
	}
	public int getName() {
		return name;
	}
	public void setName(int name) {
		this.name = name;
	}
	public int getQueryParamSequenceNumber() {
		return queryParamSequenceNumber;
	}
	public void setQueryParamSequenceNumber(int queryParamSequenceNumber) {
		this.queryParamSequenceNumber = queryParamSequenceNumber;
	}
	public String getDataType() {
		return dataType;
	}
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}
	public String getDefaultValue() {
		return defaultValue;
	}
	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}
	public boolean isNullable() {
		return isNullable;
	}
	public void setNullable(boolean isNullable) {
		this.isNullable = isNullable;
	}
	public long getMinValue() {
		return minValue;
	}
	public void setMinValue(long minValue) {
		this.minValue = minValue;
	}
	public long getMaxValue() {
		return maxValue;
	}
	public void setMaxValue(long maxValue) {
		this.maxValue = maxValue;
	}
	public long getMaxLength() {
		return maxLength;
	}
	public void setMaxLength(long maxLength) {
		this.maxLength = maxLength;
	}
	public String getParameterRegex() {
		return parameterRegex;
	}
	public void setParameterRegex(String parameterRegex) {
		this.parameterRegex = parameterRegex;
	}
	
	

}
