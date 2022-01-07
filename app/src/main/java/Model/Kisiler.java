package Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Kisiler {

    @SerializedName("Ad")
    @Expose
    private String ad;
    @SerializedName("Ozet")
    @Expose
    private String ozet;
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

    public String getOzet() {
        return ozet;
    }

    public void setOzet(String ozet) {
        this.ozet = ozet;
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