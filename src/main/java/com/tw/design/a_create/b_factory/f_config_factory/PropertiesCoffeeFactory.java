package com.tw.design.a_create.b_factory.f_config_factory;

import com.tw.design.a_create.b_factory.z_base.coffee.Coffee;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @author: pengfei.lv
 * @create: 2020-12-24 20:30
 **/
public class PropertiesCoffeeFactory {
    private static Map<String, Coffee> coffeeMap = new HashMap<String, Coffee>();

    static {
        Properties properties = new Properties();
        InputStream is = PropertiesCoffeeFactory.class.getClassLoader().getResourceAsStream("factory.properties");
        try {
            properties.load(is);
            Set<Object> objects = properties.keySet();
            for (Object key : objects) {
                String clazzName = properties.getProperty((String) key);
                Coffee coffee = (Coffee) Class.forName(clazzName).newInstance();
                coffeeMap.put((String) key, coffee);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static Coffee createCoffee(String type) {
        return coffeeMap.get(type);
    }
}
