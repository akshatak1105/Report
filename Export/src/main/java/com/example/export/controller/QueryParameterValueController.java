package com.example.export.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.QueryParameter;
import com.example.demo.model.QueryParameterValue;

@RestController
@RequestMapping("/parametervalue")
public class QueryParameterValueController {
	@PostMapping("/add")
	public void addParameterValue(@RequestBody QueryParameterValue parameter) {
		String value = parameter.getValue();
		QueryParameter queryParameter = parameter.getQueryParameter();

		// add method call

	}

	@GetMapping("/get")
	public List<ExportFormats> getExportFormat() {

	}

	@DeleteMapping("/delete")
	public void deleteExportFormat(@RequestBody ExportFormats format) {

	}
}
