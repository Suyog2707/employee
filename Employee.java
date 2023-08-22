import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class Employee{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter date of birth");
        String dobin = sc.next();
        BigDecimal bsalary;
        BigDecimal gsalary;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate dob = LocalDate.parse(dobin, formatter);

        LocalDate currentDate = LocalDate.now();

        int age = currentDate.getYear() - dob.getYear();
        LocalDate retirementDate = dob.plusYears(55);

        if(age<18){
            System.out.println("Not Applicable");

        }
    
        bsalary = sc.nextBigDecimal();
        
        BigDecimal DA = bsalary.multiply(new BigDecimal("0.02"));
        BigDecimal TA = bsalary.multiply(new BigDecimal("0.01"));
        BigDecimal HRA = bsalary.multiply(new BigDecimal("0.03"));
        BigDecimal PF = bsalary.multiply(new BigDecimal("0.005"));
        gsalary = bsalary.add(DA).add(TA).add(HRA);
        if (gsalary.compareTo(new BigDecimal("10000")) >= 0) {
            gsalary = gsalary.subtract(new BigDecimal("1000"));
        }
        System.out.println("Total Salary month : " + gsalary);
        System.out.println("Retirement Date is :" + retirementDate);



    }
}