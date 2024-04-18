package com.xdzhouxin;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private Map<String, Flyweight> flyweightMap = new HashMap<>();

    public Flyweight getFlyweight(String key) {
        Flyweight flyweight = flyweightMap.get(key);
        if (flyweight == null) {
            flyweight = new ConcreteFlyweight();
            flyweightMap.put(key, flyweight);
        }
        return flyweight;
    }


}
