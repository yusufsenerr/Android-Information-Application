package Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Kisiler {

        @SerializedName("Ad")
        @Expose
        private String ad;
        @SerializedName("DogumTarihi")
        @Expose
        private String dogumTarihi;
        @SerializedName("Fotograf")
        @Expose
        private String Fotograf;
        @SerializedName("Ozet")
        @Expose
        private String ozet;
        @SerializedName("GenelBilgi")
        @Expose
        private String genelBilgi;
        @SerializedName("ArkaPlan")
        @Expose
        private String ArkaPlan;


        public String getAd() {
            return ad;
        }

        public void setAd(String ad) {
            this.ad = ad;
        }

        public String getDogumTarihi() {
            return dogumTarihi;
        }

        public void setDogumTarihi(String dogumTarihi) {
            this.dogumTarihi = dogumTarihi;
        }

        public String getFotograf() {
            return Fotograf;
        }

        public void setFotograf(String Fotograf) {
            this.Fotograf = Fotograf;
        }

        public String getOzet() {
            return ozet;
        }

        public void setOzet(String ozet) {
            this.ozet = ozet;
        }

        public String getGenelBilgi() {
            return genelBilgi;
        }

        public void setGenelBilgi(String genelBilgi) {
            this.genelBilgi = genelBilgi; }
    }