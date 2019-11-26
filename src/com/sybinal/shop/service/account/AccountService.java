package com.sybinal.shop.service.account;

import com.sybinal.shop.model.Account;

import java.util.Map;

public interface AccountService {

	public Account getAccountByUser(Map<String, Object> reqMap);
	
	public int rechargeAccount(Account account);
	
	public int payOrderByEwallet(Account account);
}
