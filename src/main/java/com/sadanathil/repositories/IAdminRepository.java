package com.sadanathil.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sadanathil.entities.AdminModel;

@Repository
public interface IAdminRepository extends JpaRepository<AdminModel,Long>{

}
