package com.sadanathil.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sadanathil.entities.StudentsModel;

@Repository
public interface IStudentRepository extends JpaRepository<StudentsModel,Long>{

}
