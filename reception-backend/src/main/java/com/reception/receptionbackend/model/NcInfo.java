package com.reception.receptionbackend.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CONREP_NC_INFO")
public class NcInfo {
    @Id
    private String nc_code;
    private String nc_display;
    private String nc_lims_display;
    private int is_manual;
    private int is_form;
    private String sample_types;
    private int is_deviation;
    private String fr_translation;
    private String category;
    private int is_active;
    private int to_be_display;

    public NcInfo() {}

    public NcInfo(String nc_code, String nc_display, String nc_lims_display, int is_manual, int is_form, String sample_types, int is_deviation, String fr_translation, String category, int is_active, int to_be_display) {
        this.nc_code = nc_code;
        this.nc_display = nc_display;
        this.nc_lims_display = nc_lims_display;
        this.is_manual = is_manual;
        this.is_form = is_form;
        this.sample_types = sample_types;
        this.is_deviation = is_deviation;
        this.fr_translation = fr_translation;
        this.category = category;
        this.is_active = is_active;
        this.to_be_display = to_be_display;
    }

    public String getNc_code() {
        return nc_code;
    }

    public void setNc_code(String nc_code) {
        this.nc_code = nc_code;
    }

    public String getNc_display() {
        return nc_display;
    }

    public void setNc_display(String nc_display) {
        this.nc_display = nc_display;
    }

    public String getNc_lims_display() {
        return nc_lims_display;
    }

    public void setNc_lims_display(String nc_lims_display) {
        this.nc_lims_display = nc_lims_display;
    }

    public int getIs_manual() {
        return is_manual;
    }

    public void setIs_manual(int is_manual) {
        this.is_manual = is_manual;
    }

    public int getIs_form() {
        return is_form;
    }

    public void setIs_form(int is_form) {
        this.is_form = is_form;
    }

    public String getSample_types() {
        return sample_types;
    }

    public void setSample_types(String sample_types) {
        this.sample_types = sample_types;
    }

    public int getIs_deviation() {
        return is_deviation;
    }

    public void setIs_deviation(int is_deviation) {
        this.is_deviation = is_deviation;
    }

    public String getFr_translation() {
        return fr_translation;
    }

    public void setFr_translation(String fr_translation) {
        this.fr_translation = fr_translation;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getIs_active() {
        return is_active;
    }

    public void setIs_active(int is_active) {
        this.is_active = is_active;
    }

    public int getTo_be_display() {
        return to_be_display;
    }

    public void setTo_be_display(int to_be_display) {
        this.to_be_display = to_be_display;
    }

    @Override
    public String toString() {
        return "NcInfo{" +
                "nc_code='" + nc_code + '\'' +
                ", nc_display='" + nc_display + '\'' +
                ", nc_lims_display='" + nc_lims_display + '\'' +
                ", is_manual=" + is_manual +
                ", is_form=" + is_form +
                ", sample_types='" + sample_types + '\'' +
                ", is_deviation=" + is_deviation +
                ", fr_translation='" + fr_translation + '\'' +
                ", category='" + category + '\'' +
                ", is_active=" + is_active +
                ", to_be_display=" + to_be_display +
                '}';
    }
}
