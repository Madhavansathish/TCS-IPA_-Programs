/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
class AutonomousCar{
    private int carId;
    private String brand;
    private int noOfTestsConducted;
    private int noOfTestsPassed;
    private String environment;
    private String grade;
    
    AutonomousCar(int carId,String brand,int noOfTestsConducted,int noOfTestsPassed,String environment){
        this.carId=carId;
        this.brand=brand;
        this.noOfTestsConducted=noOfTestsConducted;
        this.noOfTestsPassed=noOfTestsPassed;
        this.environment=environment;
    }
    
    public void setCarId(int carId){
        this.carId=carId;
    }
    public int getCarId(){
        return carId;
    }
    
    public void setBrand(String brand){
        this.brand=brand;
    }
    public String getBrand(){
        return brand;
    }
    
    public void setNoOfTestsConducted(int noOfTestsConducted){
        this.noOfTestsConducted=noOfTestsConducted;
    }
    public int getNoTestsConducted(){
        return noOfTestsConducted;
    }
    
    public void setNoOfTestsPasses(int noOfTestsPassed){
        this.noOfTestsPassed=noOfTestsPassed;
    }
    public int getNoOfTestsPassed(){
        return noOfTestsPassed;
    }
    
    public void setEnvironment(String environment){
        this.environment=environment;
    }
    public String getEnvironment(){
        return environment;
    }
    
    public void setGrade(String grade){
        this.grade=grade;
    }
    public String getGrade(){
        return grade;
    }
}
public class Main
{
    public static int findTestsPassedByEnv(AutonomousCar[] arr,String environment){
        int sum=0;
        for(AutonomousCar c:arr){
            if(c.getEnvironment().equalsIgnoreCase(environment)){
                sum+=c.getNoOfTestsPassed();
            }
        }
        if(sum>0){
            return sum;
        }
        else{
            return 0;
        }
    }
    
    public static AutonomousCar updateCarGrade(String brand,AutonomousCar[] arr){
    
       
        for(AutonomousCar c:arr){
            if(c.getBrand().equalsIgnoreCase(brand)){
                int rating=(c.getNoOfTestsPassed()*100)/c.getNoTestsConducted();
                if(rating>=80){
                    c.setGrade("A1");
                }
                else{
                    c.setGrade("B2");
                }
                return c;
            }
        }
        return null;
        
    }
    
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		AutonomousCar[] arr=new AutonomousCar[4];
		for(int i=0;i<4;i++){
		    int id=sc.nextInt();
		    sc.nextLine();
		    String brand=sc.nextLine();
		    int tests=sc.nextInt();
		    int passed=sc.nextInt();
		    sc.nextLine();
		    String env=sc.nextLine();
		    
		    arr[i]=new AutonomousCar(id,brand,tests,passed,env);
		}
		
		String env=sc.nextLine();
		String brand=sc.nextLine();
		
		int ans=findTestsPassedByEnv(arr,env);
		if(ans>0){
		    System.out.println(ans);
		}
		else{
		    System.out.println("There are no tests passed in this particular environment");
		}
		
		AutonomousCar result=updateCarGrade(brand,arr);
		if(result!=null){
		    System.out.println(result.getBrand()+"::"+result.getGrade());
		}
		else{
		    System.out.println("No car is available with specified brand");
		}
		
	}
}
