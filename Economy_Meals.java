package com.alaa.amira.myrestaurant;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by amira on 11/1/2016.
 */
public class Economy_Meals extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.family);
        TextView info = (TextView) findViewById(R.id.INFo);
        TextView price = (TextView) findViewById(R.id.priceTxt);
        ImageView detailed= (ImageView) findViewById(R.id.detailedImage);
        final String details ="15 Pieces of chicken with KFC’s Spicy Zinger Recipe or Original Secret Recipe, family size coleslaw, family size fries, 8 fresh buns and 1 Liter Pepsi.\n" +
                "Call 19019 Or visit one of our branches\n";
        info.setText(details);
        price.setText("255EGP");
        detailed.setImageResource(R.mipmap.economymeal);
    }
}


