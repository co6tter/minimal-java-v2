# minimal-java-v2

## Overview

This is a learning repository containing Java sample code that demonstrates various fundamental and advanced Java programming concepts. The project includes examples of control structures, object-oriented programming, exception handling, generics, threads, lambda expressions, collections, and Stream API.

## Tech Stack

- **Language**: Java 21
- **Build Tool**: Maven
- **Development Environment**: Dev Container (VSCode)
- **Extensions**: EditorConfig, Java Extension Pack

## Setup

### Using Dev Container (Recommended)

1. Open this project in Visual Studio Code
2. Install the "Dev Containers" extension
3. Click "Reopen in Container" when prompted
4. The container will automatically set up Java 21 and Maven

### Local Setup

1. Ensure Java 21 is installed on your system
2. Ensure Maven is installed (if using the `myapp` package)
3. Clone this repository

## Usage

### Running HelloWorld

```bash
javac src/HelloWorld.java
java -cp src HelloWorld
```

### Running MyApp

```bash
javac -d bin src/main/java/myapp/model/*.java src/main/java/myapp/MyApp.java
java -cp bin main.java.myapp.MyApp
```

## Directory Structure

```
.
├── .devcontainer/        # Dev Container configuration
├── .editorconfig         # Editor configuration
├── src/
│   ├── HelloWorld.java   # Basic Java examples (switch, arrays, loops)
│   └── main/java/myapp/
│       ├── MyApp.java            # Advanced Java features demo
│       └── model/
│           ├── User.java         # User class with interfaces
│           └── AdminUser.java    # AdminUser extending User
└── README.md
```

### Sample Code Contents

- **HelloWorld.java**: 基本的な制御構文（switch文、配列、拡張for文）
- **MyApp.java**: 例外処理、ジェネリクス、スレッド、ラムダ式、コレクション（ArrayList, HashSet, HashMap）、Stream API
- **User.java**: インターフェース実装、static/instance initializer、コンストラクタ
- **AdminUser.java**: クラス継承、メソッドオーバーライド

## License

This repository is for personal/private use only.
