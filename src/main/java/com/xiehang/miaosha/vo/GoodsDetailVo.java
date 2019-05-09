package com.xiehang.miaosha.vo;

import com.xiehang.miaosha.domain.MiaoshaUser;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GoodsDetailVo {

    private int miaoshaStatus = 0;
    private int remainSeconds = 0;
    private GoodsVo goods ;
    private MiaoshaUser user;
}
