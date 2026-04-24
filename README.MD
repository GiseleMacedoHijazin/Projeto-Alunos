# Projeto: Ordenação de Alunos em Java

## 📌 Descrição
Este projeto foi desenvolvido com o objetivo de praticar conceitos de ordenação em Java utilizando a classe `Aluno`.

Cada aluno possui os seguintes atributos:
- nome
- idade
- notaFinal

O sistema permite ordenar os alunos de diferentes formas, utilizando as interfaces `Comparable` e `Comparator`.

---

## ⚙️ Funcionalidades
- Ordenação por **notaFinal** (ordenação natural com `Comparable`)
- Ordenação por **nome** (utilizando `Comparator`)
- Ordenação por **idade** (utilizando `Comparator`)
- Inserção automática de **10 alunos** para testes

---

## 🧠 Conceitos utilizados

### Comparable
A interface `Comparable` foi implementada na classe `Aluno` para definir a ordenação padrão baseada na nota final.

### Comparator
Foram criadas classes auxiliares para diferentes critérios de ordenação:
- `ComparadorPorNome`
- `ComparadorPorIdade`

Essas classes permitem ordenar os objetos de maneira flexível.

---

## ▶️ Como executar

1. Compile os arquivos:
   javac *.java

2. Execute o programa:
   java App

---

## 🎯 Objetivo acadêmico
Este projeto foi desenvolvido como atividade prática para reforçar o uso de ordenação de objetos em Java e a utilização das interfaces `Comparable` e `Comparator`.

---

## 👤 Autor
Gisele Macedo Hijazin