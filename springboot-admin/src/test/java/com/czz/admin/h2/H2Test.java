package com.czz.admin.h2;

import com.czz.admin.dao.UserDao;
import com.czz.admin.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author chengzhzh@datangmobile.com
 * @create 2019-10-15 13:09
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class H2Test {
    @Autowired
    private UserDao userDao;

    @Test
    public void h2Test(){
        User zx = userDao.findByName("zx");
        System.out.println(zx);

    }
}
