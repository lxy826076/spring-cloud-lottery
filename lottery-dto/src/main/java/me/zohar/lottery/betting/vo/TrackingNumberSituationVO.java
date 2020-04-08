package me.zohar.lottery.betting.vo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
public class TrackingNumberSituationVO {

	private String id;

	/**
	 * 订单号
	 */
	private String orderNo;

	/**
	 * 追号时间
	 */
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date trackingNumberTime;

	/**
	 * 游戏代码
	 */
	private String gameCode;

	private String gameName;

	/**
	 * 开始期号
	 */
	private Long startIssueNum;

	/**
	 * 追号即停
	 */
	private Boolean winToStop;

	/**
	 * 追号期数
	 */
	private Long totalIssueCount;

	/**
	 * 总投注金额
	 */
	private Double totalBettingAmount;

	/**
	 * 状态
	 */
	private String state;

	private String stateName;

	/**
	 * 完成期数
	 */
	private Integer completedIssueCount;

	/**
	 * 未完成的期数(状态为未开奖且未到投注截至时间)
	 */
	private Integer uncompletedIssueCount;

	/**
	 * 投注人用户账号id
	 */
	private String userAccountId;

}
