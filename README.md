# 1 SnapChat Splash Screen using official android API method
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


# 2 Intents in Android Studio using Kotlin
        1. what is intent?
        2. types of intent?
        3. what is Explicit intent? (inside app)
        4. what is implicit intent? (outside app)

        Intent : intent is a class which provide a communication between two activities.
                intent also share data from one activity to another


        type of intent ( 1. Explicit intent 2. implicit Intent )

        Explicit intent : Inside in App move from one activity to another
        implicit Intent : Move from our app to another app .

# 3 ListView in Android Studio using Kotlin
        I have devided ListView in five step to understand easily

        steps: 
        1. Create a list view in xml
        2. Create an array and add elements
        3. create Array adapter and set layout and pass array
        4. set listAdapter to listview adapter
        5. listview.setonClick 
                create a variable selectItem = parent.getItemAtPosition(postion) as String
                show toast message

# 4 RecyclerView in Android Studio using Kotlin
        Steps:
        1. Create a recyclerview in xml
        2. create a layout for items 
        3. Create a dataclass
        4. create an adapter 
        5. in main activity set layoutManager and setHasFixedSize(true) 
        6. in main activity set adapter class to recyler view adapter.

# 5 Spinner in Android Studio using Kotlin
        The code look like listview code
        Steps:
        1. First we create a list of all the item which will add in Spinner
        2. we create an array adapter
        3. then we set setOnItemSelectListener
        4. last show a toast message

# 6 Alert Dialog Box in Android Studio using Kotlin
        We Create dialog box but we have multiple types of dialogbox
        we create here a simple alert dialog box
        Steps:
        1. create a variable builder = AlertDailog.Builder(this)
        2. builder.setTitle("Top title")
        3. setMessage("Are you sure to exit)
        4. setPositiveButton("Yes") {dialog, which ->
        toast.show}
        5. setNegativeButton same code
        6. create variable alertDialog : AlertDialog = builder.create()
        7. alertDialog.show()


# 7 Fragment in Android Studio using Kotlin
        Steps:
        1. in main activity add fragmentContianerView in xml
        2. create fragments
        3. now to got main activity and create a function
        4. the function pass a paramerter fagrment
        5. inside the function create a varible fragmentManager = SupportFragmentManager
        6. fragmentManager.beginTransition().replace(R.id.fragmentContainerView, fragment).commit()

# 8 ViewPager2 in Android Studio using Kotlin
        Steps:
        1. Add viewPager2 in xml
        2. declair all the variables
        3. create pager adapter
        4. create view holder
        5. create the list of text
        6. adding all the three method
        7. set the adapter
        the Adapter class are same like recylcer ivew

# 9 
