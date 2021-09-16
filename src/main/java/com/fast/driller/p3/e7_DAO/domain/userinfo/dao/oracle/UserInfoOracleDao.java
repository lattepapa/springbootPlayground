package com.fast.driller.p3.e7_DAO.domain.userinfo.dao.oracle;

import com.fast.driller.p3.e7_DAO.domain.userinfo.UserInfo;
import com.fast.driller.p3.e7_DAO.domain.userinfo.dao.UserInfoDao;

public class UserInfoOracleDao implements UserInfoDao {
    @Override
    public void insertUserInfo(UserInfo userInfo) {
        System.out.println("INSERT INTO User (userid, username, password) VALUES ('" + userInfo.getUserId() + "', '" + userInfo.getUserName() + "', '" + userInfo.getPassword() + "')");
    }

    @Override
    public void updateUserInfo(UserInfo userInfo) {
        System.out.println("UPDATE username = '" + userInfo.getUserName() + "' FROM USER WHERE userid = '" + userInfo.getUserId() + "'");
    }

    @Override
    public void deleteUserInfo(UserInfo userInfo) {
        System.out.println("DELETE FROM User WHERE userid = '" + userInfo.getUserId() + "'");
    }
}
