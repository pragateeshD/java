package com.web_crud.pjct1.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private String email;
	private String project_name;
	private String language;
	private String DB;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getProject_name() {
		return project_name;
	}
	public void setProject_name(String project_name) {
		this.project_name = project_name;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getDB() {
		return DB;
	}
	public void setDB(String dB) {
		DB = dB;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", email=" + email + ", project_name=" + project_name
				+ ", language=" + language + ",DB=" + DB+"]";
	}
	
}
