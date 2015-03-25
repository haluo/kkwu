package com.szc.service.service.impl;

import com.szc.service.dao.IUserDao;
import com.szc.service.domain.User;
import com.szc.service.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;

/**
 * Created by shizhizhong on 15/2/10.
 */
@Service
public class UserService implements IUserService {

    @Resource
    private IUserDao userDao;


    @Override
    public User getById(final Long id) {
        return userDao.get(new HashMap<String, Object>(){
            {
                put("id", id);
            }
        });
    }
}
