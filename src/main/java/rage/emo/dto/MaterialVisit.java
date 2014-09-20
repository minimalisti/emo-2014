package rage.emo.dto;

import javax.persistence.Entity;

@Entity
public class MaterialVisit extends AbstractSiteVisit implements Comparable<MaterialVisit> {

    @Override
    public int compareTo(MaterialVisit o) {
        return this.getVisitStarted().compareTo(o.getVisitStarted());
    }

}
