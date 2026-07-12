/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

import java.util.*;

class Antenna{
    private int antennaid;
    private String antennaName;
    private String projectLead;
    private double antennaVSWR;
    
    Antenna(int antennaid,String antennaName,String projectLead,double antennaVSWR){
        this.antennaid=antennaid;
        this.antennaName=antennaName;
        this.projectLead=projectLead;
        this.antennaVSWR=antennaVSWR;
    }
    
    public void setId(int antennaid){
        this.antennaid=antennaid;
    }
    public int getId(){
        return antennaid;
    }
    
    public void setName(String antennaName){
        this.antennaName=antennaName;
    }
    public String getName(){
        return antennaName;
    }
    
    public void setLead(String projectLead){
        this.projectLead=projectLead;
    }
    public String getLead(){
        return projectLead;
    }
    
    public void setVSWR(double antennaVSWR){
        this.antennaVSWR=antennaVSWR;
    }
    public double getVSWR(){
        return antennaVSWR;
    }
    
}

public class Main
{
    public static int searchAntennaByName(Antenna[] arr,String name){
        for(Antenna a:arr){
            if(a.getName().equals(name)){
                return a.getId();
            }
        }
        return 0;
    }
    
    public static Antenna[] sortAntennaByVSWR(Antenna[] arr,double vswr){
        
        Antenna[] temp=new Antenna[arr.length];
        int idx=0;
        for(Antenna a:arr){
            if(a.getVSWR()<vswr){
                temp[idx++]=a;
            }
        }
        if(idx!=0){
            Antenna[] sorted=new Antenna[idx];
            for(int i=0;i<idx;i++){
                sorted[i]=temp[i];
            }
            
            for(int i=0;i<idx;i++){
                for(int j=i+1;j<idx;j++){
                    if(sorted[j].getVSWR()<sorted[i].getVSWR()){
                        Antenna t=sorted[i];
                        sorted[i]=sorted[j];
                        sorted[j]=t;
                    }
                }
            }
            return sorted;
        }
        else{
            return null;
        }
    }
    
    
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Antenna[] arr=new Antenna[4];
		for(int i=0;i<4;i++){
		    int id=sc.nextInt();
		    sc.nextLine();
		    String name=sc.nextLine();
		    String lead=sc.nextLine();
		    double vswr=sc.nextDouble();
		    
		    arr[i]=new Antenna(id,name,lead,vswr);
		}
		sc.nextLine();
		String name=sc.nextLine();
		double vswr=sc.nextDouble();
		
		int res=searchAntennaByName(arr,name);
		if(res!=0){
		    System.out.println(res);
		}
		else{
		    System.out.println("There is no antenna with the given parameter");
		}
		
		Antenna[] result=sortAntennaByVSWR(arr,vswr);
		if(result!=null){
		    for(Antenna a:result){
		        System.out.println(a.getLead());
		    }
		}
		else{
		    System.out.println("No Antenna found");
		}
	}
}
