# ☁️ Laboratório Azure - Instância de Banco de Dados SQL

Este repositório documenta o processo de criação e configuração de uma instância de Banco de Dados SQL no Microsoft Azure, conforme o desafio proposto na DIO.

## Objetivo

Praticar a criação de uma instância gerenciada de banco de dados SQL no Azure, aprendendo a configurar, acessar e gerenciar recursos de forma segura e eficaz.

---

## Etapas Realizadas

### 1. Acesso ao Portal do Azure
- Navegação até: [https://portal.azure.com](https://portal.azure.com)

### 2. Criação da Instância de Banco de Dados
- Recurso: **Banco de Dados SQL**
- Nome do servidor: `sqlserver-dio-lab`
- Nome do banco: `db-dio-lab`
- Região: Brasil Sul
- Tipo de Autenticação: SQL (login e senha definidos)

### 3. Configuração de Acesso
- Regras de firewall para permitir acesso público ao IP atual
- Teste de conexão com ferramentas como Azure Data Studio ou SQL Server Management Studio (SSMS)

### 4. Acesso ao Banco de Dados
- Teste de conexão via SSMS
- Execução de comandos básicos: `CREATE TABLE`, `INSERT`, `SELECT`

---

## Dicas e Boas Práticas

- Não usar senhas fracas na criação do servidor.
- Após o uso, **remova o IP público** das regras de firewall por segurança.
- Use **tags e nomes padronizados** para facilitar a gestão e auditoria de recursos.
- Monitore o uso do banco pela aba de **Métricas** no Azure.

---

## Recursos Utilizados

- [Documentação Oficial: Criar Instância SQL no Azure](https://learn.microsoft.com/pt-br/azure/azure-sql/database/single-database-create-quickstart)
- [GitHub Markdown](https://guides.github.com/features/mastering-markdown/)
- [Formação GitHub Certification](https://dio.me)

---

## Conclusão

Este laboratório reforçou conceitos de cloud computing voltados à camada de dados, utilizando o Azure para provisionar um serviço de banco de dados SQL.
