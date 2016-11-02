package com.alaa.amira.myrestaurant;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

/**
 * Created by amira on 11/1/2016.
 */
public class Extreme_Meals extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView list;
        final String[] ExtremeNames={
                "ChickenXtremeMeal"
                ,"MaxXtremeMeals"
                ,"TwistXtremeMeal"
                ,"SupremeXtremeMeal"};
        Integer[] imgidEX ={
                R.mipmap.chickenxtrememeal,
                R.mipmap.maxxtrememeal,
                R.mipmap.twistxtrememeal,
                R.mipmap.supremextrememeal};
        final String []price={"24EGP","243EGP","234EGP","erEGP"};
        CustomListAdapter adapter=new CustomListAdapter(this, ExtremeNames, imgidEX,price);

        list=(ListView)findViewById(R.id.mainList);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                // TODO Auto-generated method stub
                String Slecteditem= ExtremeNames[+position];
                Toast.makeText(getApplicationContext(), Slecteditem, Toast.LENGTH_SHORT).show();


            }
        });


    }
}
