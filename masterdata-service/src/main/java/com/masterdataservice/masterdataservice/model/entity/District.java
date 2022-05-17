package com.masterdataservice.masterdataservice.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "district")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class District {
    
    @Id
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
    @Column(name = "regency_id")
    private String regencyId;
	private String name;
    
    public String getId() {
        return id;
    }
  
    public String getRegencyId() {
        return regencyId;
    }

    public void setRegencyId(String regencyId) {
        this.regencyId = regencyId;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setId(String id) {
        this.id = id;
    }
}
