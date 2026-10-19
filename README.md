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
- Testes automatizados executados pelo GitHub Actions

## Tecnologias

- Java 17
- JDK (`javac` e `java`)
- GitHub Actions para integração contínua
- Visual Studio Code ou outra IDE Java

## Estrutura

- `Java-Terminal/src/`: calculadora e exemplos de comentários.
- `sistema-smart-tv/src/`: classes `SmartTv` e `Usuario`.
- `tipos-variaveis/src/`: exemplos de tipos e operadores.
- `tests/SmokeTests.java`: testes automatizados sem dependências externas.
- `.github/workflows/java-ci.yml`: compilação e execução dos testes a cada push ou pull request para `main`.

## Como executar os exemplos

É necessário ter o JDK 17 instalado. Consulte a documentação oficial do [JDK 17](https://docs.oracle.com/en/java/javase/17/).

Na raiz do repositório, compile os exercícios:

```bash
mkdir -p build/classes
javac -encoding UTF-8 -d build/classes Java-Terminal/src/*.java sistema-smart-tv/src/*.java tipos-variaveis/src/*.java
```

Execute a demonstração da Smart TV:

```bash
java -cp build/classes Usuario
```

A classe `Calculadora` contém métodos reutilizáveis e não possui uma interface de terminal própria.

## Executar os testes

Compile os exercícios e a classe de testes:

```bash
mkdir -p build/classes
javac -encoding UTF-8 -d build/classes Java-Terminal/src/*.java sistema-smart-tv/src/*.java tipos-variaveis/src/*.java tests/SmokeTests.java
java -cp build/classes SmokeTests
```

Os testes verificam a soma de números, o estado inicial da Smart TV, as operações de canal e volume e os limites inválidos. O GitHub Actions executa a mesma suíte automaticamente.

## Boas práticas demonstradas

- Estado interno da Smart TV encapsulado em atributos privados.
- Métodos de leitura explícitos (`getCanal`, `getVolume` e `isLigada`).
- Validação de canal e limites de volume entre 0 e 100.
- Testes para comportamentos normais e situações inválidas.

## Próximas melhorias

- Adicionar testes unitários com JUnit quando a estrutura de build estiver preparada.
- Separar os exercícios em projetos independentes com Maven ou Gradle conforme a trilha evoluir.
- Ampliar exemplos de operadores, tipos primitivos e tratamento de exceções.

## Autor

Márcio Martins  
[LinkedIn](https://www.linkedin.com/in/marcio-martins-eufrazio/) · [Perfil GitHub](https://github.com/Marcio-Martins)
