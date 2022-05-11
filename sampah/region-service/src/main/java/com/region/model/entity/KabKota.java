package com.region.model.entity;

// import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
// import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "kab_kota")
public class KabKota {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int kode_kabkota;
    private String nama_kabkota;
    // @Column(name = "kode_provinsi")
    // private int kodeProvinsi;
    @ManyToOne
    private Provinsi provinsi;

    public KabKota(){

    }

    public KabKota(int id, int kode_kabkota, String nama_kabkota, int kodeProvinsi){
        this.id = id;
        this.kode_kabkota = kode_kabkota;
        this.nama_kabkota = nama_kabkota;
        // this.kodeProvinsi = kodeProvinsi;
    }

    public int getId(){
        return id;
    }

    public int getKodeKabKota(){
        return kode_kabkota;
    }

    public String getNamaKabKota(){
        return nama_kabkota;
    }

    // public int getKodeProvinsi(){
    //     return kodeProvinsi;
    // }

    public void setId(int id){
        this.id = id;
    }

    public void setKodeKabKota(int kode_kabkota){
        this.kode_kabkota = kode_kabkota;
    }

    public void setNamaKabKota(String nama_kabkota){
        this.nama_kabkota = nama_kabkota;
    }

    // public void setKodeProvinsi(int kodeProvinsi){
    //     this.kodeProvinsi = kodeProvinsi;
    // }
}
