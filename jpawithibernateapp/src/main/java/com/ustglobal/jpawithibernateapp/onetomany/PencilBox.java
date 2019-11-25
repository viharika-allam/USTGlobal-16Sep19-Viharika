package com.ustglobal.jpawithibernateapp.onetomany;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString.Exclude;

@Data
@Table(name="pencilBox")
@Entity
public class PencilBox {
	
	@Id
	@Column
	private int bid;
	
	@Column
	private String bname;
	
	@Exclude
	@OneToMany(mappedBy="pencilBox")
	private List<Pencil> pencil;

}
