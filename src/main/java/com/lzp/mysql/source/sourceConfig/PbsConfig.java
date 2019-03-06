package com.lzp.mysql.source.sourceConfig;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;
import java.util.Objects;
import java.util.Properties;

/**
 * @Author: lizhipeng
 * @Company: 上海博般数据技术有限公司
 * @Date: 2018/12/21 15:44
 * @Description:
 */

@Configuration
@EnableJpaRepositories( //0
        basePackages = "com.lzp.mysql.source.pbsSource.repository",
        entityManagerFactoryRef = "pbsEntityManagerFactory",
        transactionManagerRef = "pbsTransactionManager"
)
public class PbsConfig {
    @Autowired
    private Environment env; //1

    @Bean
    @ConfigurationProperties(prefix="datasource.pbs")
    public DataSourceProperties pbsDataSourceProperties() { //2
        return new DataSourceProperties();
    }


    @Bean
    public DataSource pbsDataSource() { //3
        DataSourceProperties pbsDataSourceProperties = pbsDataSourceProperties();
        return DataSourceBuilder.create()
                .driverClassName(pbsDataSourceProperties.getDriverClassName())
                .url(pbsDataSourceProperties.getUrl())
                .username(pbsDataSourceProperties.getUsername())
                .password(pbsDataSourceProperties.getPassword())
                .build();
    }

    @Bean
    public PlatformTransactionManager pbsTransactionManager() { //4
        EntityManagerFactory factory = pbsEntityManagerFactory().getObject();
        return new JpaTransactionManager(factory);
    }

    @Bean
    public LocalContainerEntityManagerFactoryBean pbsEntityManagerFactory() {//5
        LocalContainerEntityManagerFactoryBean factory =
                new LocalContainerEntityManagerFactoryBean();
        factory.setDataSource(pbsDataSource());
        factory.setPackagesToScan("com.lzp.mysql.source.pbsSource.entity");
        factory.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
        Properties jpaProperties = new Properties();
        jpaProperties.put("hibernate.show_sql", env.getProperty("hibernate.show-sql"));
        jpaProperties.put("hibernate.format_sql", env.getProperty("hibernate.format_sql"));
//mysql
//        jpaProperties.put("hibernate.hbm2ddl.auto",env.getProperty("hibernate.hbm2ddl.auto"));

//oracle
        jpaProperties.put("hibernate.ddl-auto", env.getProperty("hibernate.ddl-auto"));
        jpaProperties.put("hibernate.dialect", env.getProperty("jpa.database-platform"));
        factory.setJpaProperties(jpaProperties);
        return factory;
    }

    @Bean(name = "pbsEntity")
    public EntityManager pbsEntity(){
        return Objects.requireNonNull(pbsEntityManagerFactory().getObject()).createEntityManager();
    }

//    @Bean
//    public DataSourceInitializer pbsDataSourceInitializer() {//6
//        DataSourceInitializer dsInitializer = new DataSourceInitializer();
//        dsInitializer.setDataSource(pbsDataSource());
//        ResourceDatabasePopulator dbPopulator = new ResourceDatabasePopulator();
//        dbPopulator.addScript(new ClassPathResource("security-data.sql"));
//        dsInitializer.setDatabasePopulator(dbPopulator);
//        dsInitializer.setEnabled(env.getProperty("datasource.pbs.initialize",
//                Boolean.class, false) );
//        return dsInitializer;
//    }
}