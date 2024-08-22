package com.in28minutes.rest.webservices.restful_web_services.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.in28minutes.rest.webservices.restful_web_services.user.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
