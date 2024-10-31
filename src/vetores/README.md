# Vetores em Java

## Introdução
Vetores, também conhecidos como arrays, são estruturas de dados que armazenam uma coleção de elementos do mesmo tipo. Em Java, os vetores são amplamente utilizados para armazenar e manipular conjuntos de dados de forma eficiente.

## Declaração de Vetores
Para declarar um vetor em Java, você deve especificar o tipo de dados dos elementos e o tamanho do vetor. Aqui está um exemplo de como declarar um vetor de inteiros com 10 elementos:

```java
int[] numeros = new int[10];
```

## Inicialização de Vetores
Você pode inicializar um vetor no momento da declaração ou posteriormente. Veja alguns exemplos:

### Inicialização na Declaração
```java
int[] numeros = {1, 2, 3, 4, 5};
```

### Inicialização Posterior
```java
int[] numeros = new int[5];
numeros[0] = 1;
numeros[1] = 2;
numeros[2] = 3;
numeros[3] = 4;
numeros[4] = 5;
```

## Acessando Elementos do Vetor
Os elementos de um vetor são acessados usando índices, que começam em 0. Aqui está um exemplo de como acessar e imprimir elementos de um vetor:

```java
int[] numeros = {1, 2, 3, 4, 5};
System.out.println(numeros[0]); // Imprime 1
System.out.println(numeros[4]); // Imprime 5
```

## Percorrendo um Vetor
Você pode usar loops para percorrer os elementos de um vetor. O loop `for` é comumente usado para essa finalidade:

```java
int[] numeros = {1, 2, 3, 4, 5};
for (int i = 0; i < numeros.length; i++) {
    System.out.println(numeros[i]);
}
```

## Conclusão
Vetores são uma parte fundamental da programação em Java e são usados para armazenar e manipular conjuntos de dados de forma eficiente. Compreender como declarar, inicializar e acessar vetores é essencial para qualquer programador Java.
