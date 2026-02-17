package MiniProject;
import java.util.Scanner;
public class BankAccountMain {
	public static void main(String[] args) {
		BankAccount obj=new BankAccount("Ishita's Bank","SBIN00123",1234567890,"sayed",9848160000L,"Savings","Ishita","Jaha","sayedishita123@gmail.com",1000,1387,3366);
	System.out.println("Welcome to Ishita's Bank");
	Scanner sc=new Scanner(System.in);
	int pin=12345;
	System.out.println("Enter a pin:");
	int enteredpin=sc.nextInt();
	//PIN Validation
    if (pin == enteredpin) {
    	while (true) {
            System.out.println("\n1. Bank Enquiry");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Deposit Money");
            System.out.println("4. Change PIN");
            System.out.println("5. Change Mobile Number");
            System.out.println("6. Display Details");
            System.out.println("7. Exit");
            System.out.println("Choose Option:");
            int choose = sc.nextInt();
            switch (choose) {
            case 1:
                System.out.println("Balance: " + obj.getbalance());
                break;
            case 2:
                System.out.println("Enter Withdraw Amount:");
                double withdraw = sc.nextDouble();
                if (withdraw <= obj.getbalance()) {
                    System.out.println("Withdraw Successful");
                    withdraw=obj.getbalance()-withdraw;
                    System.out.println("Total Amount: "+withdraw);
                    
                } else {
                    System.out.println("Insufficient Balance");
                }
                break;
            case 3:
                System.out.println("Enter Deposit Amount:");
                double deposit = sc.nextDouble();
                if (deposit>500) {
                	System.out.println("Rs "+deposit+" Deposited Successfully");
                	deposit=deposit+obj.getbalance();
                	System.out.println("Total Amount: "+deposit);
                } else {
                    System.out.println("Invalid Amount");
                }
                break;
            case 4:
                System.out.println("Enter Old PIN:");
                int oldpin = sc.nextInt();
                if (oldpin == pin) {
                    System.out.println("Enter New PIN:");
                    pin = sc.nextInt();
                    System.out.println("PIN Changed Successfully");
                } else {
                    System.out.println("Invalid Old PIN");
                }
                break;
            case 5:
                System.out.println("Enter New Mobile Number:");
                long newMobile = sc.nextLong();
                System.out.println("Mobile Number Updated Successfully");
                break;
            case 6:
                System.out.println(obj.Display());
                break;
            case 7:
                System.out.println("Thank You!");
                System.exit(0);
            default:
                System.out.println("Invalid Option");
            }
        }
    } else {
        System.out.println("Invalid PIN");
    }
}
}
