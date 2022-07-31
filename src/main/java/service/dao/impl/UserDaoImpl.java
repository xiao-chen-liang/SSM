package service.dao.impl;

import service.UserService;

public class UserDaoImpl {

    private UserService userService;

    public UserService getUserService(){
        return userService;
    }

    public void setUserService(UserService userService){
        this.userService = userService;
    }
}
