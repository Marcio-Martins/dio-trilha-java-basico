# Trilha Java Básico

Repositório de exercícios e pequenos projetos desenvolvidos durante meus estudos de fundamentos da linguagem Java.

[![Java CI](https://github.com/Marcio-Martins/dio-trilha-java-basico/actions/workflows/java-ci.yml/badge.svg)](https://github.com/Marcio-Martins/dio-trilha-java-basico/actions/workflows/java-ci.yml)

## Objetivo

Praticar fundamentos da linguagem Java com exemplos executáveis, organização de classes, encapsulamento, validação de estado e testes automatizados.

## Conteúdos

- Tipos de variáveis e operadores
- Comentários e documentação JavaDoc
- Calculadora simples
- Simulação de Smart TV com controle de canal, volume e energia
- Pacotes Java nomeados
- Testes unitários com JUnit 5 e testes de fumaça
- Integração contínua com GitHub Actions

## Tecnologias

- Java 17
- Maven
- JUnit 5
- GitHub Actions

## Estrutura

- `Java-Terminal/src/`: calculadora e exemplo de comentários/operações.
- `sistema-smart-tv/src/`: classes `SmartTv` e `Usuario`.
- `tipos-variaveis/src/`: exemplos de tipos e operadores.
- `src/test/java/`: testes unitários JUnit 5.
- `tests/SmokeTests.java`: testes de regressão independentes de frameworks.
- `pom.xml`: configuração Maven e dependência JUnit.
- `.github/workflows/java-ci.yml`: compilação e testes automáticos.

## Pacotes Java

- `br.com.marciomartins.calculadora`: classe `Calculadora`.
- `br.com.marciomartins.smarttv`: classes `SmartTv` e `Usuario`.
- `br.com.marciomartins.terminal`: classe `Comentarios`.
- `br.com.marciomartins.fundamentos`: classes `Operadores` e `TiposVariaveis`.

Os arquivos continuam organizados pelas pastas dos exercícios da trilha, enquanto os pacotes evitam colisões de nomes e deixam explícita a finalidade das classes.

## Pré-requisitos

- JDK 17
- Maven 3.8 ou superior

Confira as instalações:

```bash
java -version
mvn -version
```

## Executar os exemplos

Na raiz do repositório, compile todos os exercícios:

```bash
mkdir -p build/classes
javac -encoding UTF-8 -d build/classes Java-Terminal/src/*.java sistema-smart-tv/src/*.java tipos-variaveis/src/*.java
```

Execute a demonstração da Smart TV:

```bash
java -cp build/classes br.com.marciomartins.smarttv.Usuario
```

Execute os exemplos de fundamentos:

```bash
java -cp build/classes br.com.marciomartins.fundamentos.TiposVariaveis
java -cp build/classes br.com.marciomartins.fundamentos.Operadores
```

## Executar os testes

Testes unitários JUnit:

```bash
mvn test
```

Os relatórios são gerados em `target/surefire-reports/`. A suíte verifica operações da calculadora, estado e limites da Smart TV.

Testes de fumaça:

```bash
mkdir -p build/classes
javac -encoding UTF-8 -d build/classes Java-Terminal/src/*.java sistema-smart-tv/src/*.java tipos-variaveis/src/*.java tests/SmokeTests.java
java -cp build/classes SmokeTests
```

O GitHub Actions executa ambos os conjuntos de testes em cada push ou pull request para `main`.

## Boas práticas demonstradas

- Encapsulamento e validação de estado.
- Pacotes Java nomeados.
- Documentação JavaDoc e nomes descritivos.
- Comparação segura de strings com `equals`.
- Testes de casos comuns, limites e valores nulos.
- Integração contínua para detectar regressões.

## Próximas melhorias

- Separar os exercícios em módulos Maven independentes se o repositório crescer.
- Expandir a cobertura dos exemplos conforme novos conteúdos forem adicionados.

## Autor

Márcio Martins  
[LinkedIn](https://www.linkedin.com/in/marciomartins-eufrazio/) · [Perfil GitHub](https://github.com/Marcio-Martins)