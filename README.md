# Microserviços em Springbot

* Banco em Postgres
  * Utilizado imagem docker para o banco
  * arquivo docker-compose monta a instância do banco e o pgadmim
* Config-server
  * Configurações de acesso ao banco de todos os serviços
* Eureka-server
  * Registra os serviços e cria a rede entre eles
* Serviços
  * Fornecedor
  * Loja