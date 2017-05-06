package com.java110.bean;

import net.sf.json.JSONObject;

public class WechatAuthInfo {

	/**
	 * ��ҳ��Ȩ�ӿڵ���ƾ֤,ע�⣺��access_token�����֧�ֵ�access_token��ͬ
	 */
	public String access_token;	
	
	/**
	 * access_token�ӿڵ���ƾ֤��ʱʱ�䣬��λ���룩
	 */
	public int expires_in;
	
	/**
	 * �û�ˢ��access_token
	 */
	public String refresh_token;
	
	/**
	 * �û�Ψһ��ʶ
	 */
	public String openid;
	
	/**
	 * �û���Ȩ��������ʹ�ö��ţ�,���ָ�
	 */
	public String scope;
	
	/**
	 * ��΢��ƽ̨��ȡ��access_token��ʱ��
	 */
	public long getTime;
	
	/**
	 * �������ݿ��ȡ����IData ���ݽ�������Ա������
	 * 
	 * @param data
	 * @see [�ࡢ��#��������#��Ա]
	 */
	public void parse(JSONObject jsonObject) {
		access_token = jsonObject.getString("access_token");	
		expires_in = jsonObject.getInt("expires_in");
		refresh_token = jsonObject.getString("refresh_token");
		openid = jsonObject.getString("openid");
		scope = jsonObject.getString("scope");
		
		getTime = System.currentTimeMillis();
	}	
	
	/**
	 * �ж�access_token�Ƿ��ѹ���
	 * @return
	 */
	public boolean isExpired() {
		if((System.currentTimeMillis() - getTime) > expires_in*1000) {
			return true;
		} else {
			return false;
		}
	}
}
