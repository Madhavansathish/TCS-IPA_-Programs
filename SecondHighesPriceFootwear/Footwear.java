/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

import java.util.*;

class Footwear{
    private int footwearid;
    private String footwearName;
    private String footweartype;
    private int price;
    
    Footwear(int footwearid,String footwearName,String footweartype,int price){
        this.footwearid=footwearid;
        this.footwearName=footwearName;
        this.footweartype=footweartype;
        this.price=price;
    }
    
    public void setId(int footwearid){
        this.footwearid=footwearid;
    }
    public int getId(){
        return footwearid;
    }
    
    public void setName(String footwearName){
        this.footwearName=footwearName;
    }
    public String getName(){
        return footwearName;
    }
    
    public void setPrice(int price){
        this.price=price;
    }
    public int getPrice(){
        return price;
    }
    
   
    public void setType(String footweartype){
        this.footweartype=footweartype;
    }
    public String getType(){
        return footweartype;
    }
    
}

public class Main
{
    public static int getCountByType(Footwear[] arr,String type){
        int count=0;
        for(Footwear f:arr){
            if(f.getType().equalsIgnoreCase(type)){
                count++;
            }
        }
        return count;
    }
    
    public static Footwear getSecondHighestPriceByBrand(Footwear[] arr,String name){
        Footwear first=null;
        Footwear second=null;
        for(Footwear f:arr){
            if(f.getName().equalsIgnoreCase(name)){
                if(first==null || f.getPrice()>first.getPrice()){
                    second=first;
                    first=f;
                }
                else if(second==null || (f.getPrice()<first.getPrice() && f.getPrice()>second.getPrice()) ){
                    second=f;
                }
            }
        }
        return second;
    }
   
    
    
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Footwear[] arr=new Footwear[5];
		for(int i=0;i<5;i++){
		    int id=sc.nextInt();
		    sc.nextLine();
		    String name=sc.nextLine();
		    String type=sc.nextLine();
		    int price=sc.nextInt();
		    
		    arr[i]=new Footwear(id,name,type,price);
		}
		
		sc.nextLine();
		String type=sc.nextLine();
		String name=sc.nextLine();
		
		int count=getCountByType(arr,type);
		if(count!=0){
		    System.out.println(count);
		}
		else{
		    System.out.println("Footwear not available");
		}
		
		Footwear result=getSecondHighestPriceByBrand(arr,name);
		if(result!=null){
		    System.out.println(result.getId());
		    System.out.println(result.getName());
		    System.out.println(result.getPrice());
		}
		else{
		    System.out.println("Brand not available");
		}
		
	}
}
