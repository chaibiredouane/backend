package com.reception.receptionbackend.model;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.tuple.GeneratedValueGeneration;

import javax.persistence.*;

@Entity
@Table(name = "EXPECTEDSAMPLE")
public class ExpectedSample {
    @Id  @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private int id;
    private int ces_id;
    private String sample_barcode;
    private String container_type;
    private String collection_type;
    private String collect_date;
    private String collect_time;
    private int time_elapsed;
    private String constances_id;
    private String late_status;
    private String label_status;
    private String scan_datetime;
    private String scan_by;

    public ExpectedSample() {  }

    public ExpectedSample(int ces_id, String sample_barcode, String container_type, String collection_type, String collect_date, String collect_time, int time_elapsed, String constances_id, String late_status, String label_status, String scan_datetime, String scan_by) {
        this.ces_id = ces_id;
        this.sample_barcode = sample_barcode;
        this.container_type = container_type;
        this.collection_type = collection_type;
        this.collect_date = collect_date;
        this.collect_time = collect_time;
        this.time_elapsed = time_elapsed;
        this.constances_id = constances_id;
        this.late_status = late_status;
        this.label_status = label_status;
        this.scan_datetime = scan_datetime;
        this.scan_by = scan_by;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCes_id() {
        return ces_id;
    }

    public void setCes_id(int ces_id) {
        this.ces_id = ces_id;
    }


    public String getSample_barcode() {
        return sample_barcode;
    }

    public void setSample_barcode(String sample_barcode) {
        this.sample_barcode = sample_barcode;
    }

    public String getContainer_type() {
        return container_type;
    }

    public void setContainer_type(String container_type) {
        this.container_type = container_type;
    }

    public String getCollection_type() {
        return collection_type;
    }

    public void setCollection_type(String collection_type) {
        this.collection_type = collection_type;
    }

    public String getCollect_date() {
        return collect_date;
    }

    public void setCollect_date(String collect_date) {
        this.collect_date = collect_date;
    }

    public String getCollect_time() {
        return collect_time;
    }

    public void setCollect_time(String collect_time) {
        this.collect_time = collect_time;
    }

    public int getTime_elapsed() {
        return time_elapsed;
    }

    public void setTime_elapsed(int time_elapsed) {
        this.time_elapsed = time_elapsed;
    }

    public String getConstances_id() {
        return constances_id;
    }

    public void setConstances_id(String constances_id) {
        this.constances_id = constances_id;
    }

    public String getLate_status() {
        return late_status;
    }

    public void setLate_status(String late_status) {
        this.late_status = late_status;
    }

    public String getLabel_status() {
        return label_status;
    }

    public void setLabel_status(String label_status) {
        this.label_status = label_status;
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

    @Override
    public String toString() {
        return "Sample{" +
                "id=" + id +
                ", ces_id=" + ces_id +
                ", sample_barcode='" + sample_barcode + '\'' +
                ", container_type='" + container_type + '\'' +
                ", collection_type='" + collection_type + '\'' +
                ", collect_date='" + collect_date + '\'' +
                ", collect_time='" + collect_time + '\'' +
                ", time_elapsed=" + time_elapsed +
                ", constances_id='" + constances_id + '\'' +
                ", late_status='" + late_status + '\'' +
                ", label_status='" + label_status + '\'' +
                ", scan_datetime='" + scan_datetime + '\'' +
                ", scan_by='" + scan_by + '\'' +
                '}';
    }
}
