package com.xiehang.miaosha.vo;

import java.util.Date;

import com.xiehang.miaosha.domain.Goods;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class GoodsVo extends Goods{
	private Double miaoshaPrice;
	private Integer stockCount;
	private Date startDate;
	private Date endDate;
}
