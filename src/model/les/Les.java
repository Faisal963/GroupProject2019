package model.les;

import model.persoon.Docent;

import java.util.Date;

public class Les {
    private String naam, cursuscode, startdag, einddag, werkvorm;
    private int startweek, duur;
    private Date startdatum, starttijd, einddatum, eindtijd;
    private Docent docent;

    public Les(String naam,
               String cursuscode,
               int startweek,
               String startdag,
               Date startdatum,
               Date starttijd,
               String einddag,
               Date einddatum,
               Date eindtijd,
               int duur,
               String werkvorm,
               Docent docent) {
        this.naam =naam;
        this.cursuscode = cursuscode;
        this.startweek = startweek;
        this.startdag = startdag;
        this.startdatum = startdatum;
        this.starttijd = starttijd;
        this.einddag = einddag;
        this.einddatum = einddatum;
        this.eindtijd = eindtijd;
        this.duur = duur;
        this.werkvorm = werkvorm;
        this.docent = docent;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getCursuscode() {
        return cursuscode;
    }

    public void setCursuscode(String cursuscode) {
        this.cursuscode = cursuscode;
    }

    public Date getStartweek() {
        return startweek;
    }

    public void setStartweek(String startweek) {
        this.startweek = startweek;
    }

    public String getStartdag() {
        return startdag;
    }

    public void setStartdag(String startdag) {
        this.startdag = startdag;
    }

    public String getStartdatum() {
        return startdatum;
    }

    public void setStartdatum(String startdatum) {
        this.startdatum = startdatum;
    }

    public String getStarttijd() {
        return starttijd;
    }

    public void setStarttijd(String starttijd) {
        this.starttijd = starttijd;
    }

    public String getEinddag() {
        return einddag;
    }

    public void setEinddag(String einddag) {
        this.einddag = einddag;
    }

    public String getEinddatum() {
        return einddatum;
    }

    public void setEinddatum(String einddatum) {
        this.einddatum = einddatum;
    }

    public String getEindtijd() {
        return eindtijd;
    }

    public void setEindtijd(String eindtijd) {
        this.eindtijd = eindtijd;
    }

    public String getDuur() {
        return duur;
    }

    public void setDuur(String duur) {
        this.duur = duur;
    }

    public String getWerkvorm() {
        return werkvorm;
    }

    public void setWerkvorm(String werkvorm) {
        this.werkvorm = werkvorm;
    }

    public String getDocent() {
        return docent;
    }

    public void setDocent(String docent) {
        this.docent = docent;
    }

}
