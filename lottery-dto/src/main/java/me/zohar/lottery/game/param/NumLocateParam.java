package me.zohar.lottery.game.param;

import java.util.List;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class NumLocateParam {

	/**
	 * 号位名称
	 */
	@NotBlank
	private String numLocateName;

	/**
	 * 候选的号码集合,以逗号分隔
	 */
	@NotBlank
	private String nums;

	/**
	 * 最大可选多少个号码
	 */
	@DecimalMin(value = "1", inclusive = true)
	private Integer maxSelected;

	/**
	 * 是否有过滤按钮
	 */
	@NotNull
	private Boolean hasFilterBtnFlag;

	@NotEmpty
	private List<OptionalNumParam> optionalNums;

}
