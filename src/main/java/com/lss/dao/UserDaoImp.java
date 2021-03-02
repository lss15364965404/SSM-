package com.lss.dao;


import java.util.List;
import java.util.Map;

import com.lss.bean.User;

/**
 * �û���Dao��ӿ�
 * @author ����ʯ
 * @version 2018-04-09
 */
public interface UserDaoImp {
	
	/**
	 * ����һ���û�����
	 * @param user
	 * @return
	 */
	public int insert(Map<String, Object> map);
	
	/**
	 * ���������û�����
	 * @param user
	 * @return
	 */
	public List<User> selectUserByCondition(Map<String,Object> map);
	
	/**
	 * ���������û�����
	 * @param user
	 * @return
	 */
	public List<User> selectAllUser();
	
	/**
	 * ��ѯ�û�����������
	 * @return
	 */
	public int selectCount();

	/**
	 * �޸��û�����
	 * @param map
	 * @return
	 */
	public int updatePassword(Map<String, Object> map);
}