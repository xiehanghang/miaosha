package com.xiehang.miaosha.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xiehang.miaosha.domain.MiaoshaUser;
import com.xiehang.miaosha.domain.OrderInfo;
import com.xiehang.miaosha.redis.RedisService;
import com.xiehang.miaosha.result.CodeMsg;
import com.xiehang.miaosha.result.Result;
import com.xiehang.miaosha.service.GoodsService;
import com.xiehang.miaosha.service.MiaoshaUserService;
import com.xiehang.miaosha.service.OrderService;
import com.xiehang.miaosha.vo.GoodsVo;
import com.xiehang.miaosha.vo.OrderDetailVo;

@Controller
@RequestMapping("/order")
class OrderController {

    @Autowired
    MiaoshaUserService userService;

    @Autowired
    RedisService redisService;

    @Autowired
    OrderService orderService;

    @Autowired
    GoodsService goodsService;

    @RequestMapping("/detail")
    @ResponseBody
    public Result<OrderDetailVo> info(Model model, MiaoshaUser user,
                                      @RequestParam("orderId") long orderId) {
        if (user == null) {
            return Result.error(CodeMsg.SESSION_ERROR);
        }
        OrderInfo order = orderService.getOrderById(orderId);
        if (order == null) {
            return Result.error(CodeMsg.ORDER_NOT_EXIST);
        }
        long goodsId = order.getGoodsId();
        GoodsVo goods = goodsService.getGoodsVoByGoodsId(goodsId);
        OrderDetailVo vo = new OrderDetailVo();
        vo.setOrder(order);
        vo.setGoods(goods);
        return Result.success(vo);
    }

}