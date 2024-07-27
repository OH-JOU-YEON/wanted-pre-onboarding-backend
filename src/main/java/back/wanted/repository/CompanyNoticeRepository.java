package back.wanted.repository;


import back.wanted.domain.CompanyNotice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyNoticeRepository extends JpaRepository<CompanyNotice,Long> {
}
