package com.mybatis.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "core_audit")
public class CoreAudit {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "FUNCTION_CODE")
    private String functionCode;

    @Column(name = "FUNCTION_NAME")
    private String functionName;

    @Column(name = "USER_ID")
    private Integer userId;

    @Column(name = "USER_NAME")
    private String userName;

    @Column(name = "IP")
    private String ip;

    @Column(name = "CREATE_TIME")
    private Date createTime;

    @Column(name = "SUCCESS")
    private Byte success;

    @Column(name = "ORG_ID")
    private String orgId;

    @Column(name = "MESSAGE")
    private String message;

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
     * @return FUNCTION_CODE
     */
    public String getFunctionCode() {
        return functionCode;
    }

    /**
     * @param functionCode
     */
    public void setFunctionCode(String functionCode) {
        this.functionCode = functionCode;
    }

    /**
     * @return FUNCTION_NAME
     */
    public String getFunctionName() {
        return functionName;
    }

    /**
     * @param functionName
     */
    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    /**
     * @return USER_ID
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * @return USER_NAME
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return IP
     */
    public String getIp() {
        return ip;
    }

    /**
     * @param ip
     */
    public void setIp(String ip) {
        this.ip = ip;
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
     * @return SUCCESS
     */
    public Byte getSuccess() {
        return success;
    }

    /**
     * @param success
     */
    public void setSuccess(Byte success) {
        this.success = success;
    }

    /**
     * @return ORG_ID
     */
    public String getOrgId() {
        return orgId;
    }

    /**
     * @param orgId
     */
    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    /**
     * @return MESSAGE
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message
     */
    public void setMessage(String message) {
        this.message = message;
    }
}