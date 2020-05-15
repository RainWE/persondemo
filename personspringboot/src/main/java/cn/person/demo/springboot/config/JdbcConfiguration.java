package cn.person.demo.springboot.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @Auther:cdx
 * @Date:2020-05-14
 * @Description:cn.person.demo.springboot.config
 * @Version:1.0
 */

@Configuration //声明一个类是一个java配置类，相当于一个xml配置文件
//@PropertySource("classpath:jdbc.properties")//读取资源文件
@EnableConfigurationProperties(JdbcProperties.class)
public class JdbcConfiguration {



    @Autowired
    private JdbcProperties jdbcProperties;



    @Bean   //把方法的返回值注入到spring容器
    public DataSource dataSource(){
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(this.jdbcProperties.getDriverClassName());
        dataSource.setUrl(this.jdbcProperties.getUrl());
        dataSource.setUsername(this.jdbcProperties.getUsername());
        dataSource.setPassword(this.jdbcProperties.getPassword());
        return dataSource;
    }
}
