package com.jws.medical_record.data;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Medicine {
    @Id
    private long id;
    private String name;
}
