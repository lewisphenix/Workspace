import java.util.*;
public class UserGroup{
	
    ArrayList<User> userList;
    Iterator<User> findUser;
    Iterator<User> findAdmin;
    User lastUser;
    
    public UserGroup(){ //Creates a new array list, userList
         userList = new ArrayList<User>();
    }
    
    public void addSampleData(){ //This adds the sample data to the arraylist
        User a = new User("user a", "user", "name a");
        User b = new User("user b","user","name b");
        User c = new User("user c","user","name c");
        User d = new User("user d","user","name d");
        User e = new User("user e","user","name e");
        User f = new User("user f","user","name f");
        User g = new User("user g","user","name g");
        User h = new User("user h","user","name h");
        User i = new User("user i","admin","name i");
        User j = new User("user j","admin","name j");
        userList.add(a);
        userList.add(b);
        userList.add(c);
        userList.add(d);
        userList.add(e);
        userList.add(f);
        userList.add(g);
        userList.add(h);
        userList.add(i);
        userList.add(j);
    }
    
    public User getUser(int i){ //Gets the user in the place in the arraylist
        return userList.get(i);
    }
    
    public void printUsernames(){ //Loops over the arraylist and prints out the Usernames
        for (User z : userList){
            System.out.println(z.getUsername() + " " + z.getUserType());
        }
    }
    
    //Part 3
    
    public void removeFirstUser(){
        userList.remove(0);
    }
    
    public void removeLastUser(){ //Removes the last user in the arraylist
    	int a;
        a = userList.size();
        userList.remove(a-1);
    }
    
    public void removeUser(String userdelete){ //Loops through the arraylist looking for specified user
        findUser = this.getUserIterator();
        while (findUser.hasNext()){
            if (findUser.next().getUsername().equals(userdelete)){
                findUser.remove();
            }
        }
    }
    
    public int size(){ //Gives the size of the user list
    	return userList.size();
    }
    
    public Iterator<User> getUserIterator(){ //Sets up an iterator for the user list
    	Iterator<User> getIterator = userList.iterator();
    	return getIterator;
    }
    
    public void addUser(User user){ //Adds a specific user to the user list
    	userList.add(user);
    }
    
    public void lastUserNotAdmin(){ //Sets the last user in the arraylist to become a user
    	int a;
    	a=userList.size();
    	lastUser = userList.get(a-1);
    	lastUser.setUserType("user");
    }
}
