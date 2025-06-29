# Arquitetura da solução

<span style="color:red">Pré-requisitos: <a href="05-Projeto-interface.md"> Projeto de interface</a></span>

A arquitetura da aplicação **Patas&Lares** foi estruturada de forma simples, modular e eficiente, ideal para projetos acadêmicos com foco em usabilidade, acessibilidade e organização de dados em ambiente web.

A aplicação é composta por páginas estáticas HTML/CSS/JS, manipuladas dinamicamente com JavaScript, e armazenamento local (via localStorage e JSON Server). A hospedagem foi feita no **Replit**, com versionamento e colaboração por meio do **GitHub**.

A estrutura da aplicação pode ser dividida em três grandes blocos:

1. **Front-end Web Responsivo:**

 - HTML5, CSS3 e JavaScript puro;
 - Uso de Bootstrap para responsividade;
 - Ícones da biblioteca Font Awesome;
 - Layout dividido em componentes reutilizáveis: cabeçalho, conteúdo e rodapé.

2. **Armazenamento e Dados:**

 - Utilização de localStorage para armazenar dados do navegador localmente;
 - Arquivo dados.json simula um banco de dados inicial;
 - API local com JSON Server para simular requisições CRUD (Create, Read, Update, Delete).
  
3. **Ambiente de Hospedagem e Colaboração:**

 - Replit: plataforma utilizada para hospedagem e testes online;
 - GitHub: controle de versão e repositório colaborativo;
 - GitHub Projects: gerenciamento de tarefas com Kanban.

## Funcionalidades da Aplicação 

**Cadastro e Gerenciamento de Animais:** Permite a inclusão, visualização, edição e exclusão de animais disponíveis para adoção.

- Estrtura de dados: Animais
- Acesso:
  - Página: cadastroAnimal.html
  - Dados armazenados via localStorage
- Telas:
  - Formulário de cadastro com preview de imagem;
  - Tabela com animais cadastrados;
  - Botões de edição e exclusão. 

**Visualização de Animais na Página Principal:** Exibe todos os animais cadastrados, integrando os dados do JSON local e do localStorage.

- Página: index.html
- Arquivo JS: paginaPrincipal.js

**Sistema de Login e Cadastro de Usuários e Ongs:** Permite que usuários e ongs se cadastrem, façam login e vejam seus dados no cabeçalho.

- Página: login.html, cadastroUsuario.html
- Autenticação via: localStorage

**Denúncias de Maus-tratos:** Formulário para envio de denúncias anônimas com campos de localização, descrição e imagem.

- Página: denuncias.html

**Blog Informativo:** Postagens com conteúdo educativo e notícias sobre adoção responsável.

- Página: blog.html
- 
![Captura de tela 2025-06-29 191955](https://github.com/user-attachments/assets/040b0a03-61d0-4bc0-b30c-c88d14cf28a5)

<br>

# Estrutura de Dados

**Estrutura de dados - Animais** 

```json
{
   "id": 1,                                               
   "nome": "Bidu",                                       
   "idade": "24",                                                   
   "especie": "Cachorro",                                           
   "raca": "Vira-lata",                                              
   "porte": "Médio",                                               
   "sexo": "Macho",                                                 
   "vacinado": true,                                               
   "castrado": false,                                              
   "descricao": "Muito brincalhão e carinhoso.",                          
   "foto": "base64 ou URL da imagem",                                     
   "localizacao": "Belo Horizonte - MG",                                    
   "nomeResponsavel": "Joana Silva",                                   
   "emailResponsavel": "joana@email.com",                                      
   "telefoneResponsavel": "31999999999"                                        
}

```

##### Estrutura de dados - Usuários 

```json
  {
    id: 1,
    nome: "Joao Souza",
    email: "joao@email.com",
    senha: "senha123"
  }

```

# Módulos, bibliotecas e APIs Utilizadas

|  Tipo   |          Tecnologia                               | Fiinalidade |
| ------ | -------------------------------------------------------- | ---------- |
| Framework CSS | Bootstrap 5 | Layout responsivo e estilização |
| Biblioteca de ícones | Font Awesome 4.7 | Ícones para UI (olho, pata etc.) |    
| Scripts | JavaScript |Manipulação do DOM, eventos e dados |
| Servidor local | JSON Server | Simulação de API REST para testes |
| Hospedagem | Replit |Deploy gratuito e testes |
| Controle de versão | GitHub | Armazenamento, colaboração e versionamento|
| Gerenciamento de tarefas | GitHub Projects (Kanban) | Planejamento e controle de sprints |

# Hospedagem da Aplicação 

A aplicação foi publicada e testada na plataforma Replit, permitindo a visualização em tempo real sem necessidade de servidor backend robusto.

- Ambiente de deploy: Replit
- Deploy automático ao salvar o projeto no editor online;
- Links acessíveis via navegador (inserir o link da versão hospedada quando disponível).
