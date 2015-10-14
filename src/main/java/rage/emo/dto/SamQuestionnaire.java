/* To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rage.emo.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;

/**
 *
 * @author minimalisti
 */
@Entity
public class SamQuestionnaire extends AbstractSiteVisit {

    @Lob
    @Column(length = 100000)
    private String valence;
    private String arousal;
    private String dominance;

    private String preOrPost;
    
    @Override
    public String toString() {
        return super.toString() + ";" + getValence() + ";" + getArousal() + ";" + getDominance() + ";";
    }

    public String dataString() {

        return getValence() + ";" + getArousal() + ";" + getDominance() + ";";
    }

    /**
     * @return the valence
     */
    public String getValence() {
        return valence;
    }

    /**
     * @param valence the valence to set
     */
    public void setValence(String valence) {
        this.valence = valence;
    }

    /**
     * @return the arousal
     */
    public String getArousal() {
        return arousal;
    }

    /**
     * @param arousal the arousal to set
     */
    public void setArousal(String arousal) {
        this.arousal = arousal;
    }

    /**
     * @return the dominance
     */
    public String getDominance() {
        return dominance;
    }

    /**
     * @param dominance the dominance to set
     */
    public void setDominance(String dominance) {
        this.dominance = dominance;
    }

    /**
     * @return the preOrPost
     */
    public String getPreOrPost() {
        return preOrPost;
    }

    /**
     * @param preOrPost the preOrPost to set
     */
    public void setPreOrPost(String preOrPost) {
        this.preOrPost = preOrPost;
    }

}
