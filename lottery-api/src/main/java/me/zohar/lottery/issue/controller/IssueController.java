package me.zohar.lottery.issue.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import me.zohar.lottery.common.vo.Result;
import me.zohar.lottery.issue.param.IssueEditParam;
import me.zohar.lottery.issue.param.IssueSettingParam;
import me.zohar.lottery.issue.param.LotteryHistoryParam;
import me.zohar.lottery.issue.param.LotterySituationQueryCondParam;
import me.zohar.lottery.issue.param.ManualLotteryParam;
import me.zohar.lottery.issue.service.IssueService;
import me.zohar.lottery.issue.service.IssueSettingService;
import me.zohar.lottery.issue.service.LotterySituationService;

@Controller
@RequestMapping("/issue")
public class IssueController {

	@Autowired
	private IssueService issueService;

	@Autowired
	private IssueSettingService issueSettingService;

	@Autowired
	private LotterySituationService lotterySituationService;

	@GetMapping("/getIssueSettingDetailsByGameId")
	@ResponseBody
	public Result getIssueSettingDetailsByGameId(String gameId) {
		return Result.success().setData(issueSettingService.getIssueSettingDetailsByGameId(gameId));
	}

	@PostMapping("/addOrUpdateIssueSetting")
	@ResponseBody
	public Result addOrUpdateIssueSetting(@RequestBody IssueSettingParam issueSettingParam) {
		issueSettingService.addOrUpdateIssueSetting(issueSettingParam);
		return Result.success();
	}

	@GetMapping("/findLotterySituationById")
	@ResponseBody
	public Result findLotterySituationById(String id) {
		return Result.success().setData(lotterySituationService.findLotterySituationById(id));
	}

	@PostMapping("/findLotterySituationByPage")
	@ResponseBody
	public Result findLotterySituationByPage(@RequestBody LotterySituationQueryCondParam param) {
		return Result.success().setData(lotterySituationService.findLotterySituationByPage(param));
	}

	@PostMapping("/manualLottery")
	@ResponseBody
	public Result manualLottery(@RequestBody ManualLotteryParam param) {
		issueService.manualLottery(param);
		return Result.success();
	}

	@GetMapping("/manualSettlement")
	@ResponseBody
	public Result manualSettlement(String id) {
		issueService.manualSettlement(id);
		return Result.success();
	}

	@PostMapping("/updateIssue")
	@ResponseBody
	public Result updateIssue(@RequestBody IssueEditParam param) {
		issueService.updateIssue(param);
		return Result.success();
	}

	@GetMapping("/findLatelyThe5TimeIssue")
	@ResponseBody
	public Result findLatelyThe5TimeIssue(String gameCode) {
		return Result.success().setData(issueService.findLatelyThe5TimeIssue(gameCode));
	}

	@GetMapping("/getCurrentIssue")
	@ResponseBody
	public Result getCurrentIssue(String gameCode) {
		return Result.success().setData(issueService.getCurrentIssue(gameCode));
	}

	@GetMapping("/getNextIssue")
	@ResponseBody
	public Result getNextIssue(String gameCode) {
		return Result.success().setData(issueService.getNextIssue(gameCode));
	}

	@GetMapping("/getLatelyIssue")
	@ResponseBody
	public Result getLatelyIssue(String gameCode) {
		return Result.success().setData(issueService.getLatelyIssue(gameCode));
	}

	@GetMapping("/findTodayTrackingNumberIssue")
	@ResponseBody
	public Result findTodayTrackingNumberIssue(String gameCode) {
		return Result.success().setData(issueService.findTodayTrackingNumberIssue(gameCode));
	}

	@PostMapping("/findLotteryHistory")
	@ResponseBody
	public Result findLotteryHistory(@RequestBody LotteryHistoryParam param) {
		return Result.success().setData(issueService.findLotteryHistory(param));
	}

}
