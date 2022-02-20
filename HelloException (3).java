import java.util.Scanner;

class HelloException {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int invalidAmountCtr = 0, limitExceededCtr = 0, validCtr = 0;
        int testCases = scanner.nextInt();
        for (int tc = 1; tc <= testCases; tc++) {
            int amount = scanner.nextInt();
            try {
                withdrawMoney(amount);
                validCtr++;
            } catch (InvalidAmountException iae) {
                System.out.println(iae.getMessage());
                invalidAmountCtr++;
            } catch (LimitExceededException lee) {
                System.out.println(lee.getMessage());
                limitExceededCtr++;
            }
        }
        
        System.out.println(invalidAmountCtr+" "+limitExceededCtr+" "+validCtr);
    }
private static void withdrawMoney(int amount) throws InvalidAmountException, LimitExceededException {
if(amount<=0)
{

    throw new InvalidAmountException("Amount to withdraw must be positive");

}
else if(amount>50000)
{
  
 throw new LimitExceededException("Maximum withdrawal amount is 50000");

}
else
{
    System.out.println("Valid amount");
}
}
}//end of class Hello

class InvalidAmountException extends Exception
{
    String s;
    public InvalidAmountException(String s)
    {
        this.s=s;
    }
    public String getMessage()
    {
        return s;
    }
}

class LimitExceededException extends Exception
{
    String s;
    public LimitExceededException(String s)
    {
        this.s=s;
    }
    public String getMessage()
    {
        return s;
    }
}
