# Laboratório Azure - Configurando Recursos e Dimensionamentos em Máquinas Virtuais

Este repositório documenta o processo de criação e configuração de **Máquinas Virtuais (VMs)** no Microsoft Azure, conforme o desafio proposto na DIO.

---

## Objetivo

Compreender como provisionar, configurar e dimensionar recursos computacionais utilizando máquinas virtuais no Azure, garantindo boas práticas de desempenho, custo e segurança.

---

## Etapas Realizadas

### 1. Acesso ao Portal do Azure

* Navegação até: [https://portal.azure.com](https://portal.azure.com)

### 2. Criação da Máquina Virtual

* Recurso: **Máquina Virtual (Virtual Machine)**
* Nome: `vm-dio-lab`
* Sistema Operacional: Windows Server 2022 (ou Linux, dependendo do lab)
* Tamanho: **B1s** (para fins de laboratório e economia)
* Região: Brasil Sul
* Autenticação: Usuário e senha

### 3. Configuração de Rede

* Criação de **grupo de segurança de rede (NSG)**
* Liberação de portas específicas (ex: RDP para Windows ou SSH para Linux)
* Associação da VM a uma rede virtual (VNet)

### 4. Acesso e Teste

* Conexão via RDP (Windows) ou SSH (Linux)
* Instalação de softwares ou execução de comandos de teste
* Verificação de performance e uso de recursos

### 5. Dimensionamento

* Ajuste do tamanho da VM via portal (escalar verticalmente)
* Monitoramento de uso de CPU, disco e memória pela aba *Métricas*

---

## Dicas e Boas Práticas

* Escolha o **menor tamanho de VM** suficiente para o seu caso de uso, para reduzir custos.
* Sempre **configure o grupo de segurança de rede** com regras mínimas de acesso necessárias.
* Use **tags** para organizar os recursos por projeto ou ambiente.
* **Desligue as VMs** quando não estiverem em uso para evitar cobrança.

---

## Recursos Utilizados

* Portal do Azure
* Documentação oficial da Microsoft sobre Máquinas Virtuais
* Ferramentas de conexão: Remote Desktop (RDP) ou terminal SSH
* Formação **Azure Fundamentals** (DIO)

---

## Conclusão

Este laboratório me permitiu explorar os fundamentos da computação em nuvem aplicados ao provisionamento de máquinas virtuais no Azure. Aprendi a ajustar recursos, configurar redes e aplicar boas práticas para segurança e eficiência. É uma base essencial para trabalhar com infraestrutura como serviço (IaaS) em projetos reais.