# Feign Client

Este é um projeto Java Spring que utiliza Feign para se comunicar com uma API externa (fakestoreapi) e recuperar uma lista de produtos. O projeto inclui um controlador, um serviço e uma interface Feign para facilitar a integração com a API externa.

## Tecnologias Utilizadas

- Java
- Spring boot
- Feign
- Lombok
- Swagger (para documentação da API)

## Estrutura do Projeto

- `ProductsDTO`: Classe que representa os dados dos produtos.
- `ApiClientController`: Controlador Spring responsável por lidar com as solicitações relacionadas aos produtos.
- `ApiClientService`: Serviço que utiliza a interface Feign para buscar produtos da API externa.
- `ApiClient`: Interface Feign que define os métodos para interagir com a API externa.

## Documentação da API

Acesse `localhost:8080/swagger-ui/index.html` para explorar a documentação interativa da API.




