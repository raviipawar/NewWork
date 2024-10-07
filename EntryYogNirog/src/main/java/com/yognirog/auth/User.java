package com.yognirog.auth;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "users_registration")
public class User {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", nullable = false, unique = true)
	private Integer userId;
	@Column(name = "NAME",nullable = false, unique = true)
	private String name;
	@Column(name = "USERNAME",nullable = false, unique = true)
	private String username;
	@Column(name = "EMAIL",nullable = false, unique = true)
	private String email;
	@Column(name = "CONTACT.NO")
	private String contact_no;
	@Column(name = "PASSWORD")
	private String password;
	@Column(name = "ROLE")
	private String role;
}
