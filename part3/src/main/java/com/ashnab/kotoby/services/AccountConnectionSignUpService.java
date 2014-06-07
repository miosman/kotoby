package com.ashnab.kotoby.services;

import com.ashnab.kotoby.dao.UsersDao;
import org.springframework.social.connect.Connection;
import org.springframework.social.connect.ConnectionSignUp;
import org.springframework.social.connect.UserProfile;

public class AccountConnectionSignUpService implements ConnectionSignUp {

    private final UsersDao usersDao;

    public AccountConnectionSignUpService(UsersDao usersDao) {
        this.usersDao = usersDao;
    }

    public String execute(Connection<?> connection) {
        UserProfile profile = connection.fetchUserProfile();
        usersDao.createUser(profile.getUsername());
        return profile.getUsername();
    }

}