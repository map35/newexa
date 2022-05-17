package com.masterdataservice.masterdataservice.controller;

import java.util.List;

import com.masterdataservice.masterdataservice.model.entity.AcOpenPurpose;
import com.masterdataservice.masterdataservice.model.entity.BDPosition;
import com.masterdataservice.masterdataservice.model.entity.BusinessType;
import com.masterdataservice.masterdataservice.model.entity.District;
import com.masterdataservice.masterdataservice.model.entity.MasterData;
import com.masterdataservice.masterdataservice.model.entity.Product;
import com.masterdataservice.masterdataservice.model.entity.Province;
import com.masterdataservice.masterdataservice.model.entity.Regency;
import com.masterdataservice.masterdataservice.model.entity.Sector;
import com.masterdataservice.masterdataservice.model.entity.Segment;
import com.masterdataservice.masterdataservice.model.entity.SideCoSector;
import com.masterdataservice.masterdataservice.response.ResponseHandler;
import com.masterdataservice.masterdataservice.service.MasterDataService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/masterdata")
public class MasterDataController {
    
    @Autowired MasterDataService masterDataService;

    @GetMapping(value = "/get_all_province")
    public ResponseEntity<Object> getAllProvince(){
        
        List<Province> provinceList = masterDataService.getAllProvince();

        if(provinceList.size() == 0 || provinceList.isEmpty() || provinceList == null){
            boolean is_success = false;
            return ResponseHandler.generateResponse("Province cannot found!", HttpStatus.OK, true, is_success);
        }

        // boolean is_success = false;
        return ResponseHandler.generateResponse("Get All Provinces Success!", HttpStatus.OK, true, provinceList);
    }

    @GetMapping(value = "/get_regencies_by_province_id/{id}")
    public ResponseEntity<Object> getRegenciesByProvinceId(@PathVariable(required = true) String id){
        
        List<Regency> regenciesList = masterDataService.getRegencyByProvinceId(id);

        if(regenciesList == null){
            boolean is_success = false;
            return ResponseHandler.generateResponse("Disctrict cannot found!", HttpStatus.OK, true, is_success);
        }

        if(regenciesList.size() == 0 || regenciesList.isEmpty() || regenciesList == null){
            boolean is_success = false;
            return ResponseHandler.generateResponse("Regencies cannot found!", HttpStatus.OK, true, is_success);
        }

        // boolean is_success = false;
        return ResponseHandler.generateResponse("Get All Regencies By Province Id Success!", HttpStatus.OK, true, regenciesList);
    }

    // @GetMapping(value = "/get_district_by_regency_id/{id}")
    // public ResponseEntity<Object> getDistrictByRegencyId(@PathVariable(required = true) String id){
        
    //     List<District> districtList = masterDataService.getDistrictByRegencyId(id);
        
    //     if(districtList == null){
    //         boolean is_success = false;
    //         return ResponseHandler.generateResponse("Disctrict cannot found!", HttpStatus.OK, true, is_success);
    //     }

    //     if(districtList.size() == 0 || districtList.isEmpty() || districtList == null){
    //         boolean is_success = false;
    //         return ResponseHandler.generateResponse("Disctrict cannot found!", HttpStatus.OK, true, is_success);
    //     }

    //     // boolean is_success = false;
    //     return ResponseHandler.generateResponse("Get All District By Regency Id Success!", HttpStatus.OK, true, districtList);
    // }

    @GetMapping(value = "/get_province_data_by_id/{id}")
    public ResponseEntity<Object> getProvinceDatabyProvinceId(@PathVariable(required = true) String id){
        
        Province province= masterDataService.getProvinceDataById(id);

        if(province == null){
            boolean is_success = false;
            return ResponseHandler.generateResponse("Province cannot found!", HttpStatus.OK, true, is_success);
        }

        // boolean is_success = false;
        return ResponseHandler.generateResponse("Get Province Data Success!", HttpStatus.OK, true, province);
    }

    @GetMapping(value = "/get_regency_data_by_id/{id}")
    public ResponseEntity<Object> getRegencyDatabyProvinceId(@PathVariable(required = true) String id){
        
        Regency regency = masterDataService.getRegencyDataById(id);

        if(regency == null){
            boolean is_success = false;
            return ResponseHandler.generateResponse("Regency cannot found!", HttpStatus.OK, true, is_success);
        }

        // boolean is_success = false;
        return ResponseHandler.generateResponse("Get Regency Data Success!", HttpStatus.OK, true, regency);
    }

    // @GetMapping(value = "/get_district_data_by_id/{id}")
    // public ResponseEntity<Object> getDistrictDatabyProvinceId(@PathVariable(required = true) String id){
        
    //     District districts = masterDataService.getDistrictDataById(id);

    //     if(districts == null){
    //         boolean is_success = false;
    //         return ResponseHandler.generateResponse("District cannot found!", HttpStatus.OK, true, is_success);
    //     }

    //     // boolean is_success = false;
    //     return ResponseHandler.generateResponse("Get District Data Success!", HttpStatus.OK, true, districts);
    // }
    
    @GetMapping(value = "/getallmasterdata")
    public ResponseEntity<Object> getAllMasterData(){
        
        List<AcOpenPurpose> acOpenPurposes = masterDataService.getAcOpenPurposes();
        List<BDPosition> bdPositions = masterDataService.getBdPositions();
        List<BusinessType> businessTypes = masterDataService.getBusinessTypes();
        List<Product> products = masterDataService.getProduct();
        List<Sector> sectors = masterDataService.getSectors();
        List<Segment> segments = masterDataService.getSegments();
        List<SideCoSector> sideCoSectors = masterDataService.getsSideCoSectorRepos();


       if(acOpenPurposes != null && 
       bdPositions != null && 
       businessTypes != null &&
       products != null &&
       sectors != null &&
       segments != null &&
       sideCoSectors != null ){
           MasterData masterdata = new MasterData();
           masterdata.setAcOpenPurposes(acOpenPurposes);
           masterdata.setBdPositions(bdPositions);
           masterdata.setBusinessTypes(businessTypes);
           masterdata.setProducts(products);
           masterdata.setSectors(sectors);
           masterdata.setSegments(segments);
           masterdata.setSideCoSectors(sideCoSectors);

           return ResponseHandler.generateResponse("Get All Master Data Sucess!", HttpStatus.OK, true, masterdata);
       }
       return ResponseHandler.generateResponse("Get All Master Data Failed!", HttpStatus.OK, true, false);
       
    }
}
