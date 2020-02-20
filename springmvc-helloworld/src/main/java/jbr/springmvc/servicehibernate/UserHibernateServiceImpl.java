package jbr.springmvc.servicehibernate;

import java.sql.ResultSet;

import java.sql.SQLException;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import jbr.springmvc.daohibernate.UserHibernateDao;
import jbr.springmvc.pojos.Login;
import jbr.springmvc.pojos.User;
@Service
public class UserHibernateServiceImpl implements UserServiceHibernate {
  @Autowired
  UserHibernateDao userHibernateDao;

@Override
public void register(User user) {
	// TODO Auto-generated method stub
	userHibernateDao.register(user);
}

@Override
public List<User> getAlluser() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public User validateUser(Login login) {
	// TODO Auto-generated method stub
	return null;
}
  
 
}