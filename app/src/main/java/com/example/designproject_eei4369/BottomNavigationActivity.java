package com.example.designproject_eei4369;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.example.designproject_eei4369.databinding.ActivityBottomNavigationBinding;

public class BottomNavigationActivity extends AppCompatActivity {

   @NonNull  private ActivityBottomNavigationBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityBottomNavigationBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


       // binding.navigation.setOnItemSelectedListener(item -> {

           // switch (item.getItemId()) {

              //  case R.id.home:
              //      replaceFragment(new HomeActivity());
              //      break;
              //  case R.id.gallery:
              //      replaceFragment(new videoGallery());
              //      break;
             //   case R.id.place:
              //      replaceFragment(new places());
             //       break;
           // }
          //  return true;

     //   });

    }

    private void replaceFragment(Fragment fragment){

        FragmentManager fragmentManager =getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        fragmentTransaction.replace(R.id.frame,fragment);
        fragmentTransaction.commit();

    }
}