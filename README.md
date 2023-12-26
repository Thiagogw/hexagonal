**Arquitetura Hexagonal**

----------------------------------------

**Estrutura**
- Core
- Adapter
- Infrastructure

**Core** - Camada responsável por manter as regras de negócio, que irá ser acessada atráves de portas (entrada e saida). A implementação das portas de entrada (Inbound) ficam no core com o nome de UseCase.

**Adapter** - Camada responsável por manter as implementações das portas de saida (oubound) e também os meios que vão chamar as portas de entrada (controller, mensageria, etc);

**Infrastrucutre** - Camada responsável por manter as configurações da aplicação, como BeanConfiguration por exemplo.

----------------------------------------

**Analise da Arquitetura**

----------------------------------------

**Vantagens**:

_Desacoplamento_:

A arquitetura hexagonal promove um alto nível de desacoplamento, permitindo que as lógicas de negócios e as lógicas de infraestrutura existam independentemente.

_Testabilidade_:

A separação clara entre as camadas facilita os testes, pois as lógicas de negócios podem ser testadas independentemente da infraestrutura.

_Adaptabilidade_:

A capacidade de substituir ou adaptar facilmente componentes da infraestrutura sem afetar a lógica de negócios é uma vantagem significativa.

_Foco no Domínio_:

O hexágono concentra-se no núcleo do sistema, colocando ênfase nas regras de negócios, o que pode ser benéfico para certos tipos de aplicativos.

**Desvantagens**:

_Complexidade de Implementação_:

A implementação do hexágono pode ser mais complexa, e a equipe precisa entender a divisão entre as diferentes camadas e como elas interagem.

_Excesso de Abstração_:

Em alguns casos, o uso excessivo de abstrações pode tornar o código mais difícil de entender, especialmente para desenvolvedores menos experientes.

_Possível Overhead_:

Em alguns casos, a adição de interfaces e camadas adicionais pode introduzir um overhead que não é justificado em todos os tipos de projetos.