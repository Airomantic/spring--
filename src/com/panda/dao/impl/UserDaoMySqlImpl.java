package com.panda.dao.impl;

import com.panda.dao.UserDao;

/**
 * @program: aliyun_spring
 * @description: 实现类连接接口
 * @author: jiangzq
 * @create: 2019-09-28 09:49
 **/
public class UserDaoMySqlImpl implements UserDao {
    @Override
    public void getUser() {
        System.out.println("MySql获取用户数据");//需要服务层service
    }
}
