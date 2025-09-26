package com.commerce.service;

import com.commerce.models.dto.CustomerDTO;
import com.commerce.models.dto.SellerDTO;
import com.commerce.models.dto.SessionDTO;
import com.commerce.models.entities.UserSession;


public interface LoginLogoutService {
	
	public UserSession loginCustomer(CustomerDTO customer);
	
	public SessionDTO logoutCustomer(SessionDTO session);
	
	public void checkTokenStatus(String token);
	
	public void deleteExpiredTokens();
	
	
	public UserSession loginSeller(SellerDTO seller);
	
	public SessionDTO logoutSeller(SessionDTO session);
	
	
}
