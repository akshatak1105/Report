package com.example.export.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.DatabaseSource;

@RestController
@RequestMapping("/databasesource")
public class DatabaseSourceController {

	@PostMapping("/add")
	public void addSource(@RequestBody DatabaseSource src) {

		String name = src.getName();
		String driverClass = src.getDriverClass();
		String sourceName = src.getSourceName();

		// add method call

	}

	@GetMapping("/get")
	public List<DatabaseSource> getSource() {

	}

	@DeleteMapping("/delete")
	public void deleteSource(@RequestBody DatabaseSource src) {

	}

}
