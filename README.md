# spring-security-demo

Projeto demo feito pra aprender a utilizar JWT junto com o Spring Security.
É possível cadastrar novos usuários que serão guardados em um banco de dados MySQL. Esse banco de dados é consultado quando é feita uma eventual tentativa de autenticação na aplicação. Se for sucedida, o usuário tem como retorno um token JWT.

Feito com:
- Spring Boot
- Spring Security
- Spring Data JPA

O Spring Security tem a funcionalidade embutia OAuth2 Resource Server que facilita muito toda a integração com os JWTs, precisando de quase nenhuma configuração pra rodar.

