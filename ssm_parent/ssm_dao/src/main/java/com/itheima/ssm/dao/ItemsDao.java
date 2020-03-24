package com.itheima.ssm.dao;

import com.itheima.ssm.domain.Items;

import java.util.List;

/**
 * @auther 大雄
 * @create 2020-03-23 13:07
 */
public interface ItemsDao {
    List<Items>  list();

    int save(Items items);
}
