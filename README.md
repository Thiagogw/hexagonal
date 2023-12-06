**Arquitetura Hexagonal**

Estrutura:
- Core
- Adapter
- Infrastructure

**Core** - Camada responsável por manter as regras de negócio, que irá ser acessada atráves de portas (entrada e saida). A implementação das portas de entrada (Inbound) ficam no core com o nome de UseCase.

**Adapter** - Camada responsável por manter as implementações das portas de saida (oubound) e também os meios que vão chamar as portas de entrada (controller, mensageria, etc);

**Infrastrucutre** - Camada responsável por manter as configurações da aplicação, como BeanConfiguration por exemplo.

