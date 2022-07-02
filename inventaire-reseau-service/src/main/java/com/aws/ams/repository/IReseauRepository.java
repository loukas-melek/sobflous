package com.aws.ams.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aws.ams.entity.IReseau;

@Repository("IReseauRepository")
public interface IReseauRepository extends JpaRepository<IReseau,Long>{

}
