package com.axis.batch197.utils;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.axis.batch197.model.Users;

@Repository
@Transactional
public class UsersDAO {
 
    @Autowired
    private EntityManager entityManager;
 
    public Users findUserAccount(String email) {
        try {
            String sql = "Select e from " + Users.class.getName() + " e " //
                    + " Where e.email = :email ";
 
            Query query = entityManager.createQuery(sql, Users.class);
            query.setParameter("email", email);
 
            return (Users) query.getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }
    
}
 