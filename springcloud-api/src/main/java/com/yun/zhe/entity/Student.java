package com.yun.zhe.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@Entity
@Table(name="student")
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
public class Student implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5349568325098570504L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	@Column(name = "name")
	private String name;
}
