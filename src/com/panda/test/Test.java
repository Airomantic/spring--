package com.panda.test;

import com.panda.dao.impl.UserDaoMySqlImpl;
import com.panda.dao.impl.UserDaoOracleImpl;
import com.panda.service.impl.UserServiceImpl;

/**
 * @program: aliyun_spring
 * @description: （客户端）内置main()主方法进行测试，在这里来给它new 对象
 * @author: jiangzq
 * @create: 2019-09-28 10:15
 **/
public class Test {//psvm快捷键
    public static void main(String[] args) {
        //所以解决高耦合性,不改变原来代码，在这里来给它对象方法
        UserServiceImpl userService = new UserServiceImpl();
        userService.setUserDao(new UserDaoMySqlImpl());
        userService.getUser();
        System.out.println("------------");
        userService.setUserDao(new UserDaoOracleImpl());
        userService.getUser();
    }
}
