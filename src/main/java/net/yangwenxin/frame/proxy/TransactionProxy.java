package net.yangwenxin.frame.proxy;

import lombok.extern.slf4j.Slf4j;
import net.yangwenxin.frame.annotation.Transaction;
import net.yangwenxin.frame.helper.DatabaseHelper;

import java.lang.reflect.Method;

/**
 * 事务代理
 */
@Slf4j
public class TransactionProxy implements Proxy {

    private static final ThreadLocal<Boolean> FLAG_HOLDER = new ThreadLocal<Boolean>() {
        @Override
        protected Boolean initialValue() {
            return false;
        }
    };

    @Override
    public Object doProxy(ProxyChain proxyChain) throws Throwable {
        Object result = null;
        boolean flag = FLAG_HOLDER.get();
        Method method = proxyChain.getTargetMethod();
        if (!flag && method.isAnnotationPresent(Transaction.class)) {
            FLAG_HOLDER.set(true);
            try {
                DatabaseHelper.beginTransaction();
                log.debug("begin transaction");
                result = proxyChain.doProxyChain();
                DatabaseHelper.commitTransaction();
                log.debug("commit transaction");
            } catch (Exception e) {
                DatabaseHelper.rollbackTransaction();
                log.debug("rollback transaction");
                throw e;
            } finally {
                result = proxyChain.doProxyChain();
            }
        }
        return result;
    }
}
