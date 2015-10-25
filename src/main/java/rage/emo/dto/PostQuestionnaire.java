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

    private String could_have_answered_101_prior;
    private String could_have_answered_102_prior;
    
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

    @Override
    public String toString() {
        return super.toString() + ";" + keskittyneisyys + ";" + ymmarrettavyys + ";" 
                + miellyttavyys + ";" + kuvitusAuttoi + ";" + kuvitusMiellytti 
                + ";" + olioOhjelmointi.replaceAll(";", " - ").replaceAll("\\s+", " ").trim() 
                + ";" + hotellisuunnittelu.replaceAll(";", " - ").replaceAll("\\s+", " ").trim() 
                + ";" + vapaaPalaute.replaceAll(";", " - ").replaceAll("\\s+", " ").trim() 
                + ";" + getCould_have_answered_101_prior() + ";" + getCould_have_answered_102_prior() + ";";
    }

    public String dataString() {
        return keskittyneisyys + ";" + ymmarrettavyys + ";" + miellyttavyys + ";" 
                + kuvitusAuttoi + ";" + kuvitusMiellytti + ";" 
                + olioOhjelmointi.replaceAll(";", " - ").replaceAll("\\s+", " ").trim() 
                + ";" + hotellisuunnittelu.replaceAll(";", " - ").replaceAll("\\s+", " ").trim() 
                + ";" + vapaaPalaute.replaceAll(";", " - ").replaceAll("\\s+", " ").trim()
                + ";" + getCould_have_answered_101_prior() + ";" + getCould_have_answered_102_prior() + ";";
    }

    /**
     * @return the could_have_answered_101_prior
     */
    public String getCould_have_answered_101_prior() {
        return could_have_answered_101_prior;
    }

    /**
     * @param could_have_answered_101_prior the could_have_answered_101_prior to set
     */
    public void setCould_have_answered_101_prior(String could_have_answered_101_prior) {
        this.could_have_answered_101_prior = could_have_answered_101_prior;
    }

    /**
     * @return the could_have_answered_102_prior
     */
    public String getCould_have_answered_102_prior() {
        return could_have_answered_102_prior;
    }

    /**
     * @param could_have_answered_102_prior the could_have_answered_102_prior to set
     */
    public void setCould_have_answered_102_prior(String could_have_answered_102_prior) {
        this.could_have_answered_102_prior = could_have_answered_102_prior;
    }
}
