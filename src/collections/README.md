# Aula de Collections em Java

Bem-vindo à aula de Collections em Java! Este documento fornecerá uma visão geral das principais coleções disponíveis na linguagem Java e como utilizá-las.

## Índice

1. [Introdução](#introdução)
2. [List](#list)
3. [Set](#set)
4. [Map](#map)
5. [Queue](#queue)
6. [Exemplos de Código](#exemplos-de-código)
7. [Referências](#referências)

## Introdução

As Collections em Java são uma parte fundamental da linguagem, permitindo o armazenamento e manipulação de grupos de objetos de forma eficiente. As principais interfaces de Collections são `List`, `Set`, `Map` e `Queue`.

## List

A interface `List` é uma coleção ordenada que permite elementos duplicados. As implementações mais comuns são `ArrayList` e `LinkedList`.

```java
List<String> lista = new ArrayList<>();
lista.add("Elemento 1");
lista.add("Elemento 2");
```

## Set

A interface `Set` é uma coleção que não permite elementos duplicados. As implementações mais comuns são `HashSet` e `TreeSet`.

```java
Set<String> conjunto = new HashSet<>();
conjunto.add("Elemento 1");
conjunto.add("Elemento 2");
```

## Map

A interface `Map` mapeia chaves para valores. Não permite chaves duplicadas. As implementações mais comuns são `HashMap` e `TreeMap`.

```java
Map<String, Integer> mapa = new HashMap<>();
mapa.put("Chave 1", 1);
mapa.put("Chave 2", 2);
```

## Queue

A interface `Queue` é uma coleção usada para manter elementos antes de processá-los. As implementações mais comuns são `LinkedList` e `PriorityQueue`.

```java
Queue<String> fila = new LinkedList<>();
fila.add("Elemento 1");
fila.add("Elemento 2");
```