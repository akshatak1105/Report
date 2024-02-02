package com.example.export.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.DatabaseQuery;
import com.example.demo.model.DatabaseSource;
import com.example.demo.model.QueryParameter;
import com.example.demo.model.QueryParameterValue;

@RestController
@RequestMapping("/database")
public class QueryParameterController {
	
	@PostMapping("/addquerypara")
	public void addQueryParameters(@RequestBody QueryParameter parameter) {
		 List<QueryParameterValue> parameterValues=new ArrayList<>();
		 DatabaseQuery databaseQuery;
		 int name;
		 int queryParamSequenceNumber;
		 String dataType;
		 String defaultValue;
		 boolean isNullable;
		 long minValue;
		 long maxValue;
		 long maxLength;
		 String parameterRegex;
		 
		 parameterValues = parameter.getParameterValues();
		 databaseQuery = parameter.getDatabaseQuery();
		 name = parameter.getName();
		 queryParamSequenceNumber = parameter.getQueryParamSequenceNumber();
		 dataType = parameter.getDataType();
		 defaultValue = parameter.getDefaultValue();
		 isNullable = parameter.isNullable();
		 minValue = parameter.getMinValue();
		 maxValue = parameter.getMaxValue();
		 maxLength = parameter.getMaxLength();
		 parameterRegex = parameter.getParameterRegex();
		 
	}
	
	@GetMapping("/getquerypara")
	public List<QueryParameter> getQueryParameters(){
		
	}

}
