import java.security.cert.CertPathValidatorException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //Scanner class has been defineted.
        Scanner input= new Scanner(System.in);

        //The variable data types have been defined.
        double area,radius,pi=3.14,centralAngel;

        //Get values from the user.
        System.out.print("Please enter radius=");
        radius= input.nextDouble();

        System.out.print("Please enter central angel=");
        centralAngel= input.nextDouble();

        //The area of circle has been calculated.

        area=(pi*(radius*radius)*centralAngel)/360 ;

        System.out.print("The area of circle=" + area);


    }
}