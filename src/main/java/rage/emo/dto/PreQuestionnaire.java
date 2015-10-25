package rage.emo.dto;

import javax.persistence.Entity;

@Entity
public class PreQuestionnaire extends AbstractSiteVisit {

    private String hasProgrammedInThePast;
    private String hasOoProgrammedInThePast;
    private String programDuringFreeTimeNowAndThen;
    private String readingProgrammingRelatedContentInFreetime;
    private String canNameMoreThanOneProgrammingLanguages;
    private String canNameMoreThanOneProgrammingStylesAndParadigms;


    public String isHasProgrammedInThePast() {
        return hasProgrammedInThePast;
    }

    public void setHasProgrammedInThePast(String hasProgrammedInThePast) {
        this.hasProgrammedInThePast = hasProgrammedInThePast;
    }

    public String isHasOoProgrammedInThePast() {
        return hasOoProgrammedInThePast;
    }

    public void setHasOoProgrammedInThePast(String hasOoProgrammedInThePast) {
        this.hasOoProgrammedInThePast = hasOoProgrammedInThePast;
    }

    public String isProgramDuringFreeTimeNowAndThen() {
        return programDuringFreeTimeNowAndThen;
    }

    public void setProgramDuringFreeTimeNowAndThen(String programDuringFreeTimeNowAndThen) {
        this.programDuringFreeTimeNowAndThen = programDuringFreeTimeNowAndThen;
    }

    public String isReadingProgrammingRelatedContentInFreetime() {
        return readingProgrammingRelatedContentInFreetime;
    }

    public void setReadingProgrammingRelatedContentInFreetime(String readingProgrammingRelatedContentInFreetime) {
        this.readingProgrammingRelatedContentInFreetime = readingProgrammingRelatedContentInFreetime;
    }

    public String isCanNameMoreThanOneProgrammingLanguages() {
        return canNameMoreThanOneProgrammingLanguages;
    }

    public void setCanNameMoreThanOneProgrammingLanguages(String canNameMoreThanOneProgrammingLanguages) {
        this.canNameMoreThanOneProgrammingLanguages = canNameMoreThanOneProgrammingLanguages;
    }

    public String isCanNameMoreThanOneProgrammingStylesAndParadigms() {
        return canNameMoreThanOneProgrammingStylesAndParadigms;
    }

    public void setCanNameMoreThanOneProgrammingStylesAndParadigms(String canNameMoreThanOneProgrammingStylesAndParadigms) {
        this.canNameMoreThanOneProgrammingStylesAndParadigms = canNameMoreThanOneProgrammingStylesAndParadigms;
    }
        
    @Override
    public String toString() {
        return super.toString() + ";" + hasProgrammedInThePast + ";" + hasOoProgrammedInThePast + ";"
                + programDuringFreeTimeNowAndThen + ";" + readingProgrammingRelatedContentInFreetime + ";"
                + canNameMoreThanOneProgrammingLanguages + ";" + canNameMoreThanOneProgrammingStylesAndParadigms + ";";
    }

    public String dataString() {
        return hasProgrammedInThePast + ";" + hasOoProgrammedInThePast + ";"
                + programDuringFreeTimeNowAndThen + ";" + readingProgrammingRelatedContentInFreetime + ";"
                + canNameMoreThanOneProgrammingLanguages + ";" + canNameMoreThanOneProgrammingStylesAndParadigms + ";";
    }

}
