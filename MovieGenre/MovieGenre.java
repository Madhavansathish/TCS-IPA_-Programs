/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
class Movie{
    private String movieName;
    private String company;
    private String genre;
    private int budget;
    
    Movie(String movieName,String company,String genre,int budget){
        this.movieName=movieName;
        this.company=company;
        this.genre=genre;
        this.budget=budget;
    }
    
    public void setMovieName(String movieName){
        this.movieName=movieName;
    }
    public String getMovieName(){
        return movieName;
    }
    
    public void setCompany(String company){
        this.company=company;
    }
    public String getCompany(){
        return company;
    }
    
    public void setGenre(String genre){
        this.genre=genre;
    }
    public String getGenre(){
        return genre;
    }
    
    public void setBudget(int budget){
        this.budget=budget;
    }
    public int getBudget(){
        return budget;
    }
}
public class Main
{
    public static Movie[] getMovieByGenre(Movie[] arr,String genre){
        Movie[] temp=new Movie[arr.length];
        int idx=0;
        for(Movie m:arr){
            if(m.getGenre().equalsIgnoreCase(genre)){
                temp[idx++]=m;
            }
        }
        Movie[] res=new Movie[idx];
        for(int i=0;i<idx;i++){
            res[i]=temp[i];
        }
        
        return res;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Movie[] arr=new Movie[4];
		for(int i=0;i<4;i++){
		    String name=sc.nextLine();
		    String company=sc.nextLine();
		    String genre=sc.nextLine();
		    int budget=sc.nextInt();
		    sc.nextLine();
		    
		    arr[i]=new Movie(name,company,genre,budget);
		    
		}
		
		String genre=sc.nextLine();
		Movie[] result=getMovieByGenre(arr,genre);
		for(Movie m:result){
		    if(m.getBudget()>80000000){
		        System.out.println("High Budget Movie");
		    }
		    else{
		        System.out.println("Low Budget Movie");
		    }
		}
	}
}
