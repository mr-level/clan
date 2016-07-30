package cn.level.dao;

import org.springframework.stereotype.Repository;

import cn.level.common.DAO;
import cn.level.entity.User;

@Repository
public class UserDao extends DAO {

	@SuppressWarnings("unchecked")
	public void add(User user) throws Exception {
		System.out.println("3<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
		System.out.println("3<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
		System.out.println(user);
		insert("cn.level.entity.User.insert", user);
		System.out.println("4<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
		System.out.println("4<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
	}

}
