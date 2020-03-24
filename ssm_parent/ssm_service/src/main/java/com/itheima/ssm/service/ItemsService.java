package com.itheima.ssm.service;

import com.itheima.ssm.domain.Items;

import java.util.List;

/**
 * @auther 大雄
 * @create 2020-03-23 13:20
 */
public interface ItemsService {
    List<Items> list();


    int save(Items items);
}
