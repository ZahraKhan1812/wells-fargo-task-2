package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import javax.sound.sampled.Port;
import java.util.List;

@Entity
public class Portfolio {
    @Id
    @GeneratedValue
    private long portfolioId;

    @Column(nullable = false)
    private String creationDate;

    @OneToMany
    private List<Security> security;

    @ManyToOne
    private Client client;

    protected Portfolio(){

    }
    public Portfolio(String creationDate){
        this.creationDate = creationDate;
    }
    public long getPortfolioId(){
        return portfolioId;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

}

