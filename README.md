## Java Spring Boot

## エンドポイント

```
show columns from todo;
```

新規登録
```
curl -X POST http://localhost:8080/api/create -H 'Content-Type: application/json' -d '{"name":"tomoki"}'
```

全て取得
```
curl http://localhost:8080/api/todos
```

### DDD + オニオンアーキテクチャ