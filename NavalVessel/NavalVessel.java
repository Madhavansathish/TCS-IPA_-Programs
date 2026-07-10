/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
class NavalVessel{
    private int vesselId;
    private String vesselName;
    private int noOfVoyagesPlanned;
    private int noOfVoyagesCompleted;
    private String purpose;
    private String classification;
   
    
    NavalVessel(int vesselId,String vesselName,int noOfVoyagesPlanned,int noOfVoyagesCompleted,String purpose){
        this.vesselId=vesselId;
        this.vesselName=vesselName;
        this.noOfVoyagesPlanned=noOfVoyagesPlanned;
        this.noOfVoyagesCompleted=noOfVoyagesCompleted;
        this.purpose=purpose;
    }
    
    public void setVesselId(int vesselId){
        this.vesselId=vesselId;
    }
    public int getVesselId(){
        return vesselId;
    }
    
    public void setVesselName(String vesselName){
        this.vesselName=vesselName;
    }
    public String getVesselName(){
        return vesselName;
    }
    
    public void setNoOfVoyagesPlanned(int noOfVoyagesPlanned){
        this.noOfVoyagesPlanned=noOfVoyagesPlanned;
    }
    public int getNoOfVoyagesPlanned(){
        return noOfVoyagesPlanned;
    }
    
    public void setNoOfVoyagesCompleted(int noOfVoyagesCompleted){
        this.noOfVoyagesCompleted=noOfVoyagesCompleted;
    }
    public int getNoOfVoyagesCompleted(){
        return noOfVoyagesCompleted;
    }
    
    public void setPurpose(String purpose){
        this.purpose=purpose;
    }
    public String getPurpose(){
        return purpose;
    }
    
    public void setClassification(String classification){
        this.classification=classification;
    }
    public String getClassification(){
        return classification;
    }
    
}
public class Main
{
    
    public static int findAvgVoyagesByPct(NavalVessel[] arr,int pct){
        int avg=0;
        int count=0;
        for(NavalVessel n:arr){
            int percentage=(n.getNoOfVoyagesCompleted()*100)/n.getNoOfVoyagesPlanned();
            if(percentage >=pct){
                avg+=n.getNoOfVoyagesCompleted();
                count++;
            }
        }
        if(avg==0){
            return 0;
        }
        else{
            return avg/count;
        }
       
    }
    
    
    public static NavalVessel findVesselByGrade(NavalVessel[] arr,String purpose){
        for(NavalVessel n:arr){
            if(n.getPurpose().equalsIgnoreCase(purpose)){
                int percentage=(n.getNoOfVoyagesCompleted()*100)/n.getNoOfVoyagesPlanned();
                if(percentage==100){
                    n.setClassification("Star");
                }
                else if(percentage>=80 && percentage<=99){
                    n.setClassification("Leader");
                }
                else if(percentage>=55 && percentage<=79){
                    n.setClassification("Inspirer");
                }
                else{
                    n.setClassification("Striver");
                }
                return n;
            }
        }
        return null;
        
    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    NavalVessel[] arr=new NavalVessel[4];
	    for(int i=0;i<4;i++){
	        int id=sc.nextInt();
	        sc.nextLine();
	        String name=sc.nextLine();
	        int planned=sc.nextInt();
	        int completed=sc.nextInt();
	        sc.nextLine();
	        String purpose=sc.nextLine();
	       
	      
	        
	        arr[i]=new NavalVessel(id,name,planned,completed,purpose);
	    }
	    
	   
	    int percentage=sc.nextInt();
	    sc.nextLine();
	    String purpose=sc.nextLine();
	    
	    int res=findAvgVoyagesByPct(arr,percentage);
	    System.out.println(res);
	    
	    NavalVessel result=findVesselByGrade(arr,purpose);
	    if(result!=null){
	        System.out.println(result.getVesselName()+"%"+result.getClassification());
	    }
	    else{
	        System.out.println("No Navel Vessel is available with the specified purpose");
	    }
	}
}
