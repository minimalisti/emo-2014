package rage.emo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import rage.emo.dto.PreQuestionnaire;

public interface PreQuestionnaireRepository extends JpaRepository<PreQuestionnaire, Long> {

    List<PreQuestionnaire> findByUsername(String name);
}
