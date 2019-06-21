package com.axis.batch197.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.axis.batch197.model.XAddressModel;



@Repository
public interface XAddressRepo extends JpaRepository<XAddressModel, Long>{

}
