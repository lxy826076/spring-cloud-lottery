package me.zohar.lottery.mastercontrol.vo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
public class RegisterAmountSettingVO {

	private String id;

	/**
	 * 启用标识
	 */
	private Boolean enabled;

	/**
	 * 注册礼金
	 */
	private Double registerAmount;
	
	/**
	 * 最近修改时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date latelyUpdateTime;
	
}
