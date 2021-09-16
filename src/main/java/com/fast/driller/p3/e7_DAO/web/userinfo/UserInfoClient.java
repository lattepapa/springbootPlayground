package com.fast.driller.p3.e7_DAO.web.userinfo;

import com.fast.driller.p3.e7_DAO.domain.userinfo.UserInfo;
import com.fast.driller.p3.e7_DAO.domain.userinfo.dao.UserInfoDao;
import com.fast.driller.p3.e7_DAO.domain.userinfo.dao.mysql.UserInfoMysqlDao;
import com.fast.driller.p3.e7_DAO.domain.userinfo.dao.oracle.UserInfoOracleDao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class UserInfoClient {
    public static void main(String[] args) throws IOException {
        UserInfo userInfo = new UserInfo();
        userInfo.setUserId("1001");
        userInfo.setUserName("이순신");
        userInfo.setPassword("거북선123!");

        // 인터페이스를 통해 MySQL 또는 Oracle DML이 정의된 인터페이스를 사용할 수 있도록 프로퍼티 파일을 읽어들임
        // FileInputStream 클래스로 읽어들이는 파일은 항상 프로젝트 루트경로에 위치해야 한다.
        FileInputStream fis = new FileInputStream("p3e7_db.properties");

        // 프로퍼티 파일을 key-value로 읽어들임
        Properties prop = new Properties();
        prop.load(fis);
        String dbType = prop.getProperty("DATABASE_TYPE");

        // 프로퍼티 파일에 저장된 DATABASE_TYPE의 값에 따라 그에 맞는 RDBMS 인터페이스 선택
        UserInfoDao userInfoDao = null;
        if(dbType.equals("ORACLE")) {
            userInfoDao = new UserInfoOracleDao();
        } else if(dbType.equals("MYSQL")) {
            userInfoDao = new UserInfoMysqlDao();
        } else {
            System.out.println("There is no available db connection string");
            return;
        }

        // 결정된 RDBMS 인터페이스를 활용하여 UserInfo 인스턴스 내용을 DML 활용
        userInfoDao.insertUserInfo(userInfo);
        userInfoDao.updateUserInfo(userInfo);
        userInfoDao.deleteUserInfo(userInfo);

        //    INSERT INTO User (userid, username, password) VALUES ('1001', '이순신', '거북선123!')
        //    UPDATE username = '이순신' FROM USER WHERE userid = '1001'
        //    DELETE FROM User WHERE userid = '1001'
    }
}
