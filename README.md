# Projeto Maven - Exercício  

Este projeto é um exercício simples de criação de um projeto **Maven**, incluindo dependências básicas para testes, manipulação de JSON e utilitários do Apache Commons.  

## 📌 Tecnologias Utilizadas  

- **Java**  
- **Maven**  
- **JUnit** (para testes)  
- **Gson** (para manipulação de JSON)  
- **Apache Commons Lang** (biblioteca de utilitários Java)  

## 📂 Estrutura do Projeto  

```plaintext
/exercicio-maven
│── src/
│   ├── main/java/      # Código-fonte principal
│   ├── test/java/      # Testes unitários
│── pom.xml             # Arquivo de configuração do Maven
│── README.md           # Documentação do projeto
⚙️ Configuração
Clone o repositório:

sh
Copiar
Editar
git clone https://github.com/seu-usuario/exercicio-maven.git
cd exercicio-maven
Compile o projeto:

sh
Copiar
Editar
mvn clean install
Execute os testes:

sh
Copiar
Editar
mvn test
📜 Dependências Maven
As seguintes bibliotecas foram adicionadas ao pom.xml:

xml
Copiar
Editar
<dependencies>
    <!-- JUnit para testes -->
    <dependency>
        <groupId>org.junit.jupiter</groupId>
        <artifactId>junit-jupiter-api</artifactId>
        <scope>test</scope>
    </dependency>

    <!-- Gson para manipulação de JSON -->
    <dependency>
        <groupId>com.google.code.gson</groupId>
        <artifactId>gson</artifactId>
    </dependency>

    <!-- Apache Commons Lang -->
    <dependency>
        <groupId>org.apache.commons</groupId>
        <artifactId>commons-lang3</artifactId>
    </dependency>
</dependencies>
🚀 Como Contribuir
Faça um fork do projeto
Crie uma nova branch (git checkout -b minha-feature)
Faça commit das suas alterações (git commit -m 'Minha nova feature')
Faça push para a branch (git push origin minha-feature)
Abra um Pull Request 🚀
