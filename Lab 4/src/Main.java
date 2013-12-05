public class Main{
    Toolbox myToolbox = new Toolbox();
    int number = 0;
    int a = 2;
    int b = 1;
    public static void main(String[] args){
    	//Creates 2 new usergroups
        UserGroup newUserGroup = new UserGroup();
        UserGroup administrators = new UserGroup();
        Main newmain = new Main();
        newmain.getnumber();
        newUserGroup.addSampleData(); //adds the sample data from UserGroup
        System.out.println("***These are the usernames from the sample data***");
        newUserGroup.printUsernames();
        newUserGroup.removeUser("user a");
        System.out.println("***This is the list of usernames without user a***");
        newUserGroup.printUsernames();
        
        //Part 3
        
        for (int i = 0; i<newUserGroup.size(); i++){
        	if (newUserGroup.getUser(i).getUserType().equals("admin")){
        	administrators.addUser(newUserGroup.getUser(i));
        	}
        }
        
        System.out.println("***This is the list of usernames within the administrators arraylist***");
        administrators.printUsernames();
        newUserGroup.lastUserNotAdmin();
        
        System.out.println("***All the users***");
        newUserGroup.printUsernames();
        administrators.printUsernames();
    }
    
    public void getnumber(){
        number = myToolbox.readIntegerFromCmd(); //Reads the user input and gives the times table
        for(int i=1; i<21; i++){
            System.out.println(number*i);
        }
        while (b<=500){
            b = b + a;
            a++;
            
        }
        System.out.println("It takes " + (a-2) + " iterations"); //This is the number of iterations until it reached 500
    }
    
}
