public class User{
    String username;
    String userType;
    String name;
    public User(String uname, String utype, String nam){
        //Adding the inputed details to the object
    	username = uname;
        userType = utype;
        name = nam;
    }
    
    public String getUsername(){ //Gives the username of the specified user
        return username;
    }
    
    public String getUserType(){ //Gives the usertype of the specified user
        return userType;
    }
    
    public String getName(){ //Gives the name of the specified user
        return name;
    }
    
    public void setUserType(String setType){ //Only allows type to be set to user, editor or administrator
        if (setType == "user"){
            userType = "user";
        }
        else if(setType == "editor"){
            userType = "editor";
        }
        else if(setType == "admin"){
            userType = "admin";
        }
        else{
            System.out.println("Error incorrect user type");
        }
    }
    
}
