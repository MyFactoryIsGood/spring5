package com.jun.conf;

import com.jun.dao.UserDao;
import com.jun.dao.impl.UserDaoImpl;
import com.jun.datamodel.Person;
import com.jun.service.UserService;
import com.jun.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages ="com.jun")//扫描com.jun包下的类
@Import(AppConfigTwo.class)//引入另一个配置文件
@Profile("bb")//区分不同的环境
@EnableLoadTimeWeaving//在类被加载进JVM时Spring使用LoadTimeWeaver进行动态转换
public class AppConfig {
    /*
    * 这个操作相当于@Import(AppConfigTwo.class)
    * */
    @Autowired
    private AppConfigTwo appConfigTwo;
    /*
    * 使得一个名为UserDao的bean在ApplicationContext可用，绑定到UserDaoImpl类型的对象实例上
    * */
    @Bean
    public UserDao  userDao() {
        return new UserDaoImpl();
    }
    @Bean(name = "user")//bean的命名
    @Scope("prototype") //bean的作用域
    @Description("这是一个User服务类bean")//bean的描述
    public UserService userService(){
        UserServiceImpl userService=new UserServiceImpl();
        userService.setUserDao(userDao());
        return  userService;
    }
}
