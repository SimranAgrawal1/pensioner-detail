package com.pms.pensionerDetail.dao;

import javax.transaction.Transactional;

import com.pms.pensionerDetail.model.BankLog;

public interface BankLogServiceDao {
	@Transactional
	public boolean logTransaction(BankLog bankLog);

	public Boolean isSessionValid(String token);
}
