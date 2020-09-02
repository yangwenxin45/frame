package net.yangwenxin.frame;

import net.yangwenxin.frame.helper.*;
import net.yangwenxin.frame.util.ClassUtil;

/**
 * 加载相应的Helper类
 *
 * @author yangwenxin
 * @Date 2019-9-19 15:14
 */
public final class HelperLoader {

    public static void init() {
        Class<?>[] classList = {
                ClassHelper.class,
                BeanHelper.class,
                AopHelper.class,
                IocHelper.class,
                ControllerHelper.class
        };
        for (Class<?> cls : classList) {
            ClassUtil.loadClass(cls.getName(), true);
        }
    }
}
