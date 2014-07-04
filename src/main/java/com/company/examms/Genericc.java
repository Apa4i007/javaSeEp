package com.company.examms;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by vitaliy.vasilenko on 7/4/2014.
 */
public class Genericc {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        List<Integer> integerList = new ArrayList<Integer>();
        integerList.add(new Integer(1000));

        Method addMethod = integerList.getClass().getMethod("add", Object.class);
        addMethod.invoke(integerList, "Lololo");
        addMethod.invoke(integerList, new Float(12.2));

        System.out.println(integerList);
    }
}
