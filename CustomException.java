import java.util.Scanner;
class ATM{
    int acc_number = 12344567;
    int password = 1111;

    int AN , PWD;

    void acceptInput()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the account number : ");
        AN = s.nextInt();
        System.out.println("Enter the password : ");
        PWD = s.nextInt();
    }

    void verify()
    {
        if(acc_number == AN && password == PWD)
        {
            System.out.println("collect your money");
        }
        else{
            System.out.println("Invalid user details");
        }
    }
}


class Bank
{
    void initiate(){
    ATM atm = new ATM();
    atm.acceptInput();
    atm.verify();
    }
}



public class CustomException{
    public static void main(String[] args)
    {
        Bank b = new Bank();
        b.initiate();
    }
}
