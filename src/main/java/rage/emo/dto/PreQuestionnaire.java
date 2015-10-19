package rage.emo.dto;

import javax.persistence.Entity;

@Entity
public class PreQuestionnaire extends AbstractSiteVisit {

    private Boolean hasProgrammedInThePast = false;
    private Boolean hasOoProgrammedInThePast = false;
    private Boolean programDuringFreeTimeNowAndThen = false;
    private Boolean readingProgrammingRelatedContentInFreetime = false;
    private Boolean canNameMoreThanOneProgrammingLanguages = false;
    private Boolean canNameMoreThanOneProgrammingStylesAndParadigms = false;

    private String interesting;
    private String practice_difficulty;
    private String practice_starting;
    private String information_usefulness;
    private String material_clarity;
    private String material_inspiring;
    private String material_helped;

    public Boolean isHasProgrammedInThePast() {
        return hasProgrammedInThePast;
    }

    public void setHasProgrammedInThePast(Boolean hasProgrammedInThePast) {
        this.hasProgrammedInThePast = hasProgrammedInThePast;
    }

    public Boolean isHasOoProgrammedInThePast() {
        return hasOoProgrammedInThePast;
    }

    public void setHasOoProgrammedInThePast(Boolean hasOoProgrammedInThePast) {
        this.hasOoProgrammedInThePast = hasOoProgrammedInThePast;
    }

    public Boolean isProgramDuringFreeTimeNowAndThen() {
        return programDuringFreeTimeNowAndThen;
    }

    public void setProgramDuringFreeTimeNowAndThen(Boolean programDuringFreeTimeNowAndThen) {
        this.programDuringFreeTimeNowAndThen = programDuringFreeTimeNowAndThen;
    }

    public Boolean isReadingProgrammingRelatedContentInFreetime() {
        return readingProgrammingRelatedContentInFreetime;
    }

    public void setReadingProgrammingRelatedContentInFreetime(Boolean readingProgrammingRelatedContentInFreetime) {
        this.readingProgrammingRelatedContentInFreetime = readingProgrammingRelatedContentInFreetime;
    }

    public Boolean isCanNameMoreThanOneProgrammingLanguages() {
        return canNameMoreThanOneProgrammingLanguages;
    }

    public void setCanNameMoreThanOneProgrammingLanguages(Boolean canNameMoreThanOneProgrammingLanguages) {
        this.canNameMoreThanOneProgrammingLanguages = canNameMoreThanOneProgrammingLanguages;
    }

    public Boolean isCanNameMoreThanOneProgrammingStylesAndParadigms() {
        return canNameMoreThanOneProgrammingStylesAndParadigms;
    }

    public void setCanNameMoreThanOneProgrammingStylesAndParadigms(Boolean canNameMoreThanOneProgrammingStylesAndParadigms) {
        this.canNameMoreThanOneProgrammingStylesAndParadigms = canNameMoreThanOneProgrammingStylesAndParadigms;
    }

    /**
     * @return the interesting
     */
    public String getInteresting() {
        return interesting;
    }

    /**
     * @param interesting the interesting to set
     */
    public void setInteresting(String interesting) {
        this.interesting = interesting;
    }

    /**
     * @return the practice_difficulty
     */
    public String getPractice_difficulty() {
        return practice_difficulty;
    }

    /**
     * @param practice_difficulty the practice_difficulty to set
     */
    public void setPractice_difficulty(String practice_difficulty) {
        this.practice_difficulty = practice_difficulty;
    }

    /**
     * @return the practice_starting
     */
    public String getPractice_starting() {
        return practice_starting;
    }

    /**
     * @param practice_starting the practice_starting to set
     */
    public void setPractice_starting(String practice_starting) {
        this.practice_starting = practice_starting;
    }

    /**
     * @return the information_usefulness
     */
    public String getInformation_usefulness() {
        return information_usefulness;
    }

    /**
     * @param information_usefulness the information_usefulness to set
     */
    public void setInformation_usefulness(String information_usefulness) {
        this.information_usefulness = information_usefulness;
    }

    /**
     * @return the material_clarity
     */
    public String getMaterial_clarity() {
        return material_clarity;
    }

    /**
     * @param material_clarity the material_clarity to set
     */
    public void setMaterial_clarity(String material_clarity) {
        this.material_clarity = material_clarity;
    }

    /**
     * @return the material_inspiring
     */
    public String getMaterial_inspiring() {
        return material_inspiring;
    }

    /**
     * @param material_inspiring the material_inspiring to set
     */
    public void setMaterial_inspiring(String material_inspiring) {
        this.material_inspiring = material_inspiring;
    }

    /**
     * @return the material_helped
     */
    public String getMaterial_helped() {
        return material_helped;
    }

    /**
     * @param material_helped the material_helped to set
     */
    public void setMaterial_helped(String material_helped) {
        this.material_helped = material_helped;
    }

    @Override
    public String toString() {
        return super.toString() + ";" + hasProgrammedInThePast + ";" + hasOoProgrammedInThePast + ";"
                + programDuringFreeTimeNowAndThen + ";" + readingProgrammingRelatedContentInFreetime + ";"
                + canNameMoreThanOneProgrammingLanguages + ";" + canNameMoreThanOneProgrammingStylesAndParadigms + ";"
                + getInformation_usefulness() + ";" + getInteresting() + ";" + getMaterial_clarity() + ";" + getMaterial_helped() + ";"
                + getMaterial_inspiring() + ";" + getPractice_difficulty() + ";" + getPractice_starting() + ";";
    }

    public String dataString() {
        return hasProgrammedInThePast + ";" + hasOoProgrammedInThePast + ";"
                + programDuringFreeTimeNowAndThen + ";" + readingProgrammingRelatedContentInFreetime + ";"
                + canNameMoreThanOneProgrammingLanguages + ";" + canNameMoreThanOneProgrammingStylesAndParadigms + ";"
                + getInformation_usefulness() + ";" + getInteresting() + ";" + getMaterial_clarity() + ";" + getMaterial_helped() + ";"
                + getMaterial_inspiring() + ";" + getPractice_difficulty() + ";" + getPractice_starting() + ";";
    }
}
