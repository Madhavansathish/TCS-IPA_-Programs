/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

import java.util.*;

class Engine{
    private int engineid;
    private String engineName;
    private String enginetype;
    private double price;
    
    Engine(int engineid,String engineName,String enginetype,double price){
        this.engineid=engineid;
        this.engineName=engineName;
        this.enginetype=enginetype;
        this.price=price;
    }
    
    public void setId(int engineid){
        this.engineid=engineid;
    }
    public int getId(){
        return engineid;
    }
    
    public void setName(String engineName){
        this.engineName=engineName;
    }
    public String getName(){
        return engineName;
    }
    
    public void setPrice(double price){
        this.price=price;
    }
    public double getPrice(){
        return price;
    }
    
   
    public void setType(String enginetype){
        this.enginetype=enginetype;
    }
    public String getType(){
        return enginetype;
    }
    
}

public class Main
{
    public static double findAvgEnginePriceByType(Engine[] arr,String type){
        double avg=0;
        int count=0;
        for(Engine e:arr){
            if(e.getType().equalsIgnoreCase(type)){
                avg+=e.getPrice();
                count++;
            }
        }
        if(avg!=0){
            return avg/count;
        }
        else{
            return 0;
        }
    }
    
    public static Engine[] searchEngineByName(Engine[] arr,String name){
        Engine[] temp=new Engine[arr.length];
        int idx=0;
        for(Engine e:arr){
            if(e.getName().equalsIgnoreCase(name)){
                temp[idx++]=e;
            }
        }
        if(idx!=0){
            Engine[] sort=new Engine[idx];
            for(int i=0;i<idx;i++){
                sort[i]=temp[i];
            }
            for(int i=0;i<idx;i++){
                for(int j=i+1;j<idx;j++){
                    if(sort[j].getId()<sort[i].getId()){
                        Engine e=sort[i];
                        sort[i]=sort[j];
                        sort[j]=e;
                    }
                }
            }
            return sort;
        }
        else{
            return null;
        }
    }
    
   
   
    
    
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Engine[] arr=new Engine[5];
		for(int i=0;i<5;i++){
		    int id=sc.nextInt();
		    sc.nextLine();
		    String name=sc.nextLine();
		    String type=sc.nextLine();
		    double price=sc.nextInt();
		    
		    arr[i]=new Engine(id,name,type,price);
		}
		
		sc.nextLine();
		String type=sc.nextLine();
		String name=sc.nextLine();
		
		double avg=findAvgEnginePriceByType(arr,type);
		if(avg!=0){
		    System.out.println(avg);
		}
		else{
		    System.out.println("There are no engine with given type");
		}
		
		Engine[] result=searchEngineByName(arr,name);
		if(result!=null){
		    for(Engine e:result){
		        System.out.println(e.getId());
		    }
		}
		else{
		    System.out.println("There are no engine with given name");
		}
		
	}
}
