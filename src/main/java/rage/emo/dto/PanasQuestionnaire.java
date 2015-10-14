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
public class PanasQuestionnaire extends AbstractSiteVisit {
//    The five positive affective states are: 
//        active, determined, attentive, inspired, and alert. 
//    The five negative affective states are: 
//        afraid, nervous, upset, hostile, and ashamed.
    @Lob
    @Column(length = 100000)
    private String active;
    private String determined;
    private String attentive;
    private String inspired;
    private String alert;
    
    private String afraid;
    private String nervous;
    private String upset;
    private String hostile;
    private String ashamed;
    
    private String PreOrPost;
    
         /**
     * @return the active
     */
    public String getActive() {
        return active;
    }

    /**
     * @param active the active to set
     */
    public void setActive(String active) {
        this.active = active;
    }

    /**
     * @return the determined
     */
    public String getDetermined() {
        return determined;
    }

    /**
     * @param determined the determined to set
     */
    public void setDetermined(String determined) {
        this.determined = determined;
    }

    /**
     * @return the attentive
     */
    public String getAttentive() {
        return attentive;
    }

    /**
     * @param attentive the attentive to set
     */
    public void setAttentive(String attentive) {
        this.attentive = attentive;
    }

    /**
     * @return the inspired
     */
    public String getInspired() {
        return inspired;
    }

    /**
     * @param inspired the inspired to set
     */
    public void setInspired(String inspired) {
        this.inspired = inspired;
    }

    /**
     * @return the alert
     */
    public String getAlert() {
        return alert;
    }

    /**
     * @param alert the alert to set
     */
    public void setAlert(String alert) {
        this.alert = alert;
    }

    /**
     * @return the afraid
     */
    public String getAfraid() {
        return afraid;
    }

    /**
     * @param afraid the afraid to set
     */
    public void setAfraid(String afraid) {
        this.afraid = afraid;
    }

    /**
     * @return the nervous
     */
    public String getNervous() {
        return nervous;
    }

    /**
     * @param nervous the nervous to set
     */
    public void setNervous(String nervous) {
        this.nervous = nervous;
    }

    /**
     * @return the upset
     */
    public String getUpset() {
        return upset;
    }

    /**
     * @param upset the upset to set
     */
    public void setUpset(String upset) {
        this.upset = upset;
    }

    /**
     * @return the hostile
     */
    public String getHostile() {
        return hostile;
    }

    /**
     * @param hostile the hostile to set
     */
    public void setHostile(String hostile) {
        this.hostile = hostile;
    }

    /**
     * @return the ashamed
     */
    public String getAshamed() {
        return ashamed;
    }

    /**
     * @param ashamed the ashamed to set
     */
    public void setAshamed(String ashamed) {
        this.ashamed = ashamed;
    }
    
    
    @Override
    public String toString() {
        return super.toString() + ";" + getActive() + ";" + getAfraid() + ";" + getAlert() + ";" + getAshamed() + ";" + 
                getAttentive() + ";" + getDetermined() + ";" + getHostile() + ";" + getInspired() + ";" + getNervous() + "," + getUpset() + ";" ;
    }

    public String dataString() {
        
         return getActive() + ";" + getAfraid() + ";" + getAlert() + ";" + getAshamed() + ";" + 
                getAttentive() + ";" + getDetermined() + ";" + getHostile() + ";" + getInspired() + ";" + getNervous() + "," + getUpset() + ";" ;
    }

    /**
     * @return the PreOrPost
     */
    public String getPreOrPost() {
        return PreOrPost;
    }

    /**
     * @param PreOrPost the PreOrPost to set
     */
    public void setPreOrPost(String PreOrPost) {
        this.PreOrPost = PreOrPost;
    }

}