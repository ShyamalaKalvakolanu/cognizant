

package jbr.springmvc.daohibernate;



import java.sql.ResultSet;



import java.sql.SQLException;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.jdbc.core.RowMapper;

import org.springframework.stereotype.Repository;

import org.springframework.stereotype.Service;



import jbr.springmvc.pojos.Login;

import jbr.springmvc.pojos.User;

@Repository

public class UserHibernateDaoImpl implements UserHibernateDao {

 @Autowired

 private SessionFactory hibernate4AnnotatedSessionFactory;

 @Override

 public void register(User user) {

 if(hibernate4AnnotatedSessionFactory!=null){

 hibernate4AnnotatedSessionFactory.getCurrentSession().save(user);

 }

   }

 @Override

 public List<User> getAlluser() {

 // TODO Auto-generated method stub
	 Query query=hibernate4AnnotatedSessionFactory.getCurrentSession().createQuery("from User");
	 List<User> list=query.list();
	 

 return list;

 }

 @Override

 public User validateUser(Login login) {

 // TODO Auto-generated method stub

 return null;

 }





}

