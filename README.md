# Calculadora de Horas Trabalhadas

## Descrição

Este projeto é uma aplicação Java para calcular a duração do tempo trabalhado entre horários de entrada e saída. Ele utiliza o padrão Command para organizar as ações e a Java Time API para manipulação de horários.

## Funcionalidades

✅ **Registrar horário de entrada:** Entrada no formato HH:mm:ss.  
✅ **Registrar horário de saída:** Saída no formato HH:mm:ss.  
⏳ **Calcular duração do tempo trabalhado:** Diferença entre entrada e saída.  
🕒 **Exibir duração formatada:** Mostra tempo total em horas e minutos.  
💻 **Interface CLI:** Interação por linha de comando.

## Tecnologias Utilizadas

☕ **Java 21 (LTS):** Versão mais recente com melhorias de desempenho e segurança.  
⏳ **Java Time API (`java.time`)**: Para manipulação precisa de horários.  
🛠 **Git:** Controle de versão para gerenciamento do código.  
💡 **IntelliJ IDEA:** Ambiente de desenvolvimento integrado (IDE).  

## Estrutura do Projeto

📦 **calculadora-horas-trabalhadas**  
 ┣ 📂 **src/main/java**               # Diretório principal do código-fonte  
 ┃ ┣ 📂 **application**                # Inicialização da aplicação  
 ┃ ┃ ┣ 📜 **Main.java**                # Ponto de entrada principal  
 ┃ ┣ 📂 **controller**                 # Camada de controle  
 ┃ ┃ ┣ 📜 **Controller.java**          # Coordena a interação entre camadas  
 ┃ ┣ 📂 **domain**                     # Camada de domínio (Regras de Negócio)  
 ┃ ┃ ┣ 📂 **command**                   # Implementação do Padrão Command  
 ┃ ┃ ┃ ┣ 📜 **Command.java**            # Interface para comandos  
 ┃ ┃ ┃ ┣ 📜 **RegisterEntryCommand.java**  # Registra entrada  
 ┃ ┃ ┃ ┣ 📜 **RegisterExitCommand.java**   # Registra saída  
 ┃ ┃ ┃ ┣ 📜 **CalculatorDurationCommand.java**  # Calcula duração  
 ┃ ┃ ┣ 📜 **Invoker.java**               # Responsável por executar comandos  
 ┃ ┃ ┣ 📜 **TimerCalculator.java**       # Lógica de cálculo de tempo  
 ┃ ┣ 📂 **presentation**                # Camada de apresentação (Interface com o Usuário)  
 ┃ ┃ ┣ 📜 **Menu.java**                 # Exibe o menu principal e interação do usuário  
 ┃ ┃ ┣ 📜 **InputHandler.java**         # Lida com entrada de dados  
 ┃ ┃ ┣ 📜 **OutputFormatter.java**      # Formata a saída de informações  
 ┣ 📜 **.gitignore**                   # Arquivo para ignorar arquivos irrelevantes no Git  
 ┣ 📜 **README.md**                    # Documentação do projeto  

## Padrões de Projeto e Boas Práticas

🏛 **Padrão Command:** Ações encapsuladas em comandos reutilizáveis.  
📌 **Separacão de Responsabilidades:** Código organizado por camadas (application, controller, domain, presentation).  
✅ **Nomes Descritivos:** Variáveis e métodos claros e intuitivos.  
💬 **Comentários Explicativos:** Código documentado para facilitar entendimento.  
📖 **Commits Atômicos:** Cada alteração tem um propósito específico.  
🔀 **Integração Contínua:** Código atualizado regularmente com o repositório remoto.  
📃 **Documentação Completa:** `README.md` com detalhes sobre o projeto.  

## Como Executar o Aplicativo

1️⃣ Clone o repositório:  
   ```bash
   git clone <URL_DO_REPOSITÓRIO>
   ```
2️⃣ Navegue até o diretório do projeto:  
   ```bash
   cd calculadora-horas-trabalhadas
   ```
3️⃣ Compile o projeto (certifique-se de ter o Java 21 instalado):  
   ```bash
   javac --release 21 src/main/java/application/Main.java
   ```
4️⃣ Execute o projeto:  
   ```bash
   java --enable-preview application.Main
   ```

## Uso

1️⃣ Execute o aplicativo e escolha uma opção do menu:
   * `1` - Registrar Entrada (ex: `08:30:00`)
   * `2` - Registrar Saída (ex: `17:30:00`)
   * `3` - Sair
2️⃣ A duração do tempo trabalhado será exibida.  
3️⃣ Digite `3` para encerrar o programa.

## Contribuição

🚀 Contribuições são bem-vindas! Para colaborar:
1️⃣ Faça um fork do repositório.  
2️⃣ Crie uma branch para sua funcionalidade:  
   ```bash
   git checkout -b minha-funcionalidade
   ```
3️⃣ Faça commit das alterações:  
   ```bash
   git commit -am 'Adiciona nova funcionalidade'
   ```
4️⃣ Faça push para a branch:  
   ```bash
   git push origin minha-funcionalidade
   ```
5️⃣ Crie um pull request.  


## Autor

👤 **Ezio Cintra de Lima**


