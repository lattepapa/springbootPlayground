package com.fast.driller.p3.e7_DAO.domain.userinfo.dao;

import com.fast.driller.p3.e7_DAO.domain.userinfo.UserInfo;

public interface UserInfoDao {
    public void insertUserInfo(UserInfo userInfo);
    public void updateUserInfo(UserInfo userInfo);
    public void deleteUserInfo(UserInfo userInfo);
}
