package com.axis.batch197.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.axis.batch197.model.XRoleModel;

@Repository
public interface XRoleRepo extends JpaRepository<XRoleModel, Long> {
	
	public XRoleModel findByName(String name);

}
