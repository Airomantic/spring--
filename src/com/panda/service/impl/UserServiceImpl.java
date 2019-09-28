package com.panda.service.impl;

import com.panda.dao.UserDao;
import com.panda.dao.impl.UserDaoMySqlImpl;
import com.panda.service.UserService;

/**
 * @program: aliyun_spring
 * @description: （应用程序）服务层实现类，用spring来避免这种高耦合性，假如想要接入更多的数据接口，不需要改动原来的代码
 * @author: jiangzq
 * @create: 2019-09-28 09:58
 **/
public class UserServiceImpl implements UserService {
    //private UserDao userDao = new UserDaoMySqlImpl();//出现对象与数据获取一致对应的高耦合性,所以就不用去new它，把它设置为null
    private UserDao userDao = null;
    //给他提供一个set方法
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void getUser() {//service里面这个方法是根据dao完成的（写业务）
        userDao.getUser();
    }
}
