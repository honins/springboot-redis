# 基于springboot2.2，使用redisTemplate操作redis的实例项目。

### 本地需安装redis server，端口为6379，配置密码为123456
### 可使用idea自带的http client测试，测试文件：
rest-api.http
```
GET http://localhost:8080/redis/set?key=user&value=99
Accept: application/json

<> 2020-04-07T013141.200.json
<> 2020-04-07T011547.200.json
<> 2020-04-07T011339.200.json

###
GET http://localhost:8080/redis/get?key=user
Accept: application/json

<> 2020-04-07T013152.200.json
<> 2020-04-07T010057.200.json

###
GET http://localhost:8080/redis/expire?key=user
Accept: application/json

<> 2020-04-07T010537.200.json
<> 2020-04-07T010525.400.json

###
```
### 使用Redis Desktop Manager 查看

