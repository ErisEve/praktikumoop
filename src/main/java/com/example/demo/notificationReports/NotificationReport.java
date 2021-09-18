package com.example.demo.notificationReports;
// import com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer;

import javax.persistence.*;
// import java.time.LocalDate;

@Entity
@Table
public class NotificationReport{
    @Id
    @SequenceGenerator(
            name = "notificationReport_sequence",
            sequenceName = "notificationReport_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "notificationReport_sequence"
    )
    private Long id;
    private String type;

    public NotificationReport(String type) {
        this.type=type;
    }

    public NotificationReport() {

    }

    public Long getId() {
        return id;
    }
    public String getType()
    {
        return type;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", type='" + type + '\'' +
                '}';
    }
}
