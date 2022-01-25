package dices.entity;

import java.util.Date;



import javax.persistence.Id;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;



@Document(collection="DiceThrow")
public class DiceThrow {
	
	@Id
	private String id;
	
	@Field(name="throwNumber")
	private int throwNumber;
	
	@Field(name="dice1")
	private int dice1;
	
	@Field(name="dice2")
	private int dice2;
	
	@Field(name="throwValue")
	private int throwValue;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Field(name="Date_throw")
	private Date date_throw;
	
	
	
	@Field(name="playerid")
	private String playerid;
	
	public DiceThrow() {}

	public DiceThrow(int thorwNumber, Date date_throw, String playerid) {
		super();
		this.throwNumber = thorwNumber;
		
		this.date_throw = date_throw;
		this.playerid = playerid;
	}

	public DiceThrow(int dice1, int dice2, String playerid, Date date_throw , int throwValue) {
		// TODO Auto-generated constructor stub
		
		this.dice1=dice1;
		this.dice2=dice2;
		this.playerid=playerid;
		this.date_throw=date_throw;
		this.throwValue=throwValue;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getThorwNumber() {
		return throwNumber;
	}

	public void setThorwNumber(int thorwNumber) {
		this.throwNumber = thorwNumber;
	}
	
	

	

	

	public int getThrowValue() {
		return throwValue;
	}

	public void setThrowValue(int throwValue) {
		this.throwValue = throwValue;
	}

	public int getDice1() {
		return dice1;
	}

	public void setDice1(int dice1) {
		this.dice1 = dice1;
	}

	public int getDice2() {
		return dice2;
	}

	public void setDice2(int dice2) {
		this.dice2 = dice2;
	}

	public Date getDate_throw() {
		return date_throw;
	}

	public void setDate_throw(Date date_throw) {
		this.date_throw = date_throw;
	}

	public String getPlayerid() {
		return playerid;
	}

	public void setPlayerid(String playerid) {
		this.playerid = playerid;
	}
	
	


	@Override
	public String toString() {
		return "DiceThrow [id=" + id + ", thorwNumber=" + throwNumber + ", dice1=" + dice1 + ", dice2=" + dice2
				+ ", throwValue=" + throwValue + ", date_throw=" + ", playerid=" + playerid + "]";
	}

	
	
	

}
