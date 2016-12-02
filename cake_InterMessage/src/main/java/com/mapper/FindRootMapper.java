package com.mapper;

import com.po.Root;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by lalala on 2016/11/28.
 */
public interface FindRootMapper {
//    @Select("SELECT * FROM user WHERE 1=1")
    public List<Root> find(Root root)throws Exception;
}
