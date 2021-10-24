package com.dubbo.spi.demo.consumer.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/**
 * @Auther: wanggang(323492)
 * @Date: 2021/5/7 19:40
 * @Description:
 */
public class TypeVariableTest<K extends Number, T> {
    //K有指定了上边界Number
    K key;
    //T没有指定上边界，其默认上边界为Object
    T value;

    public static void main(String[] args) {
        Type[] types = TypeVariableTest.class.getTypeParameters();
        for (Type type : types) {
            TypeVariable t = (TypeVariable) type;
            int index = t.getBounds().length - 1;
            //输出上边界
            System.out.println("--getBounds()-- " + t.getBounds()
                    [index]);
            //输出名称
            System.out.println("--getName()--" + t.getName());
            //输出所在的类的类型
            System.out.println("--getGenericDeclaration()--" + t.getGenericDeclaration());
        }
        System.out.println();
        //也可以从Field中得到
        Field[] fields = TypeVariableTest.class.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            if (field.getGenericType() instanceof TypeVariable) {
                TypeVariable<?> typeVariable = (TypeVariable<?>)
                        field.getGenericType();
                System.out.println(typeVariable.getGenericDeclaration());
            }
            ;
        }
    }
}
