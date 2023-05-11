## Papilon DigitalOnBoarding - Android

<br>
Papilon DigitalOnBoarding is an android app sdk.
</br>

<br>
<br>

## Installation
<hr>

* <b>1- Build.gradle (:app)</b>
    
    ### DigitalOnBoarding SDK Extra Dependencies
  

    <i>

    ```JAVA
        implementation 'org.jmrtd:jmrtd:0.7.18'
        implementation 'net.sf.scuba:scuba-sc-android:0.0.20'
        implementation 'com.madgag.spongycastle:prov:1.58.0.0'
        implementation 'edu.ucar:jj2000:5.2'
        implementation 'com.github.mhshams:jnbis:1.1.0'
        implementation 'androidx.appcompat:appcompat:1.4.1'
        implementation 'com.google.android.material:material:1.5.0'
        implementation 'androidx.constraintlayout:constraintlayout:2.1.3'
        implementation "com.google.android.datatransport:transport-runtime:3.1.8"
        implementation platform('com.google.firebase:firebase-bom:30.5.0')
        implementation 'com.google.firebase:firebase-crashlytics-buildtools:2.8.1'
        implementation "com.google.firebase:firebase-iid:21.1.0"
        implementation 'com.google.firebase:firebase-crashlytics:18.3.2'
        implementation 'com.google.firebase:firebase-messaging:23.0.0'
        implementation 'androidx.work:work-runtime:2.7.1'
        implementation 'com.google.code.gson:gson:2.8.8'
        implementation 'androidx.navigation:navigation-fragment:2.4.2'
        implementation 'androidx.navigation:navigation-ui:2.4.2'
        testImplementation 'junit:junit:4.13.2'
        androidTestImplementation 'androidx.test.ext:junit:1.1.3'
        androidTestImplementation 'androidx.test.espresso:espresso-core:3.4.0'
        implementation 'androidx.multidex:multidex:2.0.1'
        implementation 'androidx.lifecycle:lifecycle-livedata:2.2.0'
        implementation "androidx.lifecycle:lifecycle-viewmodel:2.2.0"
        implementation 'com.google.mlkit:barcode-scanning:16.0.3'
        implementation 'com.google.code.gson:gson:2.8.5'
        implementation 'com.google.guava:guava:27.0.1-android'
        implementation 'androidx.camera:camera-camera2:1.1.0-beta03'
        implementation 'androidx.camera:camera-lifecycle:1.0.2-beta03'
        implementation 'androidx.camera:camera-view:1.0.0-alpha14'
        implementation 'androidx.camera:camera-view:1.0.0-alpha32'
        implementation 'com.google.android.gms:play-services-mlkit-text-recognition:16.1.1'
        androidTestImplementation 'androidx.test.ext:junit:1.1.1'
        def camerax_version = "1.1.0-beta03"
        implementation "androidx.camera:camera-core:${camerax_version}"
        implementation "androidx.camera:camera-camera2:${camerax_version}"
        implementation "androidx.camera:camera-lifecycle:${camerax_version}"
        implementation "androidx.camera:camera-video:${camerax_version}"
        implementation "androidx.camera:camera-view:${camerax_version}"
        implementation "androidx.camera:camera-extensions:${camerax_version}"
        implementation 'com.github.barteksc:android-pdf-viewer:3.2.0-beta.1'
        implementation 'com.github.Papilon-Savunma:PapilonMrzLibrary:1.0.1'
        implementation ('org.jitsi.react:jitsi-meet-sdk:4.1.0') { transitive = true }
        implementation ('io.socket:socket.io-client:2.0.0') { exclude group: 'org.json', module: 'json' }
        implementation 'com.squareup.retrofit2:retrofit:2.9.0'
        implementation 'com.squareup.retrofit2:converter-gson:2.9.0'
        implementation 'com.google.android.gms:play-services-mlkit-text-recognition:17.0.1'
        implementation 'com.google.mlkit:text-recognition-devanagari:16.0.0-beta2'
        implementation 'pl.droidsonroids.gif:android-gif-drawable:1.2.22'
        implementation 'com.github.Papilon-Savunma:PapilonNfcReaderAndroid:4.0.2'
    ```

    </i>

    <br>



    ### Main SDK Dependency

    <i>

    ```JAVA
        implementation 'com.github.Papilon-Savunma:PapilonDobAndroid:v.0.1.17'
    ```
    </i>
     
<br>
<br>

* <b> 2- Settings.gradle </b>
 

    ### Private Usages and Jitsi Meet Components

    <i>

    ```JAVA
        import org.gradle.api.initialization.resolve.RepositoriesMode

        pluginManagement {
            repositories {
                gradlePluginPortal()
                google()
                mavenCentral()
                maven {
                    url "https://www.jitpack.io"
                    credentials {
                        username authToken
                    }
                }
                maven {
                    url "https://maven.google.com"
                }
                jcenter()
                maven {
                    url "https://github.com/jitsi/jitsi-maven-repository/raw/master/releases"
                }
            }
        }

        dependencyResolutionManagement {
            repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
            repositories {
                google()
                mavenCentral()
                jcenter()

                maven {
                    url "https://www.jitpack.io"
                    credentials {
                        username authToken
                    }
                }
                maven {
                    url "https://github.com/jitsi/jitsi-maven-repository/raw/master/releases"
                }
            }
        }
    ```

    </i>

<br>

* <b> 3- Gradle.properties </b>
    <br>

    <i>

    ```JAVA
        org.gradle.jvmargs=-Xmx2048m -Dfile.encoding=UTF-8
        android.useAndroidX=true
        android.nonTransitiveRClass=true
        android.enableJetifier=true
        android.overridePathCheck=false
        android.enableDexingArtifactTransform.desugaring=true
        android.useNewApkCreator=true

        #SDK Private Usage Token
        authToken: jp_3tafktfd22ug28pk2umqa6e2nn
    ```

    </i>

    <b> Note: Important Field For Private Usage </b>
    
<br>
## Dependencies
<hr>

* <b> Minimum SDK: 23</b>
* <b> Grade Version: 7.2.2</b>
* <b> Target SDK: 33</b>
* <b> Java Version: 1.8</b>

<br>

## Usage
<hr>

* Firstly, you should create an activity.
* Import sdk and <b>"WelcomeKvkk"</b> activity in the main activity.
* Define an intent to open sdk pages from main application.
* Put 3 parameters to intent as extra fields.
    a) <b>"calling_package"</b> (It should be the package name of main application)
    b) <b>"calling_class" </b> (It should be the activity class name of main application')
    c) <b>"from_main"</b> (It should be "true")

    <br>

    Then, you can start the activity using startActivity method.

    <br>

     <b>Sample</b>:
     

    <i>

    ```JAVA

    Intent intent = new Intent(BaseActivity.this, WelcomeKvkk.class);
    intent.putExtra("calling_package", "com.papilon.tacirlersdk");
    intent.putExtra("calling_class", "com.papilon.tacirlersdk.BaseActivity");
    intent.putExtra("from_main", "true");
    startActivity(intent);
    ```

    </i>





