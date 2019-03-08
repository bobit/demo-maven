package com.demo.designpattern.decorator;

/**
 * 客户端测试
 * 增加了需求，需要得到留言板上的内容后能够过滤掉HTML标签和政治敏感的字眼，这时候我们该怎么办呢？大家想想，过滤掉HTML标签和政治敏感的字眼这两个功能有先后顺序问题。不同的顺序我们就要做做不同的类来实现。如果类似这样的功能又增加了几个，排列组合起来是很可怕的。那如何是好呢？你要停下来好好思索一下了。
 *
 * @Author: zhangb
 * @Date: 2019/3/8 15:51
 */
public class MessageBoardDecoratorClient {
    public static void main(String[] args) {
        MessageBoardHandler mb = new MessageBoard();
        String content = mb.filter("一定要学好装饰模式！");
        System.out.println(content);

        mb = new HtmlFilter(new SensitiveFilter(new MessageBoard()));
        content = mb.filter("一定要学好装饰模式！");
        System.out.println(content);
    }
}