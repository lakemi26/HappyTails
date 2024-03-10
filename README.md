# HappyTails
Uma api destinada a um projeto de adoção de animais

## Endpoints

- Pessoas interessadas
    -[Cadastrar](#cadastrar-pessoa)
    -[Obter Informação](#informacao-pessoa)
    -[Editar](#editar-pessoa)
    -[Apagar](#apagar-pessoa)
    
---

### Cadastrar Pessoa

`POST` /pessoas

Cadastra uma nova pessoa interessada.

**Corpo da Requisição**

|campo|tipo|obrigatório|descrição|
|-----|----|-----------|---------|
|nomeCompleto|string|✅|Nome completo da pessoa|
|dataNascimento|string|✅|Data de nascimento da pessoa (formato: YYYY-MM-DD)|
|cpf|long|✅|CPF da pessoa|
|genero|string|❌|Gênero da pessoa|
|endereco|string|✅|Endereço da pessoa|
|numero|int|✅|Número do endereço|
|complemento|string|❌|Complemento do endereço|
|email|string|✅|Endereço de e-mail|
|telefone|long|✅|Número de telefone|

```json
    {   
    "nomeCompleto": "Larissa Akemi",
    "dataNascimento": "1996-12-26",
    "cpf": "123.456.789-00",
    "generoTutor": "Feminino",
    "endereco": "Rua A, 123",
    "numero": "101",
    "complemento": "Ap. 22",
    "email": "lari@gmail.com",
    "telefone": "(11) 98765-4321"
    }
```

**Exemplo de resposta**

```json
    [
    {
        "id": 1,
        "nomeCompleto": "Larissa Akemi",
        "dataNascimento": "1996-12-26",
        "cpf": "123.456.789-00",
        "generoTutor": "Feminino",
        "endereco": "Rua A, 123",
        "numero": "101",
        "complemento": "Ap. 22",
        "email": "lari@gmail.com",
        "telefone": "(11) 98765-4321"
    }
    ]
```

**Código de Status**

| código | descrição|
|--------|----------|
|201|Pessoa cadastrada com sucesso|
|400|Erro de validação - verifique o corpo da requisição|

---

### Obter Informação

`GET`/pessoas{id}

Obter informações de um interessado pelo ID.

**Exemplo de Resposta**

```json
    [
    {
        "id": 1,
        "nomeCompleto": "Larissa Akemi",
        "dataNascimento": "1996-12-26",
        "cpf": "123.456.789-00",
        "generoTutor": "Feminino",
        "endereco": "Rua A, 123",
        "numero": "101",
        "complemento": "Ap. 22",
        "email": "lari@gmail.com",
        "telefone": "(11) 98765-4321"
    }
    ]
```

**Códigos de Status**

| código | descrição|
|--------|----------|
|200|Dados retornados com sucesso|


---
### Editar Pessoa

Atualiza os dados da pessoa interessada com o `id` informado

**Exemplo de Resposta**

```json
    [
    {
        "id": 1,
        "endereco": "Rua A, 123",
        "numero": "101",
        "complemento": "Ap. 22",
        "email": "lari@gmail.com",
        "telefone": "(11) 98765-4321"
    }
    ]

```

**Códigos de Status**

| código | descrição|
|--------|----------|
|200|Pessoa atualizada com sucesso|
|400|A validação falhou - verifique o corpo da requisição|
|404|Id da pessoa não encontrado|

---

### Apagar pessoa

`DELETE` /pessoas/{id}

Apaga os dados da pessoa interessada com o {id} informado.

**Códigos de Status**

| código | descrição|
|--------|----------|
|204|Pessoa apagada com sucesso|
|404|Id da pessoa não encontrado|

---

