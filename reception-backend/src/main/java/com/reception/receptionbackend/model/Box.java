package com.reception.receptionbackend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CONREP_BOX")
public class Box {
   @Id
   private int id;
   private String ces_id;
   private String expected_delivery_date;
   private String box_barcode;
   private String scan_datetime;
   private String scan_by;
   private String status;
   private String opened_by;
   private String temp_status;
   private String nb_forms;
   private String import_process_id;

    public Box() {}

    public Box(String ces_id, String expected_delivery_date, String box_barcode, String scan_datetime, String scan_by, String status, String opened_by, String temp_status, String nb_forms, String import_process_id) {
        this.ces_id = ces_id;
        this.expected_delivery_date = expected_delivery_date;
        this.box_barcode = box_barcode;
        this.scan_datetime = scan_datetime;
        this.scan_by = scan_by;
        this.status = status;
        this.opened_by = opened_by;
        this.temp_status = temp_status;
        this.nb_forms = nb_forms;
        this.import_process_id = import_process_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCes_id() {
        return ces_id;
    }

    public void setCes_id(String ces_id) {
        this.ces_id = ces_id;
    }

    public String getExpected_delivery_date() {
        return expected_delivery_date;
    }

    public void setExpected_delivery_date(String expected_delivery_date) {
        this.expected_delivery_date = expected_delivery_date;
    }

    public String getBox_barcode() {
        return box_barcode;
    }

    public void setBox_barcode(String box_barcode) {
        this.box_barcode = box_barcode;
    }

    public String getScan_datetime() {
        return scan_datetime;
    }

    public void setScan_datetime(String scan_datetime) {
        this.scan_datetime = scan_datetime;
    }

    public String getScan_by() {
        return scan_by;
    }

    public void setScan_by(String scan_by) {
        this.scan_by = scan_by;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getOpened_by() {
        return opened_by;
    }

    public void setOpened_by(String opened_by) {
        this.opened_by = opened_by;
    }

    public String getTemp_status() {
        return temp_status;
    }

    public void setTemp_status(String temp_status) {
        this.temp_status = temp_status;
    }

    public String getNb_forms() {
        return nb_forms;
    }

    public void setNb_forms(String nb_forms) {
        this.nb_forms = nb_forms;
    }

    public String getImport_process_id() {
        return import_process_id;
    }

    public void setImport_process_id(String import_process_id) {
        this.import_process_id = import_process_id;
    }

    @Override
    public String toString() {
        return "Box{" +
                "id=" + id +
                ", ces_id='" + ces_id + '\'' +
                ", expected_delivery_date='" + expected_delivery_date + '\'' +
                ", box_barcode='" + box_barcode + '\'' +
                ", scan_datetime='" + scan_datetime + '\'' +
                ", scan_by='" + scan_by + '\'' +
                ", status='" + status + '\'' +
                ", opened_by='" + opened_by + '\'' +
                ", temp_status='" + temp_status + '\'' +
                ", nb_forms=" + nb_forms +
                ", import_process_id=" + import_process_id +
                '}';
    }
}
