package com.asiainspection.dao;

public interface UserDao {
	
	public int getUserIdByUsernameAndPassword(String username, String password);
	
	public String getUserAuthorityByUsernameAndPassword(String username, String password);

}
