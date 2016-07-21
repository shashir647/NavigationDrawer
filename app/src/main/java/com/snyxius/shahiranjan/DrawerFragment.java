package com.snyxius.shahiranjan;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Toast;

import com.snyxius.shahiranjan.Fragment.CurrentOrderFragment;
import com.snyxius.shahiranjan.Fragment.DrnkFragment;
import com.snyxius.shahiranjan.Fragment.EatFragment;
import com.snyxius.shahiranjan.Fragment.ExploreFragment;
import com.snyxius.shahiranjan.Fragment.GigsFragment;
import com.snyxius.shahiranjan.Fragment.PeopleFragment;
import com.snyxius.shahiranjan.Fragment.WorkFragment;


/**
 * A simple {@link Fragment} subclass.
 */
public class DrawerFragment extends Fragment implements View.OnClickListener {

    static DrawerLayout drawerLayout;

    public static DrawerFragment newInstance(DrawerLayout drawer) {
        // Required empty public constructor
        drawerLayout = drawer;
        DrawerFragment f = new DrawerFragment();
        return f;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.drawyer_laout_items, container, false);

    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initialise(view);
        Animation animation1 = AnimationUtils.loadAnimation(getContext(), R.anim.slide_in_left);
        view.findViewById(R.id.textView2).startAnimation(animation1);
        view.findViewById(R.id.textView2).startAnimation(animation1);
        view.findViewById(R.id.textView3).startAnimation(animation1);
        view.findViewById(R.id.textView4).startAnimation(animation1);
        view.findViewById(R.id.textView5).startAnimation(animation1);
        view.findViewById(R.id.textView6).startAnimation(animation1);
        view.findViewById(R.id.textView7).startAnimation(animation1);
        view.findViewById(R.id.textView8).startAnimation(animation1);
    }

    private void callback(View view, int position) {
        Intent intent;
        drawerLayout.closeDrawer(Gravity.LEFT);

    }

    private void initialise(View view) {
//        view.findViewById(R.id.textView).setOnClickListener(this);
        view.findViewById(R.id.textView2).setOnClickListener(this);
        view.findViewById(R.id.textView3).setOnClickListener(this);
        view.findViewById(R.id.textView4).setOnClickListener(this);
        view.findViewById(R.id.textView5).setOnClickListener(this);
        view.findViewById(R.id.textView6).setOnClickListener(this);
        view.findViewById(R.id.textView7).setOnClickListener(this);
        view.findViewById(R.id.textView8).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        drawerLayout.closeDrawers();
        switch (v.getId()) {

            case R.id.textView2:
                EatFragment eatFragment=new EatFragment();
                FragmentManager manager=getFragmentManager();
                manager.beginTransaction()
                        .replace(R.id.relativelayout_for_fragment,
                                eatFragment,eatFragment.getTag()).commit();
                Toast.makeText(getContext(),"Eat",Toast.LENGTH_SHORT).show();
                break;
            case R.id.textView3:
                DrnkFragment drnkFragment=new DrnkFragment();
                FragmentManager manager1=getFragmentManager();
                manager1.beginTransaction()
                        .replace(R.id.relativelayout_for_fragment,
                                drnkFragment,drnkFragment.getTag()).commit();
                Toast.makeText(getContext(),"Drnk",Toast.LENGTH_SHORT).show();
                break;
            case R.id.textView4:
                WorkFragment workFragment=new WorkFragment();
                FragmentManager manager2=getFragmentManager();
                manager2.beginTransaction()
                        .replace(R.id.relativelayout_for_fragment,
                                workFragment,workFragment.getTag()).commit();
                Toast.makeText(getContext(),"Work",Toast.LENGTH_SHORT).show();
                break;
            case R.id.textView5:
                PeopleFragment peopleFragment=new PeopleFragment();
                FragmentManager manager3=getFragmentManager();
                manager3.beginTransaction()
                        .replace(R.id.relativelayout_for_fragment,
                                peopleFragment,peopleFragment.getTag()).commit();
                Toast.makeText(getContext(),"People",Toast.LENGTH_SHORT).show();
                break;
            case R.id.textView6:
                GigsFragment gigsFragment=new GigsFragment();
                FragmentManager manager4=getFragmentManager();
                manager4.beginTransaction()
                        .replace(R.id.relativelayout_for_fragment,
                                gigsFragment,gigsFragment.getTag()).commit();
                Toast.makeText(getContext(),"Gigs",Toast.LENGTH_SHORT).show();
                break;
            case R.id.textView7:
                ExploreFragment exploreFragment=new ExploreFragment();
                FragmentManager manager5=getFragmentManager();
                manager5.beginTransaction()
                        .replace(R.id.relativelayout_for_fragment,
                                exploreFragment,exploreFragment.getTag()).commit();
                Toast.makeText(getContext(),"Explorer",Toast.LENGTH_SHORT).show();
                break;
            case R.id.textView8:
                CurrentOrderFragment currentOrderFragment=new CurrentOrderFragment();
                FragmentManager manager6=getFragmentManager();
                manager6.beginTransaction()
                        .replace(R.id.relativelayout_for_fragment,
                                currentOrderFragment,currentOrderFragment.getTag()).commit();
                Toast.makeText(getContext(),"CurrentOrder",Toast.LENGTH_SHORT).show();
                break;
        }

    }


}
