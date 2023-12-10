package com.sadanathil.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sadanathil.entity.SubjectsModel;

@Repository
public interface ISubjectsRepository extends JpaRepository<SubjectsModel,Long>{

}
