package dices.entity;

import java.util.Date;

import java.util.ArrayList;

import java.util.List;


import javax.persistence.Id;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;



@Document(collection="Players")
public class Player {
	@Id
	private String id;
	
	@Field(name="Name")
	private String name;
	
	@Field(name="Percent")
	private double percent;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Field(name="Date_at")
	private Date date_at;
	
	
	@Field(name="ThrowList")
	private List<DiceThrow> throwList=new ArrayList<DiceThrow>();
	
	public Player() {}

	public Player(String name, Date date_at) {
		super();
	
		this.name = name;
		this.date_at = date_at;
	}

	public Player(String id, String name, Date date_at, List<DiceThrow> throwList) {
		super();
		this.id = id;
		this.name = name;
		this.date_at = date_at;
		this.throwList = throwList;
	}

	public Player(String id, String string, Date instance) {
		// TODO Auto-generated constructor stub
		
		this.id = id;
		this.name = name;
		this.date_at = date_at;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

	public double getPercent() {
		return percent;
	}

	public void setPercent(double percent) {
		this.percent = percent;
	}

	public Date getDate_at() {
		return date_at;
	}

	public void setDate_at(Date date_at) {
		this.date_at = date_at;
	}

	public List<DiceThrow> getThrowList() {
		return throwList;
	}

	public void setThrowList(List<DiceThrow> throwList) {
		this.throwList = throwList;
	}

	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + ", date_at=" +  ", throwList=" + throwList + "]";
	}
	
	
}
