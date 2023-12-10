package com.sadanathil.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sadanathil.entity.AdminModel;

@Repository
public interface IAdminRepository extends JpaRepository<AdminModel,Long> {

}
