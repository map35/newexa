package com.masterdataservice.masterdataservice.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "province")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Province {

    @Id
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
	private String name;
    
    public String getId() {
        return id;
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
