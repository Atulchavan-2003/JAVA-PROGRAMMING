package com.atul.team;

import java.util.Set;
import java.util.TreeSet;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
@Entity
@Table(name = "team")
public class Team {
	
		@Id
		@Column(name = "teamId")
		int playerId;
		@Column(name = "teamName")
		String teamName;
		
		@OneToMany(targetEntity = Player.class, cascade = CascadeType.ALL)
		
		Set<Player> allBatters;
		
		
		public Team(int playerId, String teamName,Set<Player> batters) {
			super();
			this.playerId = playerId;
			this.teamName = teamName;
			this.allBatters=batters;
		}
	
		public int getPlayerId() {
			return playerId;
		}
		public void setPlayerId(int playerId) {
			this.playerId = playerId;
		}
		public String getPlayerName() {
			return teamName;
		}
		public void setPlayerName(String teamName) {
			this.teamName = teamName;
		}
		
		
		
}
