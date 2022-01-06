package Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Kisiler {

    @SerializedName("Ad")
    @Expose
    private String ad;
    @SerializedName("Soyad")
    @Expose
    private String soyad;
    @SerializedName("DogumTarihi")
    @Expose
    private String dogumTarihi;
    @SerializedName("Fotograf")
    @Expose
    private String fotograf;
    @SerializedName("Aciklama")
    @Expose
    private String aciklama;

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getDogumTarihi() {
        return dogumTarihi;
    }

    public void setDogumTarihi(String dogumTarihi) {
        this.dogumTarihi = dogumTarihi;
    }

    public String getFotograf() {
        return fotograf;
    }

    public void setFotograf(String fotograf) {
        this.fotograf = fotograf;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

}