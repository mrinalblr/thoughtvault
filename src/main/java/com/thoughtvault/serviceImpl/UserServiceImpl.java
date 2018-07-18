package com.thoughtvault.serviceImpl;

import ch.qos.logback.core.CoreConstants;
import com.thoughtvault.domain.User;
import com.thoughtvault.model.request.UserRequest;
import com.thoughtvault.model.response.Response;
import com.thoughtvault.model.response.UserResponse;
import com.thoughtvault.repository.UserRepo;
import com.thoughtvault.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepo userRepo;
    @Override
    public Response createUser(UserRequest userRequest) {
        User user = new User(userRequest.getUsername(),userRequest.getEmailId(),userRequest.getContactNumber(), userRequest.getGender(),userRequest.getPassword());

        User addedUser =  userRepo.save(user);
        Response response = new Response(HttpStatus.CREATED.toString(),addedUser,"");
        return response;
    }

    @Override
    public Response getUserInfo(String emailId) {
        System.out.println(emailId);
        User user = (User)userRepo.findByEmailId(emailId);
        System.out.println(user.toString());
        System.out.println(user.getEmailId());
        UserResponse userResponse = new UserResponse(user.getUsername(),user.getEmailId(),user.getContactNumber(),user.getGender());

        Response response = new Response(HttpStatus.ACCEPTED.toString(),userResponse,"");
        return response;
    }

    @Override
    public Response resetPassword(UserRequest userRequest) {
        User user = (User)userRepo.findByEmailId(userRequest.getEmailId());
        if(user!=null) {
            if (user.getEmailId().equalsIgnoreCase(userRequest.getEmailId())) {
                User modifiedUser = user;
                modifiedUser.setPassword(userRequest.getPassword());
                User updatedUser = userRepo.save(modifiedUser);
                Response response = new Response(HttpStatus.CREATED.toString(),updatedUser,"");
                return response;
            }
        }
            return new Response(HttpStatus.BAD_REQUEST.toString(),null,"Sorry Email Id does not exist.Please try with valid Email Id");

    }
}
