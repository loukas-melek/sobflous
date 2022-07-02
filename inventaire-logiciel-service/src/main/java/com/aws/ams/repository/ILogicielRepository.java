package com.aws.ams.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aws.ams.entity.ILogiciel;
@Repository("ILogicielRepository")
public interface ILogicielRepository extends JpaRepository<ILogiciel, Long>{

}
