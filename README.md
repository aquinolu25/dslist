# DsList

DsList é uma API REST desenvolvida em Java, projetada para estudo e aplicação de boas práticas de programação. Esta API simula um repositório de jogos, permitindo a manipulação de informações como nome, ano, gênero, imagem e descrição de cada jogo.

## Funcionalidades

- **Endpoint `/games`**: Retorna uma lista de todos os jogos cadastrados.
- **Endpoint `/games/{id}`**: Retorna informações detalhadas de um jogo específico, identificado pelo seu ID.
- **GET Mapping para busca de todos os jogos**: Endpoint para buscar e retornar todos os jogos cadastrados.
- **GET Mapping para busca de jogo por ID**: Endpoint para buscar e retornar um jogo específico com base no seu ID.
- **Implementação de lista dinâmica**: Uma lista dinâmica é implementada para permitir a troca de posições dos jogos na listagem. Isso é realizado através do método `move()` na camada de serviço.

## Estrutura do Projeto

O projeto está organizado nos seguintes pacotes:

- **Config**: Contém as configurações da aplicação.
- **Controllers**: Classes responsáveis por mapear os endpoints da API.
- **DTO**: Data Transfer Objects (DTOs) para transferência de dados entre camadas.
- **Entities**: Entidades que representam os objetos do domínio.
- **Projection**: Projeções utilizadas para definir a estrutura das consultas.
- **Repository**: Repositórios responsáveis pela comunicação com o banco de dados.
- **Service**: Lógica de negócio e manipulação dos dados.

## Como Usar

1. Clone este repositório em sua máquina local.
2. Importe o projeto em sua IDE Java favorita.
3. Certifique-se de ter todas as dependências necessárias instaladas.
4. Execute a aplicação.
5. Utilize ferramentas como Postman ou cURL para interagir com os endpoints da API.

## Contribuindo

Contribuições são bem-vindas! Sinta-se à vontade para propor melhorias, correções de bugs ou novas funcionalidades através de pull requests.

## Autor

Luiz Gonzaga de Aquino Neto (https://github.com/aquinolu25)
