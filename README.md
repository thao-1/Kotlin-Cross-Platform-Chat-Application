# Kotlin Cross-Platform Chat Application

A secure, cross-platform chat application built with Kotlin Multiplatform targeting Android and iOS platforms.

## Features

- Cross-platform support (Android & iOS)
- End-to-end encryption for messages
- Real-time message updates
- Clean architecture with separation of concerns

## Project Structure

```
ChatApp/
├── androidApp/           # Android-specific code
├── iosApp/              # iOS-specific code
├── shared/              # Shared Kotlin code
│   └── src/
│       └── commonMain/
│           └── kotlin/
│               └── com/
│                   └── example/
│                       └── chatapp/
│                           ├── data/           # Data layer
│                           ├── domain/         # Domain models
│                           ├── presentation/   # UI components
│                           └── utils/          # Utility classes
```

## Setup Instructions

### Prerequisites

- Android Studio (for Android development)
- Xcode (for iOS development, macOS only)
- Kotlin Multiplatform Mobile plugin
- CocoaPods (for iOS dependencies)

### Building the Project

#### Android
```bash
./gradlew :androidApp:assembleDebug
```

#### iOS
```bash
cd iosApp
pod install
xcodebuild -workspace ChatApp.xcworkspace -scheme ChatApp -destination 'platform=iOS Simulator,name=iPhone 14'
```

## Security

This application uses AES encryption for message security. In a production environment, you should:
- Use a secure key management system
- Implement proper key rotation
- Consider using additional security measures like certificate pinning

## License

MIT License 