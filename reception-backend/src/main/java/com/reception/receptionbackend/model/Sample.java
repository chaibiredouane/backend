package com.reception.receptionbackend.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CONREP_SAMPLE")
public class Sample {
    @Id
    private int id;
    private String sample_id;
    private String order_no;
    private String order_entry_datetime;
    private String sample_barcode;
    private String constances_id;
    private String ces_id;
    private String collector_id;
    private String collector_name;
    private String consent;
    private String fasting;
    private String menstruating;
    private String container_type;
    private String collection_type;
    private String tube_expirydate;
    private String tube_expired;
    private String tube_status;
    private String collect_datetime;
    private String centri_datetime;
    private String centri_speed;
    private String centri_brake;
    private String centri_temperature;
    private String centri_duration;
    private String centri_runno;
    private String freezing_datetime;
    private String abort_reason;
    private String order_state;
    private String scan_datetime;
    private String scan_by;
    private String box_id;
    private String sample_id_lims;
    private String to_update_lims;
    private String import_process_id;
    private String form_id;
    private String consent_id;
    private String consent_date_check;
    private String consent_status;

    public Sample() {}

    public Sample(String sample_id, String order_no, String order_entry_datetime, String sample_barcode, String constances_id, String ces_id, String collector_id, String collector_name, String consent, String fasting, String menstruating, String container_type, String collection_type, String tube_expirydate, String tube_expired, String tube_status, String collect_datetime, String centri_datetime, String centri_speed, String centri_brake, String centri_temperature, String centri_duration, String centri_runno, String freezing_datetime, String abort_reason, String order_state, String scan_datetime, String scan_by, String box_id, String sample_id_lims, String to_update_lims, String import_process_id, String form_id, String consent_id, String consent_date_check, String consent_status) {
        this.sample_id = sample_id;
        this.order_no = order_no;
        this.order_entry_datetime = order_entry_datetime;
        this.sample_barcode = sample_barcode;
        this.constances_id = constances_id;
        this.ces_id = ces_id;
        this.collector_id = collector_id;
        this.collector_name = collector_name;
        this.consent = consent;
        this.fasting = fasting;
        this.menstruating = menstruating;
        this.container_type = container_type;
        this.collection_type = collection_type;
        this.tube_expirydate = tube_expirydate;
        this.tube_expired = tube_expired;
        this.tube_status = tube_status;
        this.collect_datetime = collect_datetime;
        this.centri_datetime = centri_datetime;
        this.centri_speed = centri_speed;
        this.centri_brake = centri_brake;
        this.centri_temperature = centri_temperature;
        this.centri_duration = centri_duration;
        this.centri_runno = centri_runno;
        this.freezing_datetime = freezing_datetime;
        this.abort_reason = abort_reason;
        this.order_state = order_state;
        this.scan_datetime = scan_datetime;
        this.scan_by = scan_by;
        this.box_id = box_id;
        this.sample_id_lims = sample_id_lims;
        this.to_update_lims = to_update_lims;
        this.import_process_id = import_process_id;
        this.form_id = form_id;
        this.consent_id = consent_id;
        this.consent_date_check = consent_date_check;
        this.consent_status = consent_status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSample_id() {
        return sample_id;
    }

    public void setSample_id(String sample_id) {
        this.sample_id = sample_id;
    }

    public String getOrder_no() {
        return order_no;
    }

    public void setOrder_no(String order_no) {
        this.order_no = order_no;
    }

    public String getOrder_entry_datetime() {
        return order_entry_datetime;
    }

    public void setOrder_entry_datetime(String order_entry_datetime) {
        this.order_entry_datetime = order_entry_datetime;
    }

    public String getSample_barcode() {
        return sample_barcode;
    }

    public void setSample_barcode(String sample_barcode) {
        this.sample_barcode = sample_barcode;
    }

    public String getConstances_id() {
        return constances_id;
    }

    public void setConstances_id(String constances_id) {
        this.constances_id = constances_id;
    }

    public String getCes_id() {
        return ces_id;
    }

    public void setCes_id(String ces_id) {
        this.ces_id = ces_id;
    }

    public String getCollector_id() {
        return collector_id;
    }

    public void setCollector_id(String collector_id) {
        this.collector_id = collector_id;
    }

    public String getCollector_name() {
        return collector_name;
    }

    public void setCollector_name(String collector_name) {
        this.collector_name = collector_name;
    }

    public String getConsent() {
        return consent;
    }

    public void setConsent(String consent) {
        this.consent = consent;
    }

    public String getFasting() {
        return fasting;
    }

    public void setFasting(String fasting) {
        this.fasting = fasting;
    }

    public String getMenstruating() {
        return menstruating;
    }

    public void setMenstruating(String menstruating) {
        this.menstruating = menstruating;
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

    public String getTube_expirydate() {
        return tube_expirydate;
    }

    public void setTube_expirydate(String tube_expirydate) {
        this.tube_expirydate = tube_expirydate;
    }

    public String getTube_expired() {
        return tube_expired;
    }

    public void setTube_expired(String tube_expired) {
        this.tube_expired = tube_expired;
    }

    public String getTube_status() {
        return tube_status;
    }

    public void setTube_status(String tube_status) {
        this.tube_status = tube_status;
    }

    public String getCollect_datetime() {
        return collect_datetime;
    }

    public void setCollect_datetime(String collect_datetime) {
        this.collect_datetime = collect_datetime;
    }

    public String getCentri_datetime() {
        return centri_datetime;
    }

    public void setCentri_datetime(String centri_datetime) {
        this.centri_datetime = centri_datetime;
    }

    public String getCentri_speed() {
        return centri_speed;
    }

    public void setCentri_speed(String centri_speed) {
        this.centri_speed = centri_speed;
    }

    public String getCentri_brake() {
        return centri_brake;
    }

    public void setCentri_brake(String centri_brake) {
        this.centri_brake = centri_brake;
    }

    public String getCentri_temperature() {
        return centri_temperature;
    }

    public void setCentri_temperature(String centri_temperature) {
        this.centri_temperature = centri_temperature;
    }

    public String getCentri_duration() {
        return centri_duration;
    }

    public void setCentri_duration(String centri_duration) {
        this.centri_duration = centri_duration;
    }

    public String getCentri_runno() {
        return centri_runno;
    }

    public void setCentri_runno(String centri_runno) {
        this.centri_runno = centri_runno;
    }

    public String getFreezing_datetime() {
        return freezing_datetime;
    }

    public void setFreezing_datetime(String freezing_datetime) {
        this.freezing_datetime = freezing_datetime;
    }

    public String getAbort_reason() {
        return abort_reason;
    }

    public void setAbort_reason(String abort_reason) {
        this.abort_reason = abort_reason;
    }

    public String getOrder_state() {
        return order_state;
    }

    public void setOrder_state(String order_state) {
        this.order_state = order_state;
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

    public String getBox_id() {
        return box_id;
    }

    public void setBox_id(String box_id) {
        this.box_id = box_id;
    }

    public String getSample_id_lims() {
        return sample_id_lims;
    }

    public void setSample_id_lims(String sample_id_lims) {
        this.sample_id_lims = sample_id_lims;
    }

    public String getTo_update_lims() {
        return to_update_lims;
    }

    public void setTo_update_lims(String to_update_lims) {
        this.to_update_lims = to_update_lims;
    }

    public String getImport_process_id() {
        return import_process_id;
    }

    public void setImport_process_id(String import_process_id) {
        this.import_process_id = import_process_id;
    }

    public String getForm_id() {
        return form_id;
    }

    public void setForm_id(String form_id) {
        this.form_id = form_id;
    }

    public String getConsent_id() {
        return consent_id;
    }

    public void setConsent_id(String consent_id) {
        this.consent_id = consent_id;
    }

    public String getConsent_date_check() {
        return consent_date_check;
    }

    public void setConsent_date_check(String consent_date_check) {
        this.consent_date_check = consent_date_check;
    }

    public String getConsent_status() {
        return consent_status;
    }

    public void setConsent_status(String consent_status) {
        this.consent_status = consent_status;
    }

    @Override
    public String toString() {
        return "Sample{" +
                "id=" + id +
                ", sample_id='" + sample_id + '\'' +
                ", order_no='" + order_no + '\'' +
                ", order_entry_datetime='" + order_entry_datetime + '\'' +
                ", sample_barcode='" + sample_barcode + '\'' +
                ", constances_id='" + constances_id + '\'' +
                ", ces_id='" + ces_id + '\'' +
                ", collector_id='" + collector_id + '\'' +
                ", collector_name='" + collector_name + '\'' +
                ", consent='" + consent + '\'' +
                ", fasting='" + fasting + '\'' +
                ", menstruating='" + menstruating + '\'' +
                ", container_type='" + container_type + '\'' +
                ", collection_type='" + collection_type + '\'' +
                ", tube_expirydate='" + tube_expirydate + '\'' +
                ", tube_expired='" + tube_expired + '\'' +
                ", tube_status='" + tube_status + '\'' +
                ", collect_datetime='" + collect_datetime + '\'' +
                ", centri_datetime='" + centri_datetime + '\'' +
                ", centri_speed='" + centri_speed + '\'' +
                ", centri_brake='" + centri_brake + '\'' +
                ", centri_temperature='" + centri_temperature + '\'' +
                ", centri_duration='" + centri_duration + '\'' +
                ", centri_runno='" + centri_runno + '\'' +
                ", freezing_datetime='" + freezing_datetime + '\'' +
                ", abort_reason='" + abort_reason + '\'' +
                ", order_state='" + order_state + '\'' +
                ", scan_datetime='" + scan_datetime + '\'' +
                ", scan_by='" + scan_by + '\'' +
                ", box_id='" + box_id + '\'' +
                ", sample_id_lims='" + sample_id_lims + '\'' +
                ", to_update_lims='" + to_update_lims + '\'' +
                ", import_process_id='" + import_process_id + '\'' +
                ", form_id='" + form_id + '\'' +
                ", consent_id='" + consent_id + '\'' +
                ", consent_date_check='" + consent_date_check + '\'' +
                ", consent_status='" + consent_status + '\'' +
                '}';
    }
}
