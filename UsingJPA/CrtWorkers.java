package com.Workers.create.db;

import javax.persistence.Id;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "workers")
public class CrtWorkers {
	@Id
	int id;
	String name;
	
	public CrtWorkers()
	{
		this.name="";
		this.id=0;
	}
	
	public void setname(String name)
	{
		this.name=name;
	}
	public void setid(int id)
	{
		this.id=id;
	}
	public String getname()
	{
		return name;
	}
	public int getid()
	{
		return id;
	}
	

}
