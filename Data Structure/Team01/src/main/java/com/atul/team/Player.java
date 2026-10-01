package com.atul.team;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import jakarta.persistence.Table;

@Entity
@Table(name = "Player")
public class Player {
	
	@Id
	@Column(name = "id")
	int id ;
	@Column(name = "name")
	String name ;
	@Column(name = "jerseyNO")
	int jerseyNo;
	
	@ManyToOne(targetEntity = Team.class)
	
	 Team team;
	
	public Player() {
		
	}
	
	public Player(int id, String name, int jerseyNo, Team  batters ) {
		
		this.id = id;
		this.name = name;
		this.jerseyNo = jerseyNo;
		
		this.team= batters;
	}
	
	public void setTeam(Team team) {
		this.team=team;
	}
     public Team getTeam() {
    	 return this.team;
     }
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
	public int getJerseyNo() {
		return jerseyNo;
	}
	public void setJerseyNo(int jerseyNo) {
		this.jerseyNo = jerseyNo;
	}
	
	
}
