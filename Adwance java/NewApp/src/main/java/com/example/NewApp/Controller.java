package com.example.NewApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {

    @Autowired
    private UserRepo repo;

   
    @PostMapping("/user1")
    public String storeRecord(
            @RequestParam String name,
            @RequestParam String password) {

        repo.save(new User(name, password));
        return "Record Added";
    }

    
    @GetMapping("/user2/{name}")
    public User getRecord(@PathVariable String name) {
        return repo.findByName(name);
    }

   
    @PutMapping("/user3/{atul}")
    public String updateRecord(
            @PathVariable String name,
            @RequestParam String newPassword) {

        User user = repo.findByName(name);

        if (user != null) {
            user.setPassword(newPassword);
            repo.save(user);
            return "Record updated";
        } else {
            return "User Not Found";
        }
    }

    
    @DeleteMapping("/user4/{name}")
    public String deleteUser(@PathVariable String name) {

        User user = repo.findByName(name);
        if (user == null) return "User Not Found";

        repo.delete(user);
        return "Deleted";
    }
}

