package rage.emo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import rage.emo.dto.DemographicQuestionnaire;

public interface DemographicQuestionnaireRepository extends JpaRepository<DemographicQuestionnaire, Long> {

    List<DemographicQuestionnaire> findByUsername(String name);
}