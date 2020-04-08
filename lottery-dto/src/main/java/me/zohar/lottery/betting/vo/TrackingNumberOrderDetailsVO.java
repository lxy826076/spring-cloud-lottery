package me.zohar.lottery.betting.vo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

/**
 * 追号订单详情
 * 
 * @author zohar
 * @date 2019年5月16日
 *
 */
@Data
public class TrackingNumberOrderDetailsVO {

	/**
	 * 主键id
	 */
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
	 * 投注底数金额
	 */
	private Double baseAmount;

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
	 * 未完成的期数(状态为未开奖且未到投注截至时间)
	 */
	private Integer uncompletedIssueCount;

	private String userAccountId;

	private String userName;

	private List<TrackingNumberContentVO> trackingNumberContents = new ArrayList<>();

	private List<TrackingNumberPlanVO> trackingNumberPlans = new ArrayList<>();


}
