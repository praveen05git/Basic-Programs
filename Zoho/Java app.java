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
    
    public ArrayList<Details> viewAll()
    {
        ArrayList<Details> allDetails=new ArrayList();
        
        for(Details detail : det)
        {
            allDetails.add(detail);
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
        
        int inid;
        String inname;
        
        for(int i=0;i<2;i++)
        {
            inid=sc.nextInt();
            inname=sc.next();   
            Details values = new Details(inid,inname);
            processor.addDetails(values);
        }
        
        
        ArrayList<Details> emptyList=new ArrayList();
        
        emptyList=processor.viewAll();
        
        for(Details em : emptyList)
        {
            System.out.println(em.getId());
            System.out.println(em.getName());
        }
        
     }
     
}
