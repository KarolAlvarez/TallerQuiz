package com.i014114.tallerquiz;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FloatingActionButton bt_floating = (FloatingActionButton) findViewById(R.id.mi_bt_f);
        registerForContextMenu(bt_floating);

    }
    @Override public boolean onCreateOptionsMenu(Menu miMenu){

        getMenuInflater().inflate(R.menu.mimenu_1,miMenu);
        return true;
    }

    @Override    public boolean onOptionsItemSelected(MenuItem opcionMenu) {
        int id = opcionMenu.getItemId();
        if (id == R.id.itemTres) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(opcionMenu);
    }








    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuCtx) {
        super.onCreateContextMenu(menu, v, menuCtx);
        MenuInflater inflater = getMenuInflater();
        menu.setHeaderTitle("Mis opciones");
        inflater.inflate(R.menu.mi_menu_ctx, menu);
    }

}
