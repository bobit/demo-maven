package com.demo.lombok;

import lombok.Cleanup;
import org.junit.Test;

import java.io.*;

/**
 * 该注解使用在属性前，该注解是用来保证分配的资源被释放。在本地变量上使用该注解，任何后续代码都将封装在try/finally中，确保当前作用于中的资源被释放。默认@Cleanup清理的方法为close，可以使用value指定不同的方法名称。
 *
 * @Author: zhangb
 * @Date: 2019/1/2 11:10
 */
public class CleanupExample4Lombok {

    public static void main(String[] args) throws IOException {
        @Cleanup InputStream in = new FileInputStream(args[0]);
        @Cleanup OutputStream out = new FileOutputStream(args[1]);
        byte[] b = new byte[10000];
        while (true) {
            int r = in.read(b);
            if (r == -1) break;
            out.write(b, 0, r);
        }
    }
}
