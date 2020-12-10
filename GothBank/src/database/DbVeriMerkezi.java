package database;

import java.text.DecimalFormat;

public class DbVeriMerkezi extends DbConnection {

    protected int kullaniciId = 0;
    protected String adSoyad, telNo, tcNo, musteriNo;
    protected double bakiye;
    protected double elektrikFaturasi, suFaturasi, dogalgazFaturasi, internetFaturasi;

    public int getKullaniciId() {
        return kullaniciId;
    }

    public void setKullaniciId(int kullaniciId) {
        this.kullaniciId = kullaniciId;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public String getTelNo() {
        return telNo;
    }

    public void setTelNo(String telNo) {
        this.telNo = telNo;
    }

    public String getTcNo() {
        return tcNo;
    }

    public void setTcNo(String tcNo) {
        this.tcNo = tcNo;
    }

    public String getMusteriNo() {
        return musteriNo;
    }

    public void setMusteriNo(String musteriNo) {
        this.musteriNo = musteriNo;
    }

    public double getBakiye() {
        return bakiye;
    }

    public void setBakiye(double bakiye) {
        double b = Double.valueOf(new DecimalFormat("##.##").format(bakiye).replaceAll(",", "."));
        this.bakiye = b;
    }

    public double getElektrikFaturasi() {
        return elektrikFaturasi;
    }

    public void setElektrikFaturasi(double elektrikFaturasi) {
        this.elektrikFaturasi = elektrikFaturasi;
    }

    public double getSuFaturasi() {
        return suFaturasi;
    }

    public void setSuFaturasi(double suFaturasi) {
        this.suFaturasi = suFaturasi;
    }

    public double getDogalgazFaturasi() {
        return dogalgazFaturasi;
    }

    public void setDogalgazFaturasi(double dogalgazFaturasi) {
        this.dogalgazFaturasi = dogalgazFaturasi;
    }

    public double getInternetFaturasi() {
        return internetFaturasi;
    }

    public void setInternetFaturasi(double internetFaturasi) {
        this.internetFaturasi = internetFaturasi;
    }

    
}
