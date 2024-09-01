# CRIANDO UM PEQUENO SISTEMA PARA VALIDAÇÃO DE PROCESSO SELETIVO

## Casos

Vamos explorar alguns outros cenários com fluxo condicionais, repetições e excepcionais.

### Caso 1:

Vamos imaginar que em um processo seletivo existe o valor base salarial de R$ 2.000,00 e o salário pretendido pelo candidato. Vamos elaborar um controle de fluxo onde:

1. Se o valor salario base for maior que o valor salario pretendido, imprima: "LIGAR PARA O CANDIDATO";

2. Se o valor salario base for igual ao valor salario pretendido, imprima: "LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA";

3. Senão imprima: "AGUARDANDO RESULTADO DEMAIS CANDIDATOS".

### Caso 2:

Foi solicitado que nosso sistema garanta que diante das inúmeras candidaturas sejam selecionados apenas no máximo 5 candidatos para entrevista onde o salário pretendido seja menor ou igual ao salário base.

### Caso 3:

Agora é hora de imprimir a lista dos candidatos selecionados para disponibilizar para o RH entrar em contato.

### Caso 4:

O RH deverá realizar uma ligação com no máximo 03 tentativas para cada candidato selecionado e caso o candidato atenda, deve-se imprimir:

1. "CONSEGUIMOS CONTATO COM [CANDIDATO], APÓS [TENTATICAS] TENTATIVAS";

2. do contrário imprima: "NÃO CONSEGUIMOS CONTATO COM O [CANDIDATO]".

# CONTROLE DE FLUXO - DESAFIO

Vamos exercitar todo o conteúdo apresentado no médulo de Controle de Fluxo condificando o seguinte cenário.

O sistema deverá receber dois parâmetros via terminal que representarão dois números inteiros, com estes dois números você deverá obter a quantidade de interações (for) e realizar a impressão no console (System.out.print) dos números incrementados, exemplo:

- Se você passar os números 12 e 30, logo teremos uma interação (for) com ocorrências para imprimir os números, exemplo: "Imprimindo o número 1", "Imprimindo o número 2" e assim por diante.

- Se o primeiro parâmetro for MAIOR que o segundo parâmetro, você deverá lançar a exceção customizada chamada de (ParametrosInvalidosException) com a segunda mensagem: "O segundo parâmetro deve ser maior que o primeiro"

1. Crie o projeto (DesafioControleFluxo)
2. Dentro do projeto, crie a classe (Contador.java) para realizar toda a codificação do nosso programa.
3. Dentro do projeto, crie a classe (ParametrosInvalidosException) que representará a exceção de negócio no sistema.
