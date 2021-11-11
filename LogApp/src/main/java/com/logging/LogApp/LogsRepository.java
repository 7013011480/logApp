package com.logging.LogApp;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogsRepository extends JpaRepository<logs,Long> {
	/*
	 * List<logs> findAllByDateBetween(Date creationTimeStart, Date
	 * creationTimeEnd);
	 */	 
	
}
