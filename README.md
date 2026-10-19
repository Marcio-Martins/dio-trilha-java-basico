# Trilha Java Básico

Repositório de exercícios e pequenos projetos desenvolvidos durante meus estudos de fundamentos da linguagem Java.

[![Java CI](https://github.com/Marcio-Martins/dio-trilha-java-basico/actions/workflows/java-ci.yml/badge.svg)](https://github.com/Marcio-Martins/dio-trilha-java-basico/actions/workflows/java-ci.yml)

## Objetivo

Praticar conceitos iniciais de programação, organização de classes, encapsulamento, validação de estado e testes automatizados.

## Conteúdos

- Tipos de variáveis e operadores
- Comentários e documentação JavaDoc
- Calculadora simples executada no terminal
- Simulação de uma Smart TV com controle de canal, volume e energia
- Pacotes Java nomeados
- Testes unitários com JUnit 5 e testes de fumaça
- Integração contínua com GitHub Actions

## Tecnologias

- Java 17
- Maven para dependências e execução dos testes
- JUnit 5 para testes unitários
- GitHub Actions para integração contínua
- Visual Studio Code ou outra IDE Java

## Estrutura

- `Java-Terminal/src/`: calculadora e exemplos de comentários.
- `sistema-smart-tv/src/`: classes `SmartTv` e `Usuario`.
- `tipos-variaveis/src/`: exemplos de tipos e operadores.
- `src/test/java/`: testes unitários JUnit 5.
- `tests/SmokeTests.java`: testes simples de regressão sem dependências externas.
- `pom.xml`: configuração Maven e dependência do JUnit 5.
- `.github/workflows/java-ci.yml`: compila os exercícios e executa os testes em cada push ou pull request para `main`.

## Pacotes Java

As classes reutilizáveis usam pacotes nomeados para evitar colisões de nomes e deixar explícita a organização do código:

- `br.com.marciomartins.calculadora`: classe `Calculadora`.
- `br.com.marciomartins.smarttv`: classes `SmartTv` e `Usuario`.

Os arquivos permanecem nas pastas dos exercícios da trilha para preservar a organização didática original.

## Pré-requisitos

- JDK 17
- Maven 3.8 ou superior

Confira as instalações com:

```bash
java -version
mvn -version
```

## Executar os exemplos

Na raiz do repositório, compile os exercícios:

```bash
mkdir -p build/classes
javac -encoding UTF-8 -d build/classes Java-Terminal/src/*.java sistema-smart-tv/src/*.java tipos-variaveis/src/*.java
```

Execute a demonstração da Smart TV:

```bash
java -cp build/classes br.com.marciomartins.smarttv.Usuario
```

A classe `Calculadora` contém métodos reutilizáveis e não possui uma interface de terminal própria.

## Executar os testes

Execute os testes unitários com Maven:

```bash
mvn test
```

Maven baixa automaticamente as dependências necessárias do JUnit 5 e gera os relatórios em `target/surefire-reports/`.

Os testes cobrem o estado inicial da Smart TV, energia, mudança de canal, limites inválidos, limites de volume e operações da calculadora.

Os testes de fumaça independentes podem ser executados manualmente:

```bash
mkdir -p build/classes
javac -encoding UTF-8 -d build/classes Java-Terminal/src/*.java sistema-smart-tv/src/*.java tipos-variaveis/src/*.java tests/SmokeTests.java
java -cp build/classes SmokeTests
```

O GitHub Actions executa ambos os conjuntos de testes automaticamente.

## Boas práticas demonstradas

- Estado interno da Smart TV encapsulado em atributos privados.
- Métodos de leitura explícitos (`getCanal`, `getVolume` e `isLigada`).
- Validação de canal e limites de volume entre 0 e 100.
- Pacotes Java nomeados para organizar classes reutilizáveis.
- Testes unitários com nomes descritivos e verificações de exceções.
- Integração contínua para detectar regressões antes da integração na branch principal.

## Próximas melhorias

- Migrar gradualmente os demais exercícios para pacotes Java nomeados.
- Separar os exercícios em módulos independentes conforme a trilha evoluir.
- Ampliar exemplos de operadores, tipos primitivos e tratamento de exceções.

## Autor

Márcio Martins  
[LinkedIn](https://www.linkedin.com/in/marciomartins-eufrazio/) · [Perfil GitHub](https://github.com/Marcio-Martins)