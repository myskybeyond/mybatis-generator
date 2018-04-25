package com.mybatis.db;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.datasource.unpooled.UnpooledDataSourceFactory;

public class DruidDataSourceFacotry extends UnpooledDataSourceFactory {
    public  DruidDataSourceFacotry(){
        this.dataSource = new DruidDataSource();
    }
}
