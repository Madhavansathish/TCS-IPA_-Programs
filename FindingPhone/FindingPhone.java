/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
class Phone{
    private int phoneId;
    private String os;
    private String brand;
    private int price;
    
    Phone(int phoneId,String os,String brand,int price){
        this.phoneId=phoneId;
        this.os=os;
        this.brand=brand;
        this.price=price;
    }
    
    public void setPhoneId(int phoneId){
        this.phoneId=phoneId;
    }
    public int getPhoneId(){
        return phoneId;
    }
    
    public void setOs(String os){
        this.os=os;
    }
    public String getOs(){
        return os;
    }
    
    public void setBrand(String brand){
        this.brand=brand;
    }
    public String getBrand(){
        return brand;
    }
    
    public void setPrice(int price){
        this.price=price;
    }
    public int getPrice(){
        return price;
    }
    
}
public class Main
{
    public static int findPriceForGivenBrand(Phone[] arr,String brand){
        int sum=0;
        for(Phone p:arr){
            if(p.getBrand().equalsIgnoreCase(brand)){
                sum+=p.getPrice();
            }
        }
        return sum;
    }
    
    public static Phone getPhoneIdBasedOnOs(Phone[] arr,String os){
        for(Phone p:arr){
            if(p.getOs().equalsIgnoreCase(os) && p.getPrice()>=50000){
                return p;
            }
        }
        return null;
    }
    
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    Phone[] arr=new Phone[4];
	    for(int i=0;i<4;i++){
	        int id=sc.nextInt();
	        sc.nextLine();
	        String os=sc.nextLine();
	        String brand=sc.nextLine();
	        int price=sc.nextInt();
	        
	        arr[i]=new Phone(id,os,brand,price);
	    }
	    
	    sc.nextLine();
	    String brand=sc.nextLine();
	    String os=sc.nextLine();
	    
	    int res=findPriceForGivenBrand(arr,brand);
	    if(res>0){
	        System.out.println(res);
	    }
	    else{
	        System.out.println("The given Brand is not available");
	    }
	    
	    Phone result=getPhoneIdBasedOnOs(arr,os);
	    if(result!=null){
	        System.out.println(result.getPhoneId());
	    }
	    else{
	        System.out.println("No phones are available with specified os and price range");
	    }
		
	}
}
