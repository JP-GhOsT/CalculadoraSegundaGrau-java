# Resolução de Equação do Segundo Grau com Tratamento de Exceções

## Descrição

Este projeto implementa uma abstração chamada `Equacao_Segundo_Grau`, responsável por resolver equações do formato:

ax² + bx + c = 0

A resolução é realizada automaticamente pelo método construtor após receber os coeficientes `a`, `b` e `c`.

O projeto também utiliza tratamento de exceções para lidar com situações inválidas, como:

- Coeficiente `a` igual a zero.
- Discriminante (Δ) negativo, indicando raízes pertencentes ao conjunto dos números complexos.

---

## Estrutura do Projeto

```text
pacoteCalculadora
│
├── Equacao_Segundo_Grau.java
└── Simula_Excecao.java
```

---

## Classe Equacao_Segundo_Grau

### Atributos

| Atributo | Tipo | Descrição |
|-----------|------|------------|
| a | int | Coeficiente de x² |
| b | int | Coeficiente de x |
| c | int | Termo independente |

### Construtor

```java
public Equacao_Segundo_Grau(int a, int b, int c) throws Exception
```

Recebe os coeficientes da equação e chama automaticamente o método responsável por resolver a equação.

---

## Cálculo do Delta

O discriminante é calculado pela fórmula:

Δ = b² - 4ac

### Possíveis resultados

| Condição | Resultado |
|-----------|------------|
| Δ > 0 | Duas raízes reais distintas |
| Δ = 0 | Duas raízes reais iguais |
| Δ < 0 | Exceção lançada (raízes complexas) |

---

## Tratamento de Exceções

### Coeficiente inválido

Caso o coeficiente `a` seja igual a zero:

```java
throw new Exception("O coeficiente 'a' não pode ser zero.");
```

### Raízes Complexas

Caso o discriminante seja negativo:

```java
throw new Exception(
    "A equação possui raízes complexas."
);
```

---

## Classe Simula_Excecao

Responsável por criar objetos da classe `Equacao_Segundo_Grau` e demonstrar:

- Situação sem ocorrência de exceção.
- Situação com ocorrência de exceção.

Exemplo:

```java
try {
    Equacao_Segundo_Grau eq =
        new Equacao_Segundo_Grau(1, -5, 6);
} catch (Exception e) {
    System.out.println(e.getMessage());
}
```

---

## Exemplo de Execução

### Entrada

```java
new Equacao_Segundo_Grau(1, -5, 6);
```

### Saída

```text
Δ = 1.0
x1 = 3.0
x2 = 2.0
```

---

### Entrada

```java
new Equacao_Segundo_Grau(1, 2, 5);
```

### Saída

```text
A equação possui raízes complexas (Δ = -16.0).
```

---

## Tecnologias Utilizadas

- Java
- Programação Orientada a Objetos (POO)
- Tratamento de Exceções

---

## Autor
- João Paulo Zimmermann Matsui - [GitHub](https://github.com/JP-GhOsT) | [Linkedin](https://linkedin.com/in/joaomatsui)

Desenvolvido para fins acadêmicos na disciplina de Programação Orientada a Objetos.
