package com.te.myplayerapp.dto;

public class PlayerResponse {

	private int statusCode;
	private String msg;
	private String desc;
	
	private Player player;
	
	
	public final int getStatusCode() {
		return statusCode;
	}
	public final void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public final String getMsg() {
		return msg;
	}
	public final void setMsg(String msg) {
		this.msg = msg;
	}
	public final String getDesc() {
		return desc;
	}
	public final void setDesc(String desc) {
		this.desc = desc;
	}
	public final Player getPlayer() {
		return player;
	}
	public final void setPlayer(Player player) {
		this.player = player;
	}
	public PlayerResponse(int statusCode, String msg, String desc, Player player) {
		super();
		this.statusCode = statusCode;
		this.msg = msg;
		this.desc = desc;
		this.player = player;
	}
	public PlayerResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "PlayerResponse [statusCode=" + statusCode + ", msg=" + msg + ", desc=" + desc + ", player=" + player
				+ "]";
	}
	
	
	
}
