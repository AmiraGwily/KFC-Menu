package com.alaa.amira.myrestaurant;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by amira on 11/1/2016.
 */
public class Family extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.family);
        TextView info = (TextView) findViewById(R.id.INFo);
        TextView price = (TextView) findViewById(R.id.priceTxt);
        ImageView detailed= (ImageView) findViewById(R.id.detailedImage);
        final String details ="12 Pieces of Chicken with KFC’s Spicy Zinger Recipe or Original Secret Recipe, family size coleslaw, family size fries, 6 fresh buns with Pepsi.\n" +
                "Call 19019 Or visit one of our branches";
        info.setText(details);
        price.setText("235EGP");
        detailed.setImageResource(R.mipmap.familymeal);
    }
}
