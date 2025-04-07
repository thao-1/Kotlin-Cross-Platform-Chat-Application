# Kotlin Cross-Platform Chat Application

A real-time chat application built with Kotlin Multiplatform, supporting both Android and iOS platforms.

## Features

- Real-time messaging
- User authentication
- Cross-platform compatibility (Android & iOS)
- Modern UI with Material Design
- Firebase integration for backend services

## Prerequisites

### For Android Development
- Android Studio (latest version)
- JDK 17 or later
- Android SDK
- Gradle 8.2 or later

### For iOS Development
- macOS
- Xcode 14.0 or later
- CocoaPods
- Ruby 3.1.0 or later

## Project Setup

1. Clone the repository:
```bash
git clone https://github.com/yourusername/Kotlin-Cross-Platform-Chat-Application.git
cd Kotlin-Cross-Platform-Chat-Application
```

2. Install dependencies:
```bash
./gradlew build
```

## Running the Application

### Android
1. Open the project in Android Studio
2. Select the `androidApp` configuration
3. Choose your target device (emulator or physical device)
4. Click the "Run" button or use the command:
```bash
./gradlew :androidApp:assembleDebug
```
5. The APK will be generated at `androidApp/build/outputs/apk/debug/`

### iOS
1. Install CocoaPods if not already installed:
```bash
sudo gem install cocoapods
```

2. Navigate to the iOS project directory and install pods:
```bash
cd iosApp
pod install
```

3. Open the workspace in Xcode:
```bash
open ChatApp.xcworkspace
```

4. In Xcode:
   - Select your target device (simulator or physical device)
   - Click the "Run" button or press Cmd+R

## Firebase Setup

1. Install Firebase CLI:
```bash
npm install -g firebase-tools
```

2. Login to Firebase:
```bash
firebase login
```

3. Initialize Firebase in your project:
```bash
firebase init
```

4. Follow the Firebase setup wizard to configure your project

## Project Structure

```
├── androidApp/          # Android-specific code
├── iosApp/             # iOS-specific code
├── shared/             # Shared Kotlin code
│   ├── src/
│   │   ├── commonMain/ # Common code for all platforms
│   │   ├── androidMain/# Android-specific implementations
│   │   └── iosMain/    # iOS-specific implementations
│   └── build.gradle.kts
└── build.gradle.kts    # Root project build file
```

## Dependencies

### Shared Module
- Kotlin Coroutines
- Firebase Auth
- Firebase Firestore
- Firebase Core

### Android
- AndroidX Core KTX
- Material Design Components

### iOS
- Shared Framework (via CocoaPods)

## Contributing

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

## License

This project is licensed under the MIT License - see the LICENSE file for details 