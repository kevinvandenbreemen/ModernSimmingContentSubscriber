# ModernSimmingContentSubscriber
Middle tier content consumption layer for ModernSimmingApp

# Setup for your App
In order to use this library you'll first need the ModernSimmingApp installed.  Next you'll need to ensure that the app using this library requires the "com.vandenbreemen.modernsimming.READ" permission.

# Required Libraries
You'll need to have Coroutines installed:

```
def coroutinesVersion = "(version)"
implementation "org.jetbrains.kotlinx:kotlinx-coroutines-android:$coroutinesVersion"
```

# Notes about Android 11
Please be sure to add a queries tag to your manifest in order to allow the system to resolve the content provider.

```
    <queries>
        <package android:name="com.vandenbreemen.modernsimmingapp" />
    </queries>
```