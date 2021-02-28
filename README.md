# treinamento-desafio
## Descrição do Projeto
<p align="center"> Sistema de gerenciamento para eventos de treinamento</p>

![Badge](https://www.linkedin.com/public-profile/settings?trk=d_flagship3_profile_self_view_public_profile)


### Pré-requisitos

Antes de começar, você vai precisar ter instalado em sua máquina as seguintes ferramentas:
 [Node.js](https://nodejs.org/en/) [Postgresql](https://www.postgresql.org/) [Java] (https://www.java.com/pt-BR/)

[Gradle](https://gradle.org/install/)


### 🎲 Rodando Banco de Dados (servidor)

# Inicie o pgadmin e crie 2 banco de dados chamado trei_db e tre_db_test


### 🎲 Rodando o Back End (servidor)

# Abra a pasta backend com a IDE de sua preferência para desenvolvimento Java.

# Vá em backend\src\main\resources\application.properties mude as informações de acesso deacordo com as suas.

# Rode a Classe TreinoApplication.  

# O servidor inciará na porta:300 - acesse <http://localhost:3000>

### 🎲 Rodando o Front End (servidor)

# Acesse a pasta do projeto frontend\treino

# Instale as dependências
npm install -g vue-cli@2.7.0
$ npm install

# Execute a aplicação em modo de desenvolvimento
$ npm run dev

# Acesse <http://localhost:8080>

### Usando o Sistema

# Depois de criar os bancos e inicializar o back end e front end  acesse <http://localhost:8080>.

# A localhost:8080 representa a nossa home antes de utilizala devemos 

cadastrar os participantes do treinamento as Salas e os espaços do café.
Para acessar o cadastro averá uma barra de navegação na parte superior da tela.
para cadastrar Participante vá a nav bar e click em Pessoa.
para cadastra as salas click em sala e para cadastrar os espaços click em espaço.

# Volte para aba Home

Na aba home serão listadas os Objetos cadastrados anteriormente
para iniciar a etapa de treinamento click no botao iniciar etapa
E nesse momento que designamos os participantes paras suas salas
e espaços de café.
Abaixo do botão teremos 3 tabelas Pessoa, Sala e Espaço.
Avera um link que nos permetirá ver os atributos dos mesmos.

### 🛠 Tecnologias

As seguintes ferramentas foram usadas na construção do projeto:

- [Vue](https://br.vuejs.org/)
- [Spring boot](https://spring.io/projects/spring-boot)
- [Postgresql](https://www.postgresql.org/)
- [Gradle](https://gradle.org/install/)
