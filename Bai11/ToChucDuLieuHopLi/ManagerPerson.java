package Bai11.ToChucDuLieuHopLi;

import MyCollection.MyQueue;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ManagerPerson {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        MyQueue<Person> female=new MyQueue<>();
        MyQueue<Person> male=new MyQueue<>();
        Person[] people = new Person[5];
        people[0]=new Person("awndsr",true,format.parse("12/12/2001"));
        people[1]=new Person("dsbkds",false,format.parse("12/12/2002"));
        people[2]=new Person("fdkfnb",false,format.parse("12/12/2003"));
        people[3]=new Person("aeihsf",true,format.parse("12/12/2004"));
        people[4]=new Person("dbsjbx",false,format.parse("12/12/2005"));
        for(int i=0;i<people.length;i++){
            if(people[i].isMale()){
                male.add(people[i]);
            }else{
                female.add(people[i]);
            }
        }
        while(!female.isEmpty()){
            System.out.println((female.remove()).toString());
        }
        while(!male.isEmpty()){
            System.out.println((male.remove()).toString());
        }

    }

}
