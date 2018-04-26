package model;

import javax.persistence.*;

@Table(name = "core_role_function")
public class CoreRoleFunction {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "ROLE_ID")
    private Integer roleId;

    @Column(name = "FUNCTION_ID")
    private Integer functionId;

    @Column(name = "DATA_ACCESS_TYPE")
    private Byte dataAccessType;

    @Column(name = "DATA_ACCESS_POLICY")
    private String dataAccessPolicy;

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
     * @return ROLE_ID
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * @param roleId
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
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
     * @return DATA_ACCESS_TYPE
     */
    public Byte getDataAccessType() {
        return dataAccessType;
    }

    /**
     * @param dataAccessType
     */
    public void setDataAccessType(Byte dataAccessType) {
        this.dataAccessType = dataAccessType;
    }

    /**
     * @return DATA_ACCESS_POLICY
     */
    public String getDataAccessPolicy() {
        return dataAccessPolicy;
    }

    /**
     * @param dataAccessPolicy
     */
    public void setDataAccessPolicy(String dataAccessPolicy) {
        this.dataAccessPolicy = dataAccessPolicy;
    }
}