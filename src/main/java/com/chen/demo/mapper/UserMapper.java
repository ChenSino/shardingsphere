package com.chen.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chen.demo.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author chenkun
 * @description:
 * @date: 2024-11-28 11:56:05
 **/
@Mapper
public interface UserMapper extends BaseMapper<User> {

}