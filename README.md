# Conta Bancária! <img loading="lazy" src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/java/java-original.svg" width="40" height="40"/>
# :page_with_curl: Sobre
Este programa de console implementa o cadastro e a operação básica de uma conta bancária, aplicando princípios fundamentais da Programação Orientada a Objetos (POO). O objetivo é demonstrar, de forma prática, a utilização dos seguintes conceitos:

:white_check_mark: **Entidades:** a classe Conta representa a conta bancária, agrupando atributos e métodos pertinentes ao seu funcionamento.

:white_check_mark: **Construtores:** sobrecarga de construtores para permitir a criação de instâncias com ou sem depósito inicial.

:white_check_mark: **Encapsulamento:** todos os atributos são privados, assegurando o controle de acesso e a integridade dos dados.

:white_check_mark: **Modificadores de acesso:** aplicação adequada de private para atributos sensíveis (número da conta, saldo) e public para métodos de interação (depósito, saque, atualização de titular).

Este exercício tem o propósito de reforçar as boas práticas de design orientado a objetos, sobretudo o princípio do encapsulamento, ressaltando a importância de expor somente o que for estritamente necessário por meio de interfaces controladas.

## :memo: Regras de Negócio

:arrow_right: **Imutabilidade do número da conta:** uma vez definida na criação, não pode ser alterada.

:arrow_right: **Alterabilidade do nome do titular:** o titular pode atualizar seu nome por meio de método público específico.

:arrow_right: **Proteção do saldo:** o saldo somente é modificado pelos métodos depositar() e sacar(), sendo aplicado automaticamente um encargo de R$ 5,00 em cada operação de saque.

:arrow_right: **Saldo negativo:** o mecanismo permite que o saldo fique negativo caso o valor de saque e taxa excedam o saldo disponível.

## :arrows_counterclockwise: Fluxo de Execução

1. Solicitação dos dados iniciais: número da conta, nome do titular e valor opcional de depósito inicial.
2. Exibição do estado atual da conta.
3. Recebimento de valor para depósito e atualização do saldo.
4. Exibição do estado da conta após o depósito.
5. Recebimento de valor para saque (com aplicação da taxa) e atualização do saldo.
6. Exibição do estado final da conta.

# ![Static Badge](https://img.shields.io/badge/Status-conclu%C3%ADdo-brightgreen)
# :computer: Tecnologias
<div>
  <img loading="lazy" src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/java/java-original-wordmark.svg" width="90" height="90"/> <img loading="lazy" src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/intellij/intellij-original.svg" width="90" height="90"/>
</div>

# :construction_worker: Autor
<img loading="lazy" src="https://avatars.githubusercontent.com/u/190774461?v=4)" width=115><br><sub>**José Roberto Gomes**</sub>
<div>
<a href="https://www.linkedin.com/in/roberto-gomes-dev/">
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/linkedin/linkedin-original.svg" width="40" height="40" />
</a>
  <a href="https://github.com/robertogomesdev">
  <img src="https://github.com/user-attachments/assets/62e7a586-bb55-4ba1-8f61-8e29caefebc5" width="40" height="40" />
</a>
</div>
