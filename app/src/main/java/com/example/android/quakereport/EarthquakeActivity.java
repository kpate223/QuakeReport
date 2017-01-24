/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.quakereport;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.android.quakereport.adapter.EarthquakeAdapter;
import com.example.android.quakereport.pojo.Earthquake;

import java.util.ArrayList;

public class EarthquakeActivity extends AppCompatActivity {

    public static final String LOG_TAG = EarthquakeActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.earthquake_activity);

        ArrayList<Earthquake> earthquakes = new ArrayList<>();

        // Create a fake list of earthquake locations.
        Earthquake earthquake = new Earthquake();
        earthquake.setMagnitude(3.0);
        earthquake.setLocation("Mexico");
        earthquake.setDate("Jan 1, 1988");

        earthquakes.add(earthquake);

        earthquake = new Earthquake();
        earthquake.setMagnitude(4.5);
        earthquake.setLocation("California");
        earthquake.setDate("July 8, 2003");

        earthquakes.add(earthquake);

        earthquake = new Earthquake();
        earthquake.setMagnitude(2.8);
        earthquake.setLocation("Texas");
        earthquake.setDate("Sept 14, 1994");

        earthquakes.add(earthquake);

        earthquake = new Earthquake();
        earthquake.setMagnitude(2.8);
        earthquake.setLocation("Las Vegas");
        earthquake.setDate("Aug 2, 2004");

        earthquakes.add(earthquake);

        earthquake = new Earthquake();
        earthquake.setMagnitude(3.3);
        earthquake.setLocation("Utah");
        earthquake.setDate("Feb 23, 2001");

        earthquakes.add(earthquake);

        // Find a reference to the {@link ListView} in the layout
        ListView earthquakeListView = (ListView) findViewById(R.id.list);

        // Create a new {@link ArrayAdapter} of earthquakes
        EarthquakeAdapter adapter = new EarthquakeAdapter(this, earthquakes);

        // Set the adapter on the {@link ListView}
        // so the list can be populated in the user interface
        earthquakeListView.setAdapter(adapter);
    }
}
