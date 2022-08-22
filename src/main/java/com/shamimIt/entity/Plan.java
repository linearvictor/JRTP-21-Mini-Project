package com.shamimIt.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import lombok.Data;

@Entity
@Table(name = "PLAN")
@Data
public class Plan {

	@Id
	@GeneratedValue
	private Integer planId;
	
	private String planName;
	private Date planStartDate;
	private Date planEndDate;
	private Integer planCategoryId;
	private String activeSw;

	@Column(name = "CREATE_DATE", updatable = false)
	@CreationTimestamp
	private Date createDate;

	@Column(name = "UPDATE_DATE", insertable = true)
	@CreationTimestamp
	private Date updateDate;
	private String createdBy;
	private String updatedBy;

}
