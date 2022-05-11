package com.region.model.entity;

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
    private int kode_provinsi;
    private String nama_provinsi;

    public Provinsi(){
        
    }

    public Provinsi(int id, int kode_provinsi, String nama_provinsi){
        this.id = id;
        this.kode_provinsi = kode_provinsi;
        this.nama_provinsi = nama_provinsi;
    }

    public int getId(){
        return id;
    }

    public int getKodeProvinsi(){
        return kode_provinsi;
    }

    public String getNamaProvinsi(){
        return nama_provinsi;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setKodeProvinsi(int kode_provinsi){
        this.kode_provinsi = kode_provinsi;
    }

    public void setNamaProvinsi(String nama_provinsi){
        this.nama_provinsi = nama_provinsi;
    }
}
