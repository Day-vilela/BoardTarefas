# 🗂️ Board de Tarefas em Java

Um projeto simples de gerenciamento de tarefas implementado em Java puro, seguindo boas práticas de programação orientada a objetos e arquitetura em camadas (MVC). O sistema permite criar, listar, atualizar e remover tarefas através de um menu interativo no terminal.

---

## 🚀 Funcionalidades

- ✅ Criar uma nova tarefa
- 📄 Listar todas as tarefas
- 🔄 Atualizar o status da tarefa (`TODO`, `DOING`, `DONE`)
- ❌ Remover uma tarefa pelo ID

---

## 🧠 Arquitetura

O projeto é dividido em camadas, seguindo o padrão **MVC (Model-View-Controller)**:

taskboard/
├── Main.java # Ponto de entrada
├── controller/ # Controla o fluxo entre View e Service
│ └── TaskController.java
├── model/ # Contém as classes de domínio
│ ├── Task.java
│ └── Status.java
├── repository/ # Simula a persistência em memória
│ └── TaskRepository.java
├── service/ # Contém a lógica de negócio
│ └── TaskService.java
└── view/ # Interface com o usuário (CLI)
└── TaskView.java


---

## 🧩 Modelo de Dados

```java
public class Task {
    private int id;
    private String titulo;
    private String descricao;
    private Status status; // Enum: TODO, DOING, DONE
}

```
---

🛠️ Tecnologias Utilizadas


☕ Java 17+ (pode ser adaptado para Java 8+)

📦 Estrutura modular baseada em pacotes

🧪 Scanner para entrada via terminal

✅ Enum para controle de status

🔄 Lista em memória para simular banco de dados

---

📝 Exemplos de Uso

== BOARD DE TAREFAS ==
1. Criar tarefa
2. Listar tarefas
3. Atualizar status
4. Remover tarefa
0. Sair
Opção: 1
Título: Estudar Java
Descrição: Finalizar módulo sobre Orientação a Objetos
Tarefa criada: 1

---

🎯 Objetivos de Aprendizado


Aplicar princípios de POO (Encapsulamento, Abstração)

Trabalhar com enumerações e coleções em Java

Praticar a estruturação de projetos em camadas

Desenvolver interações simples via terminal

---

🧩 Futuras Possíveis Melhorias 


💾 Persistência com banco de dados (JPA/Hibernate)

🌐 Interface Web (Spring Boot + Thymeleaf)

📱 Aplicação Desktop com JavaFX

📊 Filtro por status, busca por título, ordenação

🧪 Testes unitários (JUnit)

---

👨‍💻 Autora
Desenvolvido por Daiane Vilela — Bootcamp DIO ✨

