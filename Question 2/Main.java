import java.util.Scanner;
    class Car {
    Scanner sc=new Scanner(System.in);
    String serviceCode[]={"BS01", "EF01", "CF01", "BF01", "GF01"};
    String service[]={"Basic Servicing", "Engine Fixing", "Clutch Fixing", "Brake Fixing", "Gear Fixing"};
    int Hatchback[]={2000, 5000, 2000, 1000, 3000};
    int Sedan[]={4000, 8000, 4000, 1500, 6000};
    int SUV[]={5000, 10000, 6000, 2500, 8000};
    String Service;
    int sum=0;
    void Hatchback(){
        System.out.print("Enter the number of services you want in your Hatchback > ");
        int n1=sc.nextInt();
        for (int k=1;k<=n1; k++){
            System.out.print("Enter service code> ");
            Service=sc.next();
            for (int i=0; i<5; i++){
                if (serviceCode[i].equalsIgnoreCase(Service)){
                    System.out.println("Charges for "+service[i]+" - Rs. "+ Hatchback[i]);
                    sum+=Hatchback[i];
                }
            }
        }
        n1--;
        System.out.println("----------------------------------------------------------------");
        if(sum<10000){
            System.out.println("Total charges of the service= Rs. "+sum);
        }
        else {
            System.out.println("Total charges of the service= Rs. "+sum);
            System.out.println("CONGRATULATIONS YOU HAVE GOT A COMPLIMENTARY CLEANING SERVICE!");
        }
    }
    void Sedan(){
        System.out.print("Enter the number of services you want in your Sedan > ");
        int n2=sc.nextInt();
        for (int k=1;k<=n2; k++){
            System.out.print("Enter service code> ");
            Service=sc.next();
            for (int i=0; i<5; i++){
                if (serviceCode[i].equalsIgnoreCase(Service)){
                    System.out.println("Charges for "+service[i]+" - Rs. "+ Sedan[i]);
                    sum+=Sedan[i];
                }
            }
        }
        n2--;
        System.out.println("----------------------------------------------------------------");
        if(sum<10000){
            System.out.println("Total charges of the service= Rs. "+sum);
        }
        else {
            System.out.println("Total charges of the service= Rs. "+sum);
            System.out.println("CONGRATULATIONS YOU HAVE GOT A COMPLIMENTARY CLEANING SERVICE!");
        }
    }
    void SUV(){
        System.out.print("Enter the number of services you want in your SUV > ");
        int n3=sc.nextInt();
        for (int k=1;k<=n3; k++){
            System.out.print("Enter service code> ");
            Service=sc.next();
            for (int i=0; i<5; i++){
                if (serviceCode[i].equalsIgnoreCase(Service)){
                    System.out.println("Charges for "+service[i]+" - Rs. "+ SUV[i]);
                    sum+=SUV[i];
                }
            }
        }
        n3--;
        System.out.println("----------------------------------------------------------------");
        if(sum<10000){
            System.out.println("Total charges of the service= Rs. "+sum);
        }
        else {
            System.out.println("Total charges of the service= Rs. "+sum);
            System.out.println("CONGRATULATIONS YOU HAVE GOT A COMPLIMENTARY CLEANING SERVICE!");
        }
    }
    void caclulate(){
        Scanner sc=new Scanner(System.in);

        System.out.println("Press 1 for Hatchback");
        System.out.println("Press 2 for Sedan");
        System.out.println("Press 3 for SUV");
        System.out.print("Enter your car type > ");
        int carType=sc.nextInt();
        String Service;
        int n;
        switch (carType){
            case 1:
                Hatchback();
                break;
            case 2:
                Sedan();
                break;
            case 3:
                SUV();
                break;
            default:
                System.out.println("PLEASE ENTER CORRECT CODE FOR CAR TYPE!");
        }
    }
}

class Main{
    public static void main(String[] args) {
        Car car1=new Car();
        car1.caclulate();
    }
}
