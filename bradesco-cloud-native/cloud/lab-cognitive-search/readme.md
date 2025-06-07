# Azure Cognitive Search – Utilizando AI Search para Indexação e Consulta de Dados

Este repositório documenta as atividades realizadas durante o laboratório prático com **Azure AI Search**, com foco na ingestão, indexação e exploração de dados por meio de recursos de inteligência artificial. O desafio faz parte da trilha de aprendizado da DIO e tem como objetivo aplicar conceitos de **pesquisa inteligente e análise de conteúdo**.

---

## Objetivo do Laboratório

Explorar os principais recursos do **Azure Cognitive Search**, praticando a ingestão de dados, a criação de índices inteligentes e a consulta eficiente por meio de interfaces gráficas e automações.

Com isso, busca-se desenvolver competências em **organização, estruturação e pesquisa de informação** em grandes volumes de dados, utilizando **serviços gerenciados de IA**.

---

## Etapas Realizadas

### 1. Acesso ao Portal do Azure

* Navegação até [https://portal.azure.com](https://portal.azure.com)
* Criação do recurso **Azure Cognitive Search**
* Escolha da camada gratuita (F0) para fins de laboratório

### 2. Ingestão de Dados

* Upload de arquivos (.pdf, .txt, .docx) via **Blob Storage**
* Conexão do Azure Cognitive Search com o armazenamento
* Criação de *Data Source* a partir do container no Storage Account

### 3. Criação do Índice Inteligente

* Configuração de **Skillsets** com:

    * OCR (reconhecimento de texto em imagem)
    * Extração de frases-chave
    * Detecção de linguagem
    * Tradução
    * Análise de sentimento
* Mapeamento dos campos extraídos
* Criação do *Indexer* para processar os documentos automaticamente

### 4. Consulta aos Dados Indexados

* Utilização do **portal do Azure** para realizar buscas
* Testes com palavras-chave e expressões
* Validação dos campos gerados pelas skills cognitivas
* Exploração da **Search Explorer**

---

## Aprendizados e Insights

* O Azure AI Search é uma solução poderosa para **mineração de dados não estruturados**, como arquivos PDF, imagens e documentos do Office.
* A combinação com **Cognitive Services** permite transformar conteúdo bruto em informações pesquisáveis com contexto e inteligência.
* O conceito de **Skillset** foi essencial para adicionar valor ao conteúdo durante a indexação, enriquecendo os resultados com **metadados semânticos**.
* A abordagem low-code oferecida pelo Azure facilita muito a prototipação rápida de soluções de pesquisa inteligente.

---


## Conclusão

O laboratório com **Azure Cognitive Search** foi essencial para entender como estruturar pipelines inteligentes de busca, tornando possível extrair **conhecimento estruturado de documentos desorganizados**. Este aprendizado reforça a importância das ferramentas de IA no processo de **transformação digital** e **análise de conteúdo empresarial**.
