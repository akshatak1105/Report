package com.example.export.model;

public class DatabaseQuery {
	private Connection connection;
	private String name;
	private String queryText;
	private int noOfParameters;

	public Connection getConnection() {
		return connection;
	}

	public void setConnection(Connection connection) {
		this.connection = connection;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getQueryText() {
		return queryText;
	}

	public void setQueryText(String queryText) {
		this.queryText = queryText;
	}

	public int getNoOfParameters() {
		return noOfParameters;
	}

	public void setNoOfParameters(int noOfParameters) {
		this.noOfParameters = noOfParameters;
	}

}
