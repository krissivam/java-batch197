package com.axis.batch197.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.axis.batch197.model.XSertifikasiModel;

@Repository
public interface XSertifikasiRepo extends JpaRepository<XSertifikasiModel, Long> {

}
