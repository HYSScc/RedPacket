package com.java110.bean;

import net.sf.json.JSONObject;

public class WechatUserInfo {

	/**
	 * �û��Ƿ��ĸù��ںű�ʶ��ֵΪ0ʱ��������û�û�й�ע�ù��ںţ���ȡ����������Ϣ��
	 */
	public int subscribe;	
	
	/**
	 * �û��ı�ʶ���Ե�ǰ���ں�Ψһ
	 */
	public String openid;	
	
	/**
	 * �û����ǳ�
	 */
	public String nickname;

	/**
	 * �û����Ա�ֵΪ1ʱ�����ԣ�ֵΪ2ʱ��Ů�ԣ�ֵΪ0ʱ��δ֪
	 */
	public int sex;	
		 
	/**
	 * �û����ڳ���
	 */
	public String city;	
		 
	/**
	 * �û����ڹ���
	 */
	public String country;	
	
	/**
	 * �û�����ʡ��
	 */
	public String province;	
	
	/**
	 *  �û������ԣ���������Ϊzh_CN
	 */
	public String language;	
		 
	/**
	 *  �û�ͷ�����һ����ֵ����������ͷ���С����0��46��64��96��132��ֵ��ѡ��0����640*640������ͷ�񣩣��û�û��ͷ��ʱ����Ϊ��
	 */
	public String headimgurl;	
		
	/**
	 * �û���עʱ�䣬Ϊʱ���������û�����ι�ע����ȡ����עʱ��
	 */
	public String subscribe_time;	
	
	/**
	 * ֻ�����û������ںŰ󶨵�΢�ſ���ƽ̨�ʺź󣬲Ż���ָ��ֶΡ��������ȡ�û�������Ϣ��UnionID���ƣ�
	 */
	public String unionid;
		
	/**
	 * �������ݿ��ȡ����IData ���ݽ�������Ա������
	 * 
	 * ��������£�΢�Ż᷵������JSON���ݰ������ںţ�
	 * {
	 *     "subscribe": 1, 
	 *     "openid": "o6_bmjrPTlm6_2sgVt7hMZOPfL2M", 
	 *     "nickname": "Band", 
	 *     "sex": 1, 
	 *     "language": "zh_CN", 
	 *     "city": "����", 
	 *     "province": "�㶫", 
	 *     "country": "�й�", 
	 *     "headimgurl":    "http://wx.qlogo.cn/mmopen/g3MonUZtNHkdmzicIlibx6iaFqAc56vxLSUfpb6n5WKSYVY0ChQKkiaJSgQ1dZuTOgvLLrhJbERQQ4eMsv84eavHiaiceqxibJxCfHe/0", 
	 *     "subscribe_time": 1382694957,
	 *     "unionid": " o6_bmasdasdsad6_2sgVt7hMZOPfL"
	 * }
	 * 
	 * ��ȷʱ���ص�JSON���ݰ����£�
	 * {
	 * 	  "openid":" OPENID",
	 *    "nickname": NICKNAME,
	 *    "sex":"1",
	 *    "province":"PROVINCE",
	 *    "city":"CITY",
	 *    "country":"COUNTRY",
	 *    "headimgurl":    "http://wx.qlogo.cn/mmopen/g3MonUZtNHkdmzicIlibx6iaFqAc56vxLSUfpb6n5WKSYVY0ChQKkiaJSgQ1dZuTOgvLLrhJbERQQ4eMsv84eavHiaiceqxibJxCfHe/46", 
	 *    "privilege":[
	 *      "PRIVILEGE1"
	 *      "PRIVILEGE2"
	 *     ]
	 * }
	 * 
	 * @param data
	 * @see [�ࡢ��#��������#��Ա]
	 */
	public void parse(JSONObject jsonObject) {
		//�Թ�ע�û��ɶ��ȡ����
		if(jsonObject.containsKey("subscribe")) {
			subscribe = jsonObject.getInt("subscribe");	
			if(0 != subscribe) {
				openid = jsonObject.getString("openid");
				nickname = jsonObject.getString("nickname");
				sex = jsonObject.getInt("sex");
				language = jsonObject.getString("language");
				city = jsonObject.getString("city");
				province = jsonObject.getString("province");
				country = jsonObject.getString("country");
				headimgurl = jsonObject.getString("headimgurl");
				
				subscribe_time = jsonObject.getString("subscribe_time");
				unionid = jsonObject.getString("unionid");				
			}			
		} else {
			
			openid = jsonObject.getString("openid");
			nickname = jsonObject.getString("nickname");
			sex = jsonObject.getInt("sex");
			language = jsonObject.getString("language");
			city = jsonObject.getString("city");
			province = jsonObject.getString("province");
			country = jsonObject.getString("country");
			headimgurl = jsonObject.getString("headimgurl");
			
			if(jsonObject.containsKey("unionid")) {
				unionid = jsonObject.getString("unionid");
				subscribe = 1;				
			}
		}
	}	
}
