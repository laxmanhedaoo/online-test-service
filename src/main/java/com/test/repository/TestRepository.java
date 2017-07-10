package com.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.common.entity.Test;

@Repository("testRepository")
public interface TestRepository extends JpaRepository<Test, Long>{

}
