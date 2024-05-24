## Getting Started

# Exercício de Sintaxe - Projeto ContaBanco

Vamos exercitar todo o conteúdo apresentado no módulo de Sintaxe codificando o seguinte cenário.

## Descrição do Projeto

Crie o projeto **ContaBanco** que receberá dados via terminal contendo as características de conta em banco conforme os atributos abaixo. Dentro do projeto, crie a classe `ContaTerminal.java` para realizar toda a codificação do nosso programa.

## Atributos da Conta

| Atributo      | Tipo    | Exemplo        |
|---------------|---------|----------------|
| Numero        | Inteiro | 1021           |
| Agencia       | Texto   | 067-8          |
| Nome Cliente  | Texto   | MARIO ANDRADE  |
| Saldo         | Decimal | 237.48         |

## Passos para Implementação

1. **Revisão sobre regras de declaração de variáveis**
   - Atributos da classe `ContaTerminal` devem ser declarados conforme os tipos especificados na tabela acima.

2. **Revisão sobre terminal, `main` args e a classe `Scanner`**
   - Utilize a classe `Scanner` para capturar os dados inseridos pelo usuário via terminal.

3. **Entrada de Dados**
   - Permita que os dados sejam inseridos via terminal, sendo que o usuário receberá a mensagem de qual informação será solicitada, por exemplo:
     ```
     Programa: "Por favor, digite o número da Agência!"
     Usuário: 067-8 (depois ENTER para o próximo campo)
     ```

4. **Revisão sobre concatenação e classe `String` com método `concat`**
   - Concatene as informações inseridas pelo usuário para formar a mensagem de saída.

5. **Mensagem de Saída**
   - Depois de todas as informações terem sido inseridas, o sistema deverá exibir a seguinte mensagem:
     ```
     "Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque."
     ```
   - Os campos em `[ ]` devem ser alterados pelas informações que forem inseridas pelos usuários.

## Exemplo de Uso

Ao executar o programa, o fluxo de entrada e saída será semelhante ao seguinte:

