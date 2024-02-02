package com.example.export.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.export.model.ExportFormats;

@RestController
@RequestMapping("/exportformat")
public class ExportFormatController {

	@PostMapping("/add")
	public void addExportFormat(@RequestBody ExportFormats format) {
		String name = format.getName();
		String description = format.getDescription();

		// add method call

	}

	@GetMapping("/get")
	public List<ExportFormats> getExportFormat() {

	}

	@DeleteMapping("/delete")
	public void deleteExportFormat(@RequestBody ExportFormats format) {

	}

}
