# 🎯 Java GUI Number Guesser — Interactive Swing Game Engine & Adaptive Feedback

<p align="center">
  <img src="https://capsule-render.vercel.app/api?type=waving&color=gradient&customColorList=14532D,16A34A,4ADE80&height=220&section=header&text=Java%20GUI%20Number%20Guesser&fontSize=40&fontColor=ffffff&fontAlignY=38&desc=Interactive%20Swing%20Game%20Engine%20with%20Dynamic%20Feedback%20%26%20State%20Tracking&descSize=16&descAlignY=60&descAlign=50" width="100%" alt="Java GUI Number Guesser Banner" />
</p>

<p align="center">
  <b>Desktop GUI Game Engineering: Event Dispatch Thread (EDT) Management, Defensive Input Sanitization, and Binary Search Hint Mechanics.</b>
</p>

<p align="center">
  <img src="https://img.shields.io/badge/Language-Java%2017+-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java" />
  <img src="https://img.shields.io/badge/Framework-Java%20Swing%20%7C%20AWT-007396?style=for-the-badge" alt="Swing" />
  <img src="https://img.shields.io/badge/Paradigm-Event--Driven%20GUI-16A34A?style=for-the-badge" alt="Event-Driven" />
  <img src="https://img.shields.io/github/stars/Amaraiah11/GuessingGame?style=for-the-badge&color=gold" alt="Stars" />
</p>

<p align="center">
  <img src="https://skillicons.dev/icons?i=java,git,github,vscode" alt="Tools" />
</p>

---

<a id="table-of-contents"></a>
## 📌 Table of Contents

- [📖 Executive Summary & Overview](#executive-summary--overview)
- [🎯 Key Features & Capabilities](#features)
- [🏗️ System Architecture & Pipeline](#system-architecture--pipeline)
- [🛠️ Tech Stack Breakdown](#tech-stack-breakdown)
- [⚙️ Reproducible Quickstart & Setup](#setup)
- [📁 Project Directory Layout](#project-layout)
- [🧪 Testing & Verification](#testing--verification)
- [🔮 Future Improvements & Roadmap](#future-improvements--roadmap)
- [🤝 Contributing Guidelines](#contributing-guidelines)
- [👨‍💻 Author & Contributions](#author--contributions)

---

<a id="executive-summary--overview"></a>
## 📖 Executive Summary & Overview

Graphical User Interface (GUI) development in Java requires mastering the event-driven programming paradigm: managing asynchronous UI event dispatch threads (EDT), registering `ActionListener` callbacks, updating visual state, and gracefully handling invalid user inputs without terminating runtime threads.

The **Java GUI Number Guesser** (`GuessingGame`) is a standalone desktop application built using **Java Swing and AWT** by **Amaraiah C**. The engine generates a pseudo-random integer within bounded limits, processes user guesses through an intuitive GUI, tracks attempt metrics in real time, and provides instant comparative feedback ("Too High", "Too Low", or "Correct!").

---

<a id="key-features--capabilities"></a>
## 🎯 Key Features & Capabilities

### 🖥️ 1. Event-Driven Swing Architecture
- Responsive desktop window using `JFrame`, `JPanel`, `JButton`, and `JTextField` components.

### 🛡️ 2. Defensive Input Sanitization
- Exception trapping (`NumberFormatException`) preventing application crashes on invalid or empty text inputs.

### 📊 3. Real-Time State Tracking
- Dynamic attempt counter tracking score efficiency alongside instant restart functionality.

---

<a id="system-architecture--pipeline"></a>
## 🏗️ System Architecture & Pipeline

```mermaid
flowchart TD
    Start["Launch NumberGuessingGameGUI"] --> Init["Generate Target Number (1 - 100)<br/>Attempt Counter = 0"]
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

---

<a id="tech-stack-breakdown"></a>
## 🛠️ Tech Stack Breakdown

| Component | Technology | Implementation |
| :--- | :--- | :--- |
| **Language** | Java (JDK 8 / 11 / 17 LTS) | Core object-oriented language |
| **GUI Framework** | Java Swing (`javax.swing.*`) | `JFrame`, `JLabel`, `JButton`, `JOptionPane` |
| **Window Toolkit** | Java AWT (`java.awt.*`) | `FlowLayout`, `Font`, `Color` |
| **Randomization** | `java.util.Random` | Pseudorandom integer generation within bounded ranges |

---

<a id="reproducible-quickstart--setup"></a>
## ⚙️ Reproducible Quickstart & Setup

### Prerequisites
- Java Development Kit (JDK 8 or higher)

```bash
# 1. Clone repository
git clone https://github.com/Amaraiah11/GuessingGame.git
cd GuessingGame

# 2. Compile Java GUI source
javac NumberGuessingGameGUI.java

# 3. Launch desktop application
java NumberGuessingGameGUI
```

---

<a id="project-directory-layout"></a>
## 📁 Project Directory Layout

```text
GuessingGame/
├── NumberGuessingGameGUI.java # Complete event-driven Swing game application
└── README.md                  # Comprehensive game architecture documentation
```

---

<a id="testing--verification"></a>
## 🧪 Testing & Verification

- Verified non-numeric inputs (e.g., `"abc"`, empty string) display informative warning dialogs without throwing exceptions.
- Verified target values remain strictly within $[1, 100]$ across multiple game resets.

---

<a id="future-improvements--roadmap"></a>
## 🔮 Future Improvements & Roadmap

- [ ] Add difficulty tiers: Easy ($1-50$), Medium ($1-100$), Hard ($1-1000$).
- [ ] Add persistent high-score leaderboard tracking minimal attempts.

---

<a id="author--contributions"></a>
## 👨‍💻 Author & Contributions

This project is developed and maintained with rigorous engineering standards by **Amaraiah C**, Software Developer and Applied Data Analytics Practitioner studying Bachelor of Computer Applications (BCA) at Alliance University, Bangalore.

- 🌐 **GitHub Profile:** [@Amaraiah11](https://github.com/Amaraiah11)
- 💼 **LinkedIn Profile:** [Connect on LinkedIn](https://www.linkedin.com/in/amaraiah-c/)
- 📧 **Institutional Email:** `camaraiahBCA24@ced.alliance.edu.in`

### 🤝 Contributing Guidelines
Contributions, bug reports, and architectural discussions are welcome!
1. **Fork** the repository: `https://github.com/Amaraiah11/GuessingGame`
2. **Create a Feature Branch:**
   ```bash
   git checkout -b feature/your-feature-name
   ```
3. **Commit Your Enhancements:**
   ```bash
   git commit -m "feat: enhance feature logic"
   ```
4. **Push to Your Branch:**
   ```bash
   git push origin feature/your-feature-name
   ```
5. **Open a Pull Request** against the `main` branch.

---

<p align="center">
  <b>⭐ If this codebase or documentation assisted your engineering workflows, please star the repository! ⭐</b>
</p>

<p align="center">
  <img src="https://capsule-render.vercel.app/api?type=waving&color=gradient&customColorList=14532D,16A34A,4ADE80&height=100&section=footer" width="100%" alt="Footer Banner" />
</p>
