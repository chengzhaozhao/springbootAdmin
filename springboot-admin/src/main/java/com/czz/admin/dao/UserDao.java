package com.czz.admin.dao;

import com.czz.admin.pojo.User;
import org.springframework.data.repository.CrudRepository;

/**
 * @author chengzhzh@datangmobile.com
 * @create 2019-10-15 13:06
 */
public interface UserDao extends CrudRepository<User,Long> {

    User findByName(String name);

    @Override
    Iterable<User> findAll();

    @Override
    void delete(User user);
}
