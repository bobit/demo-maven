package com.demo.designpattern.decorator;

/**
 * 装饰角色
 * <p>
 * Decorator模式
 * 装饰模式的组成，看完之后就明白了！
 * 1) 抽象构件角色（Component）：定义一个抽象接口，以规范准备接收附加责任的对象。
 * 2) 具体构件角色(Concrete Component)：这是被装饰者，定义一个将要被装饰增加功能的类。
 * 3) 装饰角色(Decorator)：持有一个构件对象的实例，并定义了抽象构件定义的接口。
 * 4) 具体装饰角色(Concrete Decorator)：负责给构件添加增加的功能。
 *
 * @Author: zhangb
 * @Date: 2019/3/8 15:51
 */
public class MessageBoardDecorator implements MessageBoardHandler {
    private MessageBoardHandler handler;

    public MessageBoardDecorator(MessageBoardHandler handler) {
        super();
        this.handler = handler;
    }

    @Override
    public String filter(String msg) {
        return handler.filter(msg);
    }
}
