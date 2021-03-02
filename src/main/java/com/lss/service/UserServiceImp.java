package com.lss.service;

import java.util.List;
import java.util.Map;

import com.lss.bean.User;

/**
 * �û���service�ӿ�
 * @author ����ʯ
 * @version 2018-04-09
 */
public interface UserServiceImp {
	/**
	 * ����ж���
	 * @param fillBlank
	 * @return
	 */
	public boolean addUser(Map<String, Object> map);
	
	/**
	 * ��¼��֤
	 * @param username
	 * @param password
	 * @return
	 */
	public User selectUserByNamePass(Map<String, Object> map);
	
	/**
	 * ����������ѯ�ж���
	 * @param User
	 * @return
	 */
	public List<User> selectUserByCondition(String username, String password,String role,String role_id,String page1,String limit1);
	
	/**
	 * ��ѯ������
	 * @return
	 */
	public int selectCounts();

	/**
	 * �޸�����
	 * @return
	 */
	public String updatePassword(Map<String, Object> map);

	
}