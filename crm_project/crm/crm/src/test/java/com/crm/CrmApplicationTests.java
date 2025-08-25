package com.crm;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CrmApplicationTests {

	@Test
	void test1() {
		System.out.println("from test 1");
	}
	
	@Test
	void test2() {
		System.out.println("from test 2");
	}
	
	@BeforeEach
	void beforeEach() {
		System.out.println("from beforeEach");
	}
	
	@AfterEach
	void afterEach() {
		System.out.println("from afterEach");
	}
	
	@BeforeAll
	static void beforeAll() {
		System.out.println("from beforeAll");
	}
	
	@AfterAll
	static void afterAll() {
		System.out.println("from afterAll");
	}

}
