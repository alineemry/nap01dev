# 📦 API REST - Produtos (NAP1 - Desenvolvimento Web)

**Maria Aline Cunha Ribeiro**  
- Curso: Sistemas de Informação - UFRA  
- Disciplina: Desenvolvimento Web - NAP1 - 2025
- Disciplina ofertada por Jose Augusto De Sena Quaresma

---

## Tecnologias Utilizadas

- Java 17  
- Spring Boot 3.5.0  
- Spring Data JPA  
- PostgreSQL (via Docker)  
- Docker  
- Maven  

---

## Estrutura do Projeto

- `Produto.java`: entidade com os atributos `id`, `nome`, `descricao`, `preco` e `quantidade`  
- `ProdutoRepository.java`: interface de acesso ao banco de dados  
- `ProdutoController.java`: controlador com endpoints REST (GET, POST, PUT, DELETE)  

---

## Como Executar o Projeto

### 1. Clonar o repositório

git clone https://github.com/alineemry/nap01dev.git
cd nap01dev

### 2. Criar o banco de dados PostgreSQL via Docker
Execute o seguinte comando no terminal:

<pre> docker run --name nap01dev -e POSTGRES_DB=produto_db -e POSTGRES_USER=aula -e POSTGRES_PASSWORD=senha -p 5428:5432 -d postgres </pre>

Obs: Isso criará um container PostgreSQL com o banco produto_db na porta 5428.

### 3. Rodar o projeto no Eclipse ou VS Code
   
Importe o projeto como Maven

Certifique-se de que o application.properties está assim:

**properties**
<pre>
spring.datasource.url=jdbc:postgresql://localhost:5428/produto_db
spring.datasource.username=aula
spring.datasource.password=senha
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
</pre>

Execute o projeto principal "nap01dev" como *Spring Boot App*

**Endpoints da API**
| Verbo  | Endpoint       | Funcionalidade                |
| ------ | -------------- | ----------------------------- |
| GET    | /produtos      | Lista todos os produtos       |
| GET    | /produtos/{id} | Busca um produto por ID       |
| POST   | /produtos      | Cadastra um novo produto      |
| PUT    | /produtos      | Atualiza um produto existente |
| DELETE | /produtos/{id} | Deleta um produto por ID      |

**Testes**
Os endpoints podem ser testados utilizando:
- Thunder Client (extensão para Visual Studio Code);
- Postman.

Ou qualquer outro cliente HTTP

### Link para o vídeo da API funcionando:
https://www.youtube.com/watch?v=qd_ACdz7jwI
