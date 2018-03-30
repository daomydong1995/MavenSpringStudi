package dong.model;

import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.NumberFormat;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

public class User {
    @NotEmpty
    private String userName;
    @Length(min = 6,max = 12)
    private String passWord;
    @Email
    private String address;
    @NumberFormat
    private String phone;
    private int age;
    public User(){

    }
    public User(String userName, String passWord, String address, String phone, int age) {
        this.userName = userName;
        this.passWord = passWord;
        this.address = address;
        this.phone = phone;
        this.age = age;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}