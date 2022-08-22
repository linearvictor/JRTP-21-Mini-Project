package com.shamimIt.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import lombok.Data;

@Entity
@Table(name = "PLAN_CATEGORY")
@Data
public class PlanCategory {

	@Id
	@GeneratedValue
	private Integer categoryId;
	
	private String categoryName;
	private String activeSw;
	
	@Column(name = "CREATE_DATE", updatable = false)
	@CreationTimestamp
	private LocalDate createDate;
	
	@Column(name = "UPDATE_DATE", insertable = false)
	@CreationTimestamp
	private LocalDate updateDate;
	
	private String createdBy;
	private String updatedBy;

}
