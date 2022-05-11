package com.provinsi.provinsiservice.controller;

import com.provinsi.provinsiservice.model.entity.Provinsi;
import com.provinsi.provinsiservice.service.ProvinsiService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/provinsi")
public class ProvinsiController {
    
    @Autowired
    ProvinsiService provinsiService;

    @PostMapping("/")
    public Provinsi save(@RequestBody Provinsi provinsi){
        return provinsiService.save(provinsi);
    }

    @GetMapping("/get-provinsi")
    public Iterable<Provinsi> findAll(){
        return provinsiService.findAll();
    }
}
