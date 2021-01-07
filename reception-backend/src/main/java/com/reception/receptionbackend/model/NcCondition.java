package com.reception.receptionbackend.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CONREP_NC_CONDITIONS")
public class NcCondition {
    @Id
    private String nc_code;
    private String nc_condition;
    private String nc_apply_by;
    private String create_date;
    private String update_date;
    private int is_active;
    private String nc_comment;

    public NcCondition() {}

    public NcCondition(String nc_code, String nc_condition, String nc_apply_by, String create_date, String update_date, int is_active, String nc_comment) {
        this.nc_code = nc_code;
        this.nc_condition = nc_condition;
        this.nc_apply_by = nc_apply_by;
        this.create_date = create_date;
        this.update_date = update_date;
        this.is_active = is_active;
        this.nc_comment = nc_comment;
    }

    public String getNc_code() {
        return nc_code;
    }

    public void setNc_code(String nc_code) {
        this.nc_code = nc_code;
    }

    public String getNc_condition() {
        return nc_condition;
    }

    public void setNc_condition(String nc_condition) {
        this.nc_condition = nc_condition;
    }

    public String getNc_apply_by() {
        return nc_apply_by;
    }

    public void setNc_apply_by(String nc_apply_by) {
        this.nc_apply_by = nc_apply_by;
    }

    public String getCreate_date() {
        return create_date;
    }

    public void setCreate_date(String create_date) {
        this.create_date = create_date;
    }

    public String getUpdate_date() {
        return update_date;
    }

    public void setUpdate_date(String update_date) {
        this.update_date = update_date;
    }

    public int getIs_active() {
        return is_active;
    }

    public void setIs_active(int is_active) {
        this.is_active = is_active;
    }

    public String getNc_comment() {
        return nc_comment;
    }

    public void setNc_comment(String nc_comment) {
        this.nc_comment = nc_comment;
    }

    @Override
    public String toString() {
        return "NcCondition{" +
                "nc_code='" + nc_code + '\'' +
                ", nc_condition='" + nc_condition + '\'' +
                ", nc_apply_by='" + nc_apply_by + '\'' +
                ", create_date='" + create_date + '\'' +
                ", update_date='" + update_date + '\'' +
                ", is_active=" + is_active +
                ", nc_comment='" + nc_comment + '\'' +
                '}';
    }
}
