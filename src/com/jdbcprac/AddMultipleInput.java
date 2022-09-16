package com.jdbcprac;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class AddMultipleInput {

	Connection connection;

	public void InsertData(String name, String city) {

		AddMultipleConnectionProvider addMultipleConnectionProvider = new AddMultipleConnectionProvider();

		try {
			connection = addMultipleConnectionProvider.getConnection();

			PreparedStatement prepareStatement = connection
					.prepareStatement("Insert into stud2 (name, city) values (?, ?)");

			prepareStatement.setString(1, name);
			prepareStatement.setString(2, city);

			int executeUpdate = prepareStatement.executeUpdate();

			System.out.println("record inserted" + executeUpdate);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {

		AddMultipleInput addMultipleInput = new AddMultipleInput();

		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {

			System.out.println("add name");

			String name = scanner.next();

			System.out.println("add city");

			String city = scanner.next();

			addMultipleInput.InsertData(name, city);
		}

	}
}
