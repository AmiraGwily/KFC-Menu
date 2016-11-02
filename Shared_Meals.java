package com.alaa.amira.myrestaurant;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

/**
 * Created by amira on 9/4/2016.
 */
public class Shared_Meals extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView list;
        final String[] subname ={
                "Family_meal","Economy_meal","Super_family","Part_ meal"
        };
        String[] price ={" 345","456","345","456"};

        Integer[] imgid={
                R.mipmap.familymeal,
                R.mipmap.economymeal,
                R.mipmap.superfamilymeal,
                R.mipmap.partymeal,

        };

            CustomListAdapter adapter=new CustomListAdapter(this, subname, imgid, price);
            list=(ListView)findViewById(R.id.mainList);
            list.setAdapter(adapter);

            list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

                @Override
                public void onItemClick(AdapterView<?> parent, View view,
                                        int position, long id) {
                    // TODO Auto-generated method stub
                    String Slecteditem= subname[+position];
                    Toast.makeText(getApplicationContext(), Slecteditem, Toast.LENGTH_SHORT).show();
                     switch (position) {
                         case 0:
                             Intent inte = new Intent(Shared_Meals.this, Family.class);
                             startActivity(inte);
                         case 1:
                             Intent a = new Intent(Shared_Meals.this, Economy_Meals.class);
                             startActivity(a);
                         case 2:
                             Intent ab = new Intent(Shared_Meals.this, Super_family.class);
                             startActivity(ab);
                         case 3:
                             Intent abc = new Intent(Shared_Meals.this, Super_family.class);
                             startActivity(abc);
                     }
                }
            });
        }
    }

