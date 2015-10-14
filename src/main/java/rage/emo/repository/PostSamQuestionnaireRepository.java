/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rage.emo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rage.emo.dto.SamQuestionnaire;

/**
 *
 * @author minimalisti
 */
public interface PostSamQuestionnaireRepository extends JpaRepository<SamQuestionnaire, Long> {

}

