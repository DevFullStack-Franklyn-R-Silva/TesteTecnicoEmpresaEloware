# Teste Técnico da Empresa Eloware

## API de Gerenciamento de Pessoas e Endereços

Este projeto contém uma API RESTful para gerenciamento de pessoas e endereços utilizando Java com Spring Boot e banco de dados MySQL.

## Configuração do Ambiente

1. Clone o repositório para a sua máquina local.
2. Importe o projeto na sua IDE favorita (como IntelliJ IDEA, Eclipse, etc.).
3. Certifique-se de ter o MySQL instalado e configurado.
4. Altere as configurações do banco de dados no arquivo `application.properties` com suas credenciais.

## Execução da Aplicação

1. Inicie o servidor Spring Boot.
2. O banco de dados será criado automaticamente com as tabelas necessárias.

## Endpoints da API

### Pessoa

#### Consultar Pessoa
- **URL:** `GET http://localhost:8080/api/pessoas/{id}`
- **Body (JSON):**
```json
{
  "nomeCompleto": "João da Silva2",
  "dataNascimento": "1990-05-15",
  "enderecos": [
    {
      "logradouro": "Rua A",
      "cep": "12345-678",
      "numero": "100",
      "cidade": "São Paulo",
      "estado": "SP"
    },
    {
      "logradouro": "Rua B",
      "cep": "54321-987",
      "numero": "200",
      "cidade": "Rio de Janeiro",
      "estado": "RJ"
    }
  ]
}
```

#### Consultar TODAS Pessoas
- **URL:** `GET http://localhost:8080/api/pessoas/consultar-todas`
- **Body (JSON):**
```json
{
    {
        "id": 1,
        "nomeCompleto": "João da Silva",
        "dataNascimento": "1990-05-15",
        "enderecos": [
            {
                "id": 1,
                "logradouro": "Rua A",
                "cep": "12345-678",
                "numero": "100",
                "cidade": "São Paulo",
                "estado": "SP"
            },
            {
                "id": 2,
                "logradouro": "Rua B",
                "cep": "54321-987",
                "numero": "200",
                "cidade": "Rio de Janeiro",
                "estado": "RJ"
            }
        ]
    },
    {
        "id": 2,
        "nomeCompleto": "João da Silva",
        "dataNascimento": "1990-05-15",
        "enderecos": [
            {
                "id": 3,
                "logradouro": "Rua A",
                "cep": "12345-678",
                "numero": "100",
                "cidade": "São Paulo",
                "estado": "SP"
            },
            {
                "id": 4,
                "logradouro": "Rua B",
                "cep": "54321-987",
                "numero": "200",
                "cidade": "Rio de Janeiro",
                "estado": "RJ"
            }
        ]
    }
}
```

#### Criar Pessoa
- **URL:** `POST http://localhost:8080/api/pessoas/criar`
- **Body (JSON):**
```json
{
  "nomeCompleto": "João da Silva",
  "dataNascimento": "1990-05-15",
  "enderecos": [
    {
      "logradouro": "Rua A",
      "cep": "12345-678",
      "numero": "100",
      "cidade": "São Paulo",
      "estado": "SP"
    },
    {
      "logradouro": "Rua B",
      "cep": "54321-987",
      "numero": "200",
      "cidade": "Rio de Janeiro",
      "estado": "RJ"
    }
  ]
}
```

#### Editar Pessoa
- **URL:** `PUT http://localhost:8080/api/pessoas/editar/{id}`
- **Body (JSON):**
```json
{
  "nomeCompleto": "João da Silva2",
  "dataNascimento": "1990-05-15",
  "enderecos": [
    {
      "logradouro": "Rua A",
      "cep": "12345-678",
      "numero": "100",
      "cidade": "São Paulo",
      "estado": "SP"
    },
    {
      "logradouro": "Rua B",
      "cep": "54321-987",
      "numero": "200",
      "cidade": "Rio de Janeiro",
      "estado": "RJ"
    }
  ]
}
```

#### Deletar Pessoa
- **URL:** `DELETE http://localhost:8080/api/pessoas/deletar/{id}`
- **Body (JSON):**
```json
{
  "nomeCompleto": "João da Silva2",
  "dataNascimento": "1990-05-15",
  "enderecos": [
    {
      "logradouro": "Rua A",
      "cep": "12345-678",
      "numero": "100",
      "cidade": "São Paulo",
      "estado": "SP"
    },
    {
      "logradouro": "Rua B",
      "cep": "54321-987",
      "numero": "200",
      "cidade": "Rio de Janeiro",
      "estado": "RJ"
    }
  ]
}
```
