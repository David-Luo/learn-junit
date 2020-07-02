package xin.luowei.learn.junit.mockito.repository;

import xin.luowei.learn.junit.mockito.User;

public interface MailClient {

    void sendUserRegistrationMail(User user);
    
}
