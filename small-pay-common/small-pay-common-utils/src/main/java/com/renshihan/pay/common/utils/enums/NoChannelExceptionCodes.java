package com.renshihan.pay.common.utils.enums;

/**
 * 系统返回码
 * 
 * @author FYW
 * @version 1.0.0
 */
public enum NoChannelExceptionCodes {
	NC0001("NC0001","未匹配到指定通道服务"),
	NC0002("NC0002","签名数据异常"),
	NC9998("NC9998","Content-Type非application/json;charset=UTF-8"),
	NC9999("NC9999","服务器内部错误");
	private String code;
	private String message;

	NoChannelExceptionCodes(String code, String message) {
		this.code = code;
		this.message = message;
	}

	public String getCode() {
		return code;
	}

	public String getMessage() {
		return message;
	}
}