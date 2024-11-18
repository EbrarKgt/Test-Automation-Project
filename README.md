# 🧪 Test Automation Project

![Selenium](https://img.shields.io/badge/Selenium-43B02A?style=for-the-badge&logo=selenium&logoColor=white)
![Java](https://img.shields.io/badge/Java-007396?style=for-the-badge&logo=java&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apache-maven&logoColor=white)

This repository contains a test automation project for the website [Automation Exercise](http://automationexercise.com). The project is designed to test various functionalities of the site using **Java**, **Selenium WebDriver**, and the **Page Object Model (POM)** architecture.

---

## 📂 Project Overview

### 🔧 Tools and Technologies

- **Java**: Programming language for building the test scripts.
- **Selenium WebDriver**: Browser automation tool.
- **JUnit**: Testing framework for structuring test cases.
- **Maven**: Dependency management and project build tool.

### 🏗️ Architecture

The project follows the **Page Object Model (POM)** design pattern to ensure:

- **Modularity**: Clear separation of locators, actions, and checks for each page.
- **Scalability**: Easy addition of new features and test cases.
- **Maintainability**: Simplified management of UI elements and business logic.


---

## 🚀 How to Set Up and Run the Project

Follow these steps to set up and run the project:

### Prerequisites

- **Java** (version 8 or higher)
- **Maven**
- **ChromeDriver** (compatible with your browser version)

### Steps

1. Clone the repository:
   ```bash
   git clone https://github.com/EbrarKgt/Test-Automation-Project
2. Navigate to the project directory:
    ```bash
    cd automation-exercise
3. Build the project:
   ```bash
    mvn clean install
4. Run the tests:
    ```bash
    mvn clean test
