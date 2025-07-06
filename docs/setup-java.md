## 🧩 Java Setup via SDKMAN!

[![Java via SDKMAN!](https://img.shields.io/badge/Java-via%20SDKMAN!-brightgreen?logo=java)](https://sdkman.io)

This project uses [SDKMAN!](https://sdkman.io/) and a `.sdkmanrc` file to ensure all contributors use the same Java version (and optionally Maven/Gradle).

---

### ✅ Step-by-Step Setup for New Contributors

1. **Install SDKMAN**
   Run this in your terminal:

   ```bash
   curl -s "https://get.sdkman.io" | bash
   source "$HOME/.sdkman/bin/sdkman-init.sh"
   ```

2. **Enable auto SDK switching (optional but recommended)**

   ```bash
   sdk config
   ```

   Set the option:

   ```
   sdkman_auto_env=true
   ```

3. **Navigate to the project directory**

   ```bash
   cd path/to/your/project
   ```

4. **Install & use the required Java version**

   ```bash
   sdk env install
   ```

   This reads `.sdkmanrc`, installs missing SDKs, and switches to them.

5. **Verify**

   ```bash
   java -version
   ```

---

### 📄 Example `.sdkmanrc`

```bash
java=21.0.3-tem
maven=3.9.5
gradle=8.6
```