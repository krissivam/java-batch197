package com.axis.batch197.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.axis.batch197.model.XSumberLokerModel;

@Repository
public interface XSumberLokerRepo extends JpaRepository<XSumberLokerModel, Long> {

}