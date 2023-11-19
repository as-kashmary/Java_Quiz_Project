/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Screens.userScreens;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.database.*;

import java.io.FileInputStream;

public class FirebaseConnection {
    public static void main(String[] args) {
        try {
            // Initialize Firebase using the Firebase Admin SDK JSON file
            FileInputStream serviceAccount = new FileInputStream("C:\\Users\\rakib\\Desktop\\FireBase Json File");
            FirebaseOptions options = new FirebaseOptions.Builder()
                    .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                    .setDatabaseUrl("https://javaswingproject-d14c3.firebaseio.com")
                    .build();

            FirebaseApp.initializeApp(options);

            // Reference to your Firebase Realtime Database
            DatabaseReference database = FirebaseDatabase.getInstance().getReference();

            // Write data to the database
            database.child("message").setValue("Hello, Firebase!");

            // Read data from the database
            database.child("message").addListenerForSingleValueEvent(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot dataSnapshot) {
                    Object value = dataSnapshot.getValue();
                    System.out.println("Value from Firebase: " + value);
                }

                @Override
                public void onCancelled(DatabaseError databaseError) {
                    System.out.println("Error: " + databaseError.getMessage());
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
