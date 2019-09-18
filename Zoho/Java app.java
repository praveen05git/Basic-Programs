import java.util.*;


class Details
{
    public int id;
    public String name;
    
    public int getId()
    {
        return id;
    }
    
    public String getName() 
    {
        return name;
    }

    public void setId(int newId)
    {
        this.id=newId;
    }

    public void setName(String newName) 
    {
        this.name = newName;
    }
  
    Details(int inId,String inName)
    {
        this.id=inId;
        this.name=inName;
    }
    Details()
    {
      
    }
 
}

//--------------------------------------------------------------------------

class Processor
{
    ArrayList<Details> det=new ArrayList();
    
    public Boolean addDetails(Details details)
    {
        det.add(details);
        
        return true;
    }
    
    public Details viewAll()
    {
        Details allDetails=new Details();
        
        for(Details detail : det)
        {
            allDetails=detail;
        }
        
        return allDetails;
    }
    
}

//--------------------------------------------------------------------------

public class HelloWorld{
    
    static Processor processor=new Processor();

     public static void main(String []args)
     {
        Scanner sc=new Scanner(System.in);
        
        int inid=sc.nextInt();
        String inname=sc.next();
        
        Details values = new Details(inid,inname);
        
        processor.addDetails(values);
        
        ArrayList<Details> emptyList=new ArrayList();
        
        emptyList=processor.viewAll();
        
        
        
    
     }
     
}
