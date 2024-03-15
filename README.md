# spring-security

Projeto de Demonstração - Funcionalidades do Spring Security, Flyway Migration, Lombok e Spring Data JPA
Este é um projeto de demonstração destinado a mostrar a implementação e o uso das seguintes funcionalidades:

**Spring Security:** Implementação de autenticação e autorização em um aplicativo Spring Boot.

**Flyway Migration:** Gerenciamento de versionamento e migração de banco de dados usando o Flyway.

**Lombok:** Redução da verbosidade do código Java através da geração automática de métodos getters, setters, construtores, entre outros.

**Spring Data JPA:** Facilitação da interação com banco de dados relacionais usando a JPA (Java Persistence API) no contexto do Spring Framework.

**JWT (JSON Web Token):** O uso de JWTs simplifica a autenticação, pois permite que os servidores validem a identidade do usuário com base nas informações contidas no token, sem a necessidade de consultar um banco de dados centralizado. Isso os torna ideais para arquiteturas distribuídas e escaláveis.

**Como Clonar o Projeto**

Para clonar este projeto, siga estas etapas:
Certifique-se de ter o Git instalado em sua máquina. 

Você pode baixá-lo e instalá-lo a partir do site oficial do Git.

Abra seu terminal ou prompt de comando.

Navegue até o diretório onde deseja armazenar o projeto.

Execute o seguinte comando para clonar o projeto: _**git clone https://github.com/francilioalencar/spring-security.git**_

Após a conclusão do processo, você terá uma cópia local do projeto em seu sistema.

**Como Executar o Projeto**

Utilizando o Mysql, 

**Schema:** portifolio-spring

**Usuario:** spring

**Senha:** Senha@123

Definir as permissões necessárias para que as migrations executem

Após realizar o clone do projeto, navegue até o diretório raiz do projeto clonado

Execute o seguinte comando para compilar e executar o projeto: _**./mvnw spring-boot:run**_

Certifique-se de ter o JDK (Java Development Kit) instalado em sua máquina. Você pode baixá-lo e instalá-lo a partir do site oficial da Oracle ou de um distribuidor de JDK como o OpenJDK.
No diretorio raiz do projeto, no terminal execute o comando: ./mvnw spring-boot:run

O serviço será executado localmente em http://localhost:8080. Você pode acessar este URL em seu navegador para interagir com o aplicativo.

**Como Testar o Projeto:**

**Requisição:** Post

**Endpoint:** http://localhost:8080/user

**Json:**

 {
 
	  "name": "admin",

    "password": "123456"
 }



Para testar as APIs deste projeto, você pode utilizar o framework de teste de API de sua preferência. 
Alguns exemplos populares incluem:

**Postman:** Um aplicativo de desktop que permite testar APIs de forma interativa e automatizada.

**Insomnia:** Outro aplicativo de desktop semelhante ao Postman, que permite testar APIs de maneira fácil e eficaz.

**RestAssured:** Uma biblioteca Java para testar APIs RESTful, que pode ser integrada a estruturas de teste como JUnit e TestNG.

_Escolha o framework que melhor se adequa às suas necessidades e preferências, e utilize-o para testar as funcionalidades oferecidas por este projeto._

**Versão do Spring Boot:** 3.2.3

**Versão do Java:** 17

Este projeto foi desenvolvido para fins de demonstração e aprendizado. Sinta-se à vontade para explorar, modificar e utilizar o código conforme necessário. Se tiver alguma dúvida ou problema, não hesite em abrir uma issue no repositório do GitHub ou entrar em contato com os mantenedores do projeto. Esperamos que este projeto seja útil para você no seu aprendizado e desenvolvimento com Spring Boot e tecnologias relacionadas.
