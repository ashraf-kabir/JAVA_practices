import java.util.Scanner;
public class LogIn {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        //int id [] = new int [500];
        String name []= new String [500];
        int pass[] = new int[500];
        int id= 0;
        int m=0;
        String logInName =" ";
        int logInPass = 0;
        for(int loop=1; ;loop++){
            for(int login=1; ; login ++){
                System.out.println(" welcome to my world");
                System.out.println("   1. Sign in ");
                System.out.println("   2. log in ");
                System.out.println("   3. Exit ");
                System.out.println(" Please enter an option to continue");
                int n = sc.nextInt();
                //sign in
                if(n==1){    
                    System.out.println(" Sign In");        
                    System.out.println(" user name: ");
                    name[id] = sc.next();
                    System.out.println(" Password:");
                    pass[id] = sc.nextInt();
                    for(int i=0; ;i++){
                        System.out.println("You have signed in successfully");
                        System.out.println("   1. Log in");
                        System.out.println("   2. Main menu");
                        System.out.println(" Please enter an option to continue");
                        m=sc.nextInt();
                        if(m==1){
                            break;
                        }
                        if (m==2){
                            break;
                        } 
                    }
                    id++;
                } // log in
                if(n==2 || m==1) {
                    System.out.println(" Log In");
                    System.out.println(" user name: ");
                    logInName = sc.next();
                    System.out.println(" Password: ");
                    logInPass = sc.nextInt();
                    for(int search =0; search<name.length; search++){
                        if(logInName.equals(name[search]) &&  logInPass==pass[search]){
                            System.out.println(" Welcome " + name[search]);
                            System.out.println(" 1. Sign out");
                            int z=sc.nextInt();
                            if(z==1){
                                break;
                            }
                        }
                        if(search==name.length-1){
                            System.out.println(" wrong password or user name");
                            break;
                        }
                    }
                }
                if(n==3){
                    break;
                }    
            }
            break;
        }
        
    }
    
}
