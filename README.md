# 📚 Repositório de Desenvolvimento de Sistemas - Java

Bem-vindo ao meu repositório de estudos em Java ☕

Este projeto reúne exercícios, exemplos e anotações desenvolvidos durante as aulas de Desenvolvimento de Sistemas na ETEC Prof. Camargo Aranha.

O objetivo deste repositório é registrar minha evolução na programação, praticar lógica de programação e aprender os principais conceitos da linguagem Java de forma didática.

---

# 🚀 Tecnologias utilizadas

* Java
* Git
* GitHub
* VS Code

---

# 📂 Organização do projeto

```java
Aula01/
Aula02/
Aula03/
Aula04/
Aula05/
Aula06/
Aula07/
Exercicios/
```

Cada pasta representa uma aula diferente, contendo exemplos práticos e explicações sobre os conteúdos estudados.

---

# 📖 Conteúdo das aulas

## ✅ Aula 01 — Primeiro programa em Java

### Conteúdo estudado

* Estrutura básica do Java
* Classe principal
* Método `main`
* Primeiro `System.out.println`

### Exemplo

```java
public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World");

    }
}
```

### Anotações

* Todo programa Java precisa de uma classe.
* O método `main` é o ponto de início da aplicação.
* `System.out.println()` é utilizado para mostrar mensagens no terminal.

---

## ✅ Aula 02 — Variáveis e concatenação

### Conteúdo estudado

* Variáveis
* Tipos primitivos
* Strings
* Concatenação
* Conversão de valores

### Exemplo

```java
String nome = "Natan";
int idade = 16;

System.out.println(nome + " tem " + idade + " anos");
```

### Anotações

* Variáveis armazenam informações.
* `String` armazena textos.
* `int` armazena números inteiros.
* O operador `+` também pode juntar textos.

---

## ✅ Aula 03 — Declaração e atribuição

### Conteúdo estudado

* Declaração de variáveis
* Inicialização
* Operações matemáticas

### Exemplo

```java
int numero1 = 10;
int numero2 = 5;

System.out.println(numero1 + numero2);
```

### Anotações

* Variáveis podem ser declaradas separadamente.
* Java executa operações matemáticas normalmente.

---

## ✅ Aula 04 — Tipos de dados

### Conteúdo estudado

* float
* char
* cálculos
* exibição de dados

### Exemplo

```java
float preco = 19.99f;
char simbolo = '$';

System.out.println(preco + " " + simbolo);
```

### Anotações

* `float` armazena números decimais.
* `char` armazena apenas um caractere.
* O `f` é obrigatório em números float.

---

## ✅ Aula 05 — Operadores e conversões

### Conteúdo estudado

* Operadores matemáticos
* Incremento
* Decremento
* Conversões de tipos

### Exemplo

```java
int numero = 5;

numero++;

System.out.println(numero);
```

### Anotações

* `++` incrementa 1.
* `--` decrementa 1.
* Conversões podem ser automáticas ou manuais.

---

## ✅ Aula 06 — Operadores relacionais e lógicos

### Conteúdo estudado

* Comparações
* Operadores lógicos
* Condições booleanas

### Exemplo

```java
int idade = 18;

System.out.println(idade >= 18);
```

### Anotações

* Operadores relacionais retornam `true` ou `false`.
* `&&` significa E.
* `||` significa OU.
* `!` significa NÃO.

---

## ✅ Aula 07 — Estrutura Switch Case

### Conteúdo estudado

* Estrutura `switch`
* `case`
* `break`
* `default`

### Exemplo

```java
int dia = 2;

switch (dia) {

    case 1:
        System.out.println("Domingo");
        break;

    case 2:
        System.out.println("Segunda");
        break;

    default:
        System.out.println("Dia inválido");
}
```

### Anotações

* O `switch` facilita múltiplas condições.
* O `break` impede que os próximos casos executem.
* O `default` funciona como alternativa padrão.

---

## ✅ Exercicios - Colocando em prática o que aprendemos

### ✅ Exercício 01 – Cálculo de Salário de Funcionário

### Objetivo do código:
Criar um programa para calcular o salário líquido de um funcionário, considerando descontos, benefícios e adicionais.

### Como foi desenvolvido:
* Foi utilizada a classe `Scanner` para receber os dados digitados pelo usuário.
* O tipo `String` foi utilizado para armazenar o nome do funcionário.
* O tipo `double` foi utilizado para armazenar valores monetários e horas trabalhadas.
* O tipo `int` foi utilizado para armazenar idade, quantidade de filhos e tempo de serviço.
* O programa calcula o salário bruto multiplicando as horas trabalhadas pelo valor da hora.
* Em seguida, calcula os descontos de INSS e Imposto de Renda.
* Também calcula benefícios como salário-família e adicionais por idade ou tempo de serviço.
* Por fim, exibe o salário líquido do funcionário.

### Conclusão:
O objetivo foi alcançado com sucesso, permitindo calcular automaticamente o salário líquido do funcionário com base nas informações fornecidas.

### ✅ Exercício 02 – Cálculo de Bônus de Natal

### Objetivo do código:
Desenvolver um programa capaz de calcular o bônus de Natal de um funcionário conforme seu sexo, tempo de trabalho e salário.

### Como foi desenvolvido:

* Foi utilizada a classe `Scanner` para a entrada de dados.
* O tipo `int` foi utilizado para armazenar o código do funcionário e o tempo de trabalho.
* O tipo `char` foi utilizado para armazenar o sexo do funcionário.
* O tipo `double` foi utilizado para armazenar o salário e o valor do bônus.
* O programa utiliza estruturas condicionais (`if` e `else`) para definir o valor do bônus.
* Dependendo das condições informadas, o bônus é calculado por porcentagem do salário ou recebe um valor fixo.

### Conclusão:
O programa conseguiu calcular corretamente o bônus de Natal de acordo com as regras estabelecidas, apresentando o resultado ao usuário.

### ✅ Exercício 03 – Classificação de Triângulos

### Objetivo do código:
Criar um programa que receba três lados e identifique se eles formam um triângulo e qual é sua classificação.

### Como foi desenvolvido:
* Foi utilizada a classe `Scanner` para receber os valores dos lados.
* O tipo `double` foi utilizado para armazenar as medidas dos lados.
* O programa primeiro organiza os lados em ordem decrescente para facilitar os cálculos.
* Em seguida, verifica se os valores formam um triângulo.
* Caso formem, utiliza estruturas condicionais para identificar se o triângulo é:
* Retângulo;
* Obtusângulo;
* Acutângulo;
* Equilátero;
* Isósceles.
* Os resultados são exibidos na tela para o usuário.

### Conclusão:
O projeto foi concluído com sucesso, permitindo identificar automaticamente se três valores formam um triângulo e determinar sua classificação de acordo com suas características.

---

# 🎯 Objetivos deste repositório

* Aprender Java
* Evoluir na lógica de programação
* Praticar organização de código
* Registrar minha evolução no curso técnico
* Criar uma base sólida para projetos futuros

---

# 👨‍💻 Autor

Desenvolvido por **Natan Gabriel** 🚀
