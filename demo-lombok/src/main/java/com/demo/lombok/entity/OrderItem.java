package com.demo.lombok.entity;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 实体类使用lombok
 *
 * @Author: zhangb
 * @Date: 2018/1/2 10:15
 */
@Data
public class OrderItem implements Serializable {

    private Long id;
    private Integer num;
    private BigDecimal unitPrice;
    private BigDecimal paymentPrice;
    private Long orderId;

}
