# JDBC Connection

Este repositório tem os elementos necessários para fazer uma conexão com um banco de dados local.

Foi criado o "db.properties" com os dados de conexão, "DB" com os métodos que fazem a conexão e fecham essa conexão, uma classe "DBException" que é uma classe de exceção 
personalizada e a classe com o método main criada exclusivamente para conectar com o banco local e fechar a conexão.
 
O banco de dados foi criado no MySql, usando o DBEaver como programa de gerenciamento do banco de dados.
Para fazer a conexão baixei o ConnectorJ do MySql:
https://dev.mysql.com/downloads/connector/j/?os=26

Essa biblioteca foi salva localmente em "C:\java-libs\jdbc-connectors" e carregada como External Libraries no IntelliJ em File -> Project Structure -> Libraries.
