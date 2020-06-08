package sg.edu.rp.c346.id19045346.demotipsforexam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    ListView lvExamTips;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        lvExamTips = findViewById(R.id.listViewExamTips);


        String array1 = "Don't just read the code, code it as much as possible during each practical session";
        String array2 = "Seek help from the lecturer ASAP, don't wait till you lost in the jungle";
        String array3 = "Prepare your template source code for each topic";
        String array4 = "Create a few empty Android projects to speed up your coding during the exam";
        String array5 = "Ensure that your Android Studio is up and running before the exam";

        ArrayList<String> examTipsArray  = new ArrayList<String>();

        examTipsArray.addAll(Arrays.asList(array1,array2,array3,array4,array5));


        ArrayAdapter adapter = new ArrayAdapter<> (this, android.R.layout.simple_list_item_1,examTipsArray);

        lvExamTips.setAdapter(adapter);



    }
}
