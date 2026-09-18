# Calculadora de Média Escolar em Java

Um programa simples em Java desenvolvido para console que recebe duas notas de um usuário, calcula a média aritmética entre elas e exibe o resultado final.

## 🚀 Funcionalidades

*   **Entrada de Dados:** Solicita e lê duas notas digitadas pelo usuário através do console.
*   **Processamento:** Calcula a média utilizando um método dedicado para manter o código limpo e organizado.
*   **Tratamento de Buffer:** Limpa o buffer do teclado após a leitura de valores numéricos para evitar bugs em futuras expansões do código.
*   **Saída de Dados:** Exibe o resultado da média na tela de forma clara.

## 🛠️ Tecnologias Utilizadas

*   **Java 8+** (ou versão superior)
*   **Classe java.util.Scanner** (para captura de dados do console)

## 🏗️ Estrutura do Código

O projeto consiste em uma única classe `Main` que contém:

1.  **`main(String[] args)`**: O ponto de entrada do programa. Gerencia o fluxo de entrada de dados, chama o método de cálculo e exibe o resultado.
2.  **`media(double x, double y)`**: Um método auxiliar que recebe as duas notas como parâmetros e retorna o cálculo da média estruturado como `(x + y) / 2`.

## ⚙️ Como Executar o Projeto

### Pré-requisitos
Você precisa ter o **JDK (Java Development Kit)** instalado em sua máquina.

### Passo a Passo

1.  **Clonar ou copiar o código:**
    Crie um arquivo chamado `Main.java` e cole o código do projeto.

2.  **Compilar o arquivo:**
    Abra o terminal na pasta onde o arquivo foi salvo e execute o seguinte comando:
    ```bash
    javac Main.java
    ```

3.  **Executar o programa:**
    Após a compilação, inicie o programa com o comando:
    ```bash
    java Main
    ```

## 📝 Exemplo de Uso

Ao executar o programa, a interação no console será semelhante a esta:

```text
Digite a 1° nota: 8.5
Digite a 2° nota: 7.5
Resultado: 8.0
```

## 📌 Versão do Projeto

*   **Versão Atual:** 1.0.0
*   **Status:** Concluído / Funcional

## 👤 Autor

*   **Igor Alencar**

## 🛡️ Licença

Este projeto é de uso livre para fins educacionais e de estudo.
