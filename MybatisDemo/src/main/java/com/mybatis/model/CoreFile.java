package model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "core_file")
public class CoreFile {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 文件名称
     */
    @Column(name = "NAME")
    private String name;

    /**
     * 路径
     */
    @Column(name = "PATH")
    private String path;

    /**
     * 业务ID
     */
    @Column(name = "BIZ_ID")
    private String bizId;

    /**
     * 上传人id
     */
    @Column(name = "USER_ID")
    private Integer userId;

    /**
     * 创建时间
     */
    @Column(name = "CREATE_TIME")
    private Date createTime;

    @Column(name = "ORG_ID")
    private Integer orgId;

    @Column(name = "BIZ_TYPE")
    private String bizType;

    @Column(name = "FILE_BATCH_ID")
    private String fileBatchId;

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
     * 获取文件名称
     *
     * @return NAME - 文件名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置文件名称
     *
     * @param name 文件名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取路径
     *
     * @return PATH - 路径
     */
    public String getPath() {
        return path;
    }

    /**
     * 设置路径
     *
     * @param path 路径
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * 获取业务ID
     *
     * @return BIZ_ID - 业务ID
     */
    public String getBizId() {
        return bizId;
    }

    /**
     * 设置业务ID
     *
     * @param bizId 业务ID
     */
    public void setBizId(String bizId) {
        this.bizId = bizId;
    }

    /**
     * 获取上传人id
     *
     * @return USER_ID - 上传人id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置上传人id
     *
     * @param userId 上传人id
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取创建时间
     *
     * @return CREATE_TIME - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
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
     * @return BIZ_TYPE
     */
    public String getBizType() {
        return bizType;
    }

    /**
     * @param bizType
     */
    public void setBizType(String bizType) {
        this.bizType = bizType;
    }

    /**
     * @return FILE_BATCH_ID
     */
    public String getFileBatchId() {
        return fileBatchId;
    }

    /**
     * @param fileBatchId
     */
    public void setFileBatchId(String fileBatchId) {
        this.fileBatchId = fileBatchId;
    }
}