package net.yangwenxin.frame.bean;

import net.yangwenxin.frame.util.CastUtil;

import java.util.Map;

/**
 * 请求参数对象
 *
 * @author yangwenxin
 * @Date 2019-9-19 15:25
 */
public class Param {

    private Map<String, Object> paramMap;

    public Param(Map<String, Object> paramMap) {
        this.paramMap = paramMap;
    }

    /**
     * 根据参数名获取long型参数值
     *
     * @author yangwenxin
     * @Date 2019-9-19 15:28
     */
    public long getLong(String name) {
        return CastUtil.castLong(paramMap.get(name));
    }

    /**
     * 获取所有字段信息
     *
     * @author yangwenxin
     * @Date 2019-9-19 15:29
     */
    public Map<String, Object> getMap() {
        return paramMap;
    }
}
