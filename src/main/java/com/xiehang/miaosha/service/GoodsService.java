package com.xiehang.miaosha.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xiehang.miaosha.dao.GoodsDao;
import com.xiehang.miaosha.domain.MiaoshaGoods;
import com.xiehang.miaosha.vo.GoodsVo;

@Service
public class GoodsService {
	
	@Autowired
	GoodsDao goodsDao;


	public List<GoodsVo> listGoodsVo(){
		return goodsDao.listGoodsVo();
	}

	public GoodsVo getGoodsVoByGoodsId(long goodsId) {
		return goodsDao.getGoodsVoByGoodsId(goodsId);
	}

	public void reduceStock(GoodsVo goods) {
		MiaoshaGoods g = new MiaoshaGoods();
		g.setGoodsId(goods.getId());
		goodsDao.reduceStock(g);
	}

}
