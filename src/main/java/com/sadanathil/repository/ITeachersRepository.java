package com.sadanathil.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sadanathil.entity.TeachersModel;

@Repository
public interface ITeachersRepository extends JpaRepository<TeachersModel,Long>{

}
