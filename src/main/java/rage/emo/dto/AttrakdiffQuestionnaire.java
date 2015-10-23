package rage.emo.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;

/**
 *
 * @author minimalisti
 */
@Entity
public class AttrakdiffQuestionnaire extends AbstractSiteVisit {

    @Lob
    @Column(length = 100000)
    private String structured;
    private String practical;
    private String predictable;
    private String simple;
    
    @Lob
    @Column(length = 100000)
    private String captivating;
    private String stylish;
    private String premium;
    private String creative;
    
   
    @Lob
    @Column(length = 100000)
    private String beautiful;
    private String good;

    @Override
    public String toString() {
        return super.toString() + ";" + getStructured() + ";" + getPractical() + ";" + getPredictable() +  ";" 
                + getSimple() + ";" + getCaptivating() + ";" + ";" + getStylish() 
                + ";" + getPremium() + ";" + getCreative() + ";" + getBeautiful() + ";" + getGood() + ";";
    }

    public String dataString() {

        return getStructured() + ";" + getPractical() + ";" + getPredictable() +  ";" 
                + getSimple() + ";" + getCaptivating() + ";" + ";" + getStylish() 
                + ";" + getPremium() + ";" + getCreative() + ";" + getBeautiful() + ";" + getGood() + ";";
    }

    /**
     * @return the structured
     */
    public String getStructured() {
        return structured;
    }

    /**
     * @param structured the structured to set
     */
    public void setStructured(String structured) {
        this.structured = structured;
    }

    /**
     * @return the practical
     */
    public String getPractical() {
        return practical;
    }

    /**
     * @param practical the practical to set
     */
    public void setPractical(String practical) {
        this.practical = practical;
    }

    /**
     * @return the predictable
     */
    public String getPredictable() {
        return predictable;
    }

    /**
     * @param predictable the predictable to set
     */
    public void setPredictable(String predictable) {
        this.predictable = predictable;
    }

    /**
     * @return the simple
     */
    public String getSimple() {
        return simple;
    }

    /**
     * @param simple the simple to set
     */
    public void setSimple(String simple) {
        this.simple = simple;
    }

    /**
     * @return the captivating
     */
    public String getCaptivating() {
        return captivating;
    }

    /**
     * @param captivating the captivating to set
     */
    public void setCaptivating(String captivating) {
        this.captivating = captivating;
    }

    /**
     * @return the stylish
     */
    public String getStylish() {
        return stylish;
    }

    /**
     * @param stylish the stylish to set
     */
    public void setStylish(String stylish) {
        this.stylish = stylish;
    }

    /**
     * @return the premium
     */
    public String getPremium() {
        return premium;
    }

    /**
     * @param premium the premium to set
     */
    public void setPremium(String premium) {
        this.premium = premium;
    }

    /**
     * @return the creative
     */
    public String getCreative() {
        return creative;
    }

    /**
     * @param creative the creative to set
     */
    public void setCreative(String creative) {
        this.creative = creative;
    }

    /**
     * @return the beautiful
     */
    public String getBeautiful() {
        return beautiful;
    }

    /**
     * @param beautiful the beautiful to set
     */
    public void setBeautiful(String beautiful) {
        this.beautiful = beautiful;
    }

    /**
     * @return the good
     */
    public String getGood() {
        return good;
    }

    /**
     * @param good the good to set
     */
    public void setGood(String good) {
        this.good = good;
    }

}
