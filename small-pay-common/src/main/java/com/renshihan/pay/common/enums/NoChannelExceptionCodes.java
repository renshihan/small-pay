package com.renshihan.pay.common.enums;

/**
 * 系统返回码
 * 
 * @author FYW
 * @version 1.0.0
 */
public enum NoChannelExceptionCodes {
	NC0001("NC0001","未匹配到指定通道服务");
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