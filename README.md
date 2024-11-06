# E-Module Mobile Learning PLC - Documentation

<img title="thumbnail" src="drawable\Picture1.png">

**Project Name**: E-Module Mobile Learning PLC  
**Description**: The "E-Module Mobile Learning PLC" app is an educational Android application designed to help students learn about programming logic controllers (PLC) on their smartphones. Developed using Android Studio, this app serves as a mobile-friendly e-learning platform, offering interactive modules, tutorials, and exercises focused on PLC programming concepts.

## Demo

[![Demo video](https://raw.githubusercontent.com/adjay27/emodule-mobile-learning-plc/main/drawable/Light%20-%20Splash%20Screen.svg)](https://raw.githubusercontent.com/adjay27/emodule-mobile-learning-plc/main/drawable/Media1.mp4)

## Project Structure

### 1. **App Modules**

- **Home**: Main screen providing access to all sections of the app.
- **Materi**: Contains structured learning modules on PLC basics, programming concepts, and practical exercises.
- **Evaluasi**: A set of quizzes to test the user’s understanding of PLC concepts.
- **Video**: A collection of videos to serve as additional material and reference about the PLC.

### 2. **Features**

- **Interactive Modules**: The app includes various learning modules that cover the basics of PLC programming, such as ladder logic, boolean operations, timers, and counters.
- **Quizzes & Tests**: After each module, quizzes allow students to self-evaluate and reinforce their learning.
- **User-Friendly Design**: The app is optimized for ease of navigation and usability on Android smartphones.

## Technology Stack

- **Language**: Java
- **IDE**: Android Studio
- **Architecture**: MVVM (Model-View-ViewModel)
- **API Integration**: Youtube API

## Installation Guide

> PSA: Some library is deprecated, this project is no longer maintained.

1. **Prerequisites**:

   - Android Studio (latest version recommended)
   - Android SDK and Emulator

2. **Setup**:

   - Clone the repository: `git clone https://github.com/your-repo/e-module-mobile-learning-plc.git`
   - Open the project in Android Studio.
   - Sync the project to download dependencies and build the project.

3. **Build & Run**:
   - Choose an emulator or connected Android device.
   - Click **Run** to install and launch the app on your selected device.

## Code Overview

- **`HomeActivity.java`**: Hosts the main screen and navigation setup for the app.
- **`MateriFragment.java`**: Manages the PLC learning content and displays individual lessons.
- **`EvalFragment.java`**: Manages and displays quizzes related to each lesson.
- **`VideoFragment.java`**: Manage and view a list of additional reference videos for learning purposes.

## Future Improvements

- **Cloud Sync**: Sync user progress to a cloud database to allow cross-device access.
- **Enhanced Simulations**: Introduce more complex simulation features and animations.
- **Cross-Platform Development**: Adding iOS support by developing in cross-platform framework.

## Credits

- Developed by: Aditya F Wijaya

This documentation covers the basic setup, structure, and purpose of the **E-Module Mobile Learning PLC** project.
