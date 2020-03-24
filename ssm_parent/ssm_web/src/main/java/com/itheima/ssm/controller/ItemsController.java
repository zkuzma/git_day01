package com.itheima.ssm.controller;

import com.itheima.ssm.domain.Items;
import com.itheima.ssm.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @auther 大雄
 * @create 2020-03-23 13:29
 */
@Controller
@RequestMapping("/items")
public class ItemsController {
    @Autowired
    ItemsService itemsService;

    @RequestMapping("/list")
    public String list(Model model){
        List<Items> list = itemsService.list();

        model.addAttribute("items",list);

        return "items";
    }

    @RequestMapping("/save")
    public String save(Items items){
        int i = itemsService.save(items);

        return "redirect:/items/list";
    }
}
