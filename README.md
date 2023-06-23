# Model — View — ViewModel (MVVM) is the industry-recognized software architecture pattern that overcomes all drawbacks of MVP and MVC design patterns. MVVM suggests separating the data presentation logic(Views or UI) from the core business logic part of the application.
The separate code layers of MVVM are:
Model: This layer is responsible for the abstraction of the data sources. Model and ViewModel work together to get and save the data.
View: The purpose of this layer is to inform the ViewModel about the user’s action. This layer observes the ViewModel and does not contain any kind of application logic.
ViewModel: It exposes those data streams which are relevant to the View. Moreover, it serves as a link between the Model and the View.

In this article, we will learn how we can build a simple movie detail app using MVVM architecture and Kotlin language. To build this application, we need MVVM architecture and Retrofit Library. Retrofit is a third-party library that helps us to make a network request in android. We will fetch data from The Movie Database Website (TMDB).

