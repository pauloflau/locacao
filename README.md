# 🏠 Projeto - Gestão de Locações

O sistema é um **projeto de estudo** desenvolvido para praticar o desenvolvimento de aplicações utilizando **Java, Spring Boot e Angular**, tendo como ponto de partida a modelagem de um banco de dados e a implementação gradual das funcionalidades.

O objetivo é construir um sistema para gerenciamento de **imóveis, unidades, inquilinos, contratos de locação, reservas, cobranças e pagamentos**, aplicando os conhecimentos adquiridos durante os estudos.

O projeto será desenvolvido por etapas, começando pelos conceitos básicos e evoluindo para funcionalidades mais avançadas, como autenticação, autorização e segurança.

Durante o desenvolvimento serão aplicados:

- Desenvolvimento de APIs REST com **Spring Boot**
- Mapeamento objeto-relacional (ORM) com **JPA / Hibernate**
- Boas práticas de organização em camadas de **Controller, Service e Repository**
- Tratamento de **relacionamentos entre entidades**
- Validação de dados e implementação de regras de negócio
- Gerenciamento de contratos, reservas e locações
- Controle de cobranças, pagamentos e saldos
- Tratamento de exceções e respostas HTTP
- Implementação de autenticação e autorização com **Spring Security**
- Integração entre backend e frontend utilizando **Angular**
- Containerização da aplicação utilizando **Docker**

---

## 🚀 Tecnologias para Implementação

- **Backend:** Java + Spring Boot
- **Frontend:** Angular + TypeScript
- **Banco de Dados:** PostgreSQL / MySQL
- **Persistência:** Spring Data JPA / Hibernate
- **Segurança:** Spring Security + JWT (etapa futura)
- **Validação:** Bean Validation
- **Ferramenta de Build:** Maven
- **Containerização:** Docker
- **Versionamento:** Git / GitHub

---

## 📑 Entidades do Sistema

#### 🔹 IMOVEL

#### 🔹 UNIDADE

#### 🔹 INQUILINO

#### 🔹 LOCACAO

#### 🔹 RESERVA

#### 🔹 COBRANCA

#### 🔹 PAGAMENTO

#### 🔹 HISTORICO

#### 🔹 USUARIO

As entidades serão implementadas gradualmente conforme a evolução do projeto.

---

## 🔗 Relacionamentos

- **Imóvel ↔ Unidade** → Um imóvel pode possuir várias unidades (1)
- **Unidade ↔ Locação** → Uma unidade pode possuir várias locações ao longo do tempo (1)
- **Inquilino ↔ Locação** → Um inquilino pode possuir várias locações (1)
- **Unidade ↔ Reserva** → Uma unidade pode possuir várias reservas (1)
- **Locação ↔ Cobrança** → Uma locação pode gerar várias cobranças (1)
- **Cobrança ↔ Pagamento** → Uma cobrança pode receber vários pagamentos (1)

Os relacionamentos serão ajustados conforme as regras de negócio forem implementadas.

---

## 📋 Regras de Negócio

O sistema terá regras para garantir a integridade dos dados e evitar conflitos durante o gerenciamento das locações.

### 🏠 Locações

- Cadastrar imóveis e suas respectivas unidades.
- Registrar os inquilinos.
- Criar e gerenciar contratos de locação.
- Manter o histórico de locações.
- Impedir locações conflitantes para a mesma unidade no mesmo período.

### 📅 Reservas

- Registrar reservas de unidades.
- Controlar os períodos reservados.
- Evitar conflitos entre reservas e locações.
- Validar a disponibilidade da unidade antes de confirmar uma reserva.

### 💰 Cobranças e Pagamentos

- Registrar cobranças vinculadas às locações.
- Permitir pagamentos parciais.
- Controlar os valores pagos e os saldos pendentes.
- Manter o histórico dos pagamentos.
- Permitir observações relacionadas às cobranças e aos pagamentos.
- Controlar situações de inadimplência e dívidas incobráveis.

### 🔐 Segurança (Implementação Futura)

- Autenticação de usuários com Spring Security.
- Autorização de acesso aos endpoints.
- Controle de permissões por perfil de usuário.
- Autenticação baseada em tokens JWT.
- Proteção das operações administrativas.

---

## 🛠️ Etapas de Desenvolvimento

### 🔹 Etapa 1 - Modelagem e Estrutura Inicial

- ✅ Criar o projeto Spring Boot.
- ✅ Organizar os pacotes da aplicação.
- ✅ Criar as entidades JPA.
- ⬜ Implementar os relacionamentos entre entidades.
- ⬜ Configurar o banco de dados.
- ⬜ Criar os repositórios com Spring Data JPA.

### 🔹 Etapa 2 - Desenvolvimento das APIs REST

- ⬜ Criar os Controllers.
- ⬜ Criar as classes de Service.
- ⬜ Implementar operações CRUD.
- ⬜ Utilizar DTOs para entrada e saída de dados.
- ⬜ Implementar validações.
- ⬜ Implementar tratamento de exceções.

### 🔹 Etapa 3 - Regras de Negócio

- ⬜ Implementar o gerenciamento de locações.
- ⬜ Implementar o gerenciamento de reservas.
- ⬜ Validar conflitos de períodos.
- ⬜ Implementar cobranças e pagamentos.
- ⬜ Controlar saldos pendentes.
- ⬜ Implementar o histórico das operações.

### 🔹 Etapa 4 - Segurança

- ⬜ Configurar o Spring Security.
- ⬜ Implementar autenticação de usuários.
- ⬜ Implementar JWT.
- ⬜ Criar perfis e permissões.
- ⬜ Proteger os endpoints da API.

### 🔹 Etapa 5 - Frontend com Angular

- ⬜ Criar o projeto Angular.
- ⬜ Organizar componentes e serviços.
- ⬜ Integrar o Angular com a API REST.
- ⬜ Criar telas de cadastro e consulta.
- ⬜ Implementar telas de locações e reservas.
- ⬜ Implementar telas de cobranças e pagamentos.
- ⬜ Criar a interface de login.
- ⬜ Implementar controle de acesso no frontend.

### 🔹 Etapa 6 - Docker e Melhorias

- ⬜ Criar o Dockerfile.
- ⬜ Configurar o Docker Compose.
- ⬜ Containerizar o backend e o banco de dados.
- ⬜ Implementar testes automatizados.
- ⬜ Documentar a API com Swagger / OpenAPI.

---

## 🎯 Objetivo do Projeto

Este projeto tem finalidade **educacional**, permitindo colocar em prática conceitos de desenvolvimento backend e frontend por meio de um sistema com regras de negócio reais.

A proposta é evoluir a aplicação gradualmente, começando pela modelagem das entidades e pelas operações básicas, até chegar a uma aplicação completa com segurança, validações, controle financeiro e interface web.

---

## ✍️ Contato

Caso queira trocar ideias ou sugerir melhorias:

**Paulo Flau**

- 💼 [LinkedIn](https://www.linkedin.com/in/pauloflau/)

---


