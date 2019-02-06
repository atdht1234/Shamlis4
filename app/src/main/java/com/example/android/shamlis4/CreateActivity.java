package com.example.android.shamlis4;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;


public class CreateActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView iv ;
    Button addPic , btncontinue;
    public static final int CAMERA_REQUEST_CODE = 0;
    public static final int GALLERY_REQUEST_CODE = 1;
    private AlertDialog.Builder ad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create);
        iv = findViewById(R.id.profile);
        btncontinue = findViewById(R.id.btncontinue);
        btncontinue.setOnClickListener(this);
        addPic = findViewById(R.id.addPic);
        addPic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

         if(view==btncontinue){
             showAlertDialog();

         }
            }
        });
    }

    public void showAlertDialog(){
        ad = new AlertDialog.Builder(this);
        ad.setTitle("insurance");
        ad.setMessage("are you sure?");
        ad.setPositiveButton("yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                Toast.makeText(CreateActivity.this, "thank you", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(CreateActivity.this,Code.class);
                startActivity(intent);

            }
        });
        ad.setNegativeButton("no", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
               Intent intent = new Intent(CreateActivity.this,CreateActivity.class);
               startActivity(intent);
            }
        });
        ad.show();
            }

    public void choosePhotoFromGallary() {
        Intent galleryIntent = new Intent(Intent.ACTION_PICK,
                android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);

        startActivityForResult(galleryIntent, GALLERY_REQUEST_CODE);
    }


    private void takePhotoFromCamera() {
        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);

        startActivityForResult(intent, CAMERA_REQUEST_CODE);
    }


    private void showPictureDialog(View view){
        AlertDialog.Builder pictureDialog = new AlertDialog.Builder(this);
        pictureDialog.setTitle("Select Action");
        String[] pictureDialogItems = {
                "Select photo from gallery",
                "Capture photo from camera" };
        pictureDialog.setItems(pictureDialogItems,
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        switch (which) {
                            case 0:
                                choosePhotoFromGallary();
                                break;
                            case 1:
                                takePhotoFromCamera();
                                break;
                        }
                    }
                });
        pictureDialog.show();
    }




    protected void onActivityResult(int requestCode, int resultCode, Intent imageReturnedIntent,View view) {
        super.onActivityResult(requestCode, resultCode, imageReturnedIntent);
        switch(requestCode) {
            case CAMERA_REQUEST_CODE:
                if(resultCode == RESULT_OK){
                    Bundle extras = imageReturnedIntent.getExtras();
                    Bitmap bmp = (Bitmap) extras.get("data");
                    iv.setImageBitmap(bmp);
                }

                break;

            case GALLERY_REQUEST_CODE:
                if(resultCode == RESULT_OK){
                    Uri selectedImage = imageReturnedIntent.getData();
                    iv.setImageURI(selectedImage);
                }
                break;
        }


    }


    @Override


    public void onClick(View view) {
        if(view == btncontinue){

            ad.show();

        }
    }
}