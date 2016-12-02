package com.service.impl;

import com.mapper.FindRootMapper;
import com.po.Root;
import com.service.inter.Rootservice;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lalala on 2016/11/28.
 */
public class RootServiceImp implements Rootservice {
    @Autowired
    private FindRootMapper findRootMapper;

    @Override
    public List<Root> find(Root root) throws Exception
    {
        List<Root> list = new ArrayList<Root>();
        list = findRootMapper.find(root);
        return list;
    }
}
