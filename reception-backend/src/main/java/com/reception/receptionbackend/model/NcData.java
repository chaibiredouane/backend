package com.reception.receptionbackend.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CONREP_NON_CONFORMITY")
public class NcData {
    @Id
    private long id;
    private long sample_id;
    private String nc_code;
    private String status;
    private String user_comment;
    private String create_date;
    private String create_by;

    public NcData() {}

    public NcData(long id, long sample_id, String nc_code, String status, String user_comment, String create_date, String create_by) {
        this.id = id;
        this.sample_id = sample_id;
        this.nc_code = nc_code;
        this.status = status;
        this.user_comment = user_comment;
        this.create_date = create_date;
        this.create_by = create_by;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getSample_id() {
        return sample_id;
    }

    public void setSample_id(long sample_id) {
        this.sample_id = sample_id;
    }

    public String getNc_code() {
        return nc_code;
    }

    public void setNc_code(String nc_code) {
        this.nc_code = nc_code;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUser_comment() {
        return user_comment;
    }

    public void setUser_comment(String user_comment) {
        this.user_comment = user_comment;
    }

    public String getCreate_date() {
        return create_date;
    }

    public void setCreate_date(String create_date) {
        this.create_date = create_date;
    }

    public String getCreate_by() {
        return create_by;
    }

    public void setCreate_by(String create_by) {
        this.create_by = create_by;
    }

    @Override
    public String toString() {
        return "Nc{" +
                "id=" + id +
                ", sample_id=" + sample_id +
                ", nc_code='" + nc_code + '\'' +
                ", status='" + status + '\'' +
                ", user_comment='" + user_comment + '\'' +
                ", create_date='" + create_date + '\'' +
                ", create_by='" + create_by + '\'' +
                '}';
    }
}
