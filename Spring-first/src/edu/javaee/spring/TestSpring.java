package edu.javaee.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args){
        Person person = new PersonImpl();
        person.learn();

        Class<PersonImpl>personClass = PersonImpl.class;
        try {
            PersonImpl person1 = personClass.newInstance();
            person1.learn();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
    public static void test(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person =(Person) ac.getBean("person");
        person.learn();
        Person person1 = ac.getBean(PersonImpl.class);
        person1.learn();


    }


}
