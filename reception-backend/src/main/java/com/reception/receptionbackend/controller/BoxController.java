package com.reception.receptionbackend.controller;

import com.reception.receptionbackend.model.Box;
import com.reception.receptionbackend.model.NcInfo;
import com.reception.receptionbackend.repository.BoxRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins ="http://localhost:4200")
@RestController
@RequestMapping("api/box")
public class BoxController {
    @Autowired
    private BoxRepository boxRepo;

    @GetMapping()
    public List<Box> getAllBox(){ return boxRepo.findAll();}
    @PostMapping()
    public void addBox(@RequestBody Box body){boxRepo.save(body);}
    @PutMapping()
    public void updateBox(@RequestBody Box body){ boxRepo.save(body);}
    @DeleteMapping()
    public void deleteBox(@RequestBody Box body){boxRepo.delete(body); }
    @GetMapping (value = "/{id}")
    public Box BoxById(@PathVariable int id){ return boxRepo.findById(id); }
}
