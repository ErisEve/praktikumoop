package com.example.demo.likes;
// import com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer;

import javax.persistence.*;

@Entity
@Table
public class Liked{
    @Id
    @SequenceGenerator(
            name = "like_sequence",
            sequenceName = "like_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "like_sequence"
    )
    private Long id;
    // @GeneratedValue(strategy=GenerationType.AUTO) private Long id;
    private Long idAd;
    private Long idCandidate;


    public Liked(Long idAd, Long idCandidate) {
        this.idAd=idAd;
        this.idCandidate=idCandidate;
    }

    public Liked() {

    }

    public Long getId() {
        return id;
    }
    public Long getIdAd(){
        return idAd;
    }
    public Long getIdCandidate(){
        return idCandidate;
    }

    public void setId(Long id){this.id=id; }
    public void setIdAd(Long idAd){
        this.idAd=idAd;
    }
    public void setIdCandidate(Long idCandidate){
        this.idCandidate=idCandidate;
    }

    @Override
    public String toString() {
        return "Like{" +
                "id=" + id +
                ", idAd='" + idAd + '\'' +
                ", idCandidate='" + idCandidate + '\''+
                '}';
    }
}
