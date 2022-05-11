package com.twsservice.twsservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "cifPerusahaan")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CIFPerusahaan {

    @Id
    @Column(name = "id")
	private String id; //1
    @Column(name = "nama")
    private String nama;
    
    public String getId(){
        return id;
    }

    public String getNama(){
        return nama;
    }

    public void setId(String id){
        this.id = id;
    }

    public void setNama(String nama){
        this.nama = nama;
    }
}
