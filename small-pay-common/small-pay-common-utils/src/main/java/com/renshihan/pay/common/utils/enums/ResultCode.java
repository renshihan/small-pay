package com.renshihan.pay.common.utils.enums;

/**
 * 系统返回码
 * 
 * @author FYW
 * @version 1.0.0
 */
public enum ResultCode {
		C0000("0000", "S", "交易成功"), 
		C0001("0001", "E", "交易失败"),  
		C0002("0002", "R", "交易处理中"),  
		C0003("0003", "R", "连接超时"), 
		C0004("0004", "E", "系统维护中，暂停交易"), 
		C0005("0005", "E", "交易流水号重复"), 
		C0006("0006", "E", "查询的交易不存在"), 
		C0007("0007", "E", "原支付流水不存在"), 
		C0008("0008", "E", "结算账户错误"), 
		C0009("0009", "E", "结算账户户名错误"), 
		C0010("0010", "E", "结算账户状态不正常"), 
		C0011("0011", "E", "证件类型错误"), 
		C0012("0012", "E", "证件号码错误"), 
		C0013("0013", "E", "身份证号码不匹配"), 
		C0014("0014", "E", "手机号错误"), 
		C0015("0015", "E", "退款金额超过剩余可退金额"), 
		C0016("0016", "E", "支付金额超限"), 
		C0017("0017", "E", "余额不足"), 
		C0018("0018", "E", "不支持该卡交易"), 
		C0019("0019", "E", "支付密码输入超限"), 
		C0020("0020", "E", "其他错误"), 
		C0021("0021", "E", "交易已完结，不允许退款"), 
		C0022("0022", "E", "金额有误"), 
		C0023("0023", "E", "支付授权码无效"), 
		C0024("0024", "E", "商户重复入驻"), 
		C0025("0025", "E", "商户身份验证失败"), 
		C0026("0026", "E", "报文不合法，包括格式不合法、必输请求项为空等"), 
		C0027("0027", "E", "商户入驻失败"), 
		C0028("0028", "E", "结算账户不支持，请确认帐户是否正常"), 
		C0029("0029", "R", "交易已受理"), 
		C0030("0030", "R", "交易处理异常"), 
		C0031("0031", "E", "解密失败"), 
		C0032("0032", "E", "不支持该交易"), 
		C9999("9999", "R", "系统异常");
	
	
	/**
	 * 构造器
	 * 
	 * @param code 状态码
	 * @param msg  状态描述
	 */
	private ResultCode(String code, String type, String msg) {
		this.code = code;
		this.msg = msg;
		this.type = type;
		
	}

	/** 状态码  **/
	private String code;

	/** 状态描述  **/
	private String msg;
	
	/** 状态码类型  **/
	private String type;
	

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}