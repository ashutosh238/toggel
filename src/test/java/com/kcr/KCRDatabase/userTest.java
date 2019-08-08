/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kcr.KCRDatabase;


import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.kcr.KCRDatabase.Dao.UserDao;
import com.kcr.KCRDatabase.model.User;

/**
 *
 * @author sharma
 */
public class userTest {
	
	 static UserDao userDAO;
@BeforeClass
	public static void initialize()
	{
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		context.scan("com.kcr.KCRDatabase");
		context.refresh();
                userDAO = (UserDao)context.getBean("userDAO");
                System.out.println("dkfhisodhfiosdhfo");
        }
        @Test
        public void save(){
           User user=new User();
            user.setEmailId("avfdvfdgc@gmail.com");
            user.setHouseNumber(58);
            user.setName("Afdbfdosh");
            user.setPassword("passfbfgbrd");
            user.setPhoneNumber("7351077308");
            user.setSecurityAnswer("secubfgbnswer");
            user.setSecurityQuestion("securbfgestion");
          user.setSeqId(3);
            userDAO.saveUser(user);
            boolean result=userDAO.saveUser(user);
            Assert.assertEquals("save user",true,result );
        }
}
