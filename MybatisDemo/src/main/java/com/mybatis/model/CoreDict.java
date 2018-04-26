package com.mybatis.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "core_dict")
public class CoreDict {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "VALUE")
    private String value;

    /**
     * 名称
     */
    @Column(name = "NAME")
    private String name;

    /**
     * 字典编码
     */
    @Column(name = "TYPE")
    private String type;

    /**
     * 类型描述
     */
    @Column(name = "TYPE_NAME")
    private String typeName;

    /**
     * 排序
     */
    @Column(name = "SORT")
    private Integer sort;

    /**
     * 父id
     */
    @Column(name = "PARENT")
    private Integer parent;

    /**
     * 删除标记
     */
    @Column(name = "DEL_FLAG")
    private Integer delFlag;

    /**
     * 备注
     */
    @Column(name = "REMARK")
    private String remark;

    /**
     * 创建时间
     */
    @Column(name = "CREATE_TIME")
    private Date createTime;

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
     * @return VALUE
     */
    public String getValue() {
        return value;
    }

    /**
     * @param value
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * 获取名称
     *
     * @return NAME - 名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置名称
     *
     * @param name 名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取字典编码
     *
     * @return TYPE - 字典编码
     */
    public String getType() {
        return type;
    }

    /**
     * 设置字典编码
     *
     * @param type 字典编码
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取类型描述
     *
     * @return TYPE_NAME - 类型描述
     */
    public String getTypeName() {
        return typeName;
    }

    /**
     * 设置类型描述
     *
     * @param typeName 类型描述
     */
    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    /**
     * 获取排序
     *
     * @return SORT - 排序
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * 设置排序
     *
     * @param sort 排序
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * 获取父id
     *
     * @return PARENT - 父id
     */
    public Integer getParent() {
        return parent;
    }

    /**
     * 设置父id
     *
     * @param parent 父id
     */
    public void setParent(Integer parent) {
        this.parent = parent;
    }

    /**
     * 获取删除标记
     *
     * @return DEL_FLAG - 删除标记
     */
    public Integer getDelFlag() {
        return delFlag;
    }

    /**
     * 设置删除标记
     *
     * @param delFlag 删除标记
     */
    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }

    /**
     * 获取备注
     *
     * @return REMARK - 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注
     *
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
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
}