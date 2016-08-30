package com.epicodus.divisionmaker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public ArrayList<String> allTeams = new ArrayList<String>();
    public ArrayList<String> division1 = new ArrayList<String>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fillTeamArray(allTeams);
        getDivision1(allTeams);

    }


    public void fillTeamArray(ArrayList<String> allTeams) {
        allTeams.add("Kyle");
        allTeams.add("Alysa");
        allTeams.add("Evan");
        allTeams.add("Matt");
        allTeams.add("Kevin");
        allTeams.add("Josh");
        allTeams.add("Todd");
        allTeams.add("David");
        allTeams.add("Pat");
        allTeams.add("Brooks");
    }

    public ArrayList<String> getDivision1(ArrayList allTeams) {
        ArrayList<String> division1 = new ArrayList<String>();
        int startingTotal = 9;
        for(int i = 0; i <= 4; i++) {
            int number = (int)  Math.floor(Math.random() * startingTotal);
            division1.add(( allTeams.get(number).toString()));
            allTeams.remove(number);
            startingTotal = startingTotal - 1;
        }
        System.out.println(division1);
        return division1;
    }
}

