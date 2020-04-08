package me.zohar.lottery.information.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import me.zohar.lottery.api.LotteryInformationApi;
import me.zohar.lottery.common.vo.Result;
import me.zohar.lottery.information.param.LotteryInformationQueryCondParam;

@Controller
@RequestMapping("/lotteryInformation")
public class LotteryInformationController {

	@Autowired
	private LotteryInformationApi lotteryInformationApi;

	@GetMapping("/findInformationById")
	@ResponseBody
	public Result findInformationById(String id) {
		return lotteryInformationApi.findInformationById(id);
	}

	@GetMapping("/findTop13Information")
	@ResponseBody
	public Result findTop13Information() {
		return lotteryInformationApi.findTop13Information();
	}

	@PostMapping("/findLotteryInformationByPage")
	@ResponseBody
	public Result findLotteryInformationByPage(@RequestBody LotteryInformationQueryCondParam param) {
		return lotteryInformationApi.findLotteryInformationByPage(param);
	}

}
