/**
 * Created by Daniel on 9/15/2016.
 */
public class triangle {
    double sideA, sideB, sideC;

        public triangle(double a, double b, double c){
            this.sideA= a;
            this.sideB= b;
            this.sideC= c;
        }

        public void TriangleT(){
            if(((sideA+sideB)<sideC)||((sideB+sideC)<sideA)) {
                System.out.print("Error. Please enter appropriate values for a triangle.");
            }
            else if(sideA!=sideB && sideB!=sideC && sideA!=sideC)
                System.out.print("This triangle is scalene.");
            else if(sideA == sideB && sideA == sideC)
                System.out.print("This triangle is equilateral.");
            else System.out.print("This triangle is isosceles.");
        }
}


