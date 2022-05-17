package com.masterdataservice.masterdataservice.service;

import java.util.List;

import com.masterdataservice.masterdataservice.model.entity.AcOpenPurpose;
import com.masterdataservice.masterdataservice.model.entity.BDPosition;
import com.masterdataservice.masterdataservice.model.entity.BusinessType;
import com.masterdataservice.masterdataservice.model.entity.District;
import com.masterdataservice.masterdataservice.model.entity.Product;
import com.masterdataservice.masterdataservice.model.entity.Province;
import com.masterdataservice.masterdataservice.model.entity.Regency;
import com.masterdataservice.masterdataservice.model.entity.Sector;
import com.masterdataservice.masterdataservice.model.entity.Segment;
import com.masterdataservice.masterdataservice.model.entity.SideCoSector;
import com.masterdataservice.masterdataservice.model.repo.AcOpenPurposeRepo;
import com.masterdataservice.masterdataservice.model.repo.BDPositionRepo;
import com.masterdataservice.masterdataservice.model.repo.BusinessTypeRepo;
import com.masterdataservice.masterdataservice.model.repo.DistrictRepo;
import com.masterdataservice.masterdataservice.model.repo.ProductRepo;
import com.masterdataservice.masterdataservice.model.repo.ProvinceRepo;
import com.masterdataservice.masterdataservice.model.repo.RegencyRepo;
import com.masterdataservice.masterdataservice.model.repo.SectorRepo;
import com.masterdataservice.masterdataservice.model.repo.SegmentRepo;
import com.masterdataservice.masterdataservice.model.repo.SideCoSectorRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MasterDataService{
    
    @Autowired AcOpenPurposeRepo acOpenPurposeRepo;
    @Autowired BDPositionRepo bdPositionRepo;
    @Autowired BusinessTypeRepo businessTypeRepo;
    @Autowired DistrictRepo districtRepo;
    @Autowired ProductRepo productRepo;
    @Autowired ProvinceRepo provinceRepo;
    @Autowired RegencyRepo regencyRepo;
    @Autowired SectorRepo sectorRepo;
    @Autowired SegmentRepo segmentRepo;
    @Autowired SideCoSectorRepo sideCoSectorRepo;

    // Province
    public List<Province> getAllProvince(){
        List<Province> provinces = provinceRepo.findAll();
        if(provinces.size() == 0 || provinces.isEmpty() || provinces == null){
            return null;
        }
        return provinces;
    }
    public Province getProvinceDataById(String id){
        Province provinceData = provinceRepo.getById(id);
        if(provinceData != null){
            return provinceData;
        }
        return null;
    }

    // Regency
    public List<Regency> getRegencyByProvinceId(String id){
        List<Regency> regencies = regencyRepo.getByprovinceId(id);
        if(regencies.size() == 0 || regencies.isEmpty() || regencies == null){
            return null;
        }
        return regencies;
    }
    public Regency getRegencyDataById(String id){
        Regency regencyData = regencyRepo.getById(id);
        if(regencyData != null){
            return regencyData;
        }
        return null;
    }

    // District
    public List<District> getDistrictByRegencyId(String id){
        List<District> districts = districtRepo.findAll();
        if(districts.size() == 0 || districts.isEmpty() || districts == null){
            return null;
        }
        return districts;
    }
    public District getDistrictDataById(String id){
        District districtData = districtRepo.getById(id);
        if(districtData != null){
            return districtData;
        }
        return null;
    }

    // AcOpenPurpose
    public List<AcOpenPurpose> getAcOpenPurposes() {
        // TODO Auto-generated method stub
        List<AcOpenPurpose> acOpenPurposes = acOpenPurposeRepo.findAll();
        if(acOpenPurposes != null){
            return acOpenPurposes;
        }
        return null;
    }

    // BDPosition
    public List<BDPosition> getBdPositions() {
        // TODO Auto-generated method stub
        List<BDPosition> bdPositions = bdPositionRepo.findAll();
        if(bdPositions != null){
            return bdPositions;
        }
        return null;
    }

    // BusinessType
    public List<BusinessType> getBusinessTypes() {
        // TODO Auto-generated method stub
        List<BusinessType> businessTypes = businessTypeRepo.findAll();
        if(businessTypes != null){
            return businessTypes;
        }
        return null;
    }

    // Product
    public List<Product> getProduct() {
        // TODO Auto-generated method stub
        List<Product> products = productRepo.findAll();
        if(products != null){
            return products;
        }
        return null;
    }
    public Product getProductById(String id) {
        // TODO Auto-generated method stub
        Product product = productRepo.getById(id);
        if(product != null){
            return product;
        }
        return null;
    }

    // Sector
    public List<Sector> getSectors() {
        // TODO Auto-generated method stub
        List<Sector> sectors = sectorRepo.findAll();
        if(sectors != null){
            return sectors;
        }
        return null;
    }

    // Segement
    public List<Segment> getSegments() {
        // TODO Auto-generated method stub
        List<Segment> segments = segmentRepo.findAll();
        if(segments != null){
            return segments;
        }
        return null;
    }

    // SideCoSector
    public List<SideCoSector> getsSideCoSectorRepos() {
        // TODO Auto-generated method stub
        List<SideCoSector> sideCoSectors = sideCoSectorRepo.findAll();
        if(sideCoSectors != null){
            return sideCoSectors;
        }
        return null;
    }

}
