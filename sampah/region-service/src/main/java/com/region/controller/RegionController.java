package com.region.controller;

import java.util.List;

import com.region.model.entity.KabKota;
import com.region.model.entity.Negara;
import com.region.model.entity.Provinsi;
import com.region.response.ResponseHandler;
import com.region.service.RegionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/region")
public class RegionController {
    
    @Autowired
    RegionService regionService;

    @PostMapping("/")
    public Negara saveNegara(@RequestBody Negara negara){
        return regionService.saveNegara(negara);
    }

    @GetMapping("/get")
    public Iterable<Negara> findAll(){
        return regionService.findAll();
    }

    @GetMapping("/get_all_negara")
    public ResponseEntity<Object> getAllNegara(){
        
        List<Negara> negaraList = regionService.getAllNegara();

        // if(negaraList.size() == 0 || negaraList.isEmpty() || negaraList == null){
        //     boolean is_success = false;
        //     return ResponseHandler.generateResponse("Province cannot found!", HttpStatus.OK, true, is_success);
        // }

        // boolean is_success = false;
        return ResponseHandler.generateResponse("Get All Provinces Success!", HttpStatus.OK, true, negaraList);
    }

    @GetMapping("/get_all_provinsi")
    public ResponseEntity<Object> getAllProvinsi(){
        
        List<Provinsi> provinsiList = regionService.getAllProvinsi();

        if(provinsiList.size() == 0 || provinsiList.isEmpty() || provinsiList == null){
            boolean is_success = false;
            return ResponseHandler.generateResponse("Province cannot found!", HttpStatus.OK, true, is_success);
        }

        // boolean is_success = false;
        return ResponseHandler.generateResponse("Get All Provinces Success!", HttpStatus.OK, true, provinsiList);
    }

    @GetMapping(value = "/get_kabkota_by_kode_provinsi/{kode_provinsi}")
    public ResponseEntity<Object> getKabKotaByKodeProvinsi(@PathVariable(required = true) int kode_provinsi){
        
        List<KabKota> kabkotaList = regionService.getKabKotaByKodeProvinsi(kode_provinsi);

        if(kabkotaList == null){
            boolean is_success = false;
            return ResponseHandler.generateResponse("Disctrict cannot found!", HttpStatus.OK, true, is_success);
        }

        if(kabkotaList.size() == 0 || kabkotaList.isEmpty() || kabkotaList == null){
            boolean is_success = false;
            return ResponseHandler.generateResponse("Regencies cannot found!", HttpStatus.OK, true, is_success);
        }

        // boolean is_success = false;
        return ResponseHandler.generateResponse("Get All Regencies By Province Id Success!", HttpStatus.OK, true, kabkotaList);
    }
}
