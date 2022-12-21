package com.maven.HibernateExample.pojo;
import javax.persistence.Column;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity // this anntation specifies that the class is an entity
@Table(name="Movie")// the table in the db by which this entity mapped


public class Movie {

	
@Id 
@Column private int id; // the primary key of the entity
@Column private String  moviename,actor;// name of the entity



}
