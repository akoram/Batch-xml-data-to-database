package com.demoprocessor;

import org.springframework.batch.item.ItemProcessor;

import com.demo.model.Person;


public class PersonItenProcessor implements ItemProcessor<Person, Person>{

	@Override
	public Person process(Person person) throws Exception {
		return person;
	}
}