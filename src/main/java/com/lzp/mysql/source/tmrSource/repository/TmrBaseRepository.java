package com.lzp.mysql.source.tmrSource.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

/**
 * @Author: lizhipeng
 * @Company: 上海博般数据技术有限公司
 * @Date: 2018/12/21 14:52
 * @Description:
 */
@NoRepositoryBean
public interface TmrBaseRepository<M,ID extends Serializable> extends JpaRepository<M,ID> {

}