package com.example.agronepal.AboutPage;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.agronepal.R;

import mehdi.sakout.aboutpage.AboutPage;
import mehdi.sakout.aboutpage.Element;

public class about extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);


        // Using Github library for About Page....

        Element adsElement = new Element();
        adsElement.setTitle("Final Year Project");


        View aboutPage = new AboutPage(this)
                .isRTL(false)
                .setImage(R.drawable.finallogo)
                .addItem(new Element().setTitle("Version 1.0.0"))
                .setDescription("Agro Nepal is a mobile based application designed to help farmers of Nepal. This application will be very handful to those who are new or say do not have an idea in agriculture. It can surely help them by providing all a necessary information regarding farming.  the application also gives the feature of identifying plant. Further news and blog related with farming can be handful for proper planning and better growth of the product. Similarly, a product and pesticides market price and details are also shown Agro Nepal can support Nepal's farmers by offering localized and based farming tips and ideas.")
                .addItem(adsElement)
                .addEmail("pragyawali0@gmail.com")
                .addTwitter("PrazitG")
                .addInstagram("prazit_")
                .create();
        setContentView(aboutPage);
    }
}