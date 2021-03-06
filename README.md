## Server manager
Projeto criado para fins de estudos onde foram criandos o front-end e o back-end de um WEB app de gerenciamento de servidores.

⚠️ ```O servidor foi desabilitado devido ao esgotamento de horas do free tier da AWS, utilizarei-o em outros projetos```

Confira a API aqui: http://servermanagerbackend-env-1.eba-uu28akxc.us-east-1.elasticbeanstalk.com/swagger-ui.html#

## funcionalidades

- CRUD de servidores
- Reports de todos os servidores da lista em xls
- Checagem de pings para servidores da mesma rede local

## Techs

Ferramentas utilizadas:

- [Swagger] - Documentacao da API
- [Spring Boot] - Estrutura em REST
- [MySql] - Armazenamento dos dados para teste
- [Postman e Insomnia] - Testes de endpoints
- [Elastic Beanstalk] - Deploy da API
- [RDS] - Banco de dados na cloud
- [maven] - automação de compilação
- [Jakarta XML] - para os reports em xls

# API sendo consumida no Front

## Lista de todos os servidores do gerenciador
![tela-de-servidores](https://user-images.githubusercontent.com/86020448/173208153-b97faf23-74f5-4bac-8731-48bb9e9ec5b5.png)

## Adicionando servidores
![tela-de-adicao](https://user-images.githubusercontent.com/86020448/173208152-63285890-36e7-416e-9efd-67dab2f55d6a.png)


# Tutoriais seguidos: 
https://www.youtube.com/watch?v=8ZPsZBcue50&t=3675s

https://www.youtube.com/watch?v=JAyjGiQHWf8&t=1688s

https://www.youtube.com/watch?v=4NmfQ2qZZjM&t=2s

https://www.youtube.com/watch?v=9SGDpanrc8U

https://www.youtube.com/watch?v=9SGDpanrc8U

```⚠️ O projeto ainda precisa de alguns reparos de CORs policy para poder fazer o deploy do front porem, em localhost, o mesmo funciona perfeitamente ⚠```
