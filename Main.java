import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean a;
        boolean pass = true;
        Scanner kb = new Scanner(System.in);
        String newLine = System.getProperty("line.separator");

        do {
            String sideA, sideB, sideC;
            do {
                System.out.print("Enter the first side of your triangle: ");
                sideA = kb.nextLine();
                if (sideA.substring(0).matches("^[1-9]+")){
                    pass = true;
                }else{
                    System.out.print("Error, enter valid input." + newLine);
                    pass = false;
                }
            }while(!pass);
            do {
                pass = true;
                System.out.print("Enter the second side of your triangle: ");
                sideB = kb.nextLine();
                if (sideB.substring(0).matches("^[1-9]+")){
                    pass = true;
                }else{
                    System.out.print("Error, enter valid input." + newLine);
                    pass = false;
                }
            }while(!pass);
            do {
                pass = true;
                System.out.print("Enter the third side of your triangle: ");
                sideC = kb.nextLine();
                if (sideC.substring(0).matches("^[1-9]+")){
                    pass = true;
                }else{
                    System.out.print("Error, enter valid input." + newLine);
                    pass = false;
                }
            }while(!pass);

            double sA=Double.valueOf(sideA);
            double sB=Double.valueOf(sideB);
            double sC=Double.valueOf(sideC);

            triangle t = new triangle(sA, sB, sC);
            t.TriangleT();

            int option;
            System.out.print(newLine + "Want to do it again? Press 1 for yes or 2 to exit.");
            option= kb.nextInt();

            if(option==1)
            {
              a=true;
            }else{
                a=false;
            }
            kb.nextLine();
        }while(a==true);
    }
}

