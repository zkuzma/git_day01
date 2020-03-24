package com.itheima.ssm.service.impl;

import com.itheima.ssm.dao.ItemsDao;
import com.itheima.ssm.domain.Items;
import com.itheima.ssm.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @auther 大雄
 * @create 2020-03-23 13:22
 */
@Service
public class ItemsServiceImpl implements ItemsService {
    @Autowired
    ItemsDao itemsDao;
    @Override
    public List<Items> list() {
        List<Items> list = itemsDao.list();
        return list;
    }

    @Override
    public int save(Items items) {
        int i = itemsDao.save(items);
        return i;
    }
}
