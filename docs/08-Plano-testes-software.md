# Plano de testes de software

O plano de testes de software é gerado a partir da especificação do sistema e consiste em casos de teste que deverão ser executados quando a implementação estiver parcial ou totalmente pronta. Apresente os cenários de teste utilizados na realização dos testes da sua aplicação. Escolha cenários de teste que demonstrem os requisitos sendo satisfeitos.

Enumere quais cenários de testes foram selecionados para teste. Neste tópico, o grupo deve detalhar quais funcionalidades foram avaliadas, o grupo de usuários que foi escolhido para participar do teste e as ferramentas utilizadas.

Não deixe de enumerar os casos de teste de forma sequencial e garantir que o(s) requisito(s) associado(s) a cada um deles esteja(m) correto(s) — de acordo com o que foi definido na <a href="03-Product-design.md">Especificação do projeto</a>.

Primeiro Teste : 
--------------------------------------------------

Caso de teste: CT-001 – Enviar Denúncia de Maus-Tratos
Requisito associado: RF-001 – O sistema deve permitir que o usuário envie denúncias de maus-tratos ou abandono preenchendo um formulário.

Objetivo do teste: Verificar se o usuário consegue registrar uma denúncia corretamente.

Passos:
  |Acessar o site https://adota-amigo.com/denuncias.html.
  |Ir a página Denuncia. |
  |Fim da página irá ter Cadastro de Denúncia. |
  |Preencher os campos obrigatórios: nome do denunciante, e-mail,telefone, descrição (contendo endereço ). |
  |Clicar em “Enviar Denúncia”.  |
  |Após irá aparecer a mensagem "Denúncia enviada com sucesso !"  |

  |Critério de aprovação: O sistema confirma o envio da denúncia com mensagem de sucesso.  |
  |Responsável pela elaboração do caso de teste | Rodrigo Diniz.


------------------------------------------------------------

Caso de teste: CT-002 – Preencher Formulário de Adoção
Requisito associado: RF-002 – O sistema deve disponibilizar um formulário de adoção para os usuários interessados em adotar um animal.

Objetivo do teste: Verificar se o usuário consegue preencher e enviar o formulário de adoção.

Passos:
Acessar o site (colocar repósitorio replit.)
Escolher um animal para adoção.
Clicar em “Quero Adotar”.
Preencher os campos obrigatórios: nome completo,data de nascimento,cpf, e-mail, telefone, endereço completo (cep, estado,cidade, bairro, rua, número),tipo de residência,possui quintal, o por que deseja adotar umm animal e se já teve expêriencia com um .
Clicar em “Enviar ".

Critério de aprovação: O sistema confirma o envio do formulário e exibe mensagem com enviado com sucesso! Caso for aceito, entraremos em contato com você por e-mail ou telefone..

Responsável pela elaboração: Esther Ventura.


