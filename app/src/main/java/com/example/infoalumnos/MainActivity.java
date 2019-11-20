package com.example.infoalumnos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.ButtonBarLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    AppCompatButton btnAcept;
    AppCompatButton btnClean;
    TextInputLayout txtInputName;
    TextInputLayout txtInputAge;
    TextView txtNameStudent;
    ImageView imgStudent;
    TextView txtDescription;
    TextView txtAbilities;
    TextView txtWelcome;
    TextInputEditText txtInputName_;
    TextInputEditText txtInputAge_;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppTheme);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnAcept = (AppCompatButton) findViewById(R.id.btnAcept);
        btnClean = (AppCompatButton) findViewById(R.id.btnClean);
        txtInputName = (TextInputLayout) findViewById(R.id.txtInputName);
        txtInputName_ = (TextInputEditText) findViewById(R.id.txtInputName_);
        txtInputAge = (TextInputLayout) findViewById(R.id.txtInputAge);
        txtInputAge_ = (TextInputEditText) findViewById(R.id.txtInputAge_);
        txtNameStudent = (TextView) findViewById(R.id.txtNameStudent);
        imgStudent = (ImageView) findViewById(R.id.imgStudent);
        txtDescription = (TextView) findViewById(R.id.txtDescription);
        txtAbilities = (TextView) findViewById(R.id.txtAbilities);
        txtWelcome = (TextView) findViewById(R.id.txtWelcome);

        Toast.makeText(this, "Bienvenid@ a mi App :) !", Toast.LENGTH_SHORT).show();


    }

    public void student1(View v){
        String name = "Gilson Ariel Chariguaman Morocho";
        String description = "Aqui va mi descripcion";
        String abilities = "Aqui van mis habilidades";
       txtNameStudent.setText(name);

       imgStudent.setImageResource(R.drawable.student1);

       txtDescription.setText(description);
       txtAbilities.setText(abilities);
    }
    public void student2(View v){
        String name = "Nataly Lizeth Quilumbaquin Tutillo";
        String description = "Aqui va la descripcion de al licha";
        String abilities = "Aqui van las habilidades de la licha";
        txtNameStudent.setText(name);
        imgStudent.setImageResource(R.drawable.student2);
        txtDescription.setText(description);
        txtAbilities.setText(abilities);
    }


    private  boolean validateName(){
        String nameInput = txtInputName.getEditText().getText().toString().trim();

        if(nameInput.isEmpty()){
            txtInputName.setError("Ingrese un Nombre");
            return  false;
        }else {
            txtInputName.setError(null);
            return  true;

        }
    }
    private  boolean validateAge(){
        String ageInput = txtInputAge.getEditText().getText().toString().trim();

        if(ageInput.isEmpty()){
            txtInputAge.setError("Ingrese una Edad");
            return  false;
        } else {
            txtInputAge.setError(null);
            return  true;

        }
    }

    public void welcome (View v){
        if (!validateName() | !validateAge()){
            return;
        }
        String name = txtInputName.getEditText().getText().toString();
        String age = txtInputAge.getEditText().getText().toString();
        String welcome = "Bienvenid@ "+name+" tu edad es "+age+".";
        txtWelcome.setText(welcome);
    }

    public void clean (View v){
        txtNameStudent.setText("Nombre del Alumno");
        txtWelcome.setText("...");
        imgStudent.setImageResource(R.drawable.user);
        txtDescription.setText("...");
        txtAbilities.setText("...");
        txtInputName_.setText("");
        txtInputAge_.setText("");
        txtInputName.setError(null);
        txtInputAge.setError(null);
        Toast.makeText(this, "Campos limpios:) !", Toast.LENGTH_SHORT).show();
    }




}
