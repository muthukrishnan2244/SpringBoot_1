package com.spring.sample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.sample.domain.UserData;

@Repository
public interface UserRepo extends JpaRepository<UserData, Long>{

}
