package com.lzp.mysql.conventer.mvc;

import com.lzp.mysql.source.pbsSource.entity.Meter;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author: lizhipeng
 * @Company: 上海博般数据技术有限公司
 * @Date: 2019/1/3 17:57
 * @Description:
 */
public interface CommService{
    /**
     * pbs和tmr接口二合一
     */
    List<?> query(String sql);
    Object findById(Class t, Object id);
//    Object save(Object t);
//    List<?> save(List<?> ts);
    List<?> findAll(Class t);
    List<?> findBy(Class t, String column, Object value);
    Object getColumn(Class t);
    /**
     * pbs的接口
     */
    List<?> pbsQuery(String sql);
    Object pbsFindById(Class t, Object id);
//    List<?> pbsSave(List<?> ts);
//    Object pbsSave(Object t);
    List<?> pbsFindAll(Class t);
    List<?> pbsFindBy(Class t, String column, Object value);

    /**
     * tmr的接口
     */
    List<?> tmrQuery(String sql);
    Object tmrFindById(Class t, Object id);
    List<?> tmrSave(List<?> ts);
    Object tmrSave(Object t);
    List<?> tmrFindAll(Class t);
    List<?> tmrFindBy(Class t, String column, Object value);

}
