# Calculadora de IMC em Java ⚖️

Aplicação de console desenvolvida em **Java** para cálculo do **Índice de Massa Corporal (IMC)**, exibindo o peso, altura, valor calculado e a classificação correspondente de acordo com as diretrizes da Organização Mundial da Saúde (OMS).

---

## 🛠️ Tecnologias Utilizadas
- **Linguagem:** Java (JDK 17+)
- **IDE:** IntelliJ IDEA
- **Controle de Versão:** Git & GitHub

---

## 📋 Tabela de Classificação do IMC

| Faixa de IMC | Classificação |
| :--- | :--- |
| **Menor que 18.5** | Abaixo do peso |
| **18.5 a 24.9** | Peso ideal (parabéns) |
| **25.0 a 29.9** | Atenção! Você está acima do peso |
| **30.0 a 34.9** | Obesidade grau I |
| **35.0 a 39.9** | Obesidade grau II (severa) |
| **Maior ou igual a 40.0** | Obesidade grau III (mórbida) |

---

## 🧠 Conceitos e Boas Práticas Aplicados
- **Entrada de dados:** Uso da classe Scanner com Locale.US para leitura padronizada de números com ponto flutuante.
- **Tipos de dados:** Variáveis do tipo double para precisão no cálculo de peso, altura e IMC.
- **Operadores aritméticos:** Precedência correta com parênteses: peso / (altura * altura).
- **Estruturas condicionais:** Encadeamento lógico eficiente com if, else if e else.
- **Formatação de saída:** Exibição com System.out.printf limitando o resultado a duas casas decimais (%.2f).
- **Gerenciamento de recursos:** Fechamento do scanner com sc.close().

---

## 💻 Como Executar o Projeto

### Pré-requisitos
- Ter o **Java JDK** instalado (versão 17 ou superior recomendada).
- Git instalado (opcional, para clonar).

### Passo a passo pelo terminal

1. Clone o repositório:
`git clone https://github.com/hermessonyurii/calculadora-imc.git
`

2. Acesse a pasta do projeto:
`
cd calculadora-imc
`

3. Compile o código:
`
javac src/CalculadoraIMC.java
`

4. Execute a aplicação:
`
java -cp src CalculadoraIMC
`

5. Digite o peso (ex: 75.5) e aperte Enter. Depois digite a altura (ex: 1.75) e aperte Enter.

---

## 👤 Tema de estudos.

Desenvolvido por **[Hermesson Yuri](https://github.com/hermessonyurii)** | **[LinkedIn](https://www.linkedin.com/in/hermesson-yuri/)**
