package com.aravindh.userfrienddb.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Database {
	@Id
	@SequenceGenerator(
			name="user_sequence",
			sequenceName ="user_sequence",
			allocationSize = 1
			)
	@GeneratedValue(
			strategy = GenerationType.IDENTITY,
			generator = "user_sequence"
			)
	private int id;
	private String dbName;
	private String dbDescription;
	private String dbImage;
	@ManyToOne
	@JoinColumn(
			name="app_user_id",
			referencedColumnName = "userId"
			)
	private AppUser appUser;
}
