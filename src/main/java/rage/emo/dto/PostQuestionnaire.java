package rage.emo.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;

@Entity
public class PostQuestionnaire extends AbstractSiteVisit {

    @Lob
    @Column(length = 100000)
    private String olioOhjelmointi;
    @Lob
    @Column(length = 100000)
    private String hotellisuunnittelu;
    private String keskittyneisyys;
    private String ymmarrettavyys;
    private String miellyttavyys;
    private String kuvitusAuttoi;
    private String kuvitusMiellytti;
    @Lob
    @Column(length = 100000)
    private String vapaaPalaute;

    public String getOlioOhjelmointi() {
        return olioOhjelmointi;
    }

    public void setOlioOhjelmointi(String olioOhjelmointi) {
        this.olioOhjelmointi = olioOhjelmointi;
    }

    public String getHotellisuunnittelu() {
        return hotellisuunnittelu;
    }

    public void setHotellisuunnittelu(String hotellisuunnittelu) {
        this.hotellisuunnittelu = hotellisuunnittelu;
    }

    public String getKeskittyneisyys() {
        return keskittyneisyys;
    }

    public void setKeskittyneisyys(String keskittyneisyys) {
        this.keskittyneisyys = keskittyneisyys;
    }

    public String getYmmarrettavyys() {
        return ymmarrettavyys;
    }

    public void setYmmarrettavyys(String ymmarrettavyys) {
        this.ymmarrettavyys = ymmarrettavyys;
    }

    public String getMiellyttavyys() {
        return miellyttavyys;
    }

    public void setMiellyttavyys(String miellyttavyys) {
        this.miellyttavyys = miellyttavyys;
    }

    public String getKuvitusAuttoi() {
        return kuvitusAuttoi;
    }

    public void setKuvitusAuttoi(String kuvitusAuttoi) {
        this.kuvitusAuttoi = kuvitusAuttoi;
    }

    public String getKuvitusMiellytti() {
        return kuvitusMiellytti;
    }

    public void setKuvitusMiellytti(String kuvitusMiellytti) {
        this.kuvitusMiellytti = kuvitusMiellytti;
    }

    public String getVapaaPalaute() {
        return vapaaPalaute;
    }

    public void setVapaaPalaute(String vapaaPalaute) {
        this.vapaaPalaute = vapaaPalaute;
    }

}
