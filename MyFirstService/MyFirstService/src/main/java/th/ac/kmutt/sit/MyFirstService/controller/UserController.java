package th.ac.kmutt.sit.MyFirstService.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class UserController{

    private ArrayList<User> users;

    public UserController(){
        this.users =new ArrayList<User>();
        this.users.add(new User(1, "user1"));
        this.users.add(new User(2, "user2"));
        this.users.add(new User(3, "user3"));
        this.users.add(new User(4, "user4"));
        this.users.add(new User(5, "user5"));
    }

    @GetMapping("/user/1")
    public User getUser1(){
        return this.users.get(0);
    }

    @GetMapping("/user/2")
    public User getUser2(){
        return this.users.get(1);
    }

    @GetMapping("/user/3")
    public User getUser3(){
        return this.users.get(2);
    }

    @GetMapping("/user/4")
    public User getUser4(){
        return this.users.get(3);
    }

    @GetMapping("/user/5")
    public User getUser5(){
        return this.users.get(4);
    }

    @GetMapping("/user/users")
    public  ArrayList getUsers(){
        return this.users;
    }
}