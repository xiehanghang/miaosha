package com.xiehang.miaosha.redis;

import org.junit.Test;
import redis.clients.jedis.Jedis;

import static org.junit.Assert.*;

public class RedisConnTestTest {

    Jedis jedis = new Jedis("localhost");

    @Test
    public void test1() {
        jedis.set("1", "1");
        jedis.close();
    }
}