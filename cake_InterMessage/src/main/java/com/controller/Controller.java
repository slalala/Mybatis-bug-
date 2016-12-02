package com.controller;

import com.po.Root;
import com.service.inter.Rootservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by lalala on 2016/12/2.
 */
@org.springframework.stereotype.Controller
public class Controller {
    @Autowired
    private Rootservice rootservice;

    @RequestMapping("/items")
    public ModelAndView find()throws Exception
    {
        Root root = new Root();
        root.setName("lalala");
        rootservice.find(root);

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/success");
        return modelAndView;
    }
}
