package com.region.service;

import java.util.List;
import java.util.Optional;

import com.region.model.entity.KabKota;
import com.region.model.entity.Negara;
import com.region.model.entity.Provinsi;
import com.region.model.repo.KabKotaRepo;
import com.region.model.repo.NegaraRepo;
import com.region.model.repo.ProvinsiRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegionService {
    
    @Autowired 
    NegaraRepo negaraRepo;
    @Autowired 
    ProvinsiRepo provinsiRepo;
    @Autowired 
    KabKotaRepo kabkotaRepo;

    

    public Negara saveNegara(Negara negara){
        return negaraRepo.save(negara);
    }

    public Iterable<Negara> findAll(){
        return negaraRepo.findAll();
    }

    public List<Negara> getAllNegara(){
        
        List<Negara> negara = negaraRepo.findAll();
        if(negara.size() == 0 || negara.isEmpty() || negara == null){
            return null;
        }
        return negara;
    }

    public List<Provinsi> getAllProvinsi(){

        List<Provinsi> provinsi = provinsiRepo.findAll();
        if(provinsi.size() == 0 || provinsi.isEmpty() || provinsi == null){
            return null;
        }
        return provinsi;
    }

    public List<KabKota> getKabKotaByKodeProvinsi(int kode_provinsi){

        List<KabKota> kabkota = kabkotaRepo.getByKodeProvinsi(kode_provinsi);
        if(kabkota.size() == 0 || kabkota.isEmpty() || kabkota == null){
            return null;
        }
        return kabkota;
    }
}
