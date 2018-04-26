package model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "core_user")
public class CoreUser {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "CODE")
    private String code;

    @Column(name = "NAME")
    private String name;

    @Column(name = "PASSWORD")
    private String password;

    @Column(name = "CREATE_TIME")
    private Date createTime;

    @Column(name = "ORG_ID")
    private Integer orgId;

    /**
     * 用户状态 1:启用 0:停用
     */
    @Column(name = "STATE")
    private String state;

    @Column(name = "JOB_TYPE1")
    private String jobType1;

    /**
     * 用户删除标记 0:未删除 1:已删除
     */
    @Column(name = "DEL_FLAG")
    private Byte delFlag;

    @Column(name = "update_Time")
    private Date updateTime;

    @Column(name = "JOB_TYPE0")
    private String jobType0;

    @Column(name = "attachment_id")
    private String attachmentId;

    /**
     * @return ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return CODE
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return NAME
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return PASSWORD
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return CREATE_TIME
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return ORG_ID
     */
    public Integer getOrgId() {
        return orgId;
    }

    /**
     * @param orgId
     */
    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    /**
     * 获取用户状态 1:启用 0:停用
     *
     * @return STATE - 用户状态 1:启用 0:停用
     */
    public String getState() {
        return state;
    }

    /**
     * 设置用户状态 1:启用 0:停用
     *
     * @param state 用户状态 1:启用 0:停用
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * @return JOB_TYPE1
     */
    public String getJobType1() {
        return jobType1;
    }

    /**
     * @param jobType1
     */
    public void setJobType1(String jobType1) {
        this.jobType1 = jobType1;
    }

    /**
     * 获取用户删除标记 0:未删除 1:已删除
     *
     * @return DEL_FLAG - 用户删除标记 0:未删除 1:已删除
     */
    public Byte getDelFlag() {
        return delFlag;
    }

    /**
     * 设置用户删除标记 0:未删除 1:已删除
     *
     * @param delFlag 用户删除标记 0:未删除 1:已删除
     */
    public void setDelFlag(Byte delFlag) {
        this.delFlag = delFlag;
    }

    /**
     * @return update_Time
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * @param updateTime
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * @return JOB_TYPE0
     */
    public String getJobType0() {
        return jobType0;
    }

    /**
     * @param jobType0
     */
    public void setJobType0(String jobType0) {
        this.jobType0 = jobType0;
    }

    /**
     * @return attachment_id
     */
    public String getAttachmentId() {
        return attachmentId;
    }

    /**
     * @param attachmentId
     */
    public void setAttachmentId(String attachmentId) {
        this.attachmentId = attachmentId;
    }
}