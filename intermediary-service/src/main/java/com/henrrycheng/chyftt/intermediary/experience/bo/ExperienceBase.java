package com.henrrycheng.chyftt.intermediary.experience.bo;

import com.baidu.bjf.dao.ColumnDescription;
import com.baidu.bjf.dao.FieldAccessVo;
import com.baidu.bjf.dao.Id;
import java.io.Serializable;
import java.util.Collections;
import java.util.Date;
import java.util.Map;
import java.util.WeakHashMap;
import org.apache.commons.lang.ObjectUtils;

/**
 * This bo is map to table : tb_experience
 * Table description : 事情经历
 * @author chengyong
 */
public abstract class ExperienceBase extends FieldAccessVo implements Serializable {
    /** serial Version UID. */
    private static final long serialVersionUID = -1L;

    /** hashCode temporary storage. */
    private volatile Long hashCode;

    /** Use a WeakHashMap so entries will be garbage collected once all entities 
    referring to a saved hash are garbage collected themselves. */
    private static final Map<Serializable, Long> SAVED_HASHES = 
        Collections.synchronizedMap(new WeakHashMap<Serializable, Long>());

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_experience.id
     *
     * @mbggenerated Sat Mar 18 22:45:19 CST 2017
     */
    @ColumnDescription(desc = "id")
    @Id
    private Long id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_experience.location_id
     *
     * @mbggenerated Sat Mar 18 22:45:19 CST 2017
     */
    @ColumnDescription(desc = "城市-公司-小区关系id")
    private Long locationId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_experience.content
     *
     * @mbggenerated Sat Mar 18 22:45:19 CST 2017
     */
    @ColumnDescription(desc = "事情经过")
    private String content;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_experience.score
     *
     * @mbggenerated Sat Mar 18 22:45:19 CST 2017
     */
    @ColumnDescription(desc = "黑心指数")
    private Long score;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_experience.count_read
     *
     * @mbggenerated Sat Mar 18 22:45:19 CST 2017
     */
    @ColumnDescription(desc = "浏览次数")
    private Long countRead;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_experience.count_agree
     *
     * @mbggenerated Sat Mar 18 22:45:19 CST 2017
     */
    @ColumnDescription(desc = "顶次数")
    private Long countAgree;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_experience.count_disagree
     *
     * @mbggenerated Sat Mar 18 22:45:19 CST 2017
     */
    @ColumnDescription(desc = "踩次数")
    private Long countDisagree;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_experience.count_comment
     *
     * @mbggenerated Sat Mar 18 22:45:19 CST 2017
     */
    @ColumnDescription(desc = "评论数")
    private Long countComment;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_experience.add_time
     *
     * @mbggenerated Sat Mar 18 22:45:19 CST 2017
     */
    @ColumnDescription(desc = "添加时间")
    private Date addTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_experience.add_user_id
     *
     * @mbggenerated Sat Mar 18 22:45:19 CST 2017
     */
    @ColumnDescription(desc = "添加人id")
    private Long addUserId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_experience.update_time
     *
     * @mbggenerated Sat Mar 18 22:45:19 CST 2017
     */
    @ColumnDescription(desc = "更新时间")
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_experience.update_user_id
     *
     * @mbggenerated Sat Mar 18 22:45:19 CST 2017
     */
    @ColumnDescription(desc = "更新人id")
    private Long updateUserId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_experience.is_deleted
     *
     * @mbggenerated Sat Mar 18 22:45:19 CST 2017
     */
    @ColumnDescription(desc = "是否已逻辑删除，0未删除，1已删除")
    private Boolean isDeleted;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_experience.id
     *
     * @return the value of tb_experience.id
     *
     * @mbggenerated Sat Mar 18 22:45:19 CST 2017
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_experience.id
     *
     * @param id the value for tb_experience.id
     *
     * @mbggenerated Sat Mar 18 22:45:19 CST 2017
     */
    public void setId(Long id) {
        // If we've just been persisted and hashCode has been
        // returned then make sure other entities with this
        // ID return the already returned hash code
        if ( this.id == null && id != null && this.hashCode != null ) {
            SAVED_HASHES.put( id, this.hashCode );
        }
        if (!ObjectUtils.equals(id, this.id)) {
            getChangeLogInfo().put("id", id);
        }
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_experience.location_id
     *
     * @return the value of tb_experience.location_id
     *
     * @mbggenerated Sat Mar 18 22:45:19 CST 2017
     */
    public Long getLocationId() {
        return locationId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_experience.location_id
     *
     * @param locationId the value for tb_experience.location_id
     *
     * @mbggenerated Sat Mar 18 22:45:19 CST 2017
     */
    public void setLocationId(Long locationId) {
        if (!ObjectUtils.equals(locationId, this.locationId)) {
            getChangeLogInfo().put("locationId", locationId);
        }
        this.locationId = locationId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_experience.content
     *
     * @return the value of tb_experience.content
     *
     * @mbggenerated Sat Mar 18 22:45:19 CST 2017
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_experience.content
     *
     * @param content the value for tb_experience.content
     *
     * @mbggenerated Sat Mar 18 22:45:19 CST 2017
     */
    public void setContent(String content) {
        if (!ObjectUtils.equals(content, this.content)) {
            getChangeLogInfo().put("content", content);
        }
        this.content = content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_experience.score
     *
     * @return the value of tb_experience.score
     *
     * @mbggenerated Sat Mar 18 22:45:19 CST 2017
     */
    public Long getScore() {
        return score;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_experience.score
     *
     * @param score the value for tb_experience.score
     *
     * @mbggenerated Sat Mar 18 22:45:19 CST 2017
     */
    public void setScore(Long score) {
        if (!ObjectUtils.equals(score, this.score)) {
            getChangeLogInfo().put("score", score);
        }
        this.score = score;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_experience.count_read
     *
     * @return the value of tb_experience.count_read
     *
     * @mbggenerated Sat Mar 18 22:45:19 CST 2017
     */
    public Long getCountRead() {
        return countRead;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_experience.count_read
     *
     * @param countRead the value for tb_experience.count_read
     *
     * @mbggenerated Sat Mar 18 22:45:19 CST 2017
     */
    public void setCountRead(Long countRead) {
        if (!ObjectUtils.equals(countRead, this.countRead)) {
            getChangeLogInfo().put("countRead", countRead);
        }
        this.countRead = countRead;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_experience.count_agree
     *
     * @return the value of tb_experience.count_agree
     *
     * @mbggenerated Sat Mar 18 22:45:19 CST 2017
     */
    public Long getCountAgree() {
        return countAgree;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_experience.count_agree
     *
     * @param countAgree the value for tb_experience.count_agree
     *
     * @mbggenerated Sat Mar 18 22:45:19 CST 2017
     */
    public void setCountAgree(Long countAgree) {
        if (!ObjectUtils.equals(countAgree, this.countAgree)) {
            getChangeLogInfo().put("countAgree", countAgree);
        }
        this.countAgree = countAgree;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_experience.count_disagree
     *
     * @return the value of tb_experience.count_disagree
     *
     * @mbggenerated Sat Mar 18 22:45:19 CST 2017
     */
    public Long getCountDisagree() {
        return countDisagree;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_experience.count_disagree
     *
     * @param countDisagree the value for tb_experience.count_disagree
     *
     * @mbggenerated Sat Mar 18 22:45:19 CST 2017
     */
    public void setCountDisagree(Long countDisagree) {
        if (!ObjectUtils.equals(countDisagree, this.countDisagree)) {
            getChangeLogInfo().put("countDisagree", countDisagree);
        }
        this.countDisagree = countDisagree;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_experience.count_comment
     *
     * @return the value of tb_experience.count_comment
     *
     * @mbggenerated Sat Mar 18 22:45:19 CST 2017
     */
    public Long getCountComment() {
        return countComment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_experience.count_comment
     *
     * @param countComment the value for tb_experience.count_comment
     *
     * @mbggenerated Sat Mar 18 22:45:19 CST 2017
     */
    public void setCountComment(Long countComment) {
        if (!ObjectUtils.equals(countComment, this.countComment)) {
            getChangeLogInfo().put("countComment", countComment);
        }
        this.countComment = countComment;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_experience.add_time
     *
     * @return the value of tb_experience.add_time
     *
     * @mbggenerated Sat Mar 18 22:45:19 CST 2017
     */
    public Date getAddTime() {
        return addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_experience.add_time
     *
     * @param addTime the value for tb_experience.add_time
     *
     * @mbggenerated Sat Mar 18 22:45:19 CST 2017
     */
    public void setAddTime(Date addTime) {
        if (!ObjectUtils.equals(addTime, this.addTime)) {
            getChangeLogInfo().put("addTime", addTime);
        }
        this.addTime = addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_experience.add_user_id
     *
     * @return the value of tb_experience.add_user_id
     *
     * @mbggenerated Sat Mar 18 22:45:19 CST 2017
     */
    public Long getAddUserId() {
        return addUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_experience.add_user_id
     *
     * @param addUserId the value for tb_experience.add_user_id
     *
     * @mbggenerated Sat Mar 18 22:45:19 CST 2017
     */
    public void setAddUserId(Long addUserId) {
        if (!ObjectUtils.equals(addUserId, this.addUserId)) {
            getChangeLogInfo().put("addUserId", addUserId);
        }
        this.addUserId = addUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_experience.update_time
     *
     * @return the value of tb_experience.update_time
     *
     * @mbggenerated Sat Mar 18 22:45:19 CST 2017
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_experience.update_time
     *
     * @param updateTime the value for tb_experience.update_time
     *
     * @mbggenerated Sat Mar 18 22:45:19 CST 2017
     */
    public void setUpdateTime(Date updateTime) {
        if (!ObjectUtils.equals(updateTime, this.updateTime)) {
            getChangeLogInfo().put("updateTime", updateTime);
        }
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_experience.update_user_id
     *
     * @return the value of tb_experience.update_user_id
     *
     * @mbggenerated Sat Mar 18 22:45:19 CST 2017
     */
    public Long getUpdateUserId() {
        return updateUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_experience.update_user_id
     *
     * @param updateUserId the value for tb_experience.update_user_id
     *
     * @mbggenerated Sat Mar 18 22:45:19 CST 2017
     */
    public void setUpdateUserId(Long updateUserId) {
        if (!ObjectUtils.equals(updateUserId, this.updateUserId)) {
            getChangeLogInfo().put("updateUserId", updateUserId);
        }
        this.updateUserId = updateUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_experience.is_deleted
     *
     * @return the value of tb_experience.is_deleted
     *
     * @mbggenerated Sat Mar 18 22:45:19 CST 2017
     */
    public Boolean getIsDeleted() {
        return isDeleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_experience.is_deleted
     *
     * @param isDeleted the value for tb_experience.is_deleted
     *
     * @mbggenerated Sat Mar 18 22:45:19 CST 2017
     */
    public void setIsDeleted(Boolean isDeleted) {
        if (!ObjectUtils.equals(isDeleted, this.isDeleted)) {
            getChangeLogInfo().put("isDeleted", isDeleted);
        }
        this.isDeleted = isDeleted;
    }

    @Override
    public int hashCode() {
        if ( this.hashCode == null ) {
            synchronized ( this ) {
                if ( this.hashCode == null ) {
                    Long newHashCode = null;
                    if ( getId() != null ) {
                        newHashCode = SAVED_HASHES.get( getId() );
                    }
                    
                    if ( newHashCode == null ) {
                        if ( getId() != null ) {
                            newHashCode = (long)getId().hashCode();
                        } else {
                            newHashCode = (long) super.hashCode();
                        }
                    }
                    this.hashCode = newHashCode;
                }
            }
        }
        return (int) (this.hashCode & 0xffffff);
    }

    @Override
    public boolean equals(final Object aThat) {
        
        if ( this == aThat ) {
            return true;
        }
        if( aThat == null ) {
            return false;
        }
        if (!( aThat instanceof ExperienceBase )) {
            return false;
        }
        
        final ExperienceBase THAT = (ExperienceBase) aThat;
        boolean result = true;
        result = result && (((this.getId() == null) &&
             ( THAT.getId() == null)) || (this.getId() != null  && 
            this.getId().equals(THAT.getId())));
        return result;
    }
}