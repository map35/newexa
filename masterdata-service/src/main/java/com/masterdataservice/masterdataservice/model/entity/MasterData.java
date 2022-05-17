package com.masterdataservice.masterdataservice.model.entity;

import java.util.List;

public class MasterData {
    private List<AcOpenPurpose> acOpenPurposes;
    private List<BDPosition> bdPositions;
    private List<BusinessType> businessTypes;
    private List<Product> products;
    private List<Sector> sectors;
    private List<Segment> segments;
    private List<SideCoSector> sideCoSectors;

    public List<AcOpenPurpose> getAcOpenPurposes() {
        return this.acOpenPurposes;
    }

    public void setAcOpenPurposes(List<AcOpenPurpose> acOpenPurposes) {
        this.acOpenPurposes = acOpenPurposes;
    }

    public List<BDPosition> getBdPositions() {
        return this.bdPositions;
    }

    public void setBdPositions(List<BDPosition> bdPositions) {
        this.bdPositions = bdPositions;
    }

    public List<BusinessType> getBusinessTypes() {
        return this.businessTypes;
    }

    public void setBusinessTypes(List<BusinessType> businessTypes) {
        this.businessTypes = businessTypes;
    }

    public List<Product> getProducts() {
        return this.products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public List<Sector> getSectors() {
        return this.sectors;
    }

    public void setSectors(List<Sector> sectors) {
        this.sectors = sectors;
    }

    public List<Segment> getSegments() {
        return this.segments;
    }

    public void setSegments(List<Segment> segments) {
        this.segments = segments;
    }

    public List<SideCoSector> getSideCoSectors() {
        return this.sideCoSectors;
    }

    public void setSideCoSectors(List<SideCoSector> sideCoSectors) {
        this.sideCoSectors = sideCoSectors;
    }

}
