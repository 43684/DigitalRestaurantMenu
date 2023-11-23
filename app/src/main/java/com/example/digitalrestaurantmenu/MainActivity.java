package com.example.digitalrestaurantmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View;


//Jag behöver kommplettera


public class MainActivity extends AppCompatActivity {

    Button btnPizza;
    Button btnDessert;
    Button btnDrinks;

    TextView firstTitle;
    TextView firstInfo;
    ImageView firstPicture;

    TextView secondTitle;
    TextView secondInfo;
    ImageView secondPicture;

    TextView thirdTitle;
    TextView thirdInfo;
    ImageView thirdPicture;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnPizza = findViewById(R.id.btn_main_course);
        btnDessert = findViewById(R.id.btn_dessert);
        btnDrinks = findViewById(R.id.btn_drinks);

        firstTitle = findViewById(R.id.tv_first_title);
        firstInfo = findViewById(R.id.tv_first_info);
        firstPicture = findViewById(R.id.tv_first_picture);

        secondTitle = findViewById(R.id.tv_second_title);
        secondInfo = findViewById(R.id.tv_second_info);
        secondPicture = findViewById(R.id.tv_second_picture);

        thirdTitle = findViewById(R.id.tv_third_title);
        thirdInfo = findViewById(R.id.tv_third_info);
        thirdPicture = findViewById(R.id.tv_third_picture);

        btnPizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setMainCourse();
            }
        });

        btnDessert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setDesserts();
            }
        });

        btnDrinks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setDrinks();
            }
        });



    }

    public void setMainCourse(){
        firstTitle.setText(getResources().getString(R.string.pizza1));
        secondTitle.setText(getResources().getString(R.string.pizza2));
        thirdTitle.setText(getResources().getString(R.string.pizza3));

        firstInfo.setText(getResources().getString(R.string.pizza1info));
        secondInfo.setText(getResources().getString(R.string.pizza2info));
        thirdInfo.setText(getResources().getString(R.string.pizza3info));

        firstPicture.setImageDrawable(getResources().getDrawable(R.drawable.pizza1));
        secondPicture.setImageDrawable(getResources().getDrawable(R.drawable.pizza2));
        thirdPicture.setImageDrawable(getResources().getDrawable(R.drawable.pizza3));
    }

    public void setDesserts(){
        System.out.println(firstTitle);

        firstTitle.setText(getResources().getString(R.string.dessert1));
        secondTitle.setText(getResources().getString(R.string.dessert2));
        thirdTitle.setText(getResources().getString(R.string.dessert3));

        firstInfo.setText(getResources().getString(R.string.dessert1info));
        secondInfo.setText(getResources().getString(R.string.dessert2info));
        thirdInfo.setText(getResources().getString(R.string.dessert3info));

        firstPicture.setImageDrawable(getResources().getDrawable(R.drawable.dessert1));
        secondPicture.setImageDrawable(getResources().getDrawable(R.drawable.dessert2));
        thirdPicture.setImageDrawable(getResources().getDrawable(R.drawable.dessert3));
    }

    public void setDrinks(){
        firstTitle.setText(getResources().getString(R.string.drink1));
        secondTitle.setText(getResources().getString(R.string.drink2));
        thirdTitle.setText(getResources().getString(R.string.drink3));

        firstInfo.setText(getResources().getString(R.string.drink1info));
        secondInfo.setText(getResources().getString(R.string.drink2info));
        thirdInfo.setText(getResources().getString(R.string.drink3info));

        firstPicture.setImageDrawable(getResources().getDrawable(R.drawable.drink1));
        secondPicture.setImageDrawable(getResources().getDrawable(R.drawable.drink2));
        thirdPicture.setImageDrawable(getResources().getDrawable(R.drawable.drink3));
    }
}