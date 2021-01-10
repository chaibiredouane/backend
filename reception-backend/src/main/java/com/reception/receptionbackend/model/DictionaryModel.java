package com.reception.receptionbackend.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DictionaryModel {
    @Id
    private String value;
    private String label;

    public DictionaryModel() {}

    public DictionaryModel(String value, String label) {
        this.value = value;
        this.label = label;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return "dictionary{" +
                "value='" + value + '\'' +
                ", label='" + label + '\'' +
                '}';
    }
}
