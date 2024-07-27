package back.wanted.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CompanyNotice {

    //채용공고

    //채용공고 id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long companyNoticeId;

    //회사 id
    private Long companyId;

    //채용 포지션
    private String position;

    //채용보상금
    private Long incentive;

    //채용내용
    private String content;

    //사용기술
    private String usingStack;

    public Long getCompanyNoticeId() {
        return companyNoticeId;
    }

    public void setCompanyNoticeId(Long companyNoticeId) {
        this.companyNoticeId = companyNoticeId;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Long getIncentive() {
        return incentive;
    }

    public void setIncentive(Long incentive) {
        this.incentive = incentive;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getUsingStack() {
        return usingStack;
    }

    public void setUsingStack(String usingStack) {
        this.usingStack = usingStack;
    }
}
