package com.example.testapp;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
@RunWith(JUnit4.class)

public class MainTest {

    @Rule
    public ActivityScenarioRule rule = new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void plusCase (){
        onView(withId(R.id.num1_ed)).perform(typeText("2"));
        onView(withId(R.id.num2_ed)).perform(typeText("4"));
        onView(withId(R.id.ok_btn_plus)).perform(click());
        onView(withId(R.id.result_tv)).check(matches(withText("6")));
    }

    @Test
    public void minusCase (){
        onView(withId(R.id.num1_ed)).perform(typeText("11"));
        onView(withId(R.id.num2_ed)).perform(typeText("3"));
        onView(withId(R.id.ok_btn_plus)).perform(click());
        onView(withId(R.id.result_tv)).check(matches(withText("7")));
    }

    @Test
    public void multyCase (){
        onView(withId(R.id.num1_ed)).perform(typeText("2"));
        onView(withId(R.id.num2_ed)).perform(typeText("8"));
        onView(withId(R.id.ok_btn_plus)).perform(click());
        onView(withId(R.id.result_tv)).check(matches(withText("16")));
    }

    @Test
    public void divide(){
        onView(withId(R.id.num1_ed)).perform(typeText("34"));
        onView(withId(R.id.num2_ed)).perform(typeText("2"));
        onView(withId(R.id.ok_btn_divide)).perform(click());
        onView(withId(R.id.result_tv)).check(matches(withText("17")));
    }
}
