package ValidateEmail;

public class EmailExampleTest {
    private static EmailExample emailExample;
    public static final String[] validEmail = new String[] {"hoa@gmail.com", "na@gmail.com", "nga@gmail.com"};
    public static final String[] invalidEmail = new String[] {"@gmail.com", "hoa@gmail.", "@#nga@gmail.com"};

    public static void main(String[] args) {
        emailExample = new EmailExample();
        for (String email : validEmail) {
            boolean isvalid = emailExample.validate(email);
            System.out.println("Email is " + email + "\tis valid: "+ isvalid);
        }
        for (String email : invalidEmail) {
            boolean isvalid = emailExample.validate(email);
            System.out.println("Email is " + email + "\tis valid: "+ isvalid);
        }
    }
}
