package com.demo.config;

import java.sql.Date;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.batch.item.database.ItemPreparedStatementSetter;

import com.demo.model.Person;

public class PersonPreparedStatementSetter implements ItemPreparedStatementSetter<Person> {

	@Override
	public void setValues(Person person, PreparedStatement ps) throws SQLException {
		ps.setInt(1, person.getPersonId());
		ps.setString(2, person.getFirstName());
		ps.setString(3, person.getLastName());
		ps.setLong(4, person.getCode());
		ps.setDouble(5, person.getSalary());
		ps.setBoolean(6, person.getFresher());
		ps.setString(7, person.getEmail());
		ps.setInt(8, person.getAge());
		//ps.setDate(3, (Date) person.getJdate());
	}

}