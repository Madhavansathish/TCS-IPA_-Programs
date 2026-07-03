/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;

class Employee{
    private int employeeId;
    private String name;
    private String branch;
    private double rating;
    private boolean companyTransport;
    
    Employee(int employeeId,String name,String branch,double rating,boolean companyTransport){
        this.employeeId=employeeId;
        this.name=name;
        this.branch=branch;
        this.rating=rating;
        this.companyTransport=companyTransport;
    }
    
    public void setEmployeeId(int employeeId){
        this.employeeId=employeeId;
    }
    public int getEmployeeId(){
        return employeeId;
    }
    
    public void setEmployeeName(String name){
        this.name=name;
    }
    public String getEmployeeName(){
        return name;
    }
    
    public void setBranch(String branch){
        this.branch=branch;
    }
    public String getBranch(){
        return branch;
    }
    
    public void setRating(double rating){
        this.rating=rating;
    }
    public double getRating(){
        return rating;
    }
    
    public void setCompanyTransport(boolean companyTransport){
        this.companyTransport=companyTransport;
    }
    public boolean getCompanyTransport(){
        return companyTransport;
    }
}


public class Main
{
    public static int findCountOfEmployeesUsingCompanyTransport(Employee[] arr,String branch){
        int count=0;
        for(Employee e:arr){
            if(e.getBranch().equals(branch)){
                if(e.getCompanyTransport()){
                    count++;
                }
            }
        }
        if(count>0){
            return count;
        }
        else{
            return 0;
        }
    }
    
    public static Employee findEmployeeWithSecondHighestRating(Employee[] arr){
        Employee[] temp=new Employee[arr.length];
        int idx=0;
        for(Employee e:arr){
            if(!e.getCompanyTransport()){
                temp[idx++]=e;
            }
        }
        Employee[] res=new Employee[idx];
        for(int i=0;i<idx;i++){
            res[i]=temp[i];
        }
        
        Employee first=null;
        Employee second=null;
        for(Employee e:res){
            if(first==null || e.getRating()>first.getRating()){
                second=first;
                first=e;
            }
            else if(second==null || e.getRating()>second.getRating()){
                second=e;
            }
        }
        return second;
    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    Employee[] arr=new Employee[4];
	    for(int i=0;i<4;i++){
	        int id=sc.nextInt();
	        sc.nextLine();
	        String name=sc.nextLine();
	        String branch=sc.nextLine();
	        double rating=sc.nextDouble();
	        boolean transport=sc.nextBoolean();
	        
	        arr[i]=new Employee(id,name,branch,rating,transport);
	    }
	    sc.nextLine();
	    String branch=sc.nextLine();
	    
	    int count=findCountOfEmployeesUsingCompanyTransport(arr,branch);
	    if(count>0){
	        System.out.println(count);
	    }
	    else{
	        System.out.println("No such Employees");
	    }
	    
	    Employee result=findEmployeeWithSecondHighestRating(arr);
	    if(result!=null){
	        System.out.println(result.getEmployeeId());
	        System.out.println(result.getEmployeeName());
	    }
	    else{
	        System.out.println("All Employees using company transport");
	        
	    }
		
	}
}
