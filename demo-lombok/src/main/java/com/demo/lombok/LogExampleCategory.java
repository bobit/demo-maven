package com.demo.lombok;

import lombok.extern.apachecommons.CommonsLog;

/**
 * Controller
 *
 * @Author: zhangb
 * @Date: 2017/12/19 23:27
 */
@CommonsLog(topic = "CounterLog")
public class LogExampleCategory {

    public static void main(String... args) {
        log.error("Calling the 'CounterLog' with a message");
    }
}
