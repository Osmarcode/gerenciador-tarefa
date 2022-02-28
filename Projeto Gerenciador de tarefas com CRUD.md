Projeto Gerenciador de tarefas com CRUD(Create, Read, Update e Delete),  foi tirado de uma playlist do youtube, no último vídeo é demonstrada à migração para o banco Postgresql e deploy no Heroku, além de documentação da API via Swagger, mas depois de um bom tempo pesquisando, não encontrei a solução para corrigir um problema no swagger, mesmo tendo feito todos os mapeamentos não funcionou, então essa parte de documentação não foi feita. Resolvi deixar o banco H2. Mesmo faltando essa parte o CRUD está totalmente funcional.

Ferramentas utilizadas:
IDE Eclipse;
Postman (para testar as requisições HTTP que foram GET(lista tarefas todas ou apenas pelo ID), PUT(edita tarefa pelo ID), POST(cria nova tarefa Gera ID Automaticamente), DELETE(exclui uma tarefa pelo ID));
Java 11;
Spring boot com suas dependências Maven:
Spring Data JPA (persistência de dados com hibernate);
Spring web (trabalhar com Restfull usando padrão MVC);
H2 Database (banco em memória, acessado localmente http://localhost:8080/h2-console/) ;
Rest Respositories (utilizando Spring Data Rest);
Spring boot dev tools(reinicia o projeto a cada modificação);

Link da playlist https://www.youtube.com/watch?v=un7EgWqgNMs&list=PL_pqVN-1MnwMScqW3AnPR0oA2SiBy0d2_&index=1
