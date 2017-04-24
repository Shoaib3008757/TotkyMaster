package hafiz.totkymaster;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    long currentPosition = -1;

    int ifBought = -1;


    static final Integer[] imgid = {R.drawable.chai_button,R.drawable.ganny_ka_rus_button,R.drawable.garmi_button,
            R.drawable.kamar_button, R.drawable.kan_massaj_button, R.drawable.khansi_button,
            R.drawable.mutton_button, R.drawable.nashpati_button, R.drawable.shogar_button,
            R.drawable.tori_button};


    ListView image_list;
    ImageAdapter imageAdapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        image_list = (ListView) findViewById(R.id.list_view);
        imageAdapter = new ImageAdapter(this, imgid);
        image_list.setAdapter(imageAdapter);

        //getSupportActionBar().setBackgroundDrawable(new ColorDrawable(ContextCompat.getColor(MainActivity.this ,R.color.colorOrangeRed)));


        listViewClickLister();

    }//end of on create


    public void listViewClickLister(){

        image_list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                long position = image_list.getItemIdAtPosition(i);
                Log.e("TAG", "Curren Item Id is " + position);




                if (position==0) {

                    showRecipeProcedure(position);
                }
                if (position==1) {

                    showRecipeProcedure(position);
                }
                if (position==2) {

                    showRecipeProcedure(position);
                }
                if (position==3) {

                    currentPosition = position;

                    if (ifBought==3){
                        showRecipeProcedure(position);
                    }else {

                        //AlertDilaog();
                        //buyRecipe3();
                    }

                    //showRecipeProcedure(position);
                }
                if (position==4) {

                    currentPosition = position;

                    if (ifBought==4){
                        showRecipeProcedure(position);
                    }else {

                      //  AlertDilaog();
                        //  buyRecipe4();
                    }

                    //showRecipeProcedure(position);
                }
                if (position==5) {

                    currentPosition = position;

                    if (ifBought==5){
                        showRecipeProcedure(position);
                    }else {

                       // AlertDilaog();
                        //  buyRecipe5();
                    }

                    //showRecipeProcedure(position);
                }
                if (position==6) {

                    currentPosition = position;

                    if (ifBought==6){
                        showRecipeProcedure(position);
                    }else {

                     //   AlertDilaog();
                        // buyRecipe6();
                    }


                    //showRecipeProcedure(position);
                }
                if (position==7) {

                    currentPosition = position;

                    if (ifBought==7){
                        showRecipeProcedure(position);
                    }else {

                      //  AlertDilaog();
                        //buyRecipe7();
                    }

                    //showRecipeProcedure(position);
                }
                if (position==8) {

                    currentPosition = position;

                    if (ifBought==8){
                        showRecipeProcedure(position);
                    }else {

                      //  AlertDilaog();
                        // buyRecipe8();
                    }

                    //showRecipeProcedure(position);
                }
                if (position==9) {

                    currentPosition = position;

                    if (ifBought==9){
                        showRecipeProcedure(position);
                    }else {

                       // AlertDilaog();
                        //buyRecipe9();
                    }

                    //showRecipeProcedure(position);
                }

            }
        });
    }//end of listView Click

    public void showRecipeProcedure(long position){
        /*Intent veiwRecipeMethod = new Intent(MainActivity.this, ViewRecipe.class);
        veiwRecipeMethod.putExtra("id", position);
        startActivity(veiwRecipeMethod);*/
        Toast.makeText(MainActivity.this, "Please Wait...", Toast.LENGTH_SHORT).show();
    }//end of showRecipeProdcedure

}
