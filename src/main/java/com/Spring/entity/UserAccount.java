package com.Spring.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity(name = "useraccount")
@AllArgsConstructor
@NoArgsConstructor
public class UserAccount {

	@Id
	@Column(name = "type")
    String	type;

	@Column(name = "password")
    String password;    
    
	@Column(name = "employeeId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    String employeeId;

    public String getType() {
        return type;
    }

    public void setType(String username) {
    	this.type = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

}
