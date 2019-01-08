package com.lzp.mysql.source.pbsSource.repository;

import com.lzp.mysql.source.pbsSource.entity.Meter;
import org.springframework.stereotype.Repository;

/**
 * @Author: lizhipeng
 * @Company: 上海博般数据技术有限公司
 * @Date: 2018/12/26 10:47
 * @Description:
 */
@Repository
public interface MeterRepository extends PbsBaseRepository<Meter,Long> {
}
