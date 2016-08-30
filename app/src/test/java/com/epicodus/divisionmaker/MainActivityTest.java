package com.epicodus.divisionmaker;

import android.os.Build;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Objects;


@Config(constants = BuildConfig.class, sdk = Build.VERSION_CODES.LOLLIPOP)
@RunWith(RobolectricGradleTestRunner.class)
public class MainActivityTest {

    private MainActivity activity;

    @Before
    public void setup() {
        activity = Robolectric.setupActivity(MainActivity.class);
    }

    @Test
    public void testFillTeamArrayPopulatesAllTeams() {
        ArrayList<String> allTeams = new ArrayList<String>();
        activity.fillTeamArray(allTeams);
        assertTrue(allTeams.size() == 10);
    }

    @Test
    public void testGetDivision1Has5Names() {
        ArrayList<String> allTeams = new ArrayList<String>();
        ArrayList<String> division1 = new ArrayList<String>();
        activity.fillTeamArray(allTeams);
        division1 = activity.getDivision1(allTeams);
        assertTrue(division1.size() == 5);
    }

}