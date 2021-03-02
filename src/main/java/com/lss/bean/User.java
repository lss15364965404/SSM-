package com.lss.bean;

import org.springframework.stereotype.Component;
/**
 * User�û���
 * @author ����ʯ
 * @version 2018-04-09
 */
@Component
public class User {

	/**
	 * �û�id
	 */
	private int user_id;
	
	/**
	 * �û���
	 */
	private String username;
	
	/**
	 * ����
	 */
	private String password;
	
	/**
	 * �û���ɫ
	 */
	private String role;
	
	/**
	 * ��ɫid
	 */
	private String role_id;
	
	/**
	 * �޲������캯��
	 */
	public User() {
		super();
	}
	
	/**
	 * �������Ĺ��캯��
	 * @param user_id �û�id
	 * @param username �û���
	 * @param password ����
	 * @param role �û���ɫ
	 * @param role_id ��ɫid
	 */
	public User(int user_id, String username, String password, String role, String role_id) {
		super();
		this.user_id = user_id;
		this.username = username;
		this.password = password;
		this.role = role;
		this.role_id = role_id;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getRole_id() {
		return role_id;
	}

	public void setRole_id(String role_id) {
		this.role_id = role_id;
	}

	/**
	 * ͨ���ַ�����ʾ�û���Ϣ
	 */
	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", username=" + username + ", password=" + password + ", role=" + role
				+ ", role_id=" + role_id + "]";
	}
	
	
	
	
}