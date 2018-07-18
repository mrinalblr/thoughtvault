package com.thoughtvault.service;

import com.thoughtvault.model.request.UserRequest;
import com.thoughtvault.model.response.Response;
import com.thoughtvault.model.response.UserResponse;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    public Response createUser(UserRequest user);
    public Response getUserInfo(String emailId);
    public Response resetPassword(UserRequest userRequest);
}
