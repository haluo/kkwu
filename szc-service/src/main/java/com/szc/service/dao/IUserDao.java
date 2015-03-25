package com.szc.service.dao;

import com.szc.service.domain.User;

import java.util.Map;

/**
 * Created by shizhizhong on 15/2/10.
 */
public interface IUserDao {

    public User get( Map<String, Object> map);
}
