package com.atguigu.gmall.constant;

public class RedisCacheConstant {

    public static final String PRODUCT_CATEGORY_CACHE_KEY = "gmall:product:category:cache";

    //GULI:PRODUCT:INFO
    public static final String PRODUCT_INFO_CACHE_KEY = "gulishop:product:info:";

    public static final String USER_INFO_CACHE_KEY = "gulishop:user:info:";
    public static final long USER_INFO_TIMEOUT = 3L;//默认过期三天
    public static final String CART_TEMP = "gmall:cart:temp:";
    public static final String USER_CART = "gmall:cart:user:";
    public static final String TRADE_TOKEN = "gmall:trade:temptoken:";//+用户令牌

    public static final Long TRADE_TOKEN_TIME = 5L;//+用户令牌，以分钟为单位
    public static final String SEC_KILL = "gmall:sec:";
}

