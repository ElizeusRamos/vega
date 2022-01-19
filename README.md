# API Rest - Vega 🤖 Desenvolvimento de api a partir de especificação Swagger - Consumo da API externa PokeApi ![image](https://user-images.githubusercontent.com/83174570/150138733-b2631662-f52a-4913-9d01-d58b70d268e9.png)

Api rest a partir de uma especificação swagger.yml utilizando codegen (dependência maven).
Esta api consome dados da api externa PokeApi 
 https://pokeapi.co/docs/v2 e retorna seus dados pelos endpoints locais

# Tecnologias e ferramentas utilizadas no projeto
- Java 11
- Swagger (codegen) https://swagger.io/docs/open-source-tools/swagger-codegen/
- Springboot https://start.spring.io/ para criação do projeto base
- Webflux
- Estruturação Rest
- Postman https://www.postman.com/ para testes de serviço
---
# Passos na criação do projeto
Dependências springboot https://start.spring.io/

![dependencias-springinitial](https://user-images.githubusercontent.com/83174570/150145540-ce79653a-be87-41f1-a169-072b6c459054.png)

# Dependências Maven e arquivo pom.xml
adicionado seguinte plugin:

![plugin-swagger](https://user-images.githubusercontent.com/83174570/150149260-a8a6fba6-537c-4bc2-9b1f-d69567fa79d4.png)
- cores:
1. branco - localização no projeto do arquivo swagger (yaml) com estrutura openapi 3 (definição dos endpoints e schemas)
2. verde - diretório de construção, onde será salvo a saída do código gerado dentro do target
3. azul - nome do diretório onde serão salvos os controllers (endpoints na definição swagger)
4. laranja - nome do diretório onde serão salvos os models (schemas ou entidades na definiçaõ swagger)

dependências annotations e validations:

![dependencias-swagger-codegen](https://user-images.githubusercontent.com/83174570/150150750-77967fc6-47db-4208-ab20-1bcc7234bf26.png)


---
# Como utilizar o projeto
