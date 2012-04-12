package com.test.rwmybatis;

import java.sql.SQLFeatureNotSupportedException;
import java.util.logging.Logger;

import org.springframework.core.NamedThreadLocal;
import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * @author Hailei
 *   DateSource不是线程安全,所以我们用threadlocal来保证当前线程要使用的数据源
 */
public class RoutingDataSource  extends AbstractRoutingDataSource{

    private final static NamedThreadLocal<String> keys = new NamedThreadLocal<String>("routingdatasource's key"); 
    public Logger getParentLogger() throws SQLFeatureNotSupportedException {
        //NooP
        return null;
    }
    
    public static void setKey(String key){
        
           keys.set(key);
    }

    @Override
    protected Object determineCurrentLookupKey() {
        return keys.get();
    }

}
