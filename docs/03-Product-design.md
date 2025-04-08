# Product design

<span style="color:red">Pré-requisitos: <a href="02-Product-discovery.md"> Product discovery</a></span>

## Histórias de Usuários

![Histórias de Usuários](https://github.com/user-attachments/assets/a42468cc-1f30-4c05-b3ca-0040304c42a0)


## Proposta de valor

![Proposta de Valor](https://github.com/user-attachments/assets/a6f7a930-60b9-4e3b-8833-3a401e3019a2)

## Requisitos

As tabelas a seguir apresentam os requisitos funcionais e não funcionais que detalham o escopo do projeto. Para determinar a prioridade dos requisitos, aplique uma técnica de priorização e detalhe como essa técnica foi aplicada.

### Requisitos funcionais

| ID     | Descrição do Requisito                                   | Prioridade |
| ------ | -------------------------------------------------------- | ---------- |
| RF-001 | O sistema deve permitir o usuário se cadatrar e fazer login | ALTA       |
| RF-002 | O sistema deve permitir o usuário fazer cadastro de ONGs ou para trabalhos voluntários | ALTA     |
| RF-003 | O sistema deve permitir fazer denúncias de casos de maus-tratos | ALTA       |
| RF-004 | O sistema deve permitir registrar um animal abandonado com fotos e localização | ALTA       |
| RF-005 | O sistema deve exibir um catálogo de animais disponíveis para adoção | ALTA       |
| RF-006 | O sistema deve permitir que os usuários informem localização, fotos e descrições de um animal abandonado | MÉDIA      |
| RF-007 | O sistema deve enviar notificações para os abrigos cadastrados quando um novo animal for resgatado | MÉDIA       |
| RF-008 | O sistema deve permitir que as pessoas possam contribuir com doações | ALTA   |
| RF-009 | O sistema deve permitir que pessoas possam adotar animais  | ALTA       |

### Requisitos não funcionais

| ID      | Descrição do Requisito                                                              | Prioridade |
| ------- | ------------------------------------------------------------------------------------- | ---------- |
| RNF-001 | O sistema deve carregar em menos de 3 segundos | BAIXA    |
| RNF-002 | O sistema deve estar disponível 24 horas por dia | ALTA      |
| RNF-003 | O sistema deve suportar um alto número de acessos simultâneos sem comprometer a performance | MÉDIA     |
| RNF-004 | O sistema deve seguir as diretrizes da LGPD (Lei Geral de Proteção de Dados), garantindo o sigilo das denúncias anônimas | ALTA     |
| RNF-005 | O sistema deve ser responsivo para rodar em dispositivos móveis | BAIXA    |
| RNF-006 | O tempo de carregamento das páginas com listas de animais não deve ultrapassar 2 segundos em conexões estáveis.  | MÉDIA     |
| RNF-007 | A navegação deve ser clara, com menus bem organizados e linguagem acessível. | ALTA     |



## Restrições

|ID| Restrição                                             |
|--|-------------------------------------------------------|
|001| O projeto deverá ser entregue até o final do semestre |
|002| O sistema será limitado à aplicação web, sem versão para aplicativos nativos.  |
|003| O sistema deverá ser desenvolvida com tecnologias livres e de código aberto (ex: HTML, CSS, JavaScript, etc.) |
|004| Todos os animais disponíveis para adoção devem ser registrados no sistema com informações detalhadas, incluindo nome, idade, raça, estado de saúde e histórico de vacinação.  |
|005| Os usuários devem se cadastrar no sistema para realizar ações como adotar um animal ou fazer uma denúncia. O cadastro deve incluir informações pessoais, como nome, endereço, telefone e e-mail. |
|006| Um usuário não pode adotar mais de um animal por vez  |
|007| As denúncias devem ser analisadas e respondidas em um prazo máximo de 48 horas.  |
|008| O sistema deve exigir que os adotantes aceitem um termo de responsabilidade que descreva os cuidados necessários para o animal.
  |
