# Aprenda Kotlin Com Exemplos: Desafio de Projeto (Lab)

Desafio de Projeto criado para avaliação do conteúdo técnico explorado no repositório [aprenda-kotlin-com-exemplos](https://github.com/digitalinnovationone/aprenda-kotlin-com-exemplos). **Nesse contexto, iremos abstrair o seguinte domínio de aplicação:**

**A [DIO](https://web.dio.me) possui `Formacoes` incríveis que têm como objetivo oferecer um conjunto de `ConteudosEducacionais` voltados para uma stack tecnológica específica, preparando profissionais de TI para o mercado de trabalho. `Formacoes` possuem algumas características importantes, como `nome`, `nivel` e seus respectivos `conteudosEducacionais`. Além disso, tais experiências educacionais têm um comportamento relevante ao nosso domínio, definido pela capacidade de `matricular` um ou mais `Alunos`.**


```kotlin
TODO("Crie uma solução em Koltin abstraindo esse domínio. O arquivo [desafio.kt] te ajudará 😉")
```

## Resolução
Nessa seção, segue a minha linha de raciocínio para resolução deste desafio em Kotlin.
1. Definir variáveis mutáveis e imutáveis.
2. Adicionar parâmetro para nível da formação, usando a classe Enum Nivel.
3. Mudei a coleção de List para Set, pensando na propriedade exclusiva dos Sets, em que não pode
haver repetição de elemento. Isso supondo que as formações não terão conteúdos educacionais
repetidos, assim como os usuários inscritos em cada formação só serão matriculados apenas uma vez.
4. Adição de novos métodos à classe Formacao: remoção de elementos e quantidade de alunos inscritos na 
formação.
5. Adição de novos métodos à classe Formacao: adição e remoção de elementos passando um vararg como parâmetro.
6. Tratamento de exceção para as funções de matrícula e remoção (incluindo as que recebem também mais de 1
usuário como argumento).
7. Elaboração de testes, inclusive testando casos em que as operações não funcionam como esperado.
8. Uso de scope functions em testes para remoção de vários usuários ao mesmo tempo.