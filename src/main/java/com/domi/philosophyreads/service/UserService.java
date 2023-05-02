package com.domi.philosophyreads.service;

import com.domi.philosophyreads.entities.User;
import com.domi.philosophyreads.presistance.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        Sort sortByTitleDesc = Sort.by(Sort.Direction.DESC, "userName");
        return userRepository.findAll();
    }
}
