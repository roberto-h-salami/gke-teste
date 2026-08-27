# Microservice GKE Test Roberto

Aplicação Spring Boot 3 em Kotlin criada para teste de deploy no Google Kubernetes Engine (GKE) via Harness (Java 21).

## Endpoint

- `GET /teste` -> Retorna `"Teste GKE Roberto"`

## Como executar localmente

```bash
# Executar a aplicação
./gradlew bootRun

# Build da aplicação
./gradlew build
```

Acesse em: `http://localhost:8080/teste`
