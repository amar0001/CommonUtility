# CommonKit

**CommonKit** is a lightweight Kotlin-based utility library for Android, offering:
- Android Jetpack Compose UI components (custom widgets, dialogs)
- Utilities for Shared Preferences management
- Simplified alert dialog helpers

---

##  Features

| Category              | Utilities Included                              |
|----------------------|--------------------------------------------------|
| Jetpack Compose UI   | Custom widgets, theming components, dialog helpers |
| Shared Preferences   | Simplified APIs for storing and reading prefs   |
| Alert Dialogs        | Ready-to-use helpers for common dialog patterns |

---

##  Getting Started

###  Add Dependency via JitPack

In your `settings.gradle.kts`:
```kotlin
dependencyResolutionManagement {
  repositories {
    google()
    mavenCentral()
    maven("https://jitpack.io")
  }
}
In your build.gradle.kts:

dependencies {
  implementation("com.github.amar0001:CommonKit:1.0.0")
}


Usage Examples
Shared Preferences Helper
// Example API (update according to actual implementation)
val prefs = PreferencesHelper(context)

prefs.putString("key", "value")
val value = prefs.getString("key", "default")


Custom Alert Dialog (Compose)

CustomAlertDialog(
  title = "Delete item?",
  onConfirm = { /* delete logic */ },
  onDismiss = { /* dismiss logic */ }
)


Compose Widget (example)

CommonButton(
  text = "Click Me",
  onClick = { /* handle click */ }
)

License

This project is licensed under the MIT License—see the LICENSE

Contributing

Contributions, bug reports, improvements, and PRs are welcome!

Contact

Created by Amarjit Kaur — feel free to reach out!
Linkedin : https://www.linkedin.com/in/amarjit-kaur-178a093b/

Medium : https://medium.com/@amarjitkr93

