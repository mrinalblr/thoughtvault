package com.thoughtvault.repository;

import com.thoughtvault.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User,Integer> {

    User findByEmailId(String emailId);
}
