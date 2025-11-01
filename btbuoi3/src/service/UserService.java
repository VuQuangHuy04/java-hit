package service;

import model.User;

import java.util.ArrayList;

public class UserService {
    ArrayList<User> DS = new ArrayList<>();
    public UserService(ArrayList<User> DS) {
        this.DS = DS;
    }
    public void getUserById(String userId){
        for (User a : DS) {
            if (a.getId().equals(userId)) {
                System.out.println(a.toString());
                return;
            }
        }

    }
    public void getAllUser(){
        for(User a : DS){
            System.out.println(a.toString());
        }
    }
}
