package com.logging.LogApp;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="LOGS")
public class logs {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	

	/*
	 * @Column(name = "empId") private int empId;
	 
	@Temporal(TemporalType.TIMESTAMP)
	Date date;
	
	
	 * @Column(name="logger") private String logger;
	 */
	@Column(name="level")
	private String level;
	
	@Column(name="message")
	private String message;

	
	public logs()
	{
		
	}
	
	public logs( /* int empId, String logger, Date creationDateTime,*/ String level, String message) {
		//this.date=date;
		/*
		 * this.empId= empId; this.logger = logger;
		 */
		this.level = level;
		this.message = message;
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	/*
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	
	 * public int getEmpId() { return empId; }
	 * 
	 * public void setEmpId(int empId) { this.empId = empId; }
	 * 
	 * public String getLogger() { return logger; }
	 * 
	 * public void setLogger(String logger) { this.logger = logger; }
	 */

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
