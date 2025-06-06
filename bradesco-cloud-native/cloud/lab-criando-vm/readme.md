# Criação de Máquina Virtual

Este repositório documenta a experiência prática no laboratório de criação e configuração de uma máquina virtual na plataforma Microsoft Azure.

---

## Etapas Realizadas

### 1. Acesso ao Azure
- Acesso ao painel inicial e navegação básica.

### 2. Criação da Máquina Virtual
- Escolha da imagem: Windows Server 2022
- Tamanho da VM: B1s (baixo custo)
- Nome da VM: `lab-vm-dio`
- Região: Brasil Sul

### 3. Configuração de Rede e Segurança
- Configuração de grupo de segurança (NSG) para liberar porta RDP (3389)
- Rede virtual padrão

### 4. Acesso Remoto
- Download do arquivo `.rdp`
- Conexão via Remote Desktop

---

## Dicas

- Escolher regiões com menor custo e menor latência.
- Sempre defina senhas fortes para acesso remoto.
- Lembre-se de **parar** ou **excluir** a VM após o uso para evitar cobranças.
- Utilize **tags** para organizar seus recursos no Azure.

---

## Recursos Utilizados

- [Documentação Oficial da Microsoft](https://learn.microsoft.com/pt-br/azure/virtual-machines/windows/quick-create-portal)
- [Documentação GitHub Markdown](https://guides.github.com/features/mastering-markdown/)
- [Formação GitHub Certification - GitBook](https://dio.me)

---

## Conclusão

Este laboratório reforçou o entendimento dos principais conceitos de computação em nuvem e mostrou, na prática, como provisionar uma máquina virtual na nuvem utilizando o Microsoft Azure.
