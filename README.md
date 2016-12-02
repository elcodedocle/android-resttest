# android-resttest

Demo of an Android app consuming [elcodedocle/jsontest](https://github.com/elcodedocle/jsontest) rest service and displaying the received items on a ListView.

## Usage

* Import the github repo on a new Android Studio project
![Import the github repo a new Android Studio project](https://cloud.githubusercontent.com/assets/3731026/20840583/5a75ada0-b8b9-11e6-8c17-16d1cd120b11.png)
* If a warning complaining about a couple of modules not being found pops up, select "remove them" and let the auto reindexing do its job
* Deploy the [restful service](https://github.com/elcodedocle/jsontest) and [point the client to it](https://github.com/elcodedocle/android-resttest/blob/master/app/src/main/java/com/github/elcodedocle/android_resttest/MainActivity.java#L10), or leave unchanged to consume the deployed demo at http://elcodedocle-jsontest.herokuapp.com/apps
* Deploy and run the app on a real or emulated device (must have a connection to the deployed server)
![Deploy and the app](https://cloud.githubusercontent.com/assets/3731026/20844947/1c4c7e52-b8cb-11e6-95bd-57d29bc84601.png)
* Slide down to reinvoke the service and refresh the view with the updated results
![Slide down to reinvoke the service and refresh the view with the updated results](https://cloud.githubusercontent.com/assets/3731026/20840847/4c032aa8-b8ba-11e6-9481-2b41bc4e636f.png)

## See also

http://stackoverflow.com/questions/40817799/import-data-from-json-or-xml-feed-and-create-a-list-in-android/
