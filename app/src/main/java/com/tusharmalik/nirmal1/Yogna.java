package com.tusharmalik.nirmal1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Yogna extends AppCompatActivity {

    ArrayList<Yognadetails> YognadetailsList=Yognadetails.genRandCourses(5);

    ListView lvYognadetailsDetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yogna);

        lvYognadetailsDetails = (ListView) findViewById(R.id.l3);
        Yogna.YognadetailsAdapter YognadetailsAdapter = new Yogna.YognadetailsAdapter();
        lvYognadetailsDetails.setAdapter(YognadetailsAdapter);
    }

    class YognadetailsAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return YognadetailsList.size();
        }

        @Override
        public Yognadetails getItem(int position) {
            return YognadetailsList.get(position);
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            LayoutInflater li = getLayoutInflater();
            convertView = li.inflate(R.layout.yognadetailsdetails, parent, false);


            TextView tvName = (TextView) convertView.findViewById(R.id.tvYognadetailsname);
            TextView tvdesc = (TextView) convertView.findViewById(R.id.tvYognadetailsdesc);


            Yognadetails thisYognadetails = getItem(position);

            tvName.setText(thisYognadetails.getName());
            tvdesc.setText(thisYognadetails.getDescription());

            return convertView;
        }

    }
}

