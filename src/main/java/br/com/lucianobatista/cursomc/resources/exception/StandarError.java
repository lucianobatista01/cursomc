package br.com.lucianobatista.cursomc.resources.exception;

import java.io.Serializable;

public class StandarError implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer status;
	private String msg;
	private Long timStamp;
	
	public StandarError(Integer status, String msg, Long timStamp) {
		super();
		this.status = status;
		this.msg = msg;
		this.timStamp = timStamp;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Long getTimStamp() {
		return timStamp;
	}

	public void setTimStamp(Long timStamp) {
		this.timStamp = timStamp;
	}


	
	
}
