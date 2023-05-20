package com.probal.aop.dynamicProxy.proxy;

import com.probal.aop.dynamicProxy.dto.IEmployee;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class EmployeeSalaryInvocationHandler implements InvocationHandler {

    private IEmployee targetObject;

    public EmployeeSalaryInvocationHandler(IEmployee targetObject) {
        this.targetObject = targetObject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        // pre-processing
        if (method.getName().equals("giveHike")) {
            double hikeValue = (double) args[0];
            if (hikeValue <= 0.0) {
                throw new RuntimeException("Hike amount cannot be negative");
            }
        }
        // making actual call to service layer
        Object result = method.invoke(targetObject, args);

        // post-processing
        System.out.println("executing " + method.getName() + " for employee with id: " + targetObject.getId());

        return result;
    }

    public Object createProxy(Class clazz, InvocationHandler handler) {
        return Proxy.newProxyInstance(clazz.getClassLoader(), new Class[]{clazz}, handler);
    }
}
