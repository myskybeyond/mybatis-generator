package com.mybatis.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "core_menu")
public class CoreMenu {
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

    @Column(name = "FUNCTION_ID")
    private Integer functionId;

    /**
     * 1,系统，2 导航 3 菜单项（对应某个功能点）
     */
    @Column(name = "TYPE")
    private String type;

    @Column(name = "PARENT_MENU_ID")
    private Integer parentMenuId;

    @Column(name = "SEQ")
    private Integer seq;

    /**
     * 图标
     */
    @Column(name = "ICON")
    private String icon;

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
     * @return FUNCTION_ID
     */
    public Integer getFunctionId() {
        return functionId;
    }

    /**
     * @param functionId
     */
    public void setFunctionId(Integer functionId) {
        this.functionId = functionId;
    }

    /**
     * 获取1,系统，2 导航 3 菜单项（对应某个功能点）
     *
     * @return TYPE - 1,系统，2 导航 3 菜单项（对应某个功能点）
     */
    public String getType() {
        return type;
    }

    /**
     * 设置1,系统，2 导航 3 菜单项（对应某个功能点）
     *
     * @param type 1,系统，2 导航 3 菜单项（对应某个功能点）
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return PARENT_MENU_ID
     */
    public Integer getParentMenuId() {
        return parentMenuId;
    }

    /**
     * @param parentMenuId
     */
    public void setParentMenuId(Integer parentMenuId) {
        this.parentMenuId = parentMenuId;
    }

    /**
     * @return SEQ
     */
    public Integer getSeq() {
        return seq;
    }

    /**
     * @param seq
     */
    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    /**
     * 获取图标
     *
     * @return ICON - 图标
     */
    public String getIcon() {
        return icon;
    }

    /**
     * 设置图标
     *
     * @param icon 图标
     */
    public void setIcon(String icon) {
        this.icon = icon;
    }
}