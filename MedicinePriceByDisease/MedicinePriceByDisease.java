/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;

class Medicine{
    private String MedicineName;
    private String batch;
    private String disease;
    private int price;
    
    Medicine(String MedicineName,String batch,String disease,int price){
        this.MedicineName=MedicineName;
        this.batch=batch;
        this.disease=disease;
        this.price=price;
    }
    
    public void setMedicineName(String MedicineName){
        this.MedicineName=MedicineName;
    }
    public String getMedicineName(){
        return MedicineName;
    }  
    
    public void setBatch(String batch){
        this.batch=batch;
    }
    public String getBatch(){
        return batch;
    }
    
    public void setDisease(String disease){
        this.disease=disease;
    }
    public String getDisease(){
        return disease;
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
    public static Medicine[] getPriceByDisease(Medicine[] arr,String disease){
        Medicine[] temp=new Medicine[arr.length];
        int idx=0;
        for(Medicine m:arr){
            if(m.getDisease().equalsIgnoreCase(disease)){
                temp[idx++]=m;
            }
        }
        Medicine[] res=new Medicine[idx];
        for(int i=0;i<idx;i++){
            res[i]=temp[i];
        }
        
        for(int i=0;i<idx;i++){
            for(int j=i+1;j<idx;j++){
                if(res[j].getPrice()<res[i].getPrice()){
                    Medicine m=res[i];
                    res[i]=res[j];
                    res[j]=m;
                }
            }
        }
        return res;
    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    Medicine[] arr=new Medicine[4];
	    for(int i=0;i<4;i++){
	        String name=sc.nextLine();
	        String batch=sc.nextLine();
	        String disease=sc.nextLine();
	        int price=sc.nextInt();
	        sc.nextLine();
	        arr[i]=new Medicine(name,batch,disease,price);
	       
	    }
	   
	    String disease=sc.nextLine();
	    
	    Medicine[] result=getPriceByDisease(arr,disease);
	    if(result.length>0){
    	    for(Medicine m:result){
    	        System.out.println(m.getPrice());
    	    }
	    }
	    else{
	        System.out.println("No Medicines found");
	    }
	
	}
}
