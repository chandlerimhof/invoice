import java.util.ArrayList;
import java.util.Scanner;

public class Company {
    Scanner scnr = new Scanner(System.in);
    private String companyName;
    private String phone;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Company{" +
                "companyName='" + companyName + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
