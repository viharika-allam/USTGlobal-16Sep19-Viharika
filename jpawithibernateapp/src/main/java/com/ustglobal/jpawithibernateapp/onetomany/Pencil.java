package com.ustglobal.jpawithibernateapp.onetomany;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Table(name="pencil")
@Entity
public class Pencil {
	
	@Id
	@Column
	private int pid;
	
	@Column
	private String color;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="bid",nullable = false)
	
	private PencilBox pencilBox;

}
