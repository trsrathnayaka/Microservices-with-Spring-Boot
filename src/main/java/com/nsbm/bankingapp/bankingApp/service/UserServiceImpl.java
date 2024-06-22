package com.nsbm.bankingapp.bankingApp.service;

import com.nsbm.bankingapp.bankingApp.model.UsersModel;
import com.nsbm.bankingapp.bankingApp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UsersModel insert(UsersModel user) {
        return userRepository.save(user);
    }

    @Override
    public UsersModel fetchUser(int id) {
        Optional<UsersModel> userOptional = userRepository.findById(id);
        return userOptional.orElse(null);
    }

    @Override
    public List<UsersModel> fetchAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public boolean delete(int id) {
        if (userRepository.existsById(id)) {
            userRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }
}