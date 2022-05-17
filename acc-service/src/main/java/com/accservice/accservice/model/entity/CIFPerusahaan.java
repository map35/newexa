package com.accservice.accservice.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
// @Table(name = "reg_cif_corp")
@Table(name = "new_reg_cif_corp")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CIFPerusahaan {

    @Id
    @Column(name = "id")
    // @GeneratedValue(strategy=GenerationType.IDENTITY)
    private String id;

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    // Bentuk badan usaha = BUSINESS.TYPE
    @Column(name = "BUSINESSTYPE")
	private String businessType;

    public String getBusinessType() {
        return this.businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    // Kewarganegaraan = NATIONALITY // AMBIL DARI TEBEL NEGARA
    @Column(name = "NATIONALITY")
	private String nationality;

    public String getNationality() {
        return this.nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
    
    // Lap keuangan = CORP.FIN.REPORT
    @Column(name = "CORPFINREPORT")
	private String corpFinReport;

    public String getCorpFinReport() {
        return this.corpFinReport;
    }

    public void setCorpFinReport(String corpFinReport) {
        this.corpFinReport = corpFinReport;
    }

    // Desk kegiatan usaha = CORP.BUSS.DESC
    @Column(name = "CORPBUSSDECS")
	private String corpBussDesc;

    public String getCorpBussDesc() {
        return this.corpBussDesc;
    }

    public void setCorpBussDesc(String corpBussDesc) {
        this.corpBussDesc = corpBussDesc;
    }

    // Bidang usaha = SID.ECO.SECTOR
    @Column(name = "SIDECOSECTOR")
	private String sideCoSector;

    public String getSideCoSector() {
        return this.sideCoSector;
    }

    public void setSideCoSector(String sideCoSector) {
        this.sideCoSector = sideCoSector;
    }

    // No akta pendirian = FIRST.REG.NO
    @Column(name = "FIRSTREGNO")
	private String firstRegNo;

    public String getFirstRegNo() {
        return this.firstRegNo;
    }

    public void setFirstRegNo(String firstRegNo) {
        this.firstRegNo = firstRegNo;
    }

    // Tgl akta pendirian = FIRST.REG.DATE
    @Column(name = "FIRSTREGDATE")
	private String firstRegDate;

    public String getFirstRegDate() {
        return this.firstRegDate;
    }

    public void setFirstRegDate(String firstRegDate) {
        this.firstRegDate = firstRegDate;
    }
   
    // No siup = LEGAL.ID-1
    @Column(name = "LEGALID1")
	private String legalID1;

    public String getLegalID1() {
        return this.legalID1;
    }

    public void setLegalID1(String legalID1) {
        this.legalID1 = legalID1;
    }

    // Tgl terbit siup = LEGAL.ISS.DATE-1
    @Column(name = "LEGALISSDATE1")
	private String legalIssDate1;

    public String getLegalIssDate1() {
        return this.legalIssDate1;
    }

    public void setLegalIssDate1(String legalIssDate1) {
        this.legalIssDate1 = legalIssDate1;
    }

    // Tgl akhir siup = LEGAL.ISS.DATE-1
    @Column(name = "LEGALEXPDATE1")
	private String legalExpDate1;

    public String getLegalExpDate1() {
        return this.legalExpDate1;
    }

    public void setLegalExpDate1(String legalExpDate1) {
        this.legalExpDate1 = legalExpDate1;
    }

    // No situ = LEGAL.ID-2
    @Column(name = "LEGALID2")
	private String legalID2;

    public String getLegalID2() {
        return this.legalID2;
    }

    public void setLegalID2(String legalID2) {
        this.legalID2 = legalID2;
    }

    // Tgl terbit situ = LEGAL.ISS.DATE-2
    @Column(name = "LEGALISSDATE2")
	private String legalIssDate2;

    public String getLegalIssDate2() {
        return this.legalIssDate2;
    }

    public void setLegalIssDate2(String legalIssDate2) {
        this.legalIssDate2 = legalIssDate2;
    }

    // Tgl akhir situ = LEGAL.EXP.DATE-2
    @Column(name = "LEGALEXPDATE2")
	private String legalExpDate2;

    public String getLegalExpDate2() {
        return this.legalExpDate2;
    }

    public void setLegalExpDate2(String legalExpDate2) {
        this.legalExpDate2 = legalExpDate2;
    }

    // No sk menteri = LEGAL.ID-3
    @Column(name = "LEGALID3")
	private String legalID3;

    public String getLegalID3() {
        return this.legalID3;
    }

    public void setLegalID3(String legalID3) {
        this.legalID3 = legalID3;
    }

    // Tgl terbit sk menteri = LEGAL.ISS.DATE-3
    @Column(name = "LEGALISSDATE3")
	private String legalIssDate3;

    public String getLegalIssDate3() {
        return this.legalIssDate3;
    }

    public void setLegalIssDate3(String legalIssDate3) {
        this.legalIssDate3 = legalIssDate3;
    }

    // Tgl akhir sk menteri = LEGAL.EXP.DATE-3
    @Column(name = "LEGALEXPDATE3")
	private String legalExpDate3;

    public String getLegalExpDate3() {
        return this.legalExpDate3;
    }

    public void setLegalExpDate3(String legalExpDate3) {
        this.legalExpDate3 = legalExpDate3;
    }

    // No tdp = LEGAL.ID-4
    @Column(name = "LEGALID4")
	private String legalID4;

    public String getLegalID4() {
        return this.legalID4;
    }

    public void setLegalID4(String legalID4) {
        this.legalID4 = legalID4;
    }

    // Tgl terbit tdp = LEGAL.ISS.DATE-4
    @Column(name = "LEGALISSDATE4")
	private String legalIssDate4;

    public String getLegalIssDate4() {
        return this.legalIssDate4;
    }

    public void setLegalIssDate4(String legalIssDate4) {
        this.legalIssDate4 = legalIssDate4;
    }

    // Tgl akhir tdp = LEGAL.EXP.DATE-4
    @Column(name = "LEGALEXPDATE4")
	private String legalExpDate4;

    public String getLegalExpDate4() {
        return this.legalExpDate4;
    }

    public void setLegalExpDate4(String legalExpDate4) {
        this.legalExpDate4 = legalExpDate4;
    }

    // Nama pengurus = BD.NAME
    @Column(name = "BDNAME")
	private String bdName;

    public String getBdName() {
        return this.bdName;
    }

    public void setBdName(String bdName) {
        this.bdName = bdName;
    }

    // Jabatan pengurus = BD.POSITION
    @Column(name = "BDPOSITION")
	private String bdPosition;

    public String getBdPosition() {
        return this.bdPosition;
    }

    public void setBdPosition(String bdPosition) {
        this.bdPosition = bdPosition;
    }

    // Kelompok nasabah = SECTOR
    @Column(name = "SECTOR")
	private String sector;

    public String getSector() {
        return this.sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    // Segment BUC = SEGMENT
    @Column(name = "SEGMENT")
	private String segment;

    public String getSegment() {
        return this.segment;
    }

    public void setSegment(String segment) {
        this.segment = segment;
    }

    // Stetus
    @Column(name = "STATUS")
	private String status;

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // NO CIF
    @Column(name = "CIFNO")
	private String cifNo;

    public String getCifNo() {
        return this.cifNo;
    }

    public void setCifNo(String cifNo) {
        this.cifNo = cifNo;
    }

    // Produk = Product.Code
    @Column(name = "PRODUCTCODE")
	private String productCode;

    public String getProductCode() {
        return this.productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    // Penduduk = RESIDE.Y.N
    @Column(name = "RESIDEYN")
	private String resideYN;

    public String getResideYN() {
        return this.resideYN;
    }

    public void setResideYN(String resideYN) {
        this.resideYN = resideYN;
    }

    // Nama perusahaan = SHORT.NAME
    @Column(name = "SHORTNAME")
	private String shortName;

    public String getShortName() {
        return this.shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    // Nama lengkap = NAME.1
    @Column(name = "NAME1")
	private String name1;

    public String getName1() {
        return this.name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    // Alamat Perusahaan = STREET
    @Column(name = "STREET")
	private String street;

    public String getStreet() {
        return this.street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    // RT
    @Column(name = "RT")
	private String rt;

    public String getRt() {
        return this.rt;
    }

    public void setRt(String rt) {
        this.rt = rt;
    }

    // RW
    @Column(name = "RW")
	private String rw;

    public String getRw() {
        return this.rw;
    }

    public void setRw(String rw) {
        this.rw = rw;
    }

    // Provinsi = PROVINCE
    @Column(name = "PROVINCE")
	private String province;

    public String getProvince() {
        return this.province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    // Kota = DISTRICT.CODE
    @Column(name = "DISTRICTCODE")
	private String districtCode;

    public String getDistrictCode() {
        return this.districtCode;
    }

    public void setDistrictCode(String districtCode) {
        this.districtCode = districtCode;
    }

    // Negara = RESIDENCE
    @Column(name = "RESIDENCE")
	private String residence;

    public String getResidence() {
        return this.residence;
    }

    public void setResidence(String residence) {
        this.residence = residence;
    }

    // Kode pos = POST.CODE
    @Column(name = "POSTCODE")
	private String postCode;

    public String getPostCode() {
        return this.postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    // No telp kantor = OFF.PHONE
    @Column(name = "OFFPHONE")
	private String offPhone;

    public String getOffPhone() {
        return this.offPhone;
    }

    public void setOffPhone(String offPhone) {
        this.offPhone = offPhone;
    }

    // No npwp = TAX.ID
    @Column(name = "TAXID")
	private String taxID;

    public String getTaxID() {
        return this.taxID;
    }

    public void setTaxID(String taxID) {
        this.taxID = taxID;
    }

    // Currency // IDR
    @Column(name = "CURRENCY")
	private String currency;

    public String getCurrency() {
        return this.currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    // Zakat = ZAKAT
    @Column(name = "ZAKAT")
	private String zakat;

    public String getZakat() {
        return this.zakat;
    }

    public void setZakat(String zakat) {
        this.zakat = zakat;
    }

    // BONUS
    @Column(name = "BONUS")
	private String bonus;

    public String getBonus() {
        return this.bonus;
    }

    public void setBonus(String bonus) {
        this.bonus = bonus;
    }

    // ATM
    @Column(name = "ATM")
	private String atm;

    public String getAtm() {
        return this.atm;
    }

    public void setAtm(String atm) {
        this.atm = atm;
    }

    // Passbook // ?
    @Column(name = "PASSBOOK")
	private String passbook;

    public String getPassbook() {
        return this.passbook;
    }

    public void setPassbook(String passbook) {
        this.passbook = passbook;
    }
    
    // Tujuan Buka Rekening = AC.OPEN.PURPOSE
    @Column(name = "ACOPENPURPOSE")
	private String acOpenPurpose;

    public String getAcOpenPurpose() {
        return this.acOpenPurpose;
    }

    public void setAcOpenPurpose(String acOpenPurpose) {
        this.acOpenPurpose = acOpenPurpose;
    }

    // Account Officer = Account.Officer
    @Column(name = "ACCOUNTOFFICER")
	private String accountOfficer;

    public String getAccountOfficer() {
        return this.accountOfficer;
    }

    public void setAccountOfficer(String accountOfficer) {
        this.accountOfficer = accountOfficer;
    }

    // Mesage ID
    @Column(name = "MSGID")
	private String msgID;

    public String getMsgID() {
        return this.msgID;
    }

    public void setMsgID(String msgID) {
        this.msgID = msgID;
    }

    // user created by name
    @Column(name = "USER_CREATED_BY_NAME")
	private String userCreatedByName;

    public String getUserCreatedByName() {
        return this.userCreatedByName;
    }

    public void setUserCreatedByName(String userCreatedByName) {
        this.userCreatedByName = userCreatedByName;
    }

    // user created date
    @Column(name = "USER_CREATED_DATE")
	private String userCreatedDate;

    public String getUserCreatedDate() {
        return this.userCreatedDate;
    }

    public void setUserCreatedDate(String userCreatedDate) {
        this.userCreatedDate = userCreatedDate;
    }

    // user created time
    @Column(name = "USER_CREATED_TIME")
	private String userCreatedTime;

    public String getUserCreatedTime() {
        return this.userCreatedTime;
    }

    public void setUserCreatedTime(String userCreatedTime) {
        this.userCreatedTime = userCreatedTime;
    }

    // user approved by name
    @Column(name = "USER_APPROVED_BY_NAME")
	private String userApprovedByName;

    public String getUserApprovedByName() {
        return this.userApprovedByName;
    }

    public void setUserApprovedByName(String userApprovedByName) {
        this.userApprovedByName = userApprovedByName;
    }

    // user approved date
    @Column(name = "USER_APPROVED_DATE")
	private String userApprovedDate;

    public String getUserApprovedDate() {
        return this.userApprovedDate;
    }

    public void setUserApprovedDate(String userApprovedDate) {
        this.userApprovedDate = userApprovedDate;
    }

    // user approved time
    @Column(name = "USER_APPROVED_TIME")
	private String userApprovedTime;

    public String getUserApprovedTime() {
        return this.userApprovedTime;
    }

    public void setUserApprovedTime(String userApprovedTime) {
        this.userApprovedTime = userApprovedTime;
    }

    // Sumber dana = FUND.SOURCE
    @Column(name = "FUNDSOURCE")
	private String fundSource;

    public String getFundSource() {
        return this.fundSource;
    }
}
