package com.xiehang.miaosha.redis;

public class OrderKey extends BasePrefix {

	public OrderKey(String prefix) {
		super(prefix);
	}

	// miao sha order uid gid
	public static OrderKey getMiaoshaOrderByUidGid = new OrderKey("moug");
}
