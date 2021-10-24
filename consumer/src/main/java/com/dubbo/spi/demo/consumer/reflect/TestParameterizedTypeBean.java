package com.dubbo.spi.demo.consumer.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/**
 * @Auther: wanggang(323492)
 * @Date: 2021/5/7 19:07
 * @Description:
 */
public class TestParameterizedTypeBean<T> {
    //是ParameterizedType
    private HashMap<String, Object> map;
    private HashSet<T> set;
    private List<HashMap<String, Integer>> list;
    private Class<?> clz;
    //不是ParameterizedType
    private Integer i;
    private String str;

    public static void main(String[] args) {
        printParameterizedType();
    }

    private static void printParameterizedType() {
        Field[] fields =
                TestParameterizedTypeBean.class.getDeclaredFields();
        for (Field f : fields) {
            //打印是否是ParameterizedType类型
            System.out.println("FieldName: " + f.getName() + " instanceof ParameterizedType is :" +
            (f.getGenericType() instanceof
                    ParameterizedType) + "#" + f.getGenericType().getClass());
        }
        //取map这个类型中的实际参数类型的数组
        getParameterizedTypeWithName("map");//Class
        System.out.println();
        getParameterizedTypeWithName("set");//TypeVariable
        System.out.println();
        getParameterizedTypeWithName("list");//ParameterizedType
        System.out.println();
        getParameterizedTypeWithName("clz");//WildcardType
        System.out.println();
        getParameterizedTypeWithName("str");//not ParameterizedType
    }

    private static void getParameterizedTypeWithName(String name) {
        Field f;
        try {
            //利用反射得到TestParameterizedTypeBean类中的所有变量
            f = TestParameterizedTypeBean.class.getDeclaredField(name);
            f.setAccessible(true);
            Type type = f.getGenericType();
            if (type instanceof ParameterizedType) {
                for (Type param : ((ParameterizedType) type).getActualTypeArguments()) {
                    //打印实际参数类型
                    System.out.println("---type actualType---" +
                            param.toString() + "#" + param.getClass());
                }
                //打印所在的父类的类型
                System.out.println("---type ownerType0---" + ((ParameterizedType) type).getOwnerType());
                //打印其本身的类型
                System.out.println("---type rawType---" + ((ParameterizedType) type).getRawType());
            }
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
}
