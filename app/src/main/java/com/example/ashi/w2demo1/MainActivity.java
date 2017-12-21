package com.example.ashi.w2demo1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        listView=(ListView)findViewById(R.id.lstView);
//        String [] names={"CCVT","CSF","BAO","UPES","Bidholi","CCVT","CSF","BAO","UPES","Bidholi","CCVT","CSF","BAO","UPES","Bidholi",
//                "CCVT","CSF","BAO","UPES","Bidholi","CCVT","CSF","BAO","UPES","Bidholi"};
//        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,names);
//        listView.setAdapter(arrayAdapter);


    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("onStart ","onStart() is called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("onResume","onResume() is called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("onPause","onPause() is called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("onStop","onStop() is called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("onStop","onDestroy() is called");
    }
}
