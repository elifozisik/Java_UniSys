
package javaUniSys;



public class Student extends Person { //Ich kann Person-Klasse Atrributen für Studenten nutzen. Nutzte ich Vererbung (Inheritance)
    
    private long matrikelnummer=0;
    private String semester="";

    
    
    
    // Konstruiert ein Student-Objekt mit den angegebenen Werten 
    

    
    public Student(long matrikelnummer, String vorname, String nachname, String geschlecht, String geburtsjahr, String email, String land, String fakultaet, String fach,String semester) {
        super(vorname, nachname, geschlecht, geburtsjahr, email, land, fakultaet, fach);
        this.matrikelnummer=matrikelnummer;
        this.semester=semester;
    }
    
   
    
    
    /*Matrikelnummern dürfen nur aus Ziffern bestehen.
    Die Länge einer Matrikelnummern muss 7 sein.
    Die erste Ziffer einer Matrikelnummer darf nicht 0 sein.*/
     
    
    public static boolean mnvalidation (long matrikelnummer) //Es könnte auch boolean sein
    {
        long firstdigit=matrikelnummer%999999; //Falls das erste Digit 0 ist, wird Mod der Matrikelnummer 0 sein, wenn es sieben Ziffer hat.
        
        if (firstdigit==0 || (matrikelnummer<1000000 || matrikelnummer>9999999))//Alle 3 Regeln müssen entsprecht werden. 
        {
           return false; //Falsch
        }
        else
        {
            return true; //Matrikelnummer ist valid.
        }
       
    }
    
    
    //toString Methode überschreibung in der Form "Matrikelnummer, Name NACHNAME" 
    
    @Override
    public String toString() {
        return  "\"" + matrikelnummer +", " + vorname +" "+ nachname.toUpperCase() +"\"";
    }

    
    
    
    
    //zwei Student Objekte sollen als gleich erkannt werden falls die Matrikelnummern der beiden Objekte gleich sind
    //die equals Methode Überschreibung
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + (int) (this.matrikelnummer ^ (this.matrikelnummer >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Student other = (Student) obj;
        if (this.matrikelnummer != other.matrikelnummer) {
            return false;
        }else
        {
        return true;
        }
    }
    
    
    //ich benutze diesem getter im zahlreiche Methoden im Universitaet Class

    public long getMatrikelnummer() {
        return matrikelnummer;
    }

    public String getSemester() {
        return semester;
    }

    public String getVorname() {
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }
    

    public void setMatrikelnummer(long matrikelnummer) {
        this.matrikelnummer = matrikelnummer;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    
   
    
    
}
