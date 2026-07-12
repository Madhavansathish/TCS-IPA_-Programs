/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/

import java.util.*;

class Flower{
    private int flowerid;
    private String flowerName;
    private int price;
    private int rating;
    private String type;
    
    Flower(int flowerid,String flowerName,int price,int rating,String type){
        this.flowerid=flowerid;
        this.flowerName=flowerName;
        this.price=price;
        this.rating=rating;
        this.type=type;
    }
    
    public void setId(int flowerid){
        this.flowerid=flowerid;
    }
    public int getId(){
        return flowerid;
    }
    
    public void setName(String flowerName){
        this.flowerName=flowerName;
    }
    public String getName(){
        return flowerName;
    }
    
    public void setPrice(int price){
        this.price=price;
    }
    public int getPrice(){
        return price;
    }
    
    public void setRating(int rating){
        this.rating=rating;
    }
    public int getRating(){
        return rating;
    }
    
    public void setType(String type){
        this.type=type;
    }
    public String getType(){
        return type;
    }
    
}

public class Main
{
    public static Flower findMinPriceByType(Flower[] arr,String type){
        Flower obj=null;
        int min=Integer.MAX_VALUE;
        for(Flower f:arr){
            if(f.getType().equals(type) && f.getRating()>3){
                if(f.getPrice()<min){
                    min=f.getPrice();
                    obj=f;
                }
            }
        }
        return obj;
    }
   
    
    
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Flower[] arr=new Flower[4];
		for(int i=0;i<4;i++){
		    int id=sc.nextInt();
		    sc.nextLine();
		    String name=sc.nextLine();
		    int price=sc.nextInt();
		    int rating=sc.nextInt();
		    sc.nextLine();
		    String type=sc.nextLine();
		    
		    arr[i]=new Flower(id,name,price,rating,type);
		}
		
		String type=sc.nextLine();
		Flower res=findMinPriceByType(arr,type);
		if(res!=null){
		    System.out.println(res.getId());
		}
		else{
		    System.out.println("There is no flower with given type");
		}
	}
}
