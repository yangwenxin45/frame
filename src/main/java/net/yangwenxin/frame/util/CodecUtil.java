package net.yangwenxin.frame.util;

import lombok.extern.slf4j.Slf4j;

import java.net.URLDecoder;
import java.net.URLEncoder;

/**
 * 编码与解码操作工具类
 *
 * @author yangwenxin
 * @Date 2019-9-19 16:11
 */
@Slf4j
public final class CodecUtil {

    /**
     * 将URL编码
     *
     * @author yangwenxin
     * @Date 2019-9-19 16:12
     */
    public static String encodeURL(String source) {
        String target;
        try {
            target = URLEncoder.encode(source, "UTF-8");
        } catch (Exception e) {
            log.error("encode url failure", e);
            throw new RuntimeException(e);
        }
        return target;
    }

    /**
     * 将URL解码
     *
     * @author yangwenxin
     * @Date 2019-9-19 16:14
     */
    public static String decodeURL(String source) {
        String target;
        try {
            target = URLDecoder.decode(source, "UTF-8");
        } catch (Exception e) {
            log.error("decode url failure", e);
            throw new RuntimeException(e);
        }
        return target;
    }
}
