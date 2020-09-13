# springboot2 template

# 構成
- cache: redis
- database: mybatis

## multi project
Gradleマルチプロジェクト構成

```
root
┗ api // API用Controller層
┗ module 
  ┗ core // ドメインモデル等の置き場
  ┗ demo-persistence  // データベース系
  ┗ web-repository // 外部データソースへのアクセス
  ┗ web-service // サービス層
┗ web // web用controller層
┗ tool // サービス外のローカル環境構築用
  ┗ mysql // mysql-data格納場所
  ┗ docker-compose.yml // ローカル環境のdocker-compose.yml
```


# Cache
- Redis
下記、classにて設定

[RedisConfig.java](./web/src/main/java/net/ksasaki/template/config/RedisConfig.java)

|key|value|
|---|---|
|StringRedisSerializer|GenericJackson2JsonRedisSerializer|


  
### Database
#### Mybatis
下記、コマンドでdocker内のDatabase内のテーブルのmodelを生成する
```
./gradlew module:demo-persistence:mbGenerator
```

下記にmapperとmodelで作成される
```
demo-persistence
┗ java/net/ksasaki/template/demo/persistence/mappergen
┗ java/net/ksasaki/template/demo/persistence/modelgen
```

