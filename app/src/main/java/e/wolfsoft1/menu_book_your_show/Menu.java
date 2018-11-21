package e.wolfsoft1.menu_book_your_show;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

import adapter.MenuAdapter;
import model.MenuModel;

public class Menu extends AppCompatActivity {


    Integer[] homeimage = {R.drawable.jurassicworld,R.drawable.oceans8,R.drawable.venom,R.drawable.spy,R.drawable.e2,R.drawable.mamma,R.drawable.again,R.drawable.skyscraper,R.drawable.hotelt};

    String[] hometext1 = {"Jurassic World","Oceans 8","Oceans 8","The Spy Who D...","The Equalizer 2","Mamma Mia","Ant Man and Th ..","Skyscraper","Hotel Transylvan .."};
    String[] hometext2 = {"1h 12m","1h 42m","1h 24m","1h 12m","1h 42m","1h 24m","1h 12m","1h 42m","1h 24m"};


    private MenuAdapter homepageAdapter;
    private RecyclerView recyclerview;
    private ArrayList<MenuModel> homeModelArrayList;


    Spinner sp_car_name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        recyclerview = findViewById(R.id.recyclerview);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(Menu.this,3);
        recyclerview.setLayoutManager(layoutManager);
        recyclerview.setItemAnimator(new DefaultItemAnimator());

        homeModelArrayList = new ArrayList<>();


        for (int i = 0; i <homeimage.length; i++) {
            MenuModel view = new MenuModel(homeimage[i],hometext1[i],hometext2[i]);
            homeModelArrayList.add(view);
        }
        homepageAdapter = new MenuAdapter(Menu.this,homeModelArrayList);
        recyclerview.setAdapter(homepageAdapter);




        sp_car_name = findViewById(R.id.sp_car_name);
        //sp_car_model = (Spinner)view.findViewById(R.id.sp_car_model);

        List<String> list = new ArrayList<String>();
        list.add("Movies in Chennai ");
        list.add("Movies in Gujarat ");
        list.add("Movies in Chennai");
        list.add("Movies in Chennai");
        list.add("Movies in Chennai");

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(Menu.this, R.layout.spinner_item, R.id.spinner_text, list);
        sp_car_name.setAdapter(dataAdapter);
    }
}
