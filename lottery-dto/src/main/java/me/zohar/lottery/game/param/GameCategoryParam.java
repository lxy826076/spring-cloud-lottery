package me.zohar.lottery.game.param;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class GameCategoryParam {

	/**
	 * 主键id
	 */
	private String id;

	/**
	 * 游戏类别code
	 */
	@NotBlank
	private String gameCategoryCode;

	/**
	 * 游戏类别
	 */
	@NotBlank
	private String gameCategoryName;

	/**
	 * 排序号
	 */
	@NotNull
	@DecimalMin(value = "0", inclusive = true)
	private Double orderNo;
	
}
