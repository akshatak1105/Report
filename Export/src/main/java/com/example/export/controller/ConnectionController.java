package com.example.export.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.export.model.Connection;

@RestController
@RequestMapping("/connection")
public class ConnectionController {

	@PostMapping("/add")
	public void addConnect(@RequestBody Connection obj) {

		String server = obj.getServer();
		String username = obj.getUsername();
		String password = obj.getPassword();
		String database_name = obj.getDatabase_name();
		int port = obj.getPort();

		// addconnect method call

	}

	@GetMapping("/get")
	public List<Connection> getConnect() {

	}

}
