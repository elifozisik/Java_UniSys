package javaUniSys;


import java.util.ArrayList;//um Arrayliste zu nutzen


public class Universitaet {
    
    private String UniversitaetName="";
    private String Stadt="";
    
    
     //Konstruiert ein Universitaet-Objekt mit den angegebenen Werten 
    public Universitaet(String UniversitaetName,String Stadt)
    {
        this.Stadt=Stadt;
        this.UniversitaetName=UniversitaetName;
       
    }
    
    
    ArrayList<Student> stlist = new ArrayList<>(); 
    ArrayList<Dozent>  dzlist = new ArrayList<>(); 
    ArrayList<LVA>    lvalist = new ArrayList<>(); 
   
    
    //Um eine Student mit beliebige Matrikelnummer zu finden, returns Student als Object oder null(existiert nicht). Methode wurde erstellt, weil sie häufig verwendet wird
     public Student getstudent(long matrikelnummer)
    {
         for(int i=0;i<stlist.size();i++)
         {
             if(matrikelnummer==stlist.get(i).getMatrikelnummer())
             {
                 return stlist.get(i);
             }
             
         }
                return null;
    }
     
     //Um eine LVA mit beliebige code zu finden, returns LVA als Object oder null(existiert nicht).
      public LVA getlva(String lvacode)
    {
         for(int i=0;i<lvalist.size();i++)
         {
             if(lvacode.equals(lvalist.get(i).getCode()))
             {
                 return lvalist.get(i);
             }
             
         }
                return null;
    }  
      
      //Um eine Dozent mit beliebige TC-Nummer zu finden, returns Dozent als Object oder null(existiert nicht).
      public Dozent getdozent(long personalnummer)
    {
         for(int i=0;i<dzlist.size();i++)
         {
             if(personalnummer==dzlist.get(i).getPersonalnummer())
             {
                 return dzlist.get(i);
             }
             
         }
                return null;
    }
    
      
    
    //Student Informationen-----------------------------------------------------------------------------------------------------------------
    
    //case 1-----------------------------------------------------------------Student hinzufügen Method
    
    public void student_add(long matrikelnummer, String vorname, String nachname, String geschlecht, String geburtsjahr,String email,String land,String fakultaet,String fach,String semester)
    {
        
         stlist.add(new Student(matrikelnummer,vorname,nachname,geschlecht,geburtsjahr,email,land,fakultaet,fach,semester));       
        
    }
    
    

    //case 2-----------------------------------------------------------------Studenten auflisten Method
    
    public String student_listall()
    {
        
          System.out.println(stlist.toString());//ich rufe toString method, und zeige im Bildschrimm
        return stlist.toString();
    }
    
    
    //case 3------------------------------------------------------------------Student Suchen Method
          
    public void student_suchen(long matrikelnummer)
    {
        
       Student student= getstudent(matrikelnummer);
       
       if(student==null)
       {
           System.out.println("Student existiert nicht.\n");
       }
       else
       {
           System.out.println(student.toString());
       }
        
    }
    
    
    //case 5------------------------------------------------------------------Student löschen Method
            
    public void student_loeschen(long matrikelnummer)
    {
        
        Student student=getstudent(matrikelnummer);
               
        if(student==null)
        {
            System.out.println("Student existiert nicht.\n");
        }
        else
        {
            stlist.remove(student);//nutze ich remove()-Method um den Student zu löschen
            System.out.println("Student wurde gelöscht.\n");
        }
        
    }
    
    //case 6------------------------------------------------------------------Student anmelden Method  
    
     
    public void student_anmelden(long matrikelnummer,String code)
    {
        Student student=getstudent(matrikelnummer);
        LVA lva=getlva(code);
        lva.getLva_studenten().add(student);
        //System.out.println("Student " +student.toString() +" wurde zur "+lva.toString()+" angemeldet.");//Nur fuer Console
    }
    
    
    
    
    //case 7------------------------------------------------------------------Student abmelden Method 
    
    public void student_abmelden(long matrikelnummer,String code)
    {
        Student student=getstudent(matrikelnummer);
        LVA lva=getlva(code);
        lva.getLva_studenten().remove(student);
        //System.out.println("Student " +student.toString() +" wurde von "+lva.toString()+" abgemeldet.");//Nur fuer Console
    }
    
    
    
    //case 8------------------------------------------------------------------Student listen Method 
    
    public void student_lva_list(long matrikelnummer)
    {
        Student student=getstudent(matrikelnummer);
        
        for(int i=0;i<lvalist.size();i++)
        {
           if(lvalist.get(i).getLva_studenten().contains(student)==true)
           {
               System.out.println("dersler:"+lvalist.get(i).toString());
           }
        }
    }
    
    
    
    //Dozent Informationen-----------------------------------------------------------------------------------------------------------------------------------
    
    
    //case 9-----------------------------------------------------------------Dozent hinzufügen Method
    
    public void dozent_add(long personalnummer, String vorname, String nachname, String geschlecht, String geburtsjahr,String email,String land,String fakultaet,String fach)
    {
        
         dzlist.add(new Dozent(personalnummer,vorname,nachname,geschlecht,geburtsjahr,email,land,fakultaet,fach));//neu Studentobject       
        
    }
    
    

    //case 10-----------------------------------------------------------------Dozenten auflisten Method
   
    public void dozent_listall()
    {
        
           System.out.println(dzlist.toString());//ich rufe toString method, um alle Dozenten im Bildschrimm zu zeigen
        
    }
    
    

    //case 11------------------------------------------------------------------Dozent suchen Method
 
     public void dozent_suchen(long personalnummer)
    {
        
       Dozent dozent= getdozent(personalnummer);
       
       if(dozent==null)
       {
           System.out.println("Dozent existiert nicht.\n");
       }
       else
       {
           System.out.println(dozent.toString());
       }
        
    }
    
    
    
    //case 13------------------------------------------------------------------Dozent löschen  Method
    public void dozent_loeschen(long personalnummer)
    {
         
       Dozent dozent = getdozent(personalnummer);
       
       if(dozent==null)
       {
           //System.out.println("Dozent existiert nicht.\n"); //nur fuer Console
       }
       else
       {
           dzlist.remove(dozent);//nutze ich remove()-Method um den Student zu löschen
           //System.out.println("Dozent wurde gelöscht.\n"); //nur fuer Console
       }
        
    }
    //case 14----------------------------------------------------------------------------------Dozent zur LVA zuweisen 
    
       
    public void dozent_zuweisen(long personalnummer,String code)
    {
        Dozent dozent = getdozent(personalnummer);
        LVA lva=getlva(code);
        
        lva.getLva_dozenten().add(dozent);
        
        System.out.println("Dozent " +dozent.toString() +" wurde zur "+lva.toString()+" zugeweist.");//nur fuer Console
    }
    
    //case 15----------------------------------------------------------------------------------Dozent von LVA abmelden
    
    public void dozent_abmelden(long personalnummer,String code)
    {
        Dozent dozent = getdozent(personalnummer);
        LVA lva=getlva(code);
        
        lva.getLva_dozenten().remove(dozent);
        
        //System.out.println("Student " +dozent.toString() +" wurde von "+lva.toString()+" abgemeldet.");//Nur fuer Console
    }
    
    
    //case 16----------------------------------------------------------------------------------Alle LVAs des Dozenten anzeigen
   
    
    public void dozent_lva_list(long personalnummer)
    {
        Dozent dozent = getdozent(personalnummer);
        
        for(int i=0;i<lvalist.size();i++)
        {
           if(lvalist.get(i).getLva_dozenten().contains(dozent)==true) //ein Dozent kann nur einmal zur ein lva zugeweisen
           {
               System.out.println("Von Dozent gegebene Klasuren:"+lvalist.get(i).toString());//Nur fuer Console
           }
        }
    }

    
    
    
    //LVA Informationen-----------------------------------------------------------------------------------------------------------------------------------
  
   //case 17-----------------------------------------------------------------LVA hinzufügen Method
    
    public void lva_add(String code,String modulname)
    {
        
         lvalist.add(new LVA(code,modulname));       
        
    }
    

    //case 18-----------------------------------------------------------------LVA auflisten Method

    public void lva_listall()
    {
        
           System.out.println(lvalist.toString());//ich rufe toString method, und zeige im Bildschrimm alle LVA
        
    }
    
    

    //case 19------------------------------------------------------------------LVA Suchen Method
            
    public void lva_suchen(String code)
    {
         
       LVA lva=getlva(code);
       
       if(lva==null)
       {
           System.out.println("LVA existiert nicht.\n");
       }
       else
       {
           System.out.println(lva.toString());
       }
        
    }
    
     //case 21------------------------------------------------------------------LVA löschen Method
    public void lva_loeschen(String code)
    {
       
       LVA lva=getlva(code);
       
       
       if(lva==null)
       {
           System.out.println("LVA existiert nicht.\n"); //Nur fuer console.
       }
       else
       {
           lvalist.remove(lva);//nutze ich remove()-Method um einen LVA zu löschen
           System.out.println("LVA wurde gelöscht.\n");
       }
    }
    
    
    

    //case 22---------------------------------------------------------------------------- Alle angemeldeten Studenten der LVA auflisten
  
    public void lva_studenten_list(String code)
    {
        LVA lva=getlva(code);
        
        System.out.println(lva.getLva_studenten().toString());
    }
        

    //23---------------------------------------------------------------------------------------------- Alle verantwortlichen Dozenten der LVA aufliste

    public void lva_dozenten_list(String code)
    {
        LVA lva=getlva(code);
        
        System.out.println(lva.getLva_dozenten().toString());
    }
    
}
