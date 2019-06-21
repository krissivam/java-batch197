package com.axis.batch197.utils;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.axis.batch197.model.UsersRoles;


@Repository
@Transactional
public class RolesDAO {
 
    @Autowired
    private EntityManager entityManager;
 
    public List<String> getRoleNames(Long usersId) {
        String sql = "Select ur.roles.roleName from " + UsersRoles.class.getName() + " ur " //
                + " where ur.users.usersId = :usersId ";
 
        Query query = this.entityManager.createQuery(sql, String.class);
        query.setParameter("usersId", usersId);
        return query.getResultList();
    }
 
}