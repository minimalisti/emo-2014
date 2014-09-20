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

    @Override
    public String toString() {
        return super.toString() + ";" + hasProgrammedInThePast + ";" + hasOoProgrammedInThePast + ";" + programDuringFreeTimeNowAndThen + ";" + readingProgrammingRelatedContentInFreetime + ";" + canNameMoreThanOneProgrammingLanguages + ";" + canNameMoreThanOneProgrammingStylesAndParadigms + ";";
    }
    
    public String dataString() {
        return hasProgrammedInThePast + ";" + hasOoProgrammedInThePast + ";" + programDuringFreeTimeNowAndThen + ";" + readingProgrammingRelatedContentInFreetime + ";" + canNameMoreThanOneProgrammingLanguages + ";" + canNameMoreThanOneProgrammingStylesAndParadigms;
    }

}
