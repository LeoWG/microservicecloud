# microservicecloud

### 微服务（SpringCloud）

----------



#### 项目构成

```
这是用spring全家桶来构成的许多微服务

内容基本涵盖了eureka、zuul、hystrix、ribbon、feign、config等

用ribbon和feign做了负载均衡

做了三个eureka集群,端口分别为7001、7002、7003

包含三个provider和一个consumer

一些config微服务+另一个仓库：microservice-config
```



----



### 项目说明

```
1、SpringBoot+SpringCloud技术相关

2、项目需要自建三个数据库，分别为DB01、DB02、DB03,建表语句会在文末提供。

3、后面由于测试config，又单独在github上开了一个仓库，名字叫microservice-config，如要使用config相关的项目，两个项目需搭配使用，项目中config相关的微服务已经在项目名上做了说明，名字中带有config的就是。

4、项目名称上的数字即是实际的端口号，如有需要的话可以自行修改，不要忘了修改yml里的server port
```



---



## 资料

###### 提供数据库建表语句，三张表唯一的不同就是数据库名称不同，数据用的是mysql

```
drop database if EXISTS cloudDB01;
create database cloudDB01 CHARACTER set utf8;
use cloudDB01;
create table dept
(
	deptno BIGINT NOT null PRIMARY key AUTO_INCREMENT,
	dname varchar(60),
	db_source VARCHAR(60)
);

insert into dept(dname,db_source) values('开发部',DATABASE());
insert into dept(dname,db_source) values('人事部',DATABASE());
insert into dept(dname,db_source) values('财务部',DATABASE());
insert into dept(dname,db_source) values('市场部',DATABASE());
insert into dept(dname,db_source) values('运维部',DATABASE());

select * from dept;
```



---



## 补充

###### 后期如果有内容会继续补充······



###### 














