package rage.emo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import rage.emo.dto.Login;

public interface LoginRepository extends JpaRepository<Login, Long> {

}
