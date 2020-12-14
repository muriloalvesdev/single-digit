[![Build Status](https://travis-ci.com/muriloalvesdev/single-digit.svg?branch=main)](https://travis-ci.com/muriloalvesdev/single-digit)
[![codecov](https://codecov.io/gh/muriloalvesdev/single-digit/branch/main/graph/badge.svg?token=9BOGVW2OBM)](https://codecov.io/gh/muriloalvesdev/single-digit)
[![Java Code Style](https://img.shields.io/badge/code%20style-eclipse-brightgreen.svg?style=flat)](https://raw.githubusercontent.com/google/styleguide/gh-pages/eclipse-java-google-style.xml "Eclipse/STS Code Style")
[![Java Code Style](https://img.shields.io/badge/code%20style-intellij-brightgreen.svg?style=flat)](https://github.com/google/styleguide/blob/gh-pages/intellij-java-google-style.xml "Intellij Code Style")
[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](https://opensource.org/licenses/Apache-2.0)

## Tecnologias 
- [Spring Boot](https://spring.io/projects/spring-boot) - Framework de Desenvolvimento para a Linguagem Java.

- [Lombok](https://projectlombok.org/) - Biblioteca Java focada em produtividade e redução de código boilerplate que, por meio de anotações adicionadas ao nosso código, ensinamos o compilador (maven ou gradle) durante o processo de compilação a criar código Java.

- [JUnit5](https://junit.org/junit5/) - Framework facilita a criação e manutenção do código para a automação de testes com apresentação dos resultados.

- [Mockito](https://site.mockito.org/) - Estrutura de teste de código aberto para Java liberada sob a licença MIT. A estrutura permite a criação de objetos duplos de teste em testes de unidade automatizados com o objetivo de desenvolvimento orientado a teste ou desenvolvimento orientado a comportamento.

- [Docker](https://www.docker.com/) - Plataforma open source que facilita a criação e administração de ambientes isolados. Ele possibilita o empacotamento de uma aplicação ou ambiente dentro de um container, se tornando portátil para qualquer outro host que contenha o Docker instalado.

- [Swagger](https://swagger.io/) - Essencialmente uma linguagem de descrição de interface para descrever APIs RESTful expressas usando JSON.


## Pré requisitos
 - [Maven](https://maven.apache.org/) - Ferramenta de automação de compilação utilizada primariamente em projetos Java.
 - [Docker](https://docs.docker.com/get-docker/) - Execução de aplicativos de containers.
 - Conclusão da instalação do módulo [API-SERVICE](https://github.com/muriloalvesdev/api-service)

## Iniciando projeto
 - Clone o projeto ` $ git clone https://github.com/muriloalvesdev/single-digit.git` e acesse o diretório do projeto `cd single-digit`.
 - Basicamente, você só precisa executar o script `docker-run.sh`. Dê permissão de execução para o arquivo `$ chmod +x docker-run.sh`
 - Execute o script `$ ./docker-run.sh`
 - O script vai gerar uma imagem do projeto e criar um container do projeto.
 - Para testar se o projeto está ativo, veja a documentação das APIs do projeto [clicando aqui](http://localhost:8081/swagger-ui.html)
