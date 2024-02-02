package com.example.export.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.export.model.Connection;
import com.example.export.model.DatabaseQuery;

@RestController
@RequestMapping("/dbquery")
public class DatabaseQueryController {

	@PostMapping("/add")
	public void addSource(@RequestBody DatabaseQuery dbquery) {

		Connection connection = dbquery.getConnection();
		String name = dbquery.getName();
		String queryText = dbquery.getQueryText();
		int noOfParameters = dbquery.getNoOfParameters();

		// add method call

	}

	@GetMapping("/get")
	public List<DatabaseQuery> getQuery() {

	}

	@DeleteMapping("/delete")
	public void deleteSource(@RequestBody DatabaseQuery dbquery) {

	}
}
