package com.mf.test08;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Auther: mf
 * @Date: 2022/11/13 - 11 - 13 - 16:43
 */
public class Test01 {
    //这是main方法，程序的入口
    public static void main(String[] args) {
        /*
        增加：put(K key, V value)
        删除：clear() remove(Object key)
        修改：
        查看：entrySet() get(Object key) keySet() size() values()
        判断：containsKey(Object key) containsValue(Object value)
            equals(Object o) isEmpty()
         */
        //创建一个Map集合：无序，唯一
        Map<String,Integer> map = new HashMap<>();
        System.out.println(map.put("lili", 10101010));
        map.put("nana",12345234);
        map.put("feifei",34563465);
        System.out.println(map.put("lili", 34565677));
        map.put("mingming",12323);
        /*map.clear();清空*/
        /*map.remove("feifei");移除*/
        System.out.println(map.size());
        System.out.println(map);
        System.out.println(map.containsKey("lili"));
        System.out.println(map.containsValue(12323));
        Map<String,Integer> map2 = new HashMap<>();
        System.out.println(map2.put("lili", 10101010));
        map2.put("nana",12345234);
        map2.put("feifei",34563465);
        System.out.println(map2.put("lili", 34565677));
        map2.put("mingming2",12323);
        System.out.println(map==map2);
        System.out.println(map.equals(map2));//equals进行了重写，比较的是集合中的值是否一致
        System.out.println("判断是否为空："+map.isEmpty());
        System.out.println(map.get("nana"));
        System.out.println("-----------------------------------");
        //keySet()对集合中的key进行遍历查看：
        Set<String> set = map.keySet();
        for(String s:set){
            System.out.println(s);
        }
        System.out.println("-----------------------------------");
        //values()对集合中的value进行遍历查看：
        Collection<Integer> values = map.values();
        for(Integer i:values){
            System.out.println(i);
        }
        System.out.println("-----------------------------------");
        //get(Object key) keySet()
        Set<String> set2 = map.keySet();
        for(String s:set2){
            System.out.println(map.get(s));
        }
        System.out.println("-----------------------------------");
        //entrySet()
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for(Map.Entry<String, Integer> e:entries){
            System.out.println(e.getKey()+"----"+e.getValue());
        }
    }
}
