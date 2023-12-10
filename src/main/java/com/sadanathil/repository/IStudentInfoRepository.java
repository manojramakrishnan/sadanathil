package com.sadanathil.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sadanathil.entity.StudentInfoModel;

@Repository
public interface IStudentInfoRepository extends JpaRepository<StudentInfoModel,Long>{

}
