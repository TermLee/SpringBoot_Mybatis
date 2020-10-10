package com.term.demo.mapper;

import com.term.demo.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    List<User> getAllUsers();

    User getUserById(int id);

}
