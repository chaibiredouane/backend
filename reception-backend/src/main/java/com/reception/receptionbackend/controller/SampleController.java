package com.reception.receptionbackend.controller;

import com.reception.receptionbackend.model.ExpectedSample;
import com.reception.receptionbackend.model.Sample;
import com.reception.receptionbackend.repository.ExpectedSampleRepository;
import com.reception.receptionbackend.repository.SampleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@CrossOrigin(origins ="http://localhost:4200")
@RestController
@RequestMapping("api/samples")
public class SampleController {

    @Autowired
    private SampleRepository sampleRepository;
    @Autowired
    private ExpectedSampleRepository expectedRepo;

    @GetMapping ()
    public List<Sample> getAllSamples(){
        return sampleRepository.findAll();
    }

    @GetMapping (value = "/{id}")
    public Sample sampleById(@PathVariable int id){
        return sampleRepository.findById(id);
    }

    @PostMapping
      public ResponseEntity<Object> addSample(@RequestBody Sample body){
        Sample samp=sampleRepository.save(body);

        if(samp == null){ return ResponseEntity.noContent().build();}

        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id").buildAndExpand(samp.getId()).toUri();

        return ResponseEntity.created(location).build();
    }

    @DeleteMapping(value = "/{id}")
    public void deleteSample(@PathVariable("id") int id){
        sampleRepository.delete(sampleById(id));
    }

    @PutMapping()
    public void updateSample(@RequestBody Sample expectedSample){
        sampleRepository.save(expectedSample);
    }

  /*  @GetMapping(value = "/sampleQuery/{param1}")
    public List<Sample> testQuery(@PathVariable int param1){
        return sampleRepository.testQuery(param1);
    }
   */

    @GetMapping (value = "/expected")
    public List<ExpectedSample> expectedSamples(){
        return expectedRepo.findAll();
    }

    @GetMapping (value = "/expected/{id}")
    public ExpectedSample expectedsampleById(@PathVariable int id){
        return expectedRepo.findById(id);
    }

    @PostMapping (value = "/expected")
    public ResponseEntity<Object> addExpectedSample(@RequestBody ExpectedSample expectedSample){
        ExpectedSample samp=expectedRepo.save(expectedSample);

        if(samp == null){ return ResponseEntity.noContent().build();}

        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id").buildAndExpand(samp.getId()).toUri();

        return ResponseEntity.created(location).build();
    }

    @DeleteMapping(value = "/expected/{id}")
    public void deleteExpectedSample(@PathVariable("id") int id){
        expectedRepo.delete(expectedsampleById(id));
    }

    @PutMapping(value = "/expected")
    public void updateExpectedSample(@RequestBody ExpectedSample expectedSample){
        expectedRepo.save(expectedSample);
    }
}
