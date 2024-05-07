
# CZĘŚĆ PRAKTYCZNA

Najlepiej na samym początku zajęć włącz środowisko `AndroidStudio` i sprawdź czy nie ma dostępnych aktualizacji. Będziemy pracować nad aplikacją na Androida w wersji 14, także należy pobrać najnowszą wersję IDE. 



## ZADANIE 1
- Uruchom AndroidStudio i stwórz nowy projekt:
```
File>New>New Project>Empty Views Activity
```
Language: Java

Minimum SDK: API 34 ("UpsideDownCake"; Android 14.0)

Build configuration: Groovy DSL (build.gradle)

- Skonfiguruj emulator urządzenia mobilnego
```
Device Manager>Create Virtual Device>
```
Wybierz Pixel 4, z obrazem systemu UpdiseDownCake (z zakładki x86 Images).

- Uruchom aplikację na nowo utworzonym urządzeniu.

- w pliku `activity_main.xml` Zmień rozmiar i kolor wyświetlanego tekstu

Tak mniej więcej powinno się to prezentować:

![App Screenshot](https://github.com/JaSycz/Simple-Social-Media-Styled-Mobile-Application/blob/pawel/zadania_praktyczne/JPWP_1.png)

## Zadanie 2

Teraz zajmiemy się tworzeniem dolnego panelu nawigacyjnego z 5 Fragmentami.

- Otwórz strukturę katalogów w widoku `Project`. 
- Przejdź do `app/src/main/res`, PPM kliknij na folder res  i wybierz `New>Android Resource Directory`
- Wybierz `Resource type: Menu` i utwórz folder 
- W nowo utworzonej lokalizacji stwórz `New Meny Resource File` 
- W pliku menu.xml dodaj 3 elementy dla poszczególnych fragmentow nawigacyjnych.

Pomocniczy kod:
```Java
<?xml version="1.0" encoding="utf-8"?>
<menu xmlns:android="http://schemas.android.com/apk/res/android">
    <item
        android:id="@+id/nav_home"
        android:icon="@drawable/ic_home"
        android:title="Home" />
</menu>
```
- Aby w menu wyświetlały się odpowiednie ikony musisz dodać w katalogu drowable odpowiednie pliki. Znajdziesz je pod tymi linkami :

[android.googlesource](https://android.googlesource.com/platform/packages/apps/TvSettings/+/8f47225/Settings/res/drawable)

[android.googlesource](https://android.googlesource.com/platform/packages/apps/Car/Settings/+/f96d9f0/res/drawable)

- Wybierz dowolne ikony, np. `ic_add, ic_chat, ic_home, ic_user, ic_account`
- W katalogu drawable stwórz `New > drawable Resource File`, nadaj odpowiednie nazwy i wybierz `Root element: vector`

Przykładowy kod pliku `ic_home.xml`:

```Java
<?xml version="1.0" encoding="utf-8"?>
<vector xmlns:android="http://schemas.android.com/apk/res/android"
    android:width="32dp"
    android:height="32dp"
    android:viewportWidth="24.0"
    android:viewportHeight="24.0">
    <path
        android:fillColor="#FFFFFF"
        android:pathData="M10,20v-6h4v6h5v-8h3L12,3 2,12h3v8z"/>
</vector>
```
- Przejdź do pliku  `Gradle Scripts > build.gradle(Module: app)` i dodaj poniższą linię kodu :

`implementation("com.google.android.material:material:1.2.0")`

- Dodaj poniższy kod do pliku `activity_main.xml`:

```Java
<com.google.android.material.bottomnavigation.BottomNavigationView
        android:id="@+id/navigation"
        android:layout_width="0dp"
        android:layout_height="wrap_content"
        android:background="?android:attr/windowBackground"
        app:labelVisibilityMode="labeled"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:menu="@menu/menu" />
```
- Po wykonaniu tych operacji aplikacja powinna prezentować się następująco:

![App Screenshot](https://github.com/JaSycz/Simple-Social-Media-Styled-Mobile-Application/blob/pawel/zadania_praktyczne/JPWP_2.png)

## Zadanie 3
- Utwórz 3 Fragment(Blank): PPM na folderze app `New > Fragment > Fragment(Blank)` 
- W plikach `fragment.xml` ustaw text elementu TextView tak aby przy używaniu menu było widać zmiany na ekranie.
- W pliku `activity_main.xml` usuń element `<TextView>` i zamiast niego wstaw `<FrameLayout>`, który obejmuje całość ekranu poza dolnym menu.
- W pliku `MainActivity.java` dodaj odpowiednie importy:
```Java
import com.google.android.material.bottomnavigation.BottomNavigationView;
import android.view.MenuItem;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentTransaction;
```
- Stwórz obiekt `BottomNavigationView` i za pomocą `findViewById()` przypisz do niego nasze menu. Do dokończenia ....
