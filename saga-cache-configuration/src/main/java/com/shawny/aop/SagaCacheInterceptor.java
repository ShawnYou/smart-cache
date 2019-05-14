package com.shawny.aop;



import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.util.ClassUtils;

import java.lang.reflect.Method;


/**
 * Created by shawn_lin on 2019/5/8.
 */
public class SagaCacheInterceptor implements MethodInterceptor {
    @Override
    public Object invoke(final MethodInvocation methodInvocation) throws Throwable {
        Method method = methodInvocation.getMethod();

        try {
            return this.execute(methodInvocation,method,methodInvocation.getArguments(),methodInvocation.getThis());
        }catch (Throwable throwable){
            throw throwable;
        }

    }

    private Object execute(MethodInvocation invocation,Method method,Object[] args,Object target){
        Object object = invocation.getThis();
        Class<?> targetClass = target.getClass();
        ClassUtils.getMostSpecificMethod(method,targetClass);
        return null;
    }
}
