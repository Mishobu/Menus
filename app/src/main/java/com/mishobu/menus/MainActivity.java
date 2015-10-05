package com.mishobu.menus;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

    EditText edtText, edtMenu, edtOpciones;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtText = (EditText) findViewById(R.id.edtTexto);
        edtMenu = (EditText) findViewById(R.id.edtMenu);
        registerForContextMenu(edtText);



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my_menu, menu);
        menu.add("Opción Agregada");
        return true;
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.item_dos: edtText.setText("Eligió Contextual dos");
                break;
            case R.id.item_tres: edtText.setText("Eligió Contextual tres");
                break;
            case R.id.item_cuatro: edtText.setText("Eligió Contextual cuatro");
                break;
            case R.id.item_cinco: edtText.setText("Eligió Contextual cinco");
                break;
            case R.id.item_seis: edtText.setText("Eligió Contextual seis");
                break;
            case R.id.item_siete: edtText.setText("Eligió Contextual siete");
                break;
            case R.id.sub_uno: edtText.setText("Eligió Submenu Contextual uno");
                break;
            case R.id.sub_dos: edtText.setText("Eligió Submenu Contextual dos");
                break;
        }
        return super.onContextItemSelected(item);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.setHeaderTitle("Contextual");
        MenuInflater mnuInflater = getMenuInflater();
        mnuInflater.inflate(R.menu.my_options_menu,menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.item_uno: edtMenu.setText("Eligió la opción uno");
                break;
            case R.id.item_dos: edtMenu.setText("Eligió la opción dos");
                break;
            case R.id.item_tres: edtMenu.setText("Eligió la opción tres");
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}