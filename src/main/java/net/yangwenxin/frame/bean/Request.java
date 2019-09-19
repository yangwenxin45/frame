package net.yangwenxin.frame.bean;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

/**
 * 封装请求信息
 *
 * @author yangwenxin
 * @Date 2019-9-19 14:30
 */
@AllArgsConstructor
@Getter
@EqualsAndHashCode
public class Request {

    /**
     * 请求方法
     *
     * @author yangwenxin
     * @Date 2019-9-19 14:32
     */
    private String requestMethod;

    /**
     * 请求路径
     *
     * @author yangwenxin
     * @Date 2019-9-19 14:33
     */
    private String requestPath;


}
