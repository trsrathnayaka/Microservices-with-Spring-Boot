package com.nsbm.bankingapp.bankingApp.service;

import com.nsbm.bankingapp.bankingApp.model.UsersModel;

import java.util.List;

public interface UserService {

    UsersModel insert(UsersModel user);


    UsersModel fetchUser(int id);

    List<UsersModel> fetchAllUsers();

    boolean delete(int id);
}