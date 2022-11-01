import java.util.Scanner;


public class CurrencyConverter {
    public static String country () {
        return (" Select the Currency from below options: \n 1. India \n 2. United States of America \n 3. Europe \n 4. Japan \n 5. Kuwait ");
    }

    public static float convert (int convert, int convertTo, float amount) {
        if (convert == 1) {
            switch(convertTo) {
                case 1:
                    return (amount);
                    
                case 2:
                    float dollar = (amount / (float) 82.75);
                    return dollar;
                    
                case 3:
                    float euro = (amount / (float) 82.06);
                    return euro;

                case 4: 
                    float jpn = (amount / (float) 0.56);
                    return jpn;

                case 5:
                    float kwait = (amount / (float) 267.20);
                    return kwait;
            }
        }
        if (convert == 2) {
            switch(convertTo) {
                case 1:
                    float inr = (amount / (float) 0.012);
                    return inr;
                    
                case 2:
                    return amount;
                    
                case 3:
                    float euro = (amount / (float) 0.99);
                    return euro;

                case 4: 
                    float jpn = (amount / (float) 0.0068);
                    return jpn;

                case 5:
                    float kwait = (amount / (float) 3.23);
                    return kwait;
            }
        }
        if (convert == 3) {
            switch(convertTo) {
                case 1:
                    float inr = (amount / (float) 0.012);
                    return inr;
                    
                case 2:
                    float dollar = (amount / (float) 1.01);
                    return dollar;
                    
                case 3:
                    return amount;

                case 4: 
                    float jpn = (amount / (float) 0.0068);
                    return jpn;

                case 5:
                    float kwait = (amount / (float) 3.26);
                    return kwait;
            }
        }
        if (convert == 4) {
            switch(convertTo) {
                case 1:
                    float inr = (amount / (float) 1.79);
                    return inr;
                    
                case 2:
                    float dollar = (amount / (float) 147.73);
                    return dollar;
                    
                case 3:
                    float euro = (amount / (float) 147.73);
                    return euro;

                case 4: 
                    return amount;

                case 5:
                    float kwait = (amount / (float) 477.00);
                    return kwait;
            }
        }
        if (convert == 5) {
            switch(convertTo) {
                case 1:
                    float inr = (amount / (float) 0.003);
                    return inr;
                    
                case 2:
                    float dollar = (amount / (float) 0.31);
                    return dollar;
                    
                case 3:
                    float euro = (amount / (float) 0.31);
                    return euro;

                case 4: 
                    float jpn = (amount / (float) 0.0021);
                    return jpn;

                case 5:
                    return amount;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("++++++++++++   Welcome to this Awesome site   ++++++++++++");
        System.out.println();
        
        System.out.println(" Select your Currecy \n"+ country());
        int convert = sc.nextInt();

        System.out.println("Select convert Currency \n"+ country());
        int convertTo = sc.nextInt();

        System.out.println(" Enter the amount: ");
        float amount = sc.nextFloat();
        sc.close();

        System.out.println("Currecy is: "+ convert(convert, convertTo, amount));
    }
}