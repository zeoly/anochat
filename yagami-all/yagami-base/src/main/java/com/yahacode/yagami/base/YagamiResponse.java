package com.yahacode.yagami.base;

import java.io.Serializable;

import com.yahacode.yagami.base.common.PropertiesUtils;

public class YagamiResponse implements Serializable {

	private static final long serialVersionUID = -2100466391754160456L;

	String code;

	String msg;

	Object data;

	public YagamiResponse() {
		super();
	}

	/**
	 * constructor for error
	 * 
	 * @param code
	 * @param msg
	 */
	public YagamiResponse(String code) {
		super();
		this.code = code;
		this.msg = PropertiesUtils.getErrorMsg(code);
	}

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

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

}
