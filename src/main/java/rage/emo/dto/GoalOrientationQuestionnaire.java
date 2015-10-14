/*
 * To change this license header, choose License Headers in Project Properties.
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
public class GoalOrientationQuestionnaire extends AbstractSiteVisit {

    @Lob
    @Column(length = 100000)
    private String suoritusOrientaatio_kysymys_1;
    private String suoritusOrientaatio_kysymys_2;
    private String suoritusOrientaatio_kysymys_3;
    private String suoritusOrientaatio_kysymys_4;
    private String suoritusOrientaatio_kysymys_5;
    private String suoritusOrientaatio_kysymys_6;
    private String suoritusOrientaatio_kysymys_7;
    private String suoritusOrientaatio_kysymys_8;

    @Lob
    @Column(length = 100000)
    private String oppimisOrientaatio_kysymys_1;
    private String oppimisOrientaatio_kysymys_2;
    private String oppimisOrientaatio_kysymys_3;
    private String oppimisOrientaatio_kysymys_4;
    private String oppimisOrientaatio_kysymys_5;
    private String oppimisOrientaatio_kysymys_6;
    private String oppimisOrientaatio_kysymys_7;
    private String oppimisOrientaatio_kysymys_8;

    @Override
    public String toString() {
        return super.toString() + ";" + getSuoritusOrientaatio_kysymys_1() + ";" + getSuoritusOrientaatio_kysymys_2() + ";" + getSuoritusOrientaatio_kysymys_3() + ";" + getSuoritusOrientaatio_kysymys_4() + ";"
                + getSuoritusOrientaatio_kysymys_5() + ";" + getSuoritusOrientaatio_kysymys_6() + ";" + getSuoritusOrientaatio_kysymys_7() + ";" + getSuoritusOrientaatio_kysymys_8() + ";"
                + getOppimisOrientaatio_kysymys_1() + ";" + getOppimisOrientaatio_kysymys_2() + ";" + getOppimisOrientaatio_kysymys_3() + ";" + getOppimisOrientaatio_kysymys_4() + ";"
                + getOppimisOrientaatio_kysymys_5() + ";" + getOppimisOrientaatio_kysymys_6() + ";" + getOppimisOrientaatio_kysymys_7() + ";" + getOppimisOrientaatio_kysymys_8() + ";";
    }

    public String dataString() {
        return getSuoritusOrientaatio_kysymys_1() + ";" + getSuoritusOrientaatio_kysymys_2() + ";" + getSuoritusOrientaatio_kysymys_3() + ";" + getSuoritusOrientaatio_kysymys_4() + ";"
                + getSuoritusOrientaatio_kysymys_5() + ";" + getSuoritusOrientaatio_kysymys_6() + ";" + getSuoritusOrientaatio_kysymys_7() + ";" + getSuoritusOrientaatio_kysymys_8() + ";"
                + getOppimisOrientaatio_kysymys_1() + ";" + getOppimisOrientaatio_kysymys_2() + ";" + getOppimisOrientaatio_kysymys_3() + ";" + getOppimisOrientaatio_kysymys_4() + ";"
                + getOppimisOrientaatio_kysymys_5() + ";" + getOppimisOrientaatio_kysymys_6() + ";" + getOppimisOrientaatio_kysymys_7() + ";" + getOppimisOrientaatio_kysymys_8() + ";";
    }

    /**
     * @return the suoritusOrientaatio_kysymys_1
     */
    public String getSuoritusOrientaatio_kysymys_1() {
        return suoritusOrientaatio_kysymys_1;
    }

    /**
     * @param suoritusOrientaatio_kysymys_1 the suoritusOrientaatio_kysymys_1 to
     * set
     */
    public void setSuoritusOrientaatio_kysymys_1(String suoritusOrientaatio_kysymys_1) {
        this.suoritusOrientaatio_kysymys_1 = suoritusOrientaatio_kysymys_1;
    }

    /**
     * @return the suoritusOrientaatio_kysymys_2
     */
    public String getSuoritusOrientaatio_kysymys_2() {
        return suoritusOrientaatio_kysymys_2;
    }

    /**
     * @param suoritusOrientaatio_kysymys_2 the suoritusOrientaatio_kysymys_2 to
     * set
     */
    public void setSuoritusOrientaatio_kysymys_2(String suoritusOrientaatio_kysymys_2) {
        this.suoritusOrientaatio_kysymys_2 = suoritusOrientaatio_kysymys_2;
    }

    /**
     * @return the suoritusOrientaatio_kysymys_3
     */
    public String getSuoritusOrientaatio_kysymys_3() {
        return suoritusOrientaatio_kysymys_3;
    }

    /**
     * @param suoritusOrientaatio_kysymys_3 the suoritusOrientaatio_kysymys_3 to
     * set
     */
    public void setSuoritusOrientaatio_kysymys_3(String suoritusOrientaatio_kysymys_3) {
        this.suoritusOrientaatio_kysymys_3 = suoritusOrientaatio_kysymys_3;
    }

    /**
     * @return the suoritusOrientaatio_kysymys_4
     */
    public String getSuoritusOrientaatio_kysymys_4() {
        return suoritusOrientaatio_kysymys_4;
    }

    /**
     * @param suoritusOrientaatio_kysymys_4 the suoritusOrientaatio_kysymys_4 to
     * set
     */
    public void setSuoritusOrientaatio_kysymys_4(String suoritusOrientaatio_kysymys_4) {
        this.suoritusOrientaatio_kysymys_4 = suoritusOrientaatio_kysymys_4;
    }

    /**
     * @return the suoritusOrientaatio_kysymys_5
     */
    public String getSuoritusOrientaatio_kysymys_5() {
        return suoritusOrientaatio_kysymys_5;
    }

    /**
     * @param suoritusOrientaatio_kysymys_5 the suoritusOrientaatio_kysymys_5 to
     * set
     */
    public void setSuoritusOrientaatio_kysymys_5(String suoritusOrientaatio_kysymys_5) {
        this.suoritusOrientaatio_kysymys_5 = suoritusOrientaatio_kysymys_5;
    }

    /**
     * @return the suoritusOrientaatio_kysymys_6
     */
    public String getSuoritusOrientaatio_kysymys_6() {
        return suoritusOrientaatio_kysymys_6;
    }

    /**
     * @param suoritusOrientaatio_kysymys_6 the suoritusOrientaatio_kysymys_6 to
     * set
     */
    public void setSuoritusOrientaatio_kysymys_6(String suoritusOrientaatio_kysymys_6) {
        this.suoritusOrientaatio_kysymys_6 = suoritusOrientaatio_kysymys_6;
    }

    /**
     * @return the suoritusOrientaatio_kysymys_7
     */
    public String getSuoritusOrientaatio_kysymys_7() {
        return suoritusOrientaatio_kysymys_7;
    }

    /**
     * @param suoritusOrientaatio_kysymys_7 the suoritusOrientaatio_kysymys_7 to
     * set
     */
    public void setSuoritusOrientaatio_kysymys_7(String suoritusOrientaatio_kysymys_7) {
        this.suoritusOrientaatio_kysymys_7 = suoritusOrientaatio_kysymys_7;
    }

    /**
     * @return the suoritusOrientaatio_kysymys_8
     */
    public String getSuoritusOrientaatio_kysymys_8() {
        return suoritusOrientaatio_kysymys_8;
    }

    /**
     * @param suoritusOrientaatio_kysymys_8 the suoritusOrientaatio_kysymys_8 to
     * set
     */
    public void setSuoritusOrientaatio_kysymys_8(String suoritusOrientaatio_kysymys_8) {
        this.suoritusOrientaatio_kysymys_8 = suoritusOrientaatio_kysymys_8;
    }

    /**
     * @return the oppimisOrientaatio_kysymys_1
     */
    public String getOppimisOrientaatio_kysymys_1() {
        return oppimisOrientaatio_kysymys_1;
    }

    /**
     * @param oppimisOrientaatio_kysymys_1 the oppimisOrientaatio_kysymys_1 to
     * set
     */
    public void setOppimisOrientaatio_kysymys_1(String oppimisOrientaatio_kysymys_1) {
        this.oppimisOrientaatio_kysymys_1 = oppimisOrientaatio_kysymys_1;
    }

    /**
     * @return the oppimisOrientaatio_kysymys_2
     */
    public String getOppimisOrientaatio_kysymys_2() {
        return oppimisOrientaatio_kysymys_2;
    }

    /**
     * @param oppimisOrientaatio_kysymys_2 the oppimisOrientaatio_kysymys_2 to
     * set
     */
    public void setOppimisOrientaatio_kysymys_2(String oppimisOrientaatio_kysymys_2) {
        this.oppimisOrientaatio_kysymys_2 = oppimisOrientaatio_kysymys_2;
    }

    /**
     * @return the oppimisOrientaatio_kysymys_3
     */
    public String getOppimisOrientaatio_kysymys_3() {
        return oppimisOrientaatio_kysymys_3;
    }

    /**
     * @param oppimisOrientaatio_kysymys_3 the oppimisOrientaatio_kysymys_3 to
     * set
     */
    public void setOppimisOrientaatio_kysymys_3(String oppimisOrientaatio_kysymys_3) {
        this.oppimisOrientaatio_kysymys_3 = oppimisOrientaatio_kysymys_3;
    }

    /**
     * @return the oppimisOrientaatio_kysymys_4
     */
    public String getOppimisOrientaatio_kysymys_4() {
        return oppimisOrientaatio_kysymys_4;
    }

    /**
     * @param oppimisOrientaatio_kysymys_4 the oppimisOrientaatio_kysymys_4 to
     * set
     */
    public void setOppimisOrientaatio_kysymys_4(String oppimisOrientaatio_kysymys_4) {
        this.oppimisOrientaatio_kysymys_4 = oppimisOrientaatio_kysymys_4;
    }

    /**
     * @return the oppimisOrientaatio_kysymys_5
     */
    public String getOppimisOrientaatio_kysymys_5() {
        return oppimisOrientaatio_kysymys_5;
    }

    /**
     * @param oppimisOrientaatio_kysymys_5 the oppimisOrientaatio_kysymys_5 to
     * set
     */
    public void setOppimisOrientaatio_kysymys_5(String oppimisOrientaatio_kysymys_5) {
        this.oppimisOrientaatio_kysymys_5 = oppimisOrientaatio_kysymys_5;
    }

    /**
     * @return the oppimisOrientaatio_kysymys_6
     */
    public String getOppimisOrientaatio_kysymys_6() {
        return oppimisOrientaatio_kysymys_6;
    }

    /**
     * @param oppimisOrientaatio_kysymys_6 the oppimisOrientaatio_kysymys_6 to
     * set
     */
    public void setOppimisOrientaatio_kysymys_6(String oppimisOrientaatio_kysymys_6) {
        this.oppimisOrientaatio_kysymys_6 = oppimisOrientaatio_kysymys_6;
    }

    /**
     * @return the oppimisOrientaatio_kysymys_7
     */
    public String getOppimisOrientaatio_kysymys_7() {
        return oppimisOrientaatio_kysymys_7;
    }

    /**
     * @param oppimisOrientaatio_kysymys_7 the oppimisOrientaatio_kysymys_7 to
     * set
     */
    public void setOppimisOrientaatio_kysymys_7(String oppimisOrientaatio_kysymys_7) {
        this.oppimisOrientaatio_kysymys_7 = oppimisOrientaatio_kysymys_7;
    }

    /**
     * @return the oppimisOrientaatio_kysymys_8
     */
    public String getOppimisOrientaatio_kysymys_8() {
        return oppimisOrientaatio_kysymys_8;
    }

    /**
     * @param oppimisOrientaatio_kysymys_8 the oppimisOrientaatio_kysymys_8 to
     * set
     */
    public void setOppimisOrientaatio_kysymys_8(String oppimisOrientaatio_kysymys_8) {
        this.oppimisOrientaatio_kysymys_8 = oppimisOrientaatio_kysymys_8;
    }

}

//    @Override
//    public String toString() {
//        return super.toString() + ";" + kuvitusAuttoi + ";" + kuvitusMiellytti + ";" + getSuoritusOrientaatio().replaceAll(";", " - ").replaceAll("\\s+", " ").trim();
//    }
//
//    public String dataString() {
//         return kuvitusAuttoi + ";" + kuvitusMiellytti + ";" + getSuoritusOrientaatio().replaceAll(";", " - ").replaceAll("\\s+", " ").trim() + ";";
//    }
