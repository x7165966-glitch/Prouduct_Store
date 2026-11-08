package com.example.productstore;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.productstore.adapter.ProductAdapter;
import com.example.productstore.model.Product;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);




        RecyclerView recyclerView =
                findViewById(R.id.productsRecyclerView);


        recyclerView.setLayoutManager(
                new GridLayoutManager(this, 2)
        );


        ArrayList<Product> products = new ArrayList<>();


        products.add(new Product(
                R.drawable.ic_launcher_background,
                "Bitzwolf B-CC1 Camera 1080P HD Webcam",
                48.89
        ));

        products.add(new Product(
                R.drawable.ic_launcher_foreground,
                "Bitzwolf B-CC1 Camera 1080P HD Webcam",
                55.89
        ));

        products.add(new Product(
                R.drawable.ic_launcher_foreground,
                "Bitzwolf B-CC1 Camera 1080P HD Webcam",
                78.89
        ));

        products.add(new Product(
                R.drawable.ic_launcher_foreground,
                "Bitzwolf B-CC1 Camera 1080P HD Webcam",
                88.55
        ));

        products.add(new Product(
                R.drawable.ic_launcher_foreground,
                "Bitzwolf B-CC1 Camera 1080P HD Webcam",
                23.67
        ));

        products.add(new Product(
                R.drawable.ic_launcher_background,
                "Bitzwolf B-CC1 Camera 1080P HD Webcam",
                44.89
        ));


        ProductAdapter adapter = new ProductAdapter(products);


        recyclerView.setAdapter(adapter);
    }
}