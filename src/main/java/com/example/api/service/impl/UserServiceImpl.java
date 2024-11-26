package com.example.api.service.impl;

import com.example.api.dto.UserDTO;
import com.example.api.entity.User;
import com.example.api.repository.UserRepository;
import com.example.api.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void save(UserDTO userDTO) {
        User user = User.builder().username(userDTO.getUsername()).password(userDTO.getPassword()).build();
        userRepository.save(user);
    }
}
