package com.driver;

import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class WhatsappService {
    public void createUser(String name  , String mobile) {
        
    }

    public Group createGroup(List<User> users) {
        
    }

    public int createMessage(String content) {
    }

    public int sendMessage(Message message, User sender, Group group) {
    }

    public String findMessage(Date start, Date end, int k) {
    }

    public int removeUser(User user) {
    }

    public String changeAdmin(User approver, User user, Group group) {
    }
}
