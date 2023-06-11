import java.util.ArrayList;
import java.util.Scanner;

public class Mainmenu {
    Scanner sc = new Scanner(System.in);
    public ArrayList <User> listUser = new ArrayList<>();
    int indexLogin;
    public Mainmenu() {
        boolean isMainmenu = true;
        boolean isLogin;
        int inpMainmenu;
        while (isMainmenu){
            System.out.print("Mainmenu\n1. Login\n2. Register\n0. Exit\n>> ");
            inpMainmenu = Integer.parseInt(sc.nextLine());
            if (inpMainmenu==1){
                isLogin = Login();
                if (isLogin){
                    listUser.get(indexLogin).MenuUser();
                }else {
                    System.out.println("Gagal Login");
                }
            }else if (inpMainmenu==2){
                Register();
            }
            else if (inpMainmenu==0){
                isMainmenu = false;
            }else {
                System.out.println("Input out of range!");
            }
        }
    }
    public boolean Login(){
        boolean isLogin = false;
        String username, password;
        System.out.print("Masukan username: ");
        username = sc.nextLine().toLowerCase();
        System.out.print("Masukan password: ");
        password = sc.nextLine();
        for (int i = 0; i< listUser.size(); i++){
            if (listUser.get(i).getUsername().equals(username)){
                if (listUser.get(i).getPassword().equals(password)){
                    isLogin=true;
                    indexLogin = i;
                }else {
                    System.out.println("Password salah!");
                }
                break;
            }
            System.out.println("User tidak ditemukan!");
        }
        return isLogin;
    }
    public void Register(){
        String username,password;
        boolean isExist = false;
        System.out.print("Masukan username: ");
        username = sc.nextLine().toLowerCase();
        while (username.equals("")){
            System.out.println("Username tidak boleh kosong!");
            System.out.print("Masukan username: ");
            username = sc.nextLine().toLowerCase();
        }
        System.out.print("Masukan password: ");
        password = sc.nextLine();
        while (password.equals("")){
            System.out.println("Password tidak boleh kosong!");
            System.out.print("Masukan password: ");
            password = sc.nextLine().toLowerCase();
        }
        for (User user : listUser) {
            if (user.getUsername().equals(username)) {
                isExist = true;
                break;
            }
        }
        if (!isExist){
            listUser.add(new User(username,password));
            System.out.println("Berhasil register");
        }else {
            System.out.println("User sudah ada!");
        }
    }
}
