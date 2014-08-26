package rage.emo.dto;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class PreQuestionnaire extends AbstractSiteVisit {

    @Column(columnDefinition = "boolean default false", nullable = false)
    private Boolean hasProgrammedInThePast;
    @Column(columnDefinition = "boolean default false", nullable = false)
    private Boolean hasOoProgrammedInThePast;
    @Column(columnDefinition = "boolean default false", nullable = false)
    private Boolean programDuringFreeTimeNowAndThen;
    @Column(columnDefinition = "boolean default false", nullable = false)
    private Boolean readingProgrammingRelatedContentInFreetime;
    @Column(columnDefinition = "boolean default false", nullable = false)
    private Boolean canNameMoreThanOneProgrammingLanguages;
    @Column(columnDefinition = "boolean default false", nullable = false)
    private Boolean canNameMoreThanOneProgrammingStylesAndParadigms;

    private String assignedMaterialType;

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

    public String getAssignedMaterialType() {
        return assignedMaterialType;
    }

    public void setAssignedMaterialType(String assignedMaterialType) {
        this.assignedMaterialType = assignedMaterialType;
    }

}
