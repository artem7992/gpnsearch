package com.mayhem.gpnsearch.model;

import java.math.BigDecimal;
import java.util.Date;

public class Company {

    private final String name;
    private final String director;
    private final String address;
    private final String inn;
    private final String ogrn;
    private final Date registrationDate;
    private final BigDecimal capital;
    private final Okved mainOkved;

    public Company(String name, String director, String address, String inn, String ogrn, Date registrationDate, BigDecimal capital, Okved mainOkved) {
        this.name = name;
        this.director = director;
        this.address = address;
        this.inn = inn;
        this.ogrn = ogrn;
        this.registrationDate = registrationDate;
        this.capital = capital;
        this.mainOkved = mainOkved;
    }

    public String getName() {
        return name;
    }

    public String getDirector() {
        return director;
    }

    public String getAddress() {
        return address;
    }

    public String getInn() {
        return inn;
    }

    public String getOgrn() {
        return ogrn;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public BigDecimal getCapital() {
        return capital;
    }

    public Okved getMainOkved() {
        return mainOkved;
    }

    @Override
    public String toString() {
        return "Company { " +
                "name = " + name + "; " +
                "director = " + director + " ; "+
                "address = " + address + "; " +
                "inn = " + inn + "; " +
                "ogrn = " + ogrn + "; " +
                "registrationDate = " + registrationDate + "; " +
                "capital = " + capital + "; " +
                "mainOkved = " + mainOkved +
                " }";
    }
}
