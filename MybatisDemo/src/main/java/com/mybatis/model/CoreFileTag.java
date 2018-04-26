package model;

import javax.persistence.*;

@Table(name = "core_file_tag")
public class CoreFileTag {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * key，关键字
     */
    @Column(name = "KEY")
    private String key;

    /**
     * 关键字对应的值
     */
    @Column(name = "VALUE")
    private String value;

    /**
     * sys_file的id，文件id
     */
    @Column(name = "FILE_ID")
    private Integer fileId;

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
     * 获取key，关键字
     *
     * @return KEY - key，关键字
     */
    public String getKey() {
        return key;
    }

    /**
     * 设置key，关键字
     *
     * @param key key，关键字
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * 获取关键字对应的值
     *
     * @return VALUE - 关键字对应的值
     */
    public String getValue() {
        return value;
    }

    /**
     * 设置关键字对应的值
     *
     * @param value 关键字对应的值
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * 获取sys_file的id，文件id
     *
     * @return FILE_ID - sys_file的id，文件id
     */
    public Integer getFileId() {
        return fileId;
    }

    /**
     * 设置sys_file的id，文件id
     *
     * @param fileId sys_file的id，文件id
     */
    public void setFileId(Integer fileId) {
        this.fileId = fileId;
    }
}