package com.provinsi.provinsiservice.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "provinsi")
public class Provinsi {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String namaProvinsi;

    public Provinsi(){

    }

    public Provinsi(int id, String namaProvinsi){
        this.id = id;
        this.namaProvinsi = namaProvinsi;
    }

    public int getId(){
        return id;
    }

    public String getNamaProvinsi(){
        return namaProvinsi;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setNamaProvinsi(String namaProvinsi){
        this.namaProvinsi = namaProvinsi;
    }
}
