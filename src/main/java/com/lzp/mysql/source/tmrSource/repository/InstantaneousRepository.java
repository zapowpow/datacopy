package com.lzp.mysql.source.tmrSource.repository;

import com.lzp.mysql.source.tmrSource.entity.InstantaneousValues;
import org.springframework.stereotype.Repository;

/**
 * @Author: lizhipeng
 * @Company: 上海博般数据技术有限公司
 * @Date: 2018/12/26 10:30
 * @Description:
 */
@Repository
public interface InstantaneousRepository extends TmrBaseRepository<InstantaneousValues,Long>{

}