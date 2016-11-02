package com.alaa.amira.myrestaurant;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

/**
 * Created by amira on 9/7/2016.
 */
public class Individual_meals extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView list;

        final String[]subname ={
                "Crispy_Strips_Rice_Meal","Classic_mighty_buket","Pop_corn_mighty_bucket","Dinner_box_meal",
                "Crispy_strips_meal","Snack_box_meal","Crispy_strips_light_meal","Chicken_rice_meal","Crispy_strips_rice_meal"
        };

        Integer[] imgid={
                R.mipmap.crispystripsricemeal,
                R.mipmap.classicmightybucket,
                R.mipmap.popcornmightybucket,
                R.mipmap.dinnerboxmeal,
                R.mipmap.crispystripsmeal,
                R.mipmap.snackboxmeal,
                R.mipmap.crispystripslightmeal,
                R.mipmap.chickenricemeal,
                R.mipmap.crispystripsricemeal,
        };
final String []price={"24EGP","243EGP","234EGP","erEGP","434EGP","534EGP","324EGP","2345EGP","324EGP"};
        CustomListAdapter adapter=new CustomListAdapter(this, subname, imgid,price);

        list=(ListView)findViewById(R.id.mainList);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                // TODO Auto-generated method stub
                String Slecteditem= subname[+position];
                Toast.makeText(getApplicationContext(), Slecteditem, Toast.LENGTH_SHORT).show();


            }
        });



    }
}
