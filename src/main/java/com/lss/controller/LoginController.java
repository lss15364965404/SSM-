package com.lss.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.lss.bean.User;
import com.lss.service.UserServiceImp;

/**
 * ��¼controller
 * @author ����ʯ
 * @version 2018-04-09
 */
@Controller
public class LoginController {
	/**
	 * ��־����
	 */
	private Logger log = Logger.getLogger(this.getClass());
	@Resource
	private UserServiceImp userServiceImp ;
	
	/**
	 * �޸�����ҳ��
	 * @return
	 */
	@RequestMapping("/changePassword")
	public String changePassword(){
		log.debug("*************changePassword  controller in*************");
		log.debug("*************changePassword  controller out*************");
		return "changePassword";
	}
	
	/**
	 * ��¼ҳ��
	 * @return
	 */
	@RequestMapping("/login")
	public String login(){
		log.debug("*************login  controller in*************");
		log.debug("*************login  controller out*************");
		return "home";
	}
	
	/**
	 * ��¼��ѯ
	 * @param userName
	 * @param pass
	 * @return
	 */
	/*@RequestMapping(value="/selectUser",method=RequestMethod.POST)
	@ResponseBody //���ã��ǽ�controller�ķ������صĶ���ͨ���ʵ���ת����ת��Ϊָ���ĸ�ʽ֮��д�뵽response�����body����ͨ����������JSON���ݻ�����XML
	public String selectUser(String data,HttpSession session){
		String result = "false";
		log.debug("**************login  controller selectUser in**********");
		
		//data = "{'username':'����ʯ','password':'1420333'}";
		
		log.debug("*********" + data);
		//��dataת��Ϊjson����
		JSONObject J =JSON.parseObject(data);//parse:��һ���ַ����н�����json����
		log.debug("*********" + J);

		//��ȡkeyֵ������ת��Ϊ����
		Object[] keys = J.keySet().toArray();
		for(int i = 0;i<keys.length;i++) {
			log.debug("*********keys["+i+"]" + keys[i]);
		}
		//��ȡvalueֵ������ת��Ϊ����
		Object[] values = J.values().toArray();
		for(int i = 0;i<values.length;i++) {
			log.debug("*********values["+i+"]" + values[i]);
		}
		//�����json����ת��Ϊmap
		Map<String, Object> map = new HashMap<String, Object>();
		for(int i=0;i<keys.length;i++){
			map.put((String)keys[i], (String)values[i]);
		}
		
		User user = userServiceImp.selectUserByNamePass(map);
		
		log.debug("*********�û�user��" + user.toString());
		if(user.getUsername().equals("���޴���")) {
			result = "noUser";
		}
		if(!(user.getUsername().equals("���޴���"))){
			log.debug("**************login  controller selectUser ��ת�ж�**************");
			log.debug("**************login  controller selectUser "+user.getRole_id()+"**************");

			if(Integer.parseInt(user.getRole_id()) == 1) {
				log.debug("**************login  controller selectUser 1----**************");
				session.setAttribute("role_id", 1);
				session.setAttribute("username", user.getUsername());
				result = "index_1";
				log.debug("**************login  controller selectUser 1++++**************");
			}else if(Integer.parseInt(user.getRole_id()) == 2) {
				log.debug("**************login  controller selectUser 2----**************");
				session.setAttribute("role_id", 2);
				session.setAttribute("username", user.getUsername());
				result = "index_2";
				log.debug("**************login  controller selectUser 2++++**************");
			}else if(Integer.parseInt(user.getRole_id()) == 3) {
				log.debug("**************login  controller selectUser 3----**************");
				session.setAttribute("role_id", 3);
				session.setAttribute("username", user.getUsername());
				result = "doExam";
				log.debug("**************login  controller selectUser 3++++**************");
			}
		}
		log.debug("**************login  controller selectUser result:"+result+"**************");
		log.debug("**************login  controller selectUser out**************");
		return result;
	}*/
	
	/**
	 * �޸�����
	 * @param data
	 * @param session
	 * @return
	 */
/*	@RequestMapping(value="/changePassword",method=RequestMethod.POST)
	@ResponseBody //���ã��ǽ�controller�ķ������صĶ���ͨ���ʵ���ת����ת��Ϊָ���ĸ�ʽ֮��д�뵽response�����body����ͨ����������JSON���ݻ�����XML
	public String changePassword(String data,HttpSession session){
		String result = "false";
		log.debug("**************login  controller changePassword in**********");
		log.debug("*********login  controller changePassword data��" + data);
		//��dataת��Ϊjson����
		JSONObject J =JSON.parseObject(data);//parse:��һ���ַ����н�����json����
		log.debug("*********login  controller changePassword json��" + J);
		//��ȡkeyֵ������ת��Ϊ����
		Object[] keys = J.keySet().toArray();
		for(int i = 0;i<keys.length;i++) {
			log.debug("*********keys["+i+"]" + keys[i]);
		}
		//��ȡvalueֵ������ת��Ϊ����
		Object[] values = J.values().toArray();
		for(int i = 0;i<values.length;i++) {
			log.debug("*********values["+i+"]" + values[i]);
		}
		//�����json����ת��Ϊmap
		Map<String, Object> map = new HashMap<String, Object>();
		for(int i=0;i<keys.length;i++){
			map.put((String)keys[i], (String)values[i]);
		}

		//����service�㷽��
		String upPass = userServiceImp.updatePassword(map);
		
		log.debug("*********�޸���������" + upPass);
		result = upPass;
		log.debug("**************login  controller changePassword out**************");
		return result;
	}*/
	
	
	
}