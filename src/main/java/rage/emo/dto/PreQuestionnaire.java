package rage.emo.dto;

import javax.persistence.Entity;

@Entity
public class PreQuestionnaire extends AbstractSiteVisit {

    private boolean courseInHighschoolOrSmtn;
    private boolean programDuringFreeTimeNowAndThen;
    private boolean ictWasOneFavouriteInPastStudies;
    private boolean readingProgrammingRelatedContentInFreetime;
    private boolean canNameMoreThanOneProgrammingLanguages;
    private boolean canNameMoreThanOneProgrammingStylesAndParadigms;

    private String assignedMaterialType;

    public String getAssignedMaterialType() {
        return assignedMaterialType;
    }

    public void setAssignedMaterialType(String assignedMaterialType) {
        this.assignedMaterialType = assignedMaterialType;
    }

    public Boolean isCourseInHighschoolOrSmtn() {
        return courseInHighschoolOrSmtn;
    }

    public void setCourseInHighschoolOrSmtn(Boolean courseInHighschoolOrSmtn) {
        this.courseInHighschoolOrSmtn = courseInHighschoolOrSmtn;
    }

    public Boolean isProgramDuringFreeTimeNowAndThen() {
        return programDuringFreeTimeNowAndThen;
    }

    public void setProgramDuringFreeTimeNowAndThen(Boolean programDuringFreeTimeNowAndThen) {
        this.programDuringFreeTimeNowAndThen = programDuringFreeTimeNowAndThen;
    }

    public Boolean isIctWasOneFavouriteInPastStudies() {
        return ictWasOneFavouriteInPastStudies;
    }

    public void setIctWasOneFavouriteInPastStudies(Boolean ictWasOneFavouriteInPastStudies) {
        this.ictWasOneFavouriteInPastStudies = ictWasOneFavouriteInPastStudies;
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

}
