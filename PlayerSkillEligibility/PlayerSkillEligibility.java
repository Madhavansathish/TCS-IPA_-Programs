/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;

class Player{
    private int playerId;
    private String skill;
    private String level;
    private int points;
    
    Player(int playerId,String skill,String level,int points){
        this.playerId=playerId;
        this.skill=skill;
        this.level=level;
        this.points=points;
    }
    
    public void setPlayerId(int playerId){
        this.playerId=playerId;
    }
    public int getPlayerId(){
        return playerId;
    }
    
    public void setSkill(String skill){
        this.skill=skill;
    }
    public String getSkill(){
        return skill;
    }
    
    public void setLevel(String level){
        this.level=level;
    }
    public String getLevel(){
        return level;
    }
    
    public void setPoints(int points){
        this.points=points;
    }
    public int getPoints(){
        return points;
    }
}

public class Main
{
    public static int findPointsForGivenSkill(Player[] arr,String skill){
        int sum=0;
        for(Player p:arr){
            if(p.getSkill().equalsIgnoreCase(skill)){
                sum+=p.getPoints();
            }
        }
        return sum;
    }
    
    public static Player getPlayerBasedOnLevel(Player[] arr,String skill,String level){
        
        for(Player p:arr){
            if(p.getSkill().equalsIgnoreCase(skill) && p.getLevel().equalsIgnoreCase(level)){
                if(p.getPoints()>=20){
                    return p;
                }
            }
        }
        return null;
    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    Player[] arr=new Player[4];
	    for(int i=0;i<4;i++){
	        int id=sc.nextInt();
	        sc.nextLine();
	        String skill=sc.nextLine();
	        String level=sc.nextLine();
	        int points=sc.nextInt();
	        
	        arr[i]=new Player(id,skill,level,points);
	    }
	    sc.nextLine();
	    String skill=sc.nextLine();
	    String level=sc.nextLine();
	    
	    int points=findPointsForGivenSkill(arr,skill);
	    if(points>0){
	        System.out.println(points);
	    }
	    else{
	        System.out.println("The given skill is not available");
	    }
	    
	    Player res=getPlayerBasedOnLevel(arr,skill,level);
	    if(res!=null){
	        System.out.println(res.getPlayerId());
	    }
	    else{
	        System.out.println("No Player is available with specified level,skill and eleigibility points");
	    }
	}
}
