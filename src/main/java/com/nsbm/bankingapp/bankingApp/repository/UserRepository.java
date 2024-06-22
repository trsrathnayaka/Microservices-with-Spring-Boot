package com.nsbm.bankingapp.bankingApp.repository;


import com.nsbm.bankingapp.bankingApp.model.UsersModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UsersModel, Integer> {
    // Add custom query methods if needed
}