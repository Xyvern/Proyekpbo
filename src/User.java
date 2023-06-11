import java.util.Scanner;

public class User {
    private String username;
    private String password;
    Scanner sc = new Scanner(System.in);

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }


    public void MenuUser(){
        boolean isMenuUser = true;
        int pilUser;
        while (isMenuUser){
            System.out.println("Welcome, "+username+"!");
            System.out.print("1. Start Game\n0. Logout\n>> ");
            pilUser = Integer.parseInt(sc.nextLine());
            if (pilUser==1){
                System.out.print("Game in Progress... (Click any key to continue)");
                Game g = new Game();
                sc.nextLine();
            }else {
                isMenuUser = false;
                System.out.println("Logging off...");
            }
        }
    }




    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
