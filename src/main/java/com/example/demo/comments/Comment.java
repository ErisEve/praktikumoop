package com.example.demo.comments;
// import com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table
public class Comment{
    @Id
    @SequenceGenerator(
            name = "comment_sequence",
            sequenceName = "comment_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "comment_sequence"
    )
    private Long id;
    private String comm;
    private Long idEmployer;
    private Long idCandidate;
    private Long idResponse;
    private Long idAd;
    private LocalDate date;

    public Comment(String comm, Long idEmployer, Long idCandidate, Long idResponse, Long idAd ) {
        this.comm=comm;
        this.idEmployer=idEmployer;
        this.idCandidate=idCandidate;
        this.idResponse=idResponse;
        this.idAd = idAd;
    }

    public Comment(Long idEmployer, Long idCandidate, Long idAd){
        this.idCandidate=idCandidate;
        this.idEmployer = idEmployer;
        this.idAd = idAd;
    }

    public Comment() {

    }

    public Long getId() {
        return id;
    }
    public Long getIdAd() {
        return idAd;
    }
    public String getComm()
    {
        return comm;
    }
    public Long getIdEmployer(){
        return idEmployer;
    }
    public Long getIdCandidate(){
        return idCandidate;
    }
    public Long getIdResponse() {
        return idResponse;
    }
    public LocalDate getDate(){return date; }

    public void setId(Long id) {
        this.id = id;
    }
    public void setIdAd(Long id) {
        this.idAd = id;
    }
    public void setComm(String comm) {
        this.comm = comm;
    }
    public void setIdEmployer(Long idEmployer){
        this.idEmployer=idEmployer;
    }
    public void setIdCandidate(Long idCandidate){
        this.idCandidate=idCandidate;
    }
    public void setIdResponse(Long idResponse){this.idResponse=idResponse; }
    public void setDate(LocalDate date){this.date=date; }
    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", comm='" + comm + '\'' +
                ", idEmployer='" + idEmployer + '\'' +
                ", idCandidate='" + idCandidate + '\''+
                ", idResponse='" + idResponse + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
