# spring-security-demo

Projeto demo feito pra aprender a utilizar JWT junto com o Spring Security.
É possível cadastrar novos usuários que serão guardados em um banco de dados MySQL.
A autenticação é feita num endpoint separado, onde o usuário vai fazer uma requisição POST. No corpo desta requisição, o usuário e senha deverão ser enviados como JSON. Essas credenciais vão ser checadas no banco de dados e, se a autenticação for bem-sucedida, o usuário terá como resposta um JWT que pode ser usado pra ter acesso aos outros endpoints da aplicação.


Feito com:
- Spring Boot
- Spring Security
- Spring Data JPA

O Spring Security tem a funcionalidade embutia OAuth2 Resource Server que facilita muito toda a integração com os JWTs, precisando de quase nenhuma configuração pra rodar.

