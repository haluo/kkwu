package com.szc.service.dao.impl;

import com.szc.service.dao.IUserDao;
import com.szc.service.domain.User;
import org.springframework.stereotype.Repository;

import java.util.Map;

/**
 * Created by shizhizhong on 15/2/10.
 */
@Repository
public class UserDao extends BaseDao implements IUserDao{


    @Override
    public User get(Map<String, Object> map) {
        return (User)queryForObject("User.get", map);
    }


}
