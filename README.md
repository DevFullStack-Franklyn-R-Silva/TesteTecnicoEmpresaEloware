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

#### Criar Pessoa
- **URL:** `POST http://localhost:8080/api/pessoas`
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