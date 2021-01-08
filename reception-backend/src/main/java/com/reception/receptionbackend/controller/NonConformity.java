package com.reception.receptionbackend.controller;

import com.reception.receptionbackend.model.ExpectedSample;
import com.reception.receptionbackend.model.NcCondition;
import com.reception.receptionbackend.model.NcData;
import com.reception.receptionbackend.model.NcInfo;
import com.reception.receptionbackend.repository.NcConditionRepository;
import com.reception.receptionbackend.repository.NcDataRepository;
import com.reception.receptionbackend.repository.NcInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins ="http://localhost:4200")
@RestController
@RequestMapping("api/nc")
public class NonConformity {

    @Autowired
    private NcInfoRepository ncInfoRepo;
    @Autowired
    private NcConditionRepository ncCondRepo;
    @Autowired
    private NcDataRepository ncDataRepo;

    @GetMapping(value = "/info")
    public List<NcInfo> getNcInfos(){ return ncInfoRepo.findAll();}
    @PostMapping(value = "/info")
    public void addNcInfo(@RequestBody NcInfo body){ncInfoRepo.save(body);}
    @PutMapping(value = "/info")
    public void updateNcInfo(@RequestBody NcInfo body){ ncInfoRepo.save(body);}
    @DeleteMapping(value = "/info")
    public void deleteNcInfo(@RequestBody NcInfo body){ncInfoRepo.delete(body); }
    /* @GetMapping (value = "/info/{id}")
    public NcInfo ncInfoById(@PathVariable int id){ return ncInfoRepo.findById(id); } */

    @GetMapping(value = "/cond")
    public List<NcCondition> getNcConditions(){return ncCondRepo.findAll();}
    @PostMapping(value = "/cond")
    public void addNcCondition(@RequestBody NcCondition body){ncCondRepo.save(body);}
    @PutMapping(value = "/cond")
    public void updateCondition(@RequestBody NcCondition body){ ncCondRepo.save(body);}
    @DeleteMapping(value = "/cond")
    public void deleteNcCondition(@RequestBody NcCondition body){ncCondRepo.delete(body);}

    @GetMapping(value = "/data")
    public List<NcData> getNcData(){return ncDataRepo.findAll();}
    @PostMapping(value = "/data")
    public void addNcData(@RequestBody NcData body){ncDataRepo.save(body);}
    @PutMapping(value = "/data")
    public void updateData(@RequestBody NcData body){ ncDataRepo.save(body);}
    @DeleteMapping(value = "/data")
    public void deleteNcData(@RequestBody NcData body){ncDataRepo.delete(body);}
    @GetMapping (value = "/data/{id}")
    public List<NcData> getById(@PathVariable long id){return ncDataRepo.findById(id);}
    @GetMapping (value = "/data/params")
    public List<NcData> getByParam(@RequestParam Map<String, String> listParams)
    {
    try {
            if (listParams.containsKey("sampleId")) {
                String str = listParams.get("sampleId");
                if (str != null && !str.trim().isEmpty()) return ncDataRepo.findBySampleID(Long.parseLong(str));
            }
            if (listParams.containsKey("id")) {
                String str = listParams.get("id");
                if (str != null && !str.trim().isEmpty()) return ncDataRepo.findById(Long.parseLong(str));
            }
        return new ArrayList<NcData>();
        }
        catch (Exception ex)
        {
           return new ArrayList<NcData>();
        }
    }
}
