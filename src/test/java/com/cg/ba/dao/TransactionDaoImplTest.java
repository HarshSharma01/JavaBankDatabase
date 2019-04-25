package com.cg.ba.dao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.io.ba.dao.TransactionDaoImpl;

class TransactionDaoImplTest {
	static TransactionDaoImpl td;

	@BeforeAll
	public static void init() {
		td = new TransactionDaoImpl();
	}

	@Test
	void testWithdraw() {
		assertEquals(1200, td.withdraw(101, 300, 1500));
	}

	@Test
	void testDeposit() {
		assertEquals(2400, td.deposit(102, 300, 2100));
	}

	@Test
	void testFundTransfer() {
		assertEquals(1400, td.fundTransfer(101, 102, 100));
	}

	@Test
	void testShowBalance() {
		assertEquals(1400, td.showBalance(101));
	}
}