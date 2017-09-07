package com.taikun.test.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.taikun.test.entity.T01PsnEntity;



public interface T01PsnEntityRepository extends JpaRepository<T01PsnEntity,String>{
	public T01PsnEntity findByPid(String pid);
}
