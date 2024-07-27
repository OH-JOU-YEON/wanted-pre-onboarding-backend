package back.wanted.domain;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Apply {


    //채용공고 id
    @Id
    private Long companyNoticeId;

    //유저 id
    private Long userId;

    public Long getCompanyNoticeId() {
        return companyNoticeId;
    }

    public void setCompanyNoticeId(Long companyNoticeId) {
        this.companyNoticeId = companyNoticeId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
