package com.example.ucgames;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TextView;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;


public class DetailsActivity extends AppCompatActivity{

    ImageView img, back;
    TextView proName, proRating, proCost, proPublisher, proDeveloper, proDescription, proRsr;
    RatingBar ratingBar;

    String name, rating, cost, publisher, developer, description, rsr, headerFilename;
    int image;

    private LinearLayout topPart;
    private LinearLayout detailsContents;
    private Button buy_dialog_message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        topPart = (LinearLayout) findViewById(R.id.custom_action_bar);
        topPart.setBackgroundColor(Color.parseColor("#060DD9"));

        detailsContents = (LinearLayout) findViewById(R.id.details_content);
        detailsContents.setBackgroundColor(Color.parseColor("#F3F3FF"));

        buy_dialog_message = findViewById(R.id.buy_now_btn);
        buy_dialog_message.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                showButtonMsg();
            }
        });

        // The following receives the values to populate the details activity and sets them in
        // the appropriate locations.
        Intent i = getIntent();

        name = i.getStringExtra("name");
        headerFilename = i.getStringExtra("image");
        rating = i.getStringExtra("rating");
        cost = i.getStringExtra("cost");
        publisher = i.getStringExtra("publisher");
        developer = i.getStringExtra("developer");
        description = i.getStringExtra("description");
        rsr = i.getStringExtra("rsr");

        proName = findViewById(R.id.product_name_text_view);
        proCost = findViewById(R.id.text_view_price);
        proRating = findViewById(R.id.star_rating);
        proPublisher = findViewById(R.id.text_view_publisher);
        proDeveloper = findViewById(R.id.text_view_developer);
        proDescription = findViewById(R.id.text_view_description);
        proRsr = findViewById(R.id.text_view_system_requirements);
        //img = findViewById(R.id.big_image);
        back = findViewById(R.id.custom_back_btn);
        ratingBar = findViewById(R.id.rating_bar);
        ImageSlider imageSlider = findViewById(R.id.slider);


        proName.setText(name);
        proRating.setText(rating);
        proCost.setText(cost);
        proPublisher.setText(publisher);
        proDeveloper.setText(developer);
        proDescription.setText(description);
        proRsr.setText(rsr);
        ratingBar.setRating(Float.parseFloat(rating));

        int k;
        List<SlideModel> slideModels = new ArrayList<>();

        // Add 3 images to the imageSlider
        for (k = 1; k < 4; k++){
            image = getResources().getIdentifier(headerFilename + "_" + String.valueOf(k), "drawable", getPackageName());
            if(image != 0){
                slideModels.add(new SlideModel(image, ScaleTypes.FIT));
            }
        }

        imageSlider.setImageList(slideModels);

        // Set animation for DetailsActivity
        Animation slideUp = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide_up);
        detailsContents.startAnimation(slideUp);


        // Set listener for top-left back button
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(DetailsActivity.this, MainActivity.class);
                startActivity(i);
                finish();

            }
        });

    }
    private void showButtonMsg(){
        final Dialog dialog = new Dialog(this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.buy_message);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.setCancelable(true);
        dialog.show();
    }
}