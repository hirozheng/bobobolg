package service;

import po.User;


public interface UserService {

    User checkUser(String username, String password);
}
