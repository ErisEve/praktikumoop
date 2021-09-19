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
    private Long idReportedThing;
    private Long idCandidate;

    public NotificationReport(String type, Long idReportedThing, Long idCandidate) {
        this.type=type;
        this.idReportedThing = idReportedThing;
        this.idCandidate = idCandidate;
    }

    public NotificationReport() {

    }

    public Long getId() {
        return id;
    }
    public Long getIdCandidate() {
        return idCandidate;
    }
    public Long getIdReportedThing() {
        return idReportedThing;
    }
    public String getType()
    {
        return type;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public void setIdCandidate(Long id) {
        this.idCandidate = id;
    }
    public void setIdReportedThing(Long id) {
        this.idReportedThing = id;
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
