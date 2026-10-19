# Trilha Java Básico

Repositório de exercícios e pequenos projetos desenvolvidos durante meus estudos de fundamentos da linguagem Java.

[![Java CI](https://github.com/Marcio-Martins/dio-trilha-java-basico/actions/workflows/java-ci.yml/badge.svg)](https://github.com/Marcio-Martins/dio-trilha-java-basico/actions/workflows/java-ci.yml)

## Objetivo

Praticar fundamentos da linguagem Java com exemplos executáveis, organização por pacotes e módulos Maven, validação de estado e testes automatizados.

## Conteúdos

- Tipos de variáveis e operadores
- Comentários e documentação JavaDoc
- Calculadora simples
- Simulação de Smart TV com controle de canal, volume e energia
- Pacotes Java nomeados
- Testes unitários JUnit 5
- Integração contínua com GitHub Actions

## Tecnologias

- Java 17
- Maven multi-módulo
- JUnit 5
- GitHub Actions

## Estrutura

- `Java-Terminal/`: exemplos de calculadora e comentários/operações.
- `sistema-smart-tv/`: classes `SmartTv` e `Usuario`.
- `tipos-variaveis/`: exemplos de tipos, conversões e operadores.
- `tests-integration/`: testes automatizados que verificam os exemplos dos módulos.
- `pom.xml`: projeto Maven agregador, versões e configuração compartilhada.
- `.github/workflows/java-ci.yml`: compilação e testes automáticos.

Cada pasta de exercício tem seu próprio `pom.xml`. O módulo `tests-integration` depende dos módulos de exercícios, permitindo validar o conjunto sem misturar os testes com o código de demonstração.

## Pacotes Java

- `br.com.marciomartins.calculadora`: classe `Calculadora`.
- `br.com.marciomartins.smarttv`: classes `SmartTv` e `Usuario`.
- `br.com.marciomartins.terminal`: classe `Comentarios`.
- `br.com.marciomartins.fundamentos`: classes `Operadores` e `TiposVariaveis`.

## Pré-requisitos

- JDK 17
- Maven 3.8 ou superior

Confira as instalações:

```bash
java -version
mvn -version
```

## Compilar e executar os testes

Na raiz do repositório, execute:

```bash
mvn clean verify
```

O Maven compila todos os módulos na ordem correta e executa os testes JUnit. Os relatórios são gerados em cada módulo, em `target/surefire-reports/`.

Para executar um módulo específico e suas dependências, use, por exemplo:

```bash
mvn -pl tests-integration -am test
```

## Executar exemplos

Após compilar os módulos, execute as classes que possuem ponto de entrada `main` usando o classpath do módulo correspondente. Exemplos:

```bash
java -cp sistema-smart-tv/target/classes br.com.marciomartins.smarttv.Usuario
java -cp tipos-variaveis/target/classes br.com.marciomartins.fundamentos.TiposVariaveis
java -cp tipos-variaveis/target/classes br.com.marciomartins.fundamentos.Operadores
```

A classe `Calculadora` não contém `main`; use-a por meio dos testes ou de uma classe chamadora.

## Boas práticas demonstradas

- Encapsulamento e validação de estado.
- Pacotes Java nomeados.
- Separação entre módulos de exercícios e testes.
- Configuração Maven centralizada.
- Comparação segura de strings com `equals`.
- Testes de casos comuns, limites e valores nulos.
- Integração contínua para detectar regressões.

## Autor

Márcio Martins  
[LinkedIn](https://www.linkedin.com/in/marciomartins-eufrazio/) · [Perfil GitHub](https://github.com/Marcio-Martins)
