package javaUniSys;


import java.util.ArrayList;


public class LVA {
    
    private String code="";
    private String modulname="";
    
    private ArrayList<Student> lva_studenten= new ArrayList();
    private ArrayList<Dozent> lva_dozenten= new ArrayList();
    
    public LVA(String code,String modulname)
    {
        
        this.code=code;
        this.modulname=modulname;
    }
        
    
    public static boolean lvavalidation (String code) 
    {
        
        int a=code.charAt(0);
        int b=code.charAt(1);
        int c=code.charAt(2);
        int d=code.charAt(3);
        int e=code.charAt(4);
        int f=code.charAt(5);
        
        
        return(a>=65&&a<=90  &&  b>=65&&b<=90  &&  c>=65&&c<=90  &&  d>=48&&d<=57  &&  e>=48&&e<=57  &&   f>=48&&f<=57  &&  code.length()==6); //Wenn alle sind Korrekt es wird 1 sein und return true, anderer falls ist es 0=false
        
        /*
        In Diesem Method habe ich kontrolliert Kürzelregel "drei Grossbuchstaben gefolgt von drei Ziffern"
        mit ASCİİ-Werte. A zur Z haben ASCİİ-Werte 65-90 und 0 zu 9 haben 48-57.
        charAt(i) nimmt der i.ste Char Wert und int nimmt der ASCİİ-Wert von der Char.
        code muss 6 Ziffer haben
        */
       
    }
    

    public String getCode() {
        return code;
    }

    public String getModulname() {
        return modulname;
    }

    public ArrayList<Student> getLva_studenten() {
        return lva_studenten;
    }

    public ArrayList<Dozent> getLva_dozenten() {
        return lva_dozenten;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setModulname(String modulname) {
        this.modulname = modulname;
    }

    public void setLva_studenten(ArrayList<Student> lva_studenten) {
        this.lva_studenten = lva_studenten;
    }

    public void setLva_dozenten(ArrayList<Dozent> lva_dozenten) {
        this.lva_dozenten = lva_dozenten;
    }

  

  
    
    
    
    
}
