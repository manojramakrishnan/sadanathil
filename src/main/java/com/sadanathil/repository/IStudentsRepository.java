package com.sadanathil.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sadanathil.entity.StudentsModel;

@Repository
public interface IStudentsRepository extends JpaRepository<StudentsModel,Long>{

}
