package com.codewithgauri.blog.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.codewithgauri.blog.entities.User;



public interface UserRepo extends JpaRepository<User, Integer>{
	
}
