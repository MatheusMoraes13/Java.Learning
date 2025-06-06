# Construindo Arquiteturas no Azure

Este repositório contém a implementação do desafio prático **"Construindo Arquiteturas no Azure"**, proposto na plataforma DIO. O objetivo é aplicar na prática os conhecimentos adquiridos sobre **infraestrutura em nuvem**, **serviços gerenciados**, **rede**, **segurança** e **boas práticas de arquitetura de soluções** no Microsoft Azure.

---

## Objetivo

Desenvolver uma arquitetura funcional na nuvem utilizando os principais serviços do Azure, compreendendo seus relacionamentos e configurações para atender às necessidades de uma aplicação real.

---

## Etapas Realizadas

### 1. Planejamento da Arquitetura

* Levantamento de requisitos (tipo de aplicação, banco de dados, regras de acesso, escalabilidade).
* Definição dos principais componentes da solução:

    * Front-end
    * Back-end
    * Banco de dados
    * Serviços de rede
    * Monitoramento e segurança

### 2. Criação da Infraestrutura no Azure

* **Grupo de Recursos**: Criação de um resource group para organizar os componentes.
* **Rede Virtual (VNet)** e **Sub-redes**: Separação de recursos por camadas (web, app, data).
* **Máquinas Virtuais ou App Services**: Dependendo da solução, provisionamento do ambiente de aplicação.
* **Banco de Dados SQL ou Cosmos DB**: Criação da camada de dados.
* **Storage Account**: Para armazenamento de arquivos e logs, se necessário.

### 3. Configuração de Segurança

* **Network Security Groups (NSGs)**: Definição de regras de entrada e saída por camada.
* **Firewall de Banco de Dados**: Restringindo IPs externos.
* **Azure Identity (RBAC)**: Controle de acesso baseado em função.
* **Key Vault (opcional)**: Armazenamento seguro de segredos e conexões.

### 4. Monitoramento e Escalabilidade

* **Azure Monitor**: Visualização de métricas e alertas.
* **Autoscale (se aplicável)**: Definido para serviços como App Service.
* **Application Insights**: Para telemetria e análise de performance da aplicação.

---

## Boas Práticas Aplicadas

* Utilização de **nomes padronizados** e **tags** para facilitar auditoria.
* Criação de **recursos por ambiente** (dev/test/prod).
* Garantia de **alta disponibilidade** com zonas de disponibilidade e réplicas.
* Pensando em **custo-benefício**, com dimensionamento adequado dos recursos.

---

## Conclusão

Este projeto consolidou o entendimento sobre **construção de ambientes completos em nuvem**, desde a infraestrutura até boas práticas de segurança e performance. A experiência prática foi essencial para visualizar como componentes se integram e como garantir um ambiente escalável e seguro no **Microsoft Azure**.

---