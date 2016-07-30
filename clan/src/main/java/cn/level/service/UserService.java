package cn.level.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.level.dao.UserDao;
import cn.level.entity.User;

@Service
public class UserService {

	@Autowired
	UserDao userDao;
	
	public void add(User user) throws Exception {
		System.out.println("1>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println("1>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		userDao.add(user);
		System.out.println("2>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println("2>>>>>>>>>>>>>>>>>>>>>>>>>>>");
	}

}
