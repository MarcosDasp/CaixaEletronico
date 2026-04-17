# 💰 Caixa Eletrônico em Java

![Java](https://img.shields.io/badge/Java-17%2B-blue)
![JUnit](https://img.shields.io/badge/JUnit-5-green)
![Mockito](https://img.shields.io/badge/Mockito-5.x-brightgreen)
![Status](https://img.shields.io/badge/Status-Completo-success)

Projeto simples desenvolvido em Java para simular o funcionamento de um caixa eletrônico, retornando a **menor quantidade possível de notas** para um determinado valor de saque.

---

## 📌 Objetivo

Implementar um sistema que:

* Receba um valor de saque
* Retorne a menor quantidade de notas possíveis
* Valide valores inválidos
* Utilize testes unitários com **JUnit e Mockito**

---

## 🧠 Lógica Utilizada

O sistema utiliza um **algoritmo guloso (Greedy)**:

> Sempre utiliza a maior nota disponível antes de passar para as menores.

Notas disponíveis:

* R$100
* R$50
* R$20
* R$10

---

## ▶️ Exemplos de Uso

| Entrada | Saída                 |
| ------- | --------------------- |
| 380     | 3x100 1x50 1x20 1x10  |
| 30      | 1x20 1x10             |
| 35      | Erro (valor inválido) |

---

## ⚙️ Tecnologias Utilizadas

* Java
* JUnit 5
* Mockito

---

## 🧪 Testes Unitários

Foram implementados testes para validar:

* ✔ Saque com valor válido
* ✔ Saque com valor inválido
* ✔ Comportamento do sistema com uso de mock (Mockito)

---

## 📸 Resultado dos Testes

Exemplo de execução dos testes no terminal:

![Resultado dos testes](./assets/testes.png)

> 💡 Dica: coloque um print da sua execução dentro da pasta `assets/` com o nome `testes.png`

---

## 🗂️ Estrutura do Projeto

```
/src
 ├── CaixaEletronico.java
 ├── Logger.java
 ├── CaixaEletronicoTest.java
 ├── mockito-extensions/
 │    └── org.mockito.plugins.MockMaker

/lib
 ├── junit-platform-console-standalone.jar
 ├── mockito-core.jar
 ├── byte-buddy.jar
 ├── objenesis.jar
```

---

## ▶️ Como Executar

### 1. Compilar

```bash
javac -cp "lib/*" src/*.java
```

### 2. Rodar os testes

```bash
java -cp "lib/*;src" org.junit.platform.console.ConsoleLauncher --scan-class-path
```

---

## ⚠️ Observações

* O projeto foi configurado sem uso de Maven ou Gradle
* Mockito foi ajustado para funcionar com versões recentes do Java utilizando:

```
mock-maker-subclass
```

* Isso evita problemas com o mecanismo de agentes do Java

---

## 🧪 Boas Práticas de Teste Aplicadas

O projeto foi desenvolvido seguindo boas práticas de testes unitários:

### 🔴🟢 Ciclo TDD
Foi adotado o ciclo **Test Driven Development (TDD)**:
- Escrita inicial de testes (falhando - RED)
- Implementação mínima para passar (GREEN)
- Refatoração do código (REFACTOR)

---

### 🧱 Estrutura AAA
Todos os testes seguem o padrão:

- **Arrange** → preparação dos dados e mocks  
- **Act** → execução da ação testada  
- **Assert** → verificação dos resultados  

---

### 🔒 Isolamento
- Cada teste é independente  
- Não há compartilhamento de estado entre testes  
- Uso de **Mockito** para simular dependências externas  

---

### 🏷️ Nomenclatura
Os testes seguem o padrão descritivo:

> deve + comportamento + condição

Exemplo: `deveRetornarNotasCorretasQuandoValorFor380`

---

### 📊 Cobertura de Cenários

Os testes cobrem:

- ✔ **Happy Path** → valores válidos (ex: 380, 30)  
- ✔ **Edge Cases** → valores mínimos (ex: 10)  
- ✔ **Exceções** → valores inválidos (ex: 35)  

---

## 🎯 Conclusão

Este projeto demonstra:

* Uso de lógica de programação (algoritmo guloso)
* Boas práticas com testes unitários
* Uso de bibliotecas externas (Mockito)
* Organização básica de projeto Java

---

## 👨‍💻 Autor

Desenvolvido para fins acadêmicos.
