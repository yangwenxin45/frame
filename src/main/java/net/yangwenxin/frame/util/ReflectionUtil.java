package net.yangwenxin.frame.util;

import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 反射工具类
 *
 * @author yangwenxin
 * @Date 2019-9-19 11:28
 */
@Slf4j
public final class ReflectionUtil {

    /**
     * 创建实例
     *
     * @author yangwenxin
     * @Date 2019-9-19 11:29
     */
    public static Object newInstance(Class<?> cls) {
        Object instance;
        try {
            instance = cls.newInstance();
        } catch (Exception e) {
            log.error("new instance failure", e);
            throw new RuntimeException(e);
        }
        return instance;
    }

    /**
     * 调用方法
     *
     * @author yangwenxin
     * @Date 2019-9-19 13:22
     */
    public static Object invokeMethod(Object obj, Method method, Object... args) {
        Object result;
        try {
            method.setAccessible(true);
            result = method.invoke(obj, args);
        } catch (Exception e) {
            log.error("invoke method failure", e);
            throw new RuntimeException(e);
        }
        return result;
    }

    /**
     * 设置成员变量的值
     *
     * @author yangwenxin
     * @Date 2019-9-19 13:27
     */
    public static void setField(Object obj, Field field, Object value) {
        try {
            field.setAccessible(true);
            field.set(obj, value);
        } catch (Exception e) {
            log.error("set field failure", e);
            throw new RuntimeException(e);
        }
    }
}
