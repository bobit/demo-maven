package com.demo.lombok;

import lombok.extern.slf4j.Slf4j;

/**
 * Controller
 *
 * @Author: zhangb
 * @Date: 2017/12/19 23:27
 */

@Slf4j
public class LogExampleOther {

    public static void main(String... args) {
        log.error("Something else is wrong here");
    }
}
