package com.negara.negaraservice.controller;

import com.negara.negaraservice.model.entity.Negara;
import com.negara.negaraservice.service.NegaraService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/negara")
public class NegaraController {
    
    @Autowired
    NegaraService negaraService;

    @PostMapping("/")
    public Negara save(@RequestBody Negara negara){
        return negaraService.save(negara);
    }

    @GetMapping("/get-negara")
    public Iterable<Negara> findAll(){
        return negaraService.findAll();
    }
}
