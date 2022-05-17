package com.masterdataservice.masterdataservice.model.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "segment")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Segment {
    
    @Id
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String description;

    public String getDescription() {
        return description;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setDescription(String description) {
        this.description = description;
    }
}
