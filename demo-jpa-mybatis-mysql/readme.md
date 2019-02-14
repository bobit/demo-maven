# mybatis-generator自动生成mapper、dao、entity

## mybatis-generator有三种用法
命令行、eclipse插件、maven插件。
个人觉得maven插件最方便，可以在eclipse/intellij idea等ide上可以通用。
### cmd命令行生成相应文件
通过命令行运行
1、执行命令（generatorConfig.xml为配置文件）
java -jar mybatis-generator-core-1.3.5.jar -configfile generatorConfig.xml -overwrite
2、建议在mybatis-generator-core-1.3.5.jar所在文件夹下新建一个xxx.bat文件，里面放入上面的命令，就可以方便自动生成
完成上述操作后，执行xxx.bat文件即可在对应文件夹中生成三个文件，xxxmapper.xml，xxxmapper.java，xxx.java
注意：请务必保证要生成的路径已经存在，否则会执行失败
3、一个完整的xxx.bat执行文件
@echo off
java -jar mybatis-generator-core-1.3.5.jar -configfile generatorConfig.xml -overwrite
pause

### eclipse插件、maven插件
mvn mybatis-generator:generate
如果是在intellij 环境，直接鼠标点击即可

## 所需环境
### mybatis-generator所需的jar包
mybatis-generator-core-1.3.5.jar
mybatis-generator下载地址：https://github.com/mybatis/generator/releases
### 数据库连接jar包
oracle的驱动：ojdbc6.jar
mysql驱动：mysql-connector-java-8.0.13.jar
postgre驱动：postgresql-9.3-1102.jdbc4.jar


## Mybatis-Generator配置文件详解
### 配置步骤
1. 引入mybatis-generator的jar包和数据库驱动jar包
2. 配置mybatis-generator的配置文件
2.1. 指定数据库驱动jar包的位置和数据库连接配置
2.2. 配置实体类生成器（javaModelGenerator），可以通过配置rootClass属性为实体类指定继承的父类
2.3. 配置SQL映射文件生成器（sqlMapGenerator）
2.4. 配置dao层接口生成器（javaClientGenerator）
3. 使用命令行执行mybatis-generator即可生成

## 问题列表
### springboot操作数据库时找不到findOne方法
使用springboot写crud时，发现JpaRepository没有findOne传Integer参数的方法
通过查阅资料发现这是因为springboot版本的原因
在springboot1.x的时候是有findOne(Integer id)的，但是到2.x后就没有了
这里有如下解决方案：

1. 使用findById(Integer id).get()，但这里需要注意的是，如果存在会直接返回需要查找的信息，如果不存在就会报异常，所以在使用的时候需要做一下判断：findById(id).isPresent()
2. 使用findById(Integer id).orElse(null)，这里表示，如果id存在则返回需要查找的信息，如果不存在，这里设置为返回null（推荐）
3. 也可以更换springboot的版本，使用1.x的版本就不存在这个问题了

### Spring Data JPA--JpaRepository和JpaSpecificationExecutor的结合使用


### springboot No Identifier specified for entity
@Id，指定主键id



## 一些要点：
a) 因为生成过程中需要连接db，generatorConfig.xml指定了驱动jar包的位置
b) generatorConfig.xml指定生成“entity实体类、mybatis映射xml文件、mapper接口”的具体位置
c) 建表时，字段名称建议用"_"分隔多个单词，比如:AWB_NO、REC_ID...，这样生成的entity，属性名称就会变成漂亮的驼峰命名，即：awbNo、recId
d)oracle中，数值形的字段，如果指定精度，比如Number(12,2)，默认生成entity属性是BigDecimal型 ，如果不指定精度，比如:Number(9)，指默认生成的是Long型
e)oracle中的nvarchar/nvarchar2，mybatis-generator会识别成Object型，建议不要用nvarchar2，改用varchar2


## 参考
https://blog.csdn.net/qq_33764491/article/details/78875181
https://blog.csdn.net/u012661010/article/details/76408566
