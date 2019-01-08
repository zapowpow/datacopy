package com.lzp.mysql.source.sourceConfig;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.core.JdbcTemplate;
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
        basePackages = "com.lzp.mysql.source.tmrSource.repository",
        entityManagerFactoryRef = "tmrEntityManagerFactory",
        transactionManagerRef = "tmrTransactionManager"
)
public class TmrConfig {
    @Autowired
    private Environment env;

    @Bean
    @ConfigurationProperties(prefix="datasource.tmr")
    public DataSourceProperties tmrDataSourceProperties() {
        return new DataSourceProperties();
    }

    @Bean(name = "tmrDataSource")
    public DataSource tmrDataSource() {
        DataSourceProperties primaryDataSourceProperties = tmrDataSourceProperties();
        return DataSourceBuilder.create()
                .driverClassName(primaryDataSourceProperties.getDriverClassName())
                .url(primaryDataSourceProperties.getUrl())
                .username(primaryDataSourceProperties.getUsername())
                .password(primaryDataSourceProperties.getPassword())
                .build();
    }

    @Bean
    public PlatformTransactionManager tmrTransactionManager() {
        EntityManagerFactory factory = tmrEntityManagerFactory().getObject();
        return new JpaTransactionManager(factory);
    }

    @Bean
    public LocalContainerEntityManagerFactoryBean tmrEntityManagerFactory() {
        LocalContainerEntityManagerFactoryBean factory = new
                LocalContainerEntityManagerFactoryBean();
        factory.setDataSource(tmrDataSource());
        factory.setPackagesToScan("com.lzp.mysql.source.tmrSource.entity");
        factory.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
        Properties jpaProperties = new Properties();
        jpaProperties.put("hibernate.hbm2ddl.auto",env.getProperty("hibernate.hbm2ddl.auto"));
        jpaProperties.put("hibernate.show_sql", env.getProperty("hibernate.show-sql"));
        jpaProperties.put("hibernate.format_sql", env.getProperty("hibernate.format_sql"));
        factory.setJpaProperties(jpaProperties);
        return factory;
    }

    @Bean(name = "tmrEntity")
    public EntityManager pbsEntity(){
        return Objects.requireNonNull(tmrEntityManagerFactory().getObject()).createEntityManager();
    }

//    @Bean(name = "tmrJdbcTemplate")
//    public JdbcTemplate tmrJdbcTemplate(
//            @Qualifier("tmrDataSource") DataSource dataSource) {
//        return new JdbcTemplate(dataSource);
//    }

//    @Bean
//    public DataSourceInitializer tmrDataSourceInitializer() {
//        DataSourceInitializer dsInitializer = new DataSourceInitializer();
//        dsInitializer.setDataSource(tmrDataSource());
//        ResourceDatabasePopulator dbPopulator = new ResourceDatabasePopulator();
//        dbPopulator.addScript(new ClassPathResource("tmr-data.sql"));
//        dsInitializer.setDatabasePopulator(dbPopulator);
//        dsInitializer.setEnabled(env.getProperty("datasource.tmr.initialize",
//                Boolean.class, false));
//        return dsInitializer;
//    }
}