
package rage.emo.dto;

import javax.persistence.Entity;

@Entity
public class DemographicQuestionnaire extends AbstractSiteVisit {

    private String select_gender;
    private String select_age;
    private String select_starting_year;
    private String select_major;
    private String select_studypoints;
    private String select_average;

    
    /**
     * @return the select_gender
     */
    public String getSelect_gender() {
        return select_gender;
    }

    /**
     * @param select_gender the select_gender to set
     */
    public void setSelect_gender(String select_gender) {
        this.select_gender = select_gender;
    }

    /**
     * @return the select_age
     */
    public String getSelect_age() {
        return select_age;
    }

    /**
     * @param select_age the select_age to set
     */
    public void setSelect_age(String select_age) {
        this.select_age = select_age;
    }

    /**
     * @return the select_starting_year
     */
    public String getSelect_starting_year() {
        return select_starting_year;
    }

    /**
     * @param select_starting_year the select_starting_year to set
     */
    public void setSelect_starting_year(String select_starting_year) {
        this.select_starting_year = select_starting_year;
    }

    /**
     * @return the select_major
     */
    public String getSelect_major() {
        return select_major;
    }

    /**
     * @param select_major the select_major to set
     */
    public void setSelect_major(String select_major) {
        this.select_major = select_major;
    }

    /**
     * @return the select_studypoints
     */
    public String getSelect_studypoints() {
        return select_studypoints;
    }

    /**
     * @param select_studypoints the select_studypoints to set
     */
    public void setSelect_studypoints(String select_studypoints) {
        this.select_studypoints = select_studypoints;
    }
        
    /**
     * @return the select_average
     */
    public String getSelect_average() {
        return select_average;
    }

    /**
     * @param select_average the select_average to set
     */
    public void setSelect_average(String select_average) {
        this.select_average = select_average;
    }
        
    @Override
    public String toString() {
        return super.toString() + ";" + getSelect_age() + "," 
                + getSelect_gender() + ";" + getSelect_major() + ";" 
                + getSelect_starting_year() + "," + getSelect_studypoints() + ";"
                + getSelect_average();
    }

    public String dataString() {
        return getSelect_age() + "," 
                + getSelect_gender() + ";" + getSelect_major() + ";" 
                + getSelect_starting_year() + "," + getSelect_studypoints() + ";"
                + getSelect_average();
    }

}
