package com.demo.lombok;

import lombok.SneakyThrows;

import java.io.UnsupportedEncodingException;
import java.nio.charset.UnsupportedCharsetException;

/**
 * 自动抛受检异常，而无需显式在方法上使用throws语句
 * 我们知道，java对于检查异常，需要在编码时进行捕获，或者throws抛出。
 * 该注解的作用是将检查异常包装为运行时异常，那么编码时就无需处理异常了。
 * 提示：不过这并不是友好的编码方式，因为你编写的api的使用者，不能显式的获知需要处理检查异常。
 *
 * @Author: zhangb
 * @Date: 2019/1/2 12:12
 */
public class SneakyThrowsExample4Lombok implements Runnable {

    @SneakyThrows(UnsupportedEncodingException.class)
    public String utf8ToString(byte[] bytes) {
        return new String(bytes, "UTF-8");
    }

    @SneakyThrows
    public void run() {
        throw new Throwable();
    }
}
