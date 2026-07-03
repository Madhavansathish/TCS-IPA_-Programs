/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
class Course{
    private int courseId;
    private String courseName;
    private String courseAdmin;
    private int quiz;
    private int handson;
    
    Course(int courseId,String courseName,String courseAdmin,int quiz,int handson){
        this.courseId=courseId;
        this.courseName=courseName;
        this.courseAdmin=courseAdmin;
        this.quiz=quiz;
        this.handson=handson;
    }
    
    public void setcourseId(int courseId){
        this.courseId=courseId;
    }
    public int getcourseId(){
        return courseId;
    }
    
    public void setcourseName(String courseName){
        this.courseName=courseName;
    }
    public String getcourseName(){
        return courseName;
    }
    
    public void setcourseAdmin(String courseAdmin){
        this.courseAdmin=courseAdmin;
    }
    public String getcourseAdmin(){
        return courseAdmin;
    }
    
    public void setquiz(int quiz){
        this.quiz=quiz;
    }
    public int getquiz(){
        return quiz;
    }
    
    public void sethandson(int handson){
        this.handson=handson;
    }
    public int gethandson(){
        return handson;
    }
}


public class Main
{
    public static int findAvgOfQuizByAdmin(Course[] arr, String admin){
        int sum=0;
        int count=0;
        for(Course c:arr){
            if(c.getcourseAdmin().equalsIgnoreCase(admin)){
                sum+=c.getquiz();
                count++;
            }
        }
        if(count<=0){
            return 0;
        }
        else{
            int avg=sum/count;
            return avg;
        }
    }
    
    public static Course[] sortCourseByHandsOn(Course[] arr, int handson){
        Course[] temp=new Course[arr.length];
        int idx=0;
        for(Course c:arr){
            if(c.gethandson()<handson){
                temp[idx]=c;
                idx++;
            }
        }
        
         if(idx==0){
            return null;
        }
        
        Course[] res=new Course[idx];
        for(int i=0;i<idx;i++){
            res[i]=temp[i];
        }
        

            for(int j=0;j<res.length;j++){
                for(int k=j+1;k<res.length;k++){
                    if(res[j].gethandson()>res[k].gethandson()){
                        Course t=res[j];
                        res[j]=res[k];
                        res[k]=t;
                    }
                }
            }
            return res;
    
    }
    
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    Course[] arr=new Course[4];
	    for(int i=0;i<4;i++){
	        int id=sc.nextInt();
	        sc.nextLine();
	        String name=sc.nextLine();
	        String admin=sc.nextLine();
	        int quiz=sc.nextInt();
	        int handson=sc.nextInt();
	        
	        arr[i]=new Course(id,name,admin,quiz,handson);
	    }
	    sc.nextLine();
	    
	    String admin=sc.nextLine();
	    int handson=sc.nextInt();
	    
	    int avg=findAvgOfQuizByAdmin(arr,admin);
	    if(avg!=0){
	        System.out.println(avg);
	    }
	    else{
	        System.out.println("No course found");
	    }
		
		Course[] result=sortCourseByHandsOn(arr,handson);
		if(result!=null){
		    for(Course c:result){
		        System.out.println(c.getcourseName());
		    }
		}
		else{
		    System.out.println("No course found with mentioned attributes");
		}
	}
}
