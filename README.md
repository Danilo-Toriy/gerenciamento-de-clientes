# 🚀 Projeto Spring Boot - Unicesumar

Este repositório contém a implementação de um exercício prático desenvolvido para a disciplina de programação avançada do curso de **Engenharia de Software - 5° Semestre**, da **Unicesumar**. O Projeto foca no desenvolvimento de uma API RESTFUL simples que utilize o Java com o uso do framework de SpringBoot.

---

## 📌 Sumário
1. [Sobre o Projeto](#sobre-o-projeto)
2. [Enunciado do Exercício](#enunciado-do-exercício)
3. [Especificações Técnicas](#especificações-técnicas)
    - [Tabela de Atributos](#tabela-de-atributos)
    - [Requisitos](#requisitos)
    - [Regras de Negócio](#regras-de-negócio)
4. [Tecnologias Utilizadas](#tecnologias-utilizadas)
5. [Referências](#referências)
6. [Autor](#autor)

---

## <a name="sobre-o-projeto"></a> 📖 Sobre o Projeto
Projeto desenvolvido como parte do treinamento prático da disciplina de Programação Avançada, da faculdade Unicesumar. O foco é a estruturação de uma API RESTFUL Simples seguindo as boas práticas de desenvolvimento, organização de commits por módulos e versionamento via Git.

---

## <a name="enunciado-do-exercício"></a> 📝 Enunciado do Exercício
> Crie um serviço RESTful em Spring Boot para gerenciar clientes. O objetivo é praticar
mapeamento JPA e operações CRUD com múltiplos campos de texto

---

## <a name="especificações-técnicas"></a> 🛠️ Especificações Técnicas

### <a name="tabela-de-atributos"></a> 📊 Tabela de Atributos Esperada
| Atributo   | Tipo   | Descrição                                            |
|:-----------|:-------|:-----------------------------------------------------|
| `id`       | Long   | Identificador único (Primary Key) com Auto-Increment |
| `nome`     | String | Nome do Cliente                                      |
| `email`    | String | Email do Cliente                                     
| `telefone` | String | Telefone do Cliente                                  |

### <a name="requisitos"></a> ✅ Requisitos
- Crie uma entidade JPA chamada Cliente com os atributos especificados
- Configure o nome da entidade JPA como Cliente
- Configure o nome da tabela no banco como tb_cliente
- Pelo menos dois atributos devem ter o nome do campo diferente do nome da
  coluna no banco, utilizando @Column(name="...")
- Implemente um repositório Spring Data JPA para a entidade
- Implemente um serviço para realizar as operações de CRUD
- Crie um controlador REST que exponha os seguintes endpoints: GET, GET(By ID), POST, PUT, DELETE

### <a name="regras-de-negócio"></a> 📏 Regras de Negócio
1. **Regra 1:** Não é necessário implementar validação de dados
2. **Regra 2:** Utilize as convenções Java para nomes de métodos, atributos e classes
3. **Regra 3:** Seu código deve estar organizado em pacotes seguindo boas práticas (ex: entity,
   repository, service, controller)

---

## <a name="tecnologias-utilizadas"></a> 💻 Tecnologias Utilizadas
* **Java 17** (LTS)
* **Spring Boot 4.0.4**
* **Spring Data JPA**
* **H2 Database**
* **Maven**
* **Swagger**

---

## <a name="referências"></a> 🔗 Referências
* 📄 [PDF Completo do Exercício](https://github.com/ElielNascimento/lista-exercicios-engenharia/blob/main/Exercicios_CRUD_Spring_Boot.pdf) - Repositório do Professor.

---

## <a name="autor"></a> 👤 Autor
Desenvolvido por **Danilo Riki Toriy**.

* **Curso:** Engenharia de Software - 5° Semestre Turma B
* **RA:** 24170520-2
* **Instituição:** Unicesumar - Maringá/PR
* **Matéria:** Programação Avançada
* **Professor:** Eliel Nascimento

---

* [GitHub Pessoal](https://github.com/Danilo-Toriy)
* [Github Professor](https://github.com/ElielNascimento)