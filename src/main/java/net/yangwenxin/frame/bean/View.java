package net.yangwenxin.frame.bean;

import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

/**
 * 返回视图对象
 *
 * @author yangwenxin
 * @Date 2019-9-19 15:30
 */
@Getter
public class View {

    /**
     * 视图路径
     *
     * @author yangwenxin
     * @Date 2019-9-19 15:31
     */
    private String path;

    /**
     * 模型数据
     *
     * @author yangwenxin
     * @Date 2019-9-19 15:31
     */
    private Map<String, Object> model;

    public View(String path) {
        this.path = path;
        model = new HashMap<>();
    }

    public View addModel(String key, Object value) {
        model.put(key, value);
        return this;
    }

}
