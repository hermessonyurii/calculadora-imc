# Calculadora de IMC em Java ⚖️

Aplicação desenvolvida em **Java** para cálculo do **Índice de Massa Corporal (IMC)**, com versões via **console** e **interface gráfica interativa (JOptionPane)**. O programa exibe o peso, altura, valor calculado e a classificação correspondente de acordo com as diretrizes da Organização Mundial da Saúde (OMS).

---

## 🛠️ Tecnologias Utilizadas
- **Linguagem:** Java (JDK 17+)
- **GUI:** Java Swing (`JOptionPane`)
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
- **Organização em pacotes:** Código estruturado dentro do pacote `programa`.
- **Interface Gráfica e Console:** Flexibilidade com duas opções de uso (via terminal com `Scanner` ou via caixas de diálogo com `JOptionPane`).
- **Entrada de dados:** Uso de `Locale.US` para leitura padronizada de números decimais com ponto.
- **Tipos de dados:** Variáveis do tipo `double` para precisão no cálculo de peso, altura e IMC.
- **Operadores aritméticos:** Precedência correta com parênteses: `peso / (altura * altura)`.
- **Estruturas condicionais:** Encadeamento lógico eficiente com `if`, `else if` e `else`.
- **Formatação de saída:** Exibição com `printf` / `String.format` limitando o resultado a duas casas decimais (`%.2f`).
- **Gerenciamento de recursos:** Fechamento adequado do scanner com `sc.close()`.

---

## 💻 Como Executar o Projeto

### Pré-requisitos
- Ter o **Java JDK** instalado (versão 17 ou superior recomendada).
- Git instalado (opcional, para clonar).

### Passo a passo pelo terminal

1. Clone o repositório:
```bash
git clone https://github.com/hermessonyurii/calculadora-imc.git
```

2. Acesse a pasta do projeto:
```bash
cd calculadora-imc
```

3. Compile as classes do pacote:
```bash
javac src/programa/*.java
```

4. Execute a aplicação desejada:

- **Versão Console:**
```bash
java -cp src programa.CalculadoraIMC
```

- **Versão Gráfica (Diálogos Swing):**
```bash
java -cp src programa.CalculadoraIMC_Grafico
```

---

## 👤 Tema de estudos.

Desenvolvido por **[Hermesson Yuri](https://github.com/hermessonyurii)** | **[LinkedIn](https://www.linkedin.com/in/hermesson-yuri/)**
