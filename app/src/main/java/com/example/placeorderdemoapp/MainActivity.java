package com.example.placeorderdemoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private ListAdapter listAdapter;
    ArrayList<Product> products = new ArrayList<>();
    Button btnPlaceOrder;
    ArrayList<Product> productOrders = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getProduct();
        listView = (ListView) findViewById(R.id.customListView);
        listAdapter = new ListAdapter(this,products);
        listView.setAdapter(listAdapter);
        btnPlaceOrder = (Button) findViewById(R.id.btnPlaceOrder);
        btnPlaceOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                placeOrder();
            }
        });
    }

    private void placeOrder()
    {
        productOrders.clear();
        for(int i=0;i<listAdapter.listProducts.size();i++)
        {
            if(listAdapter.listProducts.get(i).CartQuantity > 0)
            {
                Product products = new Product(
                        listAdapter.listProducts.get(i).ProductName
                        ,listAdapter.listProducts.get(i).ProductPrice
                        ,listAdapter.listProducts.get(i).ProductImage
                );
                products.CartQuantity = listAdapter.listProducts.get(i).CartQuantity;
                productOrders.add(products);
            }
        }
    }

    public void getProduct() {
        products.add(new Product("Video Recorder",10.0d,R.mipmap.img_card_1));
        products.add(new Product("Camera",11.0d,R.mipmap.img_card_2));
        products.add(new Product("Floppy",12.0d,R.mipmap.img_card_3));
        products.add(new Product("Game Pad",13.0d,R.mipmap.img_card_3));
        products.add(new Product("Graphics Card",14.0d,R.mipmap.img_card_3));
        products.add(new Product("HDMI Cable",16.0d,R.mipmap.img_card_3));
        products.add(new Product("Headphones",11.0d,R.mipmap.img_card_3));
        products.add(new Product("I Mac",15.0d,R.mipmap.img_card_3));
        products.add(new Product("I Pad",17.0d,R.mipmap.img_card_3));
        products.add(new Product("Keyboard",67.0d,R.mipmap.img_card_3));
        products.add(new Product("Laptop",41.0d,R.mipmap.img_card_3));
        products.add(new Product("LCD",16.0d,R.mipmap.img_card_3));
        products.add(new Product("Light Bulb",18.0d,R.mipmap.img_card_3));
        products.add(new Product("Mac Mini",121.0d,R.mipmap.img_card_3));
        products.add(new Product("Monitor",122.0d,R.mipmap.img_card_3));
        products.add(new Product("Mouse",14.0d,R.mipmap.img_card_3));
        products.add(new Product("Movie Camera",51.0d,R.mipmap.img_card_3));
        products.add(new Product("Music Player",12.0d,R.mipmap.img_card_3));
        products.add(new Product("PC",16.0d,R.mipmap.img_card_3));
        products.add(new Product("Playstation",12.0d,R.mipmap.img_card_3));
        products.add(new Product("Printer",17.0d,R.mipmap.img_card_3));
        products.add(new Product("Remote",12.0d,R.mipmap.img_card_3));
        products.add(new Product("Smart Watch",18.0d,R.mipmap.img_card_3));
        products.add(new Product("Smartphone",19.0d,R.mipmap.img_card_3));
        products.add(new Product("Tablet",21.0d,R.mipmap.img_card_3));
        products.add(new Product("USB",87.0d,R.mipmap.img_card_3));
        products.add(new Product("Webcam",87.0d,R.mipmap.img_card_3));
        products.add(new Product("Windows Phone",123.0d,R.mipmap.img_card_3));
        products.add(new Product("Zerox",85.0d,R.mipmap.img_card_3));
    }
    }
