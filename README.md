<p align="center">
  <img src="https://capsule-render.vercel.app/api?type=waving&color=gradient&customColorList=14532D,16A34A,4ADE80&height=220&section=header&text=Java%20GUI%20Number%20Guesser&fontSize=40&fontColor=ffffff&fontAlignY=38&desc=Interactive%20Swing%20Game%20Engine%20with%20Dynamic%20Feedback%20%26%20State%20Tracking&descSize=16&descAlignY=60&descAlign=50" width="100%" alt="Java GUI Number Guesser Banner" />
</p>

<p align="center">
  <img src="https://img.shields.io/badge/Language-Java%2017+-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java" />
  <img src="https://img.shields.io/badge/Framework-Java%20Swing%20%7C%20AWT-007396?style=for-the-badge" alt="Swing" />
  <img src="https://img.shields.io/badge/Paradigm-Event--Driven%20GUI-16A34A?style=for-the-badge" alt="Event-Driven" />
  <img src="https://img.shields.io/badge/Status-Fully%20Playable-success?style=for-the-badge" alt="Status" />
</p>

<a id="overview"></a>
## 📖 Executive Summary & Overview

Graphical User Interface (GUI) development in Java requires mastering the event-driven programming paradigm: managing asynchronous UI event dispatch threads (EDT), registering `ActionListener` callbacks, updating visual state, and gracefully handling invalid user inputs without terminating runtime threads.

The **Java GUI Number Guesser** (`GuessingGame`) is a standalone desktop application built using **Java Swing and AWT**. The game engine generates a pseudo-random integer within bounded limits, processes user guesses through an intuitive GUI, tracks attempt metrics in real time, and delivers instant visual hints ("Too High", "Too Low", or "Correct!").

<a id="toc"></a>
## 📑 Table of Contents

- [📖 Executive Summary & Overview](#overview)
- [🎯 Key Features & Capabilities](#features)
- [🏗️ System Architecture & Pipeline](#architecture)
- [🛠️ Tech Stack Breakdown](#tech-stack)
- [⚙️ Reproducible Quickstart & Setup](#setup)
- [📁 Project Directory Layout](#project-layout)
- [👨‍💻 Author & Contributions](#author)

<a id="features"></a>
## 🎯 Key Features & Capabilities

- **Event-Driven Swing Architecture:** Responsive GUI utilizing `JFrame`, `JPanel`, `JButton`, and `JTextField` components.
- **Real-Time Input Validation:** Exception trapping (`NumberFormatException`) preventing crashes on non-numeric inputs.
- **Dynamic Binary Search Hints:** Immediate comparative feedback guiding users toward target values using optimal search heuristics.
- **Session Reset & Metrics:** Attempt counter tracking player efficiency with single-click game restart capabilities.

<a id="architecture"></a>
## 🏗️ System Architecture & Pipeline

```mermaid
flowchart TD
    Start["User Launches NumberGuessingGameGUI"] --> Init["Generate Target Number (1 - 100)<br/>Initialize Attempt Counter = 0"]
    Init --> Render["Render Swing GUI Frame"]
    Render --> Input["User Enters Integer Guess & Clicks Guess"]
    Input --> Validate{"Valid Integer?"}
    Validate -- No --> Error["Show Warning Dialog (Invalid Input)"]
    Error --> Render
    Validate -- Yes --> Increment["Attempt Counter++"]
    Increment --> Compare{"Compare Guess to Target"}
    Compare -- "Guess > Target" --> High["Update Label: 'Too High! Try lower.'"]
    Compare -- "Guess < Target" --> Low["Update Label: 'Too Low! Try higher.'"]
    Compare -- "Guess == Target" --> Win["Show Victory Dialog: Success in N Attempts!"]
    High --> Render
    Low --> Render
    Win --> ResetPrompt["Prompt for New Game / Reset Target"]
```

<a id="tech-stack"></a>
## 🛠️ Tech Stack Breakdown

| Component | Technology | Implementation |
| :--- | :--- | :--- |
| **Language** | Java (JDK 8 / 11 / 17+) | Core object-oriented language |
| **GUI Framework** | Java Swing (`javax.swing.*`) | `JFrame`, `JLabel`, `JButton`, `JOptionPane` |
| **Window Toolkit** | Java AWT (`java.awt.*`) | `FlowLayout`, `Font`, `Color` |
| **Randomization** | `java.util.Random` | Cryptographically uniform pseudorandom generation |

<a id="setup"></a>
## ⚙️ Reproducible Quickstart & Setup

### Prerequisites
- Java Development Kit (JDK 8 or newer)

```bash
# 1. Clone repository
git clone https://github.com/Amaraiah11/GuessingGame.git
cd GuessingGame

# 2. Compile Java GUI source
javac NumberGuessingGameGUI.java

# 3. Launch the desktop application
java NumberGuessingGameGUI
```

<a id="project-layout"></a>
## 📁 Project Directory Layout

```text
GuessingGame/
├── NumberGuessingGameGUI.java # Complete event-driven Swing game application
└── README.md                  # Comprehensive game architecture documentation
```

<a id="author"></a>
## 👨‍💻 Author & Contributions

This project is developed and maintained with high technical rigour by **Amaraiah C**, Software Engineer and Data Analytics Practitioner studying Bachelor of Computer Applications (BCA) at Alliance University.

- 🌐 **GitHub:** [@Amaraiah11](https://github.com/Amaraiah11)
- 💼 **LinkedIn:** [Connect on LinkedIn](https://www.linkedin.com/in/amaraiah-c/)
- 📧 **Institutional Contact:** `camaraiahBCA24@ced.alliance.edu.in`

### 🤝 Contribution Guidelines
Contributions, bug reports, and architectural discussions are welcome!
1. **Fork** the repository: `https://github.com/Amaraiah11/GuessingGame`
2. **Branch**: `git checkout -b feature/your-feature-name`
3. **Commit**: `git commit -m "feat: enhance feature logic"`
4. **Push**: `git push origin feature/your-feature-name`
5. **Open Pull Request** against the `main` branch.

---

<p align="center">
  <b>⭐ If this codebase or documentation assisted your engineering workflows, please star the repository! ⭐</b>
</p>

<p align="center">
  <img src="https://capsule-render.vercel.app/api?type=waving&color=gradient&customColorList=14532D,16A34A,4ADE80&height=100&section=footer" width="100%" alt="Footer Banner" />
</p>
