package com.daffodilschool.schoolmanagement.service;


import com.daffodilschool.schoolmanagement.dto.LoginUserDto;
import com.daffodilschool.schoolmanagement.dto.UserDTO;
import com.daffodilschool.schoolmanagement.entity.User;

import java.util.List;

public interface UserService {
    List<UserDTO> getAllUsers();
    UserDTO getUserById(Long id);
    User createUser(UserDTO dto);
    User authenticate(LoginUserDto dto);
}
