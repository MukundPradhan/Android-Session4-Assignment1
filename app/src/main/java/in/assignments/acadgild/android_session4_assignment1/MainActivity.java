package in.assignments.acadgild.android_session4_assignment1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    Button btnAscending, btnDescending;
    ListView listView;
    ArrayList<String> ascMonthList, descMonthNameList, monthNameList=new  ArrayList<>();
    ArrayAdapter<String> arrayAdapter, ascArrayAdapter, descArrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAscending = (Button) findViewById(R.id.buttonAsc);
        btnDescending = (Button) findViewById(R.id.buttonDsc);
        listView = (ListView) findViewById(R.id.listView);

        monthNameList.add("January");
        monthNameList.add("February");
        monthNameList.add("March");
        monthNameList.add("April");
        monthNameList.add("May");
        monthNameList.add("June");
        monthNameList.add("July");
        monthNameList.add("August");
        monthNameList.add("September");
        monthNameList.add("October");
        monthNameList.add("November");
        monthNameList.add("December ");

        arrayAdapter = new ArrayAdapter<String>(getApplicationContext(), R.layout.list_format,
                R.id.textView, monthNameList);
        listView.setAdapter(arrayAdapter);

        btnAscending.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        arrayAdapter.clear();
                        Collections.sort(ascMonthList, (Comparator<? super String>) monthNameList);
                        arrayAdapter = new ArrayAdapter<>(getApplicationContext(),R.layout.list_format,R.id.textView,ascMonthList);
                        listView.setAdapter(arrayAdapter);
                        arrayAdapter.notifyDataSetChanged();
                    }
                }
        );

        btnDescending.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                    }
                }
        );
    }




}

