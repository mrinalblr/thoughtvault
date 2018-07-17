package com.thoughtvault.service;

import com.thoughtvault.model.request.UserRequest;
import com.thoughtvault.model.response.UserResponse;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    public String createUser(UserRequest user);
    public UserResponse getUserInfo(String emailId);
    public String resetPassword(UserRequest userRequest);
}
