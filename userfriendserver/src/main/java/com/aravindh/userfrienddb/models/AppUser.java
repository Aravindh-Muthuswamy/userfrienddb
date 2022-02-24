package com.aravindh.userfrienddb.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//App user entity
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AppUser {
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
	private int userId;
	private String username;
	private String password;
	private String emailid;
	private boolean activated;
}
