package com.dao;

import com.entity.User;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

//@Repository
public class UserDaoImpl extends HibernateDaoSupport {

//    public void setSessionFactory(SessionFactory sessionFactory){
//        this.sessionFactory = sessionFactory;
//    }
//
//    private HibernateTemplate getHibernateTemplate(){
//        if(hibernateTemplate == null){
//            hibernateTemplate = new HibernateTemplate(sessionFactory);
//        }
//        return hibernateTemplate;
//    }

    public void save(User user){
        getHibernateTemplate().save(user);
    }

}
