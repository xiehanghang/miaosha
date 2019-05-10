package com.xiehang.miaosha.vo;

import com.xiehang.miaosha.domain.OrderInfo;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderDetailVo {
    private GoodsVo goods;
    private OrderInfo order;
}