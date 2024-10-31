# SnapChat Splash Screen using official android API method
# on main activity i write code for splash screen
There are six steps
1. Adding logo into the drawable folder
2. Adding dependency in the gradle file //  https://developer.android.com/develop/ui/views/launch/splash-screen
3. Add to style ColorPrimary colorPrimaryVaraint, colorOnPrimary, statusBarColor
4. we add here three parameter 1st for background color 2nd for icon  3rd for main activity
5. Adding theme to android meanifests
6. Call splash screen in main activity (1st duration and 2nd call install sp screen method)
 
 we have two method for delay 1st thread 2nd coroutine
 if you  want to use thread then comment coroutine code and uncomment thread code

 Important note : 
 1. App icon with an icon background it must e 240x240dp and fit within a circle 160dp in diameter
 2. App icon withiout an icon background it must be 288x288dp and fit within a circle 192dp in diameter


# Intents in Android Studio using Kotlin
1. what is intent?
2. types of intent?
3. what is Explicit intent? (inside app)
4. what is implicit intent? (outside app)

Intent : intent is a class which provide a communication between two activities.
        intent also share data from one activity to another


type of intent ( 1. Explicit intent 2. implicit Intent )

Explicit intent : Inside in App move from one activity to another
implicit Intent : Move from our app to another app .

