# Video Call App

## Overview

VideoCallApp is an Android application built with Jetpack Compose and Stream Video SDK that provides video calling functionality. The app allows users to connect with each other by entering a username and joining a video call. The application manages permissions and handles call states using modern Android development practices.

## Features

- **User Authentication**: Users can enter a username to connect to a video call.
- **Video Calling**: Users can join and leave video calls.
- **Permissions Management**: Requests and manages required permissions for camera, microphone, and notifications.
- **Error Handling**: Displays error messages and status updates during the call process.

## Technologies Used

- **Kotlin**: Primary programming language for Android development.
- **Jetpack Compose**: UI toolkit for building native Android UIs.
- **Stream Video SDK**: Provides video calling functionality.
- **Koin**: Dependency injection framework.
- **Coroutines**: For asynchronous operations.

## Setup

### Prerequisites

- Android Studio
- Android SDK

### Installation

1. **Clone the repository:**
    
    ```
    git clone https://github.com/0oAVIRALo0/videocallapp.git
    ```
    
2. **Open the project in Android Studio.**
3. **Sync Gradle files.**
4. **Add your Stream API Key:**
    
    Replace `"api-key"` with your actual Stream API key in the `VideoCallApp.kt` file.
    
5. **Run the application:**
    
    Connect an Android device or emulator and run the app from Android Studio.
    

## Code Structure

- **`MainActivity.kt`**: The main activity that sets up the navigation and UI.
- **`VideoCallApp.kt`**: Application class that initializes the Stream Video client.
- **`ConnectScreen.kt`**: Composable function for the connection screen.
- **`ConnectViewModel.kt`**: ViewModel for handling connection logic.
- **`VideoCallScreen.kt`**: Composable function for the video call screen.
- **`VideoCallViewModel.kt`**: ViewModel for handling video call logic.
- **`VideoCallState.kt`**: Data classes representing the state of the video call.
- **`VideoCallAction.kt`**: Sealed interface defining actions related to video calls.

## Usage

1. **Connecting to a Call:**
    
    Enter a username on the `ConnectScreen` and click "Connect" to join a video call.
    
2. **Joining a Call:**
    
    Once connected, the app will automatically join the video call if permissions are granted.
    
3. **Leaving a Call:**
    
    Use the provided UI controls to leave the call.
    

## Permissions

The app requires the following permissions:

- Camera
- Microphone
- Bluetooth (Android 31+)
- Notifications (Android 33+)

## Troubleshooting

- **Permissions Issues**: Ensure all required permissions are granted.
- **Connection Issues**: Check your network connection and API key.

## Contributing

1. Fork the repository.
2. Create a new branch (`git checkout -b feature/your-feature`).
3. Commit your changes (`git commit -am 'Add new feature'`).
4. Push to the branch (`git push origin feature/your-feature`).
5. Open a pull request.

## License

This project is licensed under the MIT License - see the LICENSE file for details.

## Contact

For any questions or feedback, please open an issue on the [GitHub repository](https://github.com/yourusername/videocallapp/issues).
