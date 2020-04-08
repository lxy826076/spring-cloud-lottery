package me.zohar.lottery.betting.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import me.zohar.lottery.api.TrackingNumberApi;
import me.zohar.lottery.betting.param.StartTrackingNumberParam;
import me.zohar.lottery.betting.param.TrackingNumberSituationQueryCondParam;
import me.zohar.lottery.common.vo.Result;
import me.zohar.lottery.config.security.UserAccountDetails;

@Controller
@RequestMapping("/trackingNumber")
public class TrackingNumberController {

	@Autowired
	private TrackingNumberApi trackingNumberApi;

	/**
	 * 发起追号
	 * 
	 * @return
	 */
	@PostMapping("/startTrackingNumber")
	@ResponseBody
	public Result startTrackingNumber(@RequestBody StartTrackingNumberParam param) {
		UserAccountDetails user = (UserAccountDetails) SecurityContextHolder.getContext().getAuthentication()
				.getPrincipal();
		param.setUserAccountId(user.getUserAccountId());
		return trackingNumberApi.startTrackingNumber(param);
	}

	@PostMapping("/findMyTrackingNumberSituationByPage")
	@ResponseBody
	public Result findMyTrackingNumberSituationByPage(@RequestBody TrackingNumberSituationQueryCondParam param) {
		UserAccountDetails user = (UserAccountDetails) SecurityContextHolder.getContext().getAuthentication()
				.getPrincipal();
		param.setUserAccountId(user.getUserAccountId());
		return trackingNumberApi.findMyTrackingNumberSituationByPage(param);
	}

	@GetMapping("/findMyTrackingNumberOrderDetails")
	@ResponseBody
	public Result findMyTrackingNumberOrderDetails(String id) {
		UserAccountDetails user = (UserAccountDetails) SecurityContextHolder.getContext().getAuthentication()
				.getPrincipal();
		return trackingNumberApi.findMyTrackingNumberOrderDetails(id, user.getUserAccountId());
	}

	@GetMapping("/cancelOrder")
	@ResponseBody
	public Result cancelOrder(String orderId) {
		UserAccountDetails user = (UserAccountDetails) SecurityContextHolder.getContext().getAuthentication()
				.getPrincipal();
		return trackingNumberApi.cancelOrder(orderId, user.getUserAccountId());
	}

}
