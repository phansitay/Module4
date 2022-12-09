package codegym.email.repository;

import codegym.email.model.Email;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEmailRepository extends JpaRepository<Email, Integer> {
}
