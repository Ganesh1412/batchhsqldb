package com.sampledb.domain;

import lombok.AllArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;

@lombok.Data
@AllArgsConstructor
@Entity
public class Data {

    @Id
    private String id;
    private String state;
    private String type;
    private String host;
    private Timestamp timestamp;

    public Data() {}
}