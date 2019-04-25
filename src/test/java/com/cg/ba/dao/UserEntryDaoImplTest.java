package com.cg.ba.dao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.io.ba.dao.UserEntryDaoImpl;
import com.io.ba.model.CustomerDetails;

class UserEntryDaoImplTest {
	static UserEntryDaoImpl user;
	static CustomerDetails cd;

	@BeforeAll
	public static void init() {
		user = new UserEntryDaoImpl();
		cd = new CustomerDetails();
	}

	@Test
	void testRegister() {
		cd.setFirstName("Ramya");
		cd.setLastName("Sharma");
		cd.setEmailId("ramya@mail.com");
		cd.setPassword("ramya");
		cd.setPancardNo(1234345L);
		cd.setAadharNo("234567890191");
		cd.setAddress("Hyd");
		cd.setMobileNo("8000880008");
		cd.setBalance(0);
		int id = user.register(cd);
		assertEquals(107, id);
	}

	@Test
	void testLogin() {
		cd = user.login(105, "pavan");
		assertEquals(105, cd.getAccountNo());
	}
}
