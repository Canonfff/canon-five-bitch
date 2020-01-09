package com.canon.platform.model;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @program: canon-dependencies
 * @Auther: canon
 * @Date: 2020/1/9 11:08
 * @Description:
 */
public class IdCenter implements Serializable {
    private Long id;
    private String app;
    private String tableName;
    private Long cindex;
    private LocalDateTime createtime;
    private LocalDateTime updatetime;
    private String keypre;
    private Integer fstep;
    private Long dbid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public Long getCindex() {
        return cindex;
    }

    public void setCindex(Long cindex) {
        this.cindex = cindex;
    }

    public String getKeypre() {
        return keypre;
    }

    public void setKeypre(String keypre) {
        this.keypre = keypre;
    }

    public Integer getFstep() {
        return fstep;
    }

    public LocalDateTime getCreatetime() {
        return createtime;
    }

    public void setCreatetime(LocalDateTime createtime) {
        this.createtime = createtime;
    }

    public LocalDateTime getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(LocalDateTime updatetime) {
        this.updatetime = updatetime;
    }

    public void setFstep(Integer fstep) {
        this.fstep = fstep;
    }

    public Long getDbid() {
        return dbid;
    }

    public void setDbid(Long dbid) {
        this.dbid = dbid;
    }
}
