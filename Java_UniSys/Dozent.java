package javaUniSys;



public class Dozent extends Person { //Ich kann Person-Klasse Atrributen für Dozenten nutzen. Nutzte ich Vererbung (Inheritance)
    
    
    private long personalnummer=0;
    
    
    
    public Dozent(long personalnummer,String vorname, String nachname, String geschlecht, String geburtsjahr,String email,String land,String fakultaet,String fach)
    {
        super(vorname,nachname,geschlecht,geburtsjahr,email,land,fakultaet,fach);
        this.personalnummer=personalnummer;
    }
    
    
    
    //toString Methode überschreibung in der Form "personalnummer, Name NACHNAME" 
    
    
    @Override
    public String toString() {
        return  "\"" + personalnummer +", " + vorname +" "+ nachname.toUpperCase() +"\"";
    }
    
    
    public static boolean pnvalidantion(long personalnummer)
    {
        if ((personalnummer<10000000000L || personalnummer>99999999999L))//personalnummer muss 11 Ziffer sein. 10000000000 und 99999999999 können nicht als 32-Bit-integer (Typ int) dargestellt werden. Es kann als 64-Bit-integer (Typ long) dargestellt werden. Long-Literale in Java enden mit einem "L"
        {
           return false; //Invalid personalnummer
        }
        else
        {
            return true; //personalnummer ist valid.
        }
    }
    

    public long getPersonalnummer() {
        return personalnummer;
    }

    
    public void setPersonalnummer(long personalnummer) {
        this.personalnummer = personalnummer;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }
    
    
    
    
    
}
