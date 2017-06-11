package com.spring.boot.user.dao;

import java.util.List;

import com.spring.boot.user.entity.User;

public interface UserDao {
	int insert(User user);
	
	User selectOneByCondition(User user);  
	
	User selectById(Integer id);  
    
    int updateById(User user);  
      
    int deleteById(Integer id);  
      
    List<User> queryAll(); 
}
