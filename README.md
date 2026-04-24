**CheckPoint 02 - Domain Driven Design**


Problemas Resolvidos no Código Legado

1. **Nomenclatura (Clean Code):** Variáveis sem sentido (`pl`, `cap`, `s`) foram renomeadas para nomes descritivos (`placa`, `capacidade`, `status`).
2. **Falta de Encapsulamento:** Os atributos públicos, que permitiam dados inválidos (como capacidade negativa), foram tornados `private`. O acesso e a validação agora ocorrem via Construtores e métodos Getters/Setters.
3. **Código Duplicado:** Foi aplicada a **Herança (DRY)**. Caminhão e Moto agora herdam atributos e métodos comuns de uma classe abstrata `Veiculo`.
4. **Associação Engessada:** Foi aplicado o princípio do **Polimorfismo**. A classe `Rota` agora se associa à classe pai `Veiculo`, permitindo que o sistema aceite dinamicamente entregas de Caminhão ou Moto, tornando-o escalável.

Estrutura do Projeto (UML)

O diagrama de classes foi desenhado no **Astah** seguindo as normas UML, contendo:
* **Classe Abstrata:** `Veiculo`
* **Herança (Generalization):** `Caminhao` e `Moto` herdando de `Veiculo`
* **Associações Diretas:** `Rota` conectada a `Pacote` e `Veiculo`

> A imagem exportada do diagrama (`.png`) e o projeto original do Astah estão disponíveis nos arquivos deste repositório.

---
**Autor:** Felipe Ramalho Rodrigues  
**Curso:** Ciência da Computação - FIAP Paulista
