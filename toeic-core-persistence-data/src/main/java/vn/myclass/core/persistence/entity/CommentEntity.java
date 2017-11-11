package vn.myclass.core.persistence.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name="comment")
public class CommentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer commentId;

    @Column(name="content")
    private String content;

    @Column(name="createdate")
    private Timestamp createDate;

    public Integer getCommentId() {
        return commentId;
    }

    @ManyToOne
    @JoinColumn(name="userid")
    private UserEntity userEntity;

    public ListenGuideLineEntity getListenguidelineEntity() {
        return listenguidelineEntity;
    }

    public void setListenguidelineEntity(ListenGuideLineEntity listenguidelineEntity) {
        this.listenguidelineEntity = listenguidelineEntity;
    }

    @ManyToOne

    @JoinColumn(name="listenguidelineid")
    private ListenGuideLineEntity listenguidelineEntity;

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public UserEntity getUserEntity() {
        return userEntity;
    }

    public void setUserEntity(UserEntity userEntity) {
        this.userEntity = userEntity;
    }


    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }
}
