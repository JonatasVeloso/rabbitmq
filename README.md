- Baixar e instalar Erlang OTP
- Baixar e instalar RabbitMQ

- Instalar Plugin de gerenciamento  
	- Abrir RabbitMQ Prompt
	- Executar comando rabbitmq-plugins enable rabbitmq_management

- Executar o Server
	- rabbitmq-server start

*****************************
** PARA INICIAR O PRODUCER **
*****************************

- run RabbitmqApplication.java
- GET localhost:8090/enviaxml
  - colocar mensagem no corpo

*****************************
** PARA INICIAR O CONSUMER **
*****************************

- run Recv.java as JavaApplication
