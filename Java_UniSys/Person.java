package javaUniSys;



abstract class Person { //Das ist ein Superklasse weil man diesem Attributen im Student als auch im Dozent-Klasse nutzen kann.
    
    
    public String vorname="";
    public String nachname="";
    private String geschlecht="";
    private String geburtsjahr="";//Monate und Tage sind für mich unnötig.
    private String email="";
    private String land=""; //Staatsangehörigkeit (Turkei, Deutschland usw.)
    private String fakultaet="";
    private String fach="";
    
    
    
    //Konstruiere ein Person
    
    public Person(String vorname, String nachname, String geschlecht, String geburtsjahr,String email,String land,String fakultaet,String fach)
    {
        
        this.vorname=vorname;
        this.nachname=nachname;
        this.email=email;
        this.fach=fach;
        this.fakultaet=fakultaet;
        this.geburtsjahr=geburtsjahr;
        this.geschlecht=geschlecht;
        this.land=land;
        
    }

  
    //abstract Methode für toString() Method, nutze (override) ich es im Student,Dozent und LVA Klassen
     public abstract String toString();

     
     //getters
    public String getVorname() {
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public String getGeschlecht() {
        return geschlecht;
    }

    public String getGeburtsjahr() {
        return geburtsjahr;
    }

    public String getEmail() {
        return email;
    }

    public String getLand() {
        return land;
    }

    public String getFakultaet() {
        return fakultaet;
    }

    public String getFach() {
        return fach;
    }
    
    //setters
    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public void setGeschlecht(String geschlecht) {
        this.geschlecht = geschlecht;
    }

    public void setGeburtsjahr(String geburtsjahr) {
        this.geburtsjahr = geburtsjahr;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setLand(String land) {
        this.land = land;
    }

    public void setFakultaet(String fakultaet) {
        this.fakultaet = fakultaet;
    }

    public void setFach(String fach) {
        this.fach = fach;
    }
    
     
     
     
}

