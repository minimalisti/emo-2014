/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rage.emo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rage.emo.dto.PanasQuestionnaire;

/**
 *
 * @author minimalisti
 */
public interface PostPanasQuestionnaireRepository extends JpaRepository<PanasQuestionnaire, Long> {

}
