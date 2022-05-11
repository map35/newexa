package com.negara.negaraservice.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "negara")
public class Negara {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    // private int kode_negara;
    private String nama_negara;

    public Negara(){

    }

    public Negara(int id, int kode_negara, String nama_negara){
        this.id = id;
        // this.kode_negara = kode_negara;
        this.nama_negara = nama_negara;
    }

    public int getId(){
        return id;
    }

    // public int getKodeNegara(){
    //     return kode_negara;
    // }

    public String getNamaNegara(){
        return nama_negara;
    }

    public void setId(int id){
        this.id = id;
    }

    // public void setKodeNegara(int kode_negara){
    //     this.kode_negara = kode_negara;
    // }

    public void setNamaNegara(String nama_negara){
        this.nama_negara = nama_negara;
    }
}
