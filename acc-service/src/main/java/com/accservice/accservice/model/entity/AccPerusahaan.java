package com.accservice.accservice.model.entity;

import java.sql.Time;
import java.util.Date;

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
@Table(name = "reg_cif_account")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccPerusahaan {
    
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
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

    // Sumber dana = FUND.SOURCE
    @Column(name = "FUNDSOURCE")
	private String fundSource;

    public String getFundSource() {
        return this.fundSource;
    }

    public void setFundSource(String fundSource) {
        this.fundSource = fundSource;
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

    // No.CIF // CIF
    @Column(name = "CIFNO")
	private String cifNo;

    public String getCifNo() {
        return this.cifNo;
    }

    public void setCifNo(String cifNo) {
        this.cifNo = cifNo;
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

    // Status
    @Column(name = "STATUS")
	private String status;

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
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
	private Date userCreatedDate;

    public Date getUserCreatedDate() {
        return this.userCreatedDate;
    }

    public void setUserCreatedDate(Date userCreatedDate) {
        this.userCreatedDate = userCreatedDate;
    }

    // user created time
    @Column(name = "USER_CREATED_TIME")
	private Time userCreatedTime;

    public Time getUserCreatedTime() {
        return this.userCreatedTime;
    }

    public void setUserCreatedTime(Time userCreatedTime) {
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

    @Column(name = "ACCNO")
	private String accNo;

    public String getAccNo() {
        return this.accNo;
    }

    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }
}

