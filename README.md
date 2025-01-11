# Gerenciador de Tarefas (To-Do List)

Um simples gerenciador de tarefas em Java, que permite criar, listar, editar e excluir tarefas diretamente pelo console. Este projeto é ideal para iniciantes aprenderem conceitos básicos de Java, como programação orientada a objetos, listas, e interação com o usuário.

## Funcionalidades
- Adicionar uma nova tarefa.
- Listar todas as tarefas.
- Editar a descrição ou o status de uma tarefa existente.
- Excluir uma tarefa.
- (Opcional) Persistir as tarefas em um arquivo local para reutilização futura.

## Tecnologias Utilizadas
- **Java 17** ou superior.
- IDEs suportadas: IntelliJ IDEA, Eclipse, ou qualquer editor de sua preferência.

## Estrutura do Projeto
```
taskmanager/
├── src/
│   └── main/
│       └── java/
│           └── taskmanager/
│               ├── Main.java          # Classe principal com o menu
│               ├── Task.java          # Modelo da tarefa
│               ├── TaskManager.java   # Gerenciador das tarefas
```

## Pré-requisitos
1. Instale o [Java JDK 17](https://www.oracle.com/java/technologies/javase-jdk17-downloads.html) ou superior.
2. Configure uma IDE ou ambiente para compilar e executar programas Java.

## Como Executar
1. Clone este repositório:
   ```bash
   git clone https://github.com/seu-usuario/task-manager.git
   cd task-manager
   ```
2. Abra o projeto na sua IDE favorita.
3. Compile e execute a classe `Main.java`.

## Exemplos de Uso
### Menu do programa:
```plaintext
--- Gerenciador de Tarefas ---
1. Criar tarefa
2. Listar tarefas
3. Editar tarefa
4. Excluir tarefa
5. Sair
Escolha uma opção:
```

### Operações Básicas
- **Criar Tarefa:**
  O programa solicitará a descrição da tarefa:
  ```plaintext
  Digite a descrição da tarefa: Estudar Java
  Tarefa criada com sucesso!
  ```

- **Listar Tarefas:**
  O programa exibirá a lista de tarefas cadastradas:
  ```plaintext
  --- Lista de Tarefas ---
  Tarefa ID: 1, Descrição: Estudar Java, Concluída: Não
  ```

- **Editar Tarefa:**
  Escolha a tarefa pelo ID e atualize suas informações:
  ```plaintext
  Digite o ID da tarefa que deseja editar: 1
  Nova descrição: Estudar Java e Spring
  A tarefa está concluída? (s/n): s
  Tarefa atualizada com sucesso!
  ```

- **Excluir Tarefa:**
  Escolha a tarefa pelo ID e exclua-a:
  ```plaintext
  Digite o ID da tarefa que deseja excluir: 1
  Tarefa excluída com sucesso!
  ```

## Melhorias Futuras
- Persistência de tarefas em um arquivo `.txt` ou `.csv`.
- Interface gráfica usando JavaFX ou Swing.
- Filtros para listar apenas tarefas concluídas ou pendentes.

## Contribuição
1. Faça um fork deste repositório.
2. Crie um branch para suas alterações:
   ```bash
   git checkout -b minha-feature
   ```
3. Faça o commit das suas alterações:
   ```bash
   git commit -m 'Adiciona nova feature'
   ```
4. Envie suas alterações para o branch:
   ```bash
   git push origin minha-feature
   ```
5. Abra um Pull Request.
