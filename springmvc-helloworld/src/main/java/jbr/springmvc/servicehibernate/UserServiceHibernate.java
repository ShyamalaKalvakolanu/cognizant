package jbr.springmvc.servicehibernate;

import java.util.List;

import jbr.springmvc.pojos.Login;
import jbr.springmvc.pojos.User;

public interface UserServiceHibernate {
	void register(User user);
	  List<User> getAlluser();
	  User validateUser(Login login);
	  
	
}
