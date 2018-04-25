package tk.mybatis.mapper.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "core_org")
public class CoreOrg {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "CODE")
    private String code;

    @Column(name = "NAME")
    private String name;

    @Column(name = "CREATE_TIME")
    private Date createTime;

    @Column(name = "PARENT_ORG_ID")
    private Integer parentOrgId;

    /**
     * 1 公司，2 部门，3 小组
     */
    @Column(name = "TYPE")
    private String type;

    @Column(name = "DEL_FLAG")
    private Byte delFlag;

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
     * @return PARENT_ORG_ID
     */
    public Integer getParentOrgId() {
        return parentOrgId;
    }

    /**
     * @param parentOrgId
     */
    public void setParentOrgId(Integer parentOrgId) {
        this.parentOrgId = parentOrgId;
    }

    /**
     * 获取1 公司，2 部门，3 小组
     *
     * @return TYPE - 1 公司，2 部门，3 小组
     */
    public String getType() {
        return type;
    }

    /**
     * 设置1 公司，2 部门，3 小组
     *
     * @param type 1 公司，2 部门，3 小组
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return DEL_FLAG
     */
    public Byte getDelFlag() {
        return delFlag;
    }

    /**
     * @param delFlag
     */
    public void setDelFlag(Byte delFlag) {
        this.delFlag = delFlag;
    }
}