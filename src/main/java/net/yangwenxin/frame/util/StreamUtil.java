package net.yangwenxin.frame.util;

import lombok.extern.slf4j.Slf4j;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * 流操作工具类
 *
 * @author yangwenxin
 * @Date 2019-9-19 16:06
 */
@Slf4j
public final class StreamUtil {

    /**
     * 从输入流中获取字符串
     *
     * @author yangwenxin
     * @Date 2019-9-19 16:08
     */
    public static String getString(InputStream is) {
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(is));
            String line;
            while ((line = reader.readLine()) != null) {
                sb.append(line);
            }
        } catch (Exception e) {
            log.error("get string failure", e);
            throw new RuntimeException(e);
        }
        return sb.toString();
    }
}
