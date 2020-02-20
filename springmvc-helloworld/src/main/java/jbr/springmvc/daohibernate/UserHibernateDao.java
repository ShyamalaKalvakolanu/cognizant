package jbr.springmvc.daohibernate;

import java.util.List;

import jbr.springmvc.pojos.Login;
import jbr.springmvc.pojos.User;

public interface UserHibernateDao {
	
		  void register(User user);
		  List<User> getAlluser();
		  User validateUser(Login login);
		  
}
