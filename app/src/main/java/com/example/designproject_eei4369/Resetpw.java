package com.example.designproject_eei4369;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Resetpw extends AppCompatActivity {

    DBHelper mydb;

    EditText editpw,editcpw,updatelist;
    Button btnupdate, btnback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resetpw);

        mydb =new DBHelper(this);
        editpw=findViewById(R.id.new_password);
        editcpw=findViewById(R.id.confirm_password);
        updatelist=findViewById(R.id.enter);
        btnupdate=findViewById(R.id.btnupdte);
        btnback=findViewById(R.id.back);

        updateData();

        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Resetpw.this,LoginActivity.class));
            }
        });
    }


    public void updateData(){
        btnupdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean isUpdate = mydb.updateData(updatelist.getText().toString(),editpw.getText().toString(),editcpw.getText().toString());

                if (isUpdate == true)
                    Toast.makeText(Resetpw.this,"Data Updated Successfully",Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(Resetpw.this,"Data Not Updated",Toast.LENGTH_LONG).show();
            }
        });
    }


}