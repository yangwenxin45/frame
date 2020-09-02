package net.yangwenxin.frame;

import lombok.extern.slf4j.Slf4j;
import net.yangwenxin.frame.annotation.Aspect;
import net.yangwenxin.frame.annotation.Controller;
import net.yangwenxin.frame.proxy.AspectProxy;

import java.lang.reflect.Method;

@Slf4j
@Aspect(Controller.class)
public class ControllerAspect extends AspectProxy {

    private long begin;

    @Override
    public void before(Class<?> cls, Method method, Object[] params) {
        log.debug("----- begin -----");
        log.debug(String.format("class: %s", cls.getName()));
        log.debug(String.format("method: %s", method.getName()));
        begin = System.currentTimeMillis();
    }

    @Override
    public void after(Class<?> cls, Method method, Object params, Object result) {
        log.debug(String.format("time: %dms", System.currentTimeMillis() - begin));
        log.debug("----- end -----");
    }
}
