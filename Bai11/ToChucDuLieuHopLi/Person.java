package Bai11.ToChucDuLieuHopLi;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Person {
    SimpleDateFormat format=new SimpleDateFormat("dd/MM/yyyy");
    private String fullName;
    private final boolean isMale;
    private Date birthday;


    public Person(String fullName,boolean isMale , Date birthday) {
        this.fullName = fullName;
        this.isMale = isMale;
        this.birthday = birthday;
    }


    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public boolean isMale() {
        if(isMale){
            return true;
        }else{
            return false;
        }
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String toString(){
        return "Name: "+isMale+" Gender: "+(isMale()? "Male":" Female")+" Birthday: " +format.format(birthday);
    }
}
