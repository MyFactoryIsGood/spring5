package test;

import com.jun.conf.AppConfig;
import com.jun.conf.AppConfigThree;
import com.jun.datamodel.Person;
import com.jun.datamodel.Phone;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext();
        ctx.getEnvironment().setActiveProfiles("dev");
        ctx.register(AppConfig.class, AppConfigThree.class);
        ctx.refresh();
        //Phone phone=ctx.getBean(Phone.class);
        Person person=ctx.getBean(Person.class);
        person.setAge("5");
        person.setName("谢亚军");
        System.out.println(person);
        //System.out.println(person);
    }
  /*  public static void main(String[] args) {
        ApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
        Person person=ctx.getBean(Person.class);
        person.setAge("5");
        person.setName("谢亚军");
        System.out.println(person);
    }*/
}
