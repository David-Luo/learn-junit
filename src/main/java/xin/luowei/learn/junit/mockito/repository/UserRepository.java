package xin.luowei.learn.junit.mockito.repository;

import xin.luowei.learn.junit.mockito.User;

public interface UserRepository {

    User insert(User user);
    boolean isUsernameAlreadyExists(String userName);
    
}
