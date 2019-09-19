package net.yangwenxin.frame.bean;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.lang.reflect.Method;

/**
 * 封装Action信息
 *
 * @author yangwenxin
 * @Date 2019-9-19 14:34
 */
@AllArgsConstructor
@Getter
public class Handler {

    /**
     * Controller类
     *
     * @author yangwenxin
     * @Date 2019-9-19 14:36
     */
    private Class<?> controllerClass;

    /**
     * Action方法
     *
     * @author yangwenxin
     * @Date 2019-9-19 14:36
     */
    private Method actionMethod;
}
