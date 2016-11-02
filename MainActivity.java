package com.alaa.amira.myrestaurant;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {

    ListView list;
    String[] itemname ={
            "Shared_Meals",
            "Individual_Meals",
            "Extreme_Meals",
            "sandwiches & Meals",
            "zinger sandwiches meals",
            " Tasty deals",
            "side items",
            "beverages"
    };

    Integer[] imgid={
            R.mipmap.shared_meals,
            R.mipmap.individual,
            R.mipmap.xtrememeals,
            R.mipmap.sandwiches,
            R.mipmap.zinger,
            R.mipmap.tastydeals,
            R.mipmap.sideitems,
            R.mipmap.beverages,
    };
    String[] price=itemname;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomListAdapter adapter=new CustomListAdapter(this, itemname, imgid,price);
        list=(ListView)findViewById(R.id.mainList);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                // TODO Auto-generated method stub
                String Slecteditem= itemname[+position];
                Toast.makeText(getApplicationContext(), Slecteditem, Toast.LENGTH_SHORT).show();
                switch( position )
                {
                    case 0:  Intent newActivity = new Intent(MainActivity.this, Shared_Meals.class);
                        startActivity(newActivity);
                        break;
                    case 1:
                        newActivity = new Intent(MainActivity.this, Individual_meals.class);
                        startActivity(newActivity);
                        break;
                    case 2:
                        newActivity = new Intent(MainActivity.this, Extreme_Meals.class);
                        startActivity(newActivity);
                        break;

                }
            }

        });
    }
}