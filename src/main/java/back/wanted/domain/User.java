package back.wanted.domain;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@B
@Entity
public class User {


    //유저 id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;


    //유저 이름
    private String userName;


    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
