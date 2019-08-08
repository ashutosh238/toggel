package com.kcr.KCRDatabase.DaoImpl;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kcr.KCRDatabase.Dao.UserDao;
import com.kcr.KCRDatabase.model.User;

@Repository("userDAO")
@Transactional
public class UserDaoImpl implements UserDao {
	@Autowired
    private SessionFactory sessionFactory;
	public boolean saveUser(User user) {
		try {
            sessionFactory.getCurrentSession().save(user);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
	}


