# API Rest - Vega 🤖 Desenvolvimento de api a partir de especificação Swagger

Api rest a partir de uma especificação swagger.yml utilizando codegen (dependência maven).

# Tecnologias e ferramentas utilizadas no projeto
- Java 11
- [Maven vs 3.8.4](https://maven.apache.org/download.cgi)
- [Swagger (codegen)](https://swagger.io/docs/open-source-tools/swagger-codegen/)
- [Springboot](https://start.spring.io/) para criação do projeto base
- [IntelliJ IDEA Community](https://www.jetbrains.com/pt-br/idea/download/)
---
# Passos na criação do projeto
[Dependências springboot](https://start.spring.io/)

![dependencias-springinitial](https://user-images.githubusercontent.com/83174570/150195134-532b726d-b2bb-4567-9df7-243d47db311f.png)

# Dependências Maven e arquivo pom.xml
adicionado seguinte plugin:

![plugin-swagger](https://user-images.githubusercontent.com/83174570/150149260-a8a6fba6-537c-4bc2-9b1f-d69567fa79d4.png)
- cores:
1. branco - localização no projeto do arquivo swagger (yaml) com estrutura openapi 3 (definição dos endpoints e schemas)
2. verde - diretório de construção, onde será salvo a saída do código gerado dentro do target
3. azul - nome do diretório onde serão salvos os controllers (endpoints na definição swagger)
4. laranja - nome do diretório onde serão salvos os models (schemas ou entidades na definição swagger)

dependências annotations e validations:

![dependencias-swagger-codegen](https://user-images.githubusercontent.com/83174570/150150750-77967fc6-47db-4208-ab20-1bcc7234bf26.png)
---
# Construindo o arquivo swagger

- Acessar o endereço: https://editor.swagger.io/ nele podemos codificar com o intellisense do yaml para swagger, é possível salvar diretamente o projeto do swagger e criar server ou client com a documentação, porém neste projeto não o iremos utilizar desta maneira.
---
# Organização do nosso projeto
- Criamos os diretórios: client, controller e service

![organizacao-projeto](https://user-images.githubusercontent.com/83174570/150166643-da6736ec-264b-42b7-a4f0-d8bc3d900138.png)

- Após criar nosso documento swagger.yaml salvamos ele no nosso diretório resources, rodamos então o comando '''mvn clean compile'''. É necessário ter configurado o maven em sua máquina ou se utilizando o IntelliJ IDEA usar o terminal de comandos para maven. Tendo executado o comando é esperado que tenham sido criados os pacotes, classes e interface controller.

![api-gerada](https://user-images.githubusercontent.com/83174570/150184487-bb2c2bd1-331c-451e-a1b4-582a40aecdd0.png)
Api gerada é uma interface com os annotations necessários nas requisições rest, podemos implementar seus métodos em um controller, e faremos isto no diretório controller criado anteriormente.


