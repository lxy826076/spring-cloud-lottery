package me.zohar.lottery;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

	/**
	 * 首页
	 * 
	 * @return
	 */
	@GetMapping("/")
	public String index() {
		return "index";
	}

	/**
	 * 登录
	 * 
	 * @return
	 */
	@GetMapping("/login")
	public String login() {
		return "login";
	}

	/**
	 * 注册
	 * 
	 * @return
	 */
	@GetMapping("/register")
	public String registerPage() {
		return "register";
	}

	/**
	 * 时时彩
	 * 
	 * @return
	 */
	@GetMapping("/ssc")
	public String ssc() {
		return "ssc";
	}


	/**
	 * 个人中心
	 * 
	 * @return
	 */
	@GetMapping("/personal-center")
	public String personalCenter() {
		return "personal-center";
	}

	/**
	 * 投注记录
	 * 
	 * @return
	 */
	@GetMapping("/betting-record")
	public String bettingRecord() {
		return "betting-record";
	}

	/**
	 * 充值
	 * 
	 * @return
	 */
	@GetMapping("/recharge")
	public String recharge() {
		return "recharge";
	}

	/**
	 * 支付成功
	 * 
	 * @return
	 */
	@GetMapping("/pay-success")
	public String paySuccess() {
		return "pay-success";
	}

	/**
	 * 提现
	 * 
	 * @return
	 */
	@GetMapping("/withdraw")
	public String withdraw() {
		return "withdraw";
	}

	/**
	 * 追号记录
	 * 
	 * @return
	 */
	@GetMapping("/tracking-number-record")
	public String trackingNumberRecord() {
		return "tracking-number-record";
	}

	/**
	 * 开奖结果
	 * 
	 * @return
	 */
	@GetMapping("/lottery-result")
	public String lotteryResult() {
		return "lottery-result";
	}

	/**
	 * 游戏大厅
	 * 
	 * @return
	 */
	@GetMapping("/game-hall")
	public String gameHall() {
		return "game-hall";
	}

	/**
	 * 彩票资讯
	 * 
	 * @return
	 */
	@GetMapping("/lottery-information")
	public String lotteryInformation() {
		return "lottery-information";
	}

	/**
	 * 资讯详情
	 * 
	 * @return
	 */
	@GetMapping("/information-details")
	public String informationDetails() {
		return "information-details";
	}

	/**
	 * 代理中心
	 * 
	 * @return
	 */
	@GetMapping("/agent-center")
	public String agentCenter() {
		return "agent-center";
	}
	
	/**
	 * 开奖历史
	 * 
	 * @return
	 */
	@GetMapping("/lottery-history")
	public String lotteryHistory() {
		return "lottery-history";
	}

}
