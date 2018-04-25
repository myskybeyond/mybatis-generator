package tk.mybatis.mapper.model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "core_role")
public class CoreRole {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 角色编码
     */
    @Column(name = "CODE")
    private String code;

    /**
     * 角色名称
     */
    @Column(name = "NAME")
    private String name;

    /**
     * 创建时间
     */
    @Column(name = "CREATE_TIME")
    private Date createTime;

    /**
     * 1 可以配置 2 固定权限角色
     */
    @Column(name = "TYPE")
    private String type;

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
     * 获取角色编码
     *
     * @return CODE - 角色编码
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置角色编码
     *
     * @param code 角色编码
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 获取角色名称
     *
     * @return NAME - 角色名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置角色名称
     *
     * @param name 角色名称
     */
    public void setName(String name) {
        this.name = name;
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
     * 获取1 可以配置 2 固定权限角色
     *
     * @return TYPE - 1 可以配置 2 固定权限角色
     */
    public String getType() {
        return type;
    }

    /**
     * 设置1 可以配置 2 固定权限角色
     *
     * @param type 1 可以配置 2 固定权限角色
     */
    public void setType(String type) {
        this.type = type;
    }
}