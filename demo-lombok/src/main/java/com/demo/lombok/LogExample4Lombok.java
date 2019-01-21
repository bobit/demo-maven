package com.demo.lombok;

import lombok.extern.java.Log;

/**
 * 在任意类上添加此注解，Lombok会生成一个final的基于此类的logger实例，实例对象的名称为log。有以下几种可选实现类：
 * - @CommonsLog
 * - private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(LogExample.class);
 * - @Flogger
 * - private static final com.google.common.flogger.FluentLogger log = com.google.common.flogger.FluentLogger.forEnclosingClass();
 * - @JBossLog
 * - private static final org.jboss.logging.Logger log = org.jboss.logging.Logger.getLogger(LogExample.class);
 * - @Log
 * - private static final java.util.logging.Logger log = java.util.logging.Logger.getLogger(LogExample.class.getName());
 * - @Log4j
 * - private static final org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(LogExample.class);
 * - @Log4j2
 * - private static final org.apache.logging.log4j.Logger log = org.apache.logging.log4j.LogManager.getLogger(LogExample.class);
 * - @Slf4j
 * - private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(LogExample.class);
 * - @XSlf4j
 * - private static final org.slf4j.ext.XLogger log = org.slf4j.ext.XLoggerFactory.getXLogger(LogExample.class);
 *
 * @Author: zhangb
 * @Date: 2017/12/19 23:24
 */
@Log
public class LogExample4Lombok {

    public static void main(String... args) {
//        log.error("Something else is wrong here");
    }
}



