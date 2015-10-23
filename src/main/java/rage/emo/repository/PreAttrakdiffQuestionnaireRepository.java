package rage.emo.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import rage.emo.dto.PreAttrakdiffQuestionnaire;

public interface PreAttrakdiffQuestionnaireRepository extends JpaRepository<PreAttrakdiffQuestionnaire, Long> {

    List<PreAttrakdiffQuestionnaire> findByUsername(String name);

}
