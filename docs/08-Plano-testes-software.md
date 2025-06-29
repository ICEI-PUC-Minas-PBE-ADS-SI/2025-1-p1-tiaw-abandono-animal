# Plano de testes de software

O plano de testes de software é gerado a partir da especificação do sistema e consiste em casos de teste que deverão ser executados quando a implementação estiver parcial ou totalmente pronta. Apresente os cenários de teste utilizados na realização dos testes da sua aplicação. Escolha cenários de teste que demonstrem os requisitos sendo satisfeitos.

Enumere quais cenários de testes foram selecionados para teste. Neste tópico, o grupo deve detalhar quais funcionalidades foram avaliadas, o grupo de usuários que foi escolhido para participar do teste e as ferramentas utilizadas.

Não deixe de enumerar os casos de teste de forma sequencial e garantir que o(s) requisito(s) associado(s) a cada um deles esteja(m) correto(s) — de acordo com o que foi definido na <a href="03-Product-design.md">Especificação do projeto</a>.

Primeiro Teste : 
------------------------------------------------------------

**Caso de teste CT-001 – Login**

- **Requisito associado:** RF-001 – O sistema deve permitir que usuários cadastrados façam login com e-mail e senha.
- **Objetivo:** Verificar se um usuário consegue realizar login com credenciais válidas e se é redirecionado corretamente.
- **Ambiente de teste:** login.html acessado via navegador.

**Passos para execução:**
  1. Acessar a página de login.
  2. Informar um e-mail previamente cadastrado.
  3. Informar a senha correspondente.
  4. Clicar no botão “Entrar”.
  5. Observar se:
      -  O usuário é redirecionado para a tela principal (index.html)
      -  O cabeçalho exibe uma saudação: "Olá, [Nome do Usuário]"
  6. Opcionalmente, testar erro ao digitar senha incorreta.
     
**Critério de aprovação:** Redirecionamento bem-sucedido após login, exibição do nome do usuário no cabeçalho e mensagem de erro clara ao inserir dados inválidos. 
- **Responsável pelo caso de teste:** *Kaio Novais*

------------------------------------------------------------

**Caso de teste CT-002 – Enviar Denúncia de Maus-Tratos**

- **Requisito associado:** RF-002 – O sistema deve permitir que o usuário envie denúncias de maus-tratos ou abandono preenchendo um formulário.
- **Objetivo:** Verificar se o usuário consegue registrar corretamente uma denúncia por meio do formulário disponível.
- **Ambiente de teste:** Navegador web, site hospedado no Replit.

**Passos para execução:**
  1. Acessar página de denúncias. 
  2. Navegar até a seção “Cadastro de Denúncia” no final da página.
  3. Preencher os campos obrigatórios:
     - Nome do denunciante
     - E-mail
     - Telefone
     - Descrição (incluindo endereço detalhado da ocorrência)
  4. Clicar em “Enviar Denúncia”.
  5. Verificar se a seguinte mensagem é exibida:
      - "Denúncia enviada com sucesso!"

**Critério de aprovação:** O sistema deve exibir claramente a mensagem de envio da denúncia.  
- **Responsável pelo caso de teste:** *Rodrigo Diniz*

------------------------------------------------------------

**Caso de teste CT-003 – Preencher Formulário de Adoção**

- **Requisito associado:** RF-003 – O sistema deve disponibilizar um formulário de adoção para os usuários interessados em adotar um animal.
- **Objetivo:** Verificar se o formulário de adoção pode ser preenchido e enviado com sucesso.
- **Ambiente de teste:** Página de detalhes de animal, acessada via botão "Quero Adotar".

**Passos para execução:**
  1. Acessar página inicial.
  2. Escolher um animal na listagem.
  3. Clicar em “Quero Adotar”.
  4. Preencher todos os campos obrigatórios:
     - Nome completo
     - Data de nascimento
     - CPF
     - E-mail
     - Telefone
     - Endereço completo
     - Tipo de residência
     - Possui quintal (sim/não)
     - Motivo da adoção
     - Experiência anterior com animais
  5. Clicar em “Enviar”.
  6. Verificar se a mensagem de confirmação é exibida:
      - "Formulário enviado com sucesso! Caso for aceito, entraremos em contato com você por e-mail ou telefone."

**Critério de aprovação:** O sistema deve registrar o envio e exibir mensagem de sucesso ao final.
- **Responsável pelo caso de teste:** *Esther Ventura*

------------------------------------------------------------

**Caso de teste CT-004 – Enviar Formulário de Doações**

- **Requisito associado:** RF-004 – O sistema deve permitir que o usuário envie um formulário com intenção de doação.
- **Objetivo:** Verificar se o formulário de doação pode ser preenchido e enviado corretamente.
- **Ambiente de teste:** Página doacoes.html no navegador.

**Passos para execução:**
  1. Acessar a página de doações .
  2. Preencher os campos obrigatórios:
     - Nome 
     - E-mail
     - Telefone
     - Tipo de doação 
     - Valor estimado ou descrição do item
  3. Clicar em “Enviar”.
  4. Observar se:
      - Aparece a mensagem: "Doação enviada com sucesso!"
      - Os campos são limpos após o envio

**Critério de aprovação:** Exibição de mensagem de confirmação e Armazenamento local da doação ou envio simulado.
- **Responsável pelo caso de teste:** *Esther Ventura*



