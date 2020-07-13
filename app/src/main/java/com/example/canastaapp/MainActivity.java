package com.example.canastaapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static java.util.Arrays.asList;

public class MainActivity extends AppCompatActivity {

    PathInterpolator pathInterpolator;
    ArrayList<float[]> XAndY;
    ArrayList<ImageView> imageViews;
    ArrayList<Integer> cardIntegers;
    int j = -1;
    int k = 25;

    ImageView test;
    boolean showingBack = false;

    int gameState = 0;

    ImageView middleCard;
    ImageView middleCard2;
    ImageView middleCard3;
    ImageView middleCard4;
    ImageView middleCard5;
    ImageView middleCard6;
    ImageView middleCard7;
    ImageView middleCard8;
    ImageView middleCard9;
    ImageView middleCard10;
    ImageView middleCard11;
    ImageView middleCard12;
    ImageView middleCard13;
    ImageView middleCard14;
    ImageView middleCard15;
    ImageView middleCard16;
    ImageView middleCard17;
    ImageView middleCard18;
    ImageView middleCard19;
    ImageView middleCard20;
    ImageView middleCard21;
    ImageView middleCard22;
    ImageView middleCard23;
    ImageView middleCard24;
    ImageView middleCard25;
    ImageView middleCard26;
    ImageView middleCard27;
    ImageView middleCard28;
    ImageView middleCard29;
    ImageView middleCard30;
    ImageView middleCard31;
    ImageView middleCard32;
    ImageView middleCard33;
    ImageView middleCard34;
    ImageView middleCard35;
    ImageView middleCard36;
    ImageView middleCard37;
    ImageView middleCard38;
    ImageView middleCard39;
    ImageView middleCard40;
    ImageView middleCard41;
    ImageView middleCard42;
    ImageView middleCard43;
    ImageView middleCard44;
    ImageView middleCard45;
    ImageView middleCard46;
    ImageView middleCard47;
    ImageView middleCard48;
    ImageView middleCard49;
    ImageView middleCard50;
    ImageView middleCard51;
    ImageView middleCard52;

    public void assignImage(final ImageView imageView, final int i) {

        imageView.animate()//.withLayer
                .rotationY(90)
                .setDuration(300)
                .withEndAction(
                        new Runnable() {
                            @Override public void run() {


                                //<change the image...>

                                if (i == 101) {
                                    imageView.setImageResource(R.drawable.ace_of_clubs);
                                }
                                else if (i == 102) {
                                    imageView.setImageResource(R.drawable.two_of_clubs);

                                }
                                else if (i == 103) {
                                    imageView.setImageResource(R.drawable.three_of_clubs);
                                }
                                else if (i == 104) {
                                    imageView.setImageResource(R.drawable.four_of_clubs);
                                }
                                else if (i == 105) {
                                    imageView.setImageResource(R.drawable.five_of_clubs);
                                }
                                else if (i == 106) {
                                    imageView.setImageResource(R.drawable.six_of_clubs);
                                }
                                else if (i == 107) {
                                    imageView.setImageResource(R.drawable.seven_of_clubs);

                                }
                                else if (i == 108) {
                                    imageView.setImageResource(R.drawable.eight_of_clubs);
                                }
                                else if (i == 109) {
                                    imageView.setImageResource(R.drawable.nine_of_clubs);
                                }
                                else if (i == 110) {
                                    imageView.setImageResource(R.drawable.ten_of_clubs);
                                }
                                else if (i == 111) {
                                    imageView.setImageResource(R.drawable.jack_of_clubs);
                                }
                                else if (i == 112) {
                                    imageView.setImageResource(R.drawable.queen_of_clubs);

                                }
                                else if (i == 113) {
                                    imageView.setImageResource(R.drawable.king_of_clubs);
                                }
                                else if (i == 201) {
                                    imageView.setImageResource(R.drawable.ace_of_diamonds);
                                }
                                else if (i == 202) {
                                    imageView.setImageResource(R.drawable.two_of_diamonds);
                                }
                                else if (i == 203) {
                                    imageView.setImageResource(R.drawable.three_of_diamonds);
                                }
                                else if (i == 204) {
                                    imageView.setImageResource(R.drawable.four_of_diamonds);

                                }
                                else if (i == 205) {
                                    imageView.setImageResource(R.drawable.five_of_diamonds);
                                }
                                else if (i == 206) {
                                    imageView.setImageResource(R.drawable.six_of_diamonds);
                                }
                                else if (i == 207) {
                                    imageView.setImageResource(R.drawable.seven_of_diamonds);
                                }
                                else if (i == 208) {
                                    imageView.setImageResource(R.drawable.eight_of_diamonds);
                                }
                                else if (i == 209) {
                                    imageView.setImageResource(R.drawable.nine_of_diamonds);

                                }
                                else if (i == 210) {
                                    imageView.setImageResource(R.drawable.ten_of_diamonds);
                                }
                                else if (i == 211) {
                                    imageView.setImageResource(R.drawable.jack_of_diamonds);
                                }
                                else if (i == 212) {
                                    imageView.setImageResource(R.drawable.queen_of_diamonds);
                                }
                                else if (i == 213) {
                                    imageView.setImageResource(R.drawable.king_of_diamonds);
                                }
                                else if (i == 301) {
                                    imageView.setImageResource(R.drawable.ace_of_hearts);

                                }
                                else if (i == 302) {
                                    imageView.setImageResource(R.drawable.two_of_hearts);
                                }
                                else if (i == 303) {
                                    imageView.setImageResource(R.drawable.three_of_hearts);
                                }
                                else if (i == 304) {
                                    imageView.setImageResource(R.drawable.four_of_hearts);
                                }
                                else if (i == 305) {
                                    imageView.setImageResource(R.drawable.five_of_hearts);
                                }
                                else if (i == 306) {
                                    imageView.setImageResource(R.drawable.six_of_hearts);

                                }
                                else if (i == 307) {
                                    imageView.setImageResource(R.drawable.seven_of_hearts);
                                }
                                else if (i == 308) {
                                    imageView.setImageResource(R.drawable.eight_of_hearts);
                                }
                                else if (i == 309) {
                                    imageView.setImageResource(R.drawable.nine_of_hearts);
                                }
                                else if (i == 310) {
                                    imageView.setImageResource(R.drawable.ten_of_hearts);
                                }
                                else if (i == 311) {
                                    imageView.setImageResource(R.drawable.jack_of_hearts);

                                }
                                else if (i == 312) {
                                    imageView.setImageResource(R.drawable.queen_of_hearts);
                                }
                                else if (i == 313) {
                                    imageView.setImageResource(R.drawable.king_of_hearts);
                                }
                                else if (i == 401) {
                                    imageView.setImageResource(R.drawable.ace_of_spades);
                                }
                                else if (i == 402) {
                                    imageView.setImageResource(R.drawable.two_of_spades);

                                }
                                else if (i == 403) {
                                    imageView.setImageResource(R.drawable.three_of_spades);
                                }
                                else if (i == 404) {
                                    imageView.setImageResource(R.drawable.four_of_spades);
                                }
                                else if (i == 405) {
                                    imageView.setImageResource(R.drawable.five_of_spades);
                                }
                                else if (i == 406) {
                                    imageView.setImageResource(R.drawable.six_of_spades);
                                }
                                else if (i == 407) {
                                    imageView.setImageResource(R.drawable.seven_of_spades);

                                }
                                else if (i == 408) {
                                    imageView.setImageResource(R.drawable.eight_of_spades);
                                }
                                else if (i == 409) {
                                    imageView.setImageResource(R.drawable.nine_of_spades);
                                }
                                else if (i == 410) {
                                    imageView.setImageResource(R.drawable.ten_of_spades);
                                }
                                else if (i == 411) {
                                    imageView.setImageResource(R.drawable.jack_of_spades);
                                }
                                else if (i == 412) {
                                    imageView.setImageResource(R.drawable.queen_of_spades);

                                }
                                else if (i == 413) {
                                    imageView.setImageResource(R.drawable.king_of_spades);
                                }

                                        /*if (showingBack) {
                                            showingBack = false;
                                            test.setImageResource(R.drawable.ace_of_spades);
                                        } else {
                                            showingBack = true;
                                            test.setImageResource(R.drawable.cardback);
                                        }*/

                                // second quarter turn
                                imageView.setRotationY(-90);
                                imageView.animate()
                                        .rotationY(0)
                                        .setDuration(300)
                                        .start();
                            }
                        }
                ).start();

        //imageView.animate().rotationYBy(360).setDuration(100);

        /*final ObjectAnimator oa1 = ObjectAnimator.ofFloat(imageView, "scaleX", 1f, 0f);
        final ObjectAnimator oa2 = ObjectAnimator.ofFloat(imageView, "scaleX", 0f, 1f);
        oa1.setInterpolator(new DecelerateInterpolator());
        oa2.setInterpolator(new AccelerateDecelerateInterpolator());
        oa1.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animation) {
                super.onAnimationEnd(animation);
                //test.setImageResource(R.drawable.cardback);

                if (i == 101) {
                    imageView.setImageResource(R.drawable.ace_of_clubs);
                }
                else if (i == 102) {
                    imageView.setImageResource(R.drawable.two_of_clubs);

                }
                else if (i == 103) {
                    imageView.setImageResource(R.drawable.three_of_clubs);
                }
                else if (i == 104) {
                    imageView.setImageResource(R.drawable.four_of_clubs);
                }
                else if (i == 105) {
                    imageView.setImageResource(R.drawable.five_of_clubs);
                }
                else if (i == 106) {
                    imageView.setImageResource(R.drawable.six_of_clubs);
                }
                else if (i == 107) {
                    imageView.setImageResource(R.drawable.seven_of_clubs);

                }
                else if (i == 108) {
                    imageView.setImageResource(R.drawable.eight_of_clubs);
                }
                else if (i == 109) {
                    imageView.setImageResource(R.drawable.nine_of_clubs);
                }
                else if (i == 110) {
                    imageView.setImageResource(R.drawable.ten_of_clubs);
                }
                else if (i == 111) {
                    imageView.setImageResource(R.drawable.jack_of_clubs);
                }
                else if (i == 112) {
                    imageView.setImageResource(R.drawable.queen_of_clubs);

                }
                else if (i == 113) {
                    imageView.setImageResource(R.drawable.king_of_clubs);
                }
                else if (i == 201) {
                    imageView.setImageResource(R.drawable.ace_of_diamonds);
                }
                else if (i == 202) {
                    imageView.setImageResource(R.drawable.two_of_diamonds);
                }
                else if (i == 203) {
                    imageView.setImageResource(R.drawable.three_of_diamonds);
                }
                else if (i == 204) {
                    imageView.setImageResource(R.drawable.four_of_diamonds);

                }
                else if (i == 205) {
                    imageView.setImageResource(R.drawable.five_of_diamonds);
                }
                else if (i == 206) {
                    imageView.setImageResource(R.drawable.six_of_diamonds);
                }
                else if (i == 207) {
                    imageView.setImageResource(R.drawable.seven_of_diamonds);
                }
                else if (i == 208) {
                    imageView.setImageResource(R.drawable.eight_of_diamonds);
                }
                else if (i == 209) {
                    imageView.setImageResource(R.drawable.nine_of_diamonds);

                }
                else if (i == 210) {
                    imageView.setImageResource(R.drawable.ten_of_diamonds);
                }
                else if (i == 211) {
                    imageView.setImageResource(R.drawable.jack_of_diamonds);
                }
                else if (i == 212) {
                    imageView.setImageResource(R.drawable.queen_of_diamonds);
                }
                else if (i == 213) {
                    imageView.setImageResource(R.drawable.king_of_diamonds);
                }
                else if (i == 301) {
                    imageView.setImageResource(R.drawable.ace_of_hearts);

                }
                else if (i == 302) {
                    imageView.setImageResource(R.drawable.two_of_hearts);
                }
                else if (i == 303) {
                    imageView.setImageResource(R.drawable.three_of_hearts);
                }
                else if (i == 304) {
                    imageView.setImageResource(R.drawable.four_of_hearts);
                }
                else if (i == 305) {
                    imageView.setImageResource(R.drawable.five_of_hearts);
                }
                else if (i == 306) {
                    imageView.setImageResource(R.drawable.six_of_hearts);

                }
                else if (i == 307) {
                    imageView.setImageResource(R.drawable.seven_of_hearts);
                }
                else if (i == 308) {
                    imageView.setImageResource(R.drawable.eight_of_hearts);
                }
                else if (i == 309) {
                    imageView.setImageResource(R.drawable.nine_of_hearts);
                }
                else if (i == 310) {
                    imageView.setImageResource(R.drawable.ten_of_hearts);
                }
                else if (i == 311) {
                    imageView.setImageResource(R.drawable.jack_of_hearts);

                }
                else if (i == 312) {
                    imageView.setImageResource(R.drawable.queen_of_hearts);
                }
                else if (i == 313) {
                    imageView.setImageResource(R.drawable.king_of_hearts);
                }
                else if (i == 401) {
                    imageView.setImageResource(R.drawable.ace_of_spades);
                }
                else if (i == 402) {
                    imageView.setImageResource(R.drawable.two_of_spades);

                }
                else if (i == 403) {
                    imageView.setImageResource(R.drawable.three_of_spades);
                }
                else if (i == 404) {
                    imageView.setImageResource(R.drawable.four_of_spades);
                }
                else if (i == 405) {
                    imageView.setImageResource(R.drawable.five_of_spades);
                }
                else if (i == 406) {
                    imageView.setImageResource(R.drawable.six_of_spades);
                }
                else if (i == 407) {
                    imageView.setImageResource(R.drawable.seven_of_spades);

                }
                else if (i == 408) {
                    imageView.setImageResource(R.drawable.eight_of_spades);
                }
                else if (i == 409) {
                    imageView.setImageResource(R.drawable.nine_of_spades);
                }
                else if (i == 410) {
                    imageView.setImageResource(R.drawable.ten_of_spades);
                }
                else if (i == 411) {
                    imageView.setImageResource(R.drawable.jack_of_spades);
                }
                else if (i == 412) {
                    imageView.setImageResource(R.drawable.queen_of_spades);

                }
                else if (i == 413) {
                    imageView.setImageResource(R.drawable.king_of_spades);
                }

                oa2.start();
            }
        });
        oa1.start();*/



    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        getSupportActionBar().hide();

        middleCard= findViewById(R.id.middleCard);
        middleCard2= findViewById(R.id.middleCard2);
        middleCard3= findViewById(R.id.middleCard3);
        middleCard4= findViewById(R.id.middleCard4);
        middleCard5= findViewById(R.id.middleCard5);
        middleCard6= findViewById(R.id.middleCard6);
        middleCard7= findViewById(R.id.middleCard7);
        middleCard8= findViewById(R.id.middleCard8);
        middleCard9= findViewById(R.id.middleCard9);
        middleCard10= findViewById(R.id.middleCard10);
        middleCard11= findViewById(R.id.middleCard11);
        middleCard12= findViewById(R.id.middleCard12);
        middleCard13= findViewById(R.id.middleCard13);
        middleCard14= findViewById(R.id.middleCard14);
        middleCard15= findViewById(R.id.middleCard15);
        middleCard16= findViewById(R.id.middleCard16);
        middleCard17= findViewById(R.id.middleCard17);
        middleCard18= findViewById(R.id.middleCard18);
        middleCard19= findViewById(R.id.middleCard19);
        middleCard20= findViewById(R.id.middleCard20);
        middleCard21= findViewById(R.id.middleCard21);
        middleCard22= findViewById(R.id.middleCard22);
        middleCard23= findViewById(R.id.middleCard23);
        middleCard24= findViewById(R.id.middleCard24);
        middleCard25= findViewById(R.id.middleCard25);
        middleCard26= findViewById(R.id.middleCard26);
        middleCard27= findViewById(R.id.middleCard27);
        middleCard28= findViewById(R.id.middleCard28);
        middleCard29= findViewById(R.id.middleCard29);
        middleCard30= findViewById(R.id.middleCard30);
        middleCard31= findViewById(R.id.middleCard31);
        middleCard32= findViewById(R.id.middleCard32);
        middleCard33= findViewById(R.id.middleCard33);
        middleCard34= findViewById(R.id.middleCard34);
        middleCard35= findViewById(R.id.middleCard35);
        middleCard36= findViewById(R.id.middleCard36);
        middleCard37= findViewById(R.id.middleCard37);
        middleCard38= findViewById(R.id.middleCard38);
        middleCard39= findViewById(R.id.middleCard39);
        middleCard40= findViewById(R.id.middleCard40);
        middleCard41= findViewById(R.id.middleCard41);
        middleCard42= findViewById(R.id.middleCard42);
        middleCard43= findViewById(R.id.middleCard43);
        middleCard44= findViewById(R.id.middleCard44);
        middleCard45= findViewById(R.id.middleCard45);
        middleCard46= findViewById(R.id.middleCard46);
        middleCard47= findViewById(R.id.middleCard47);
        middleCard48= findViewById(R.id.middleCard48);
        middleCard49= findViewById(R.id.middleCard49);
        middleCard50= findViewById(R.id.middleCard50);
        middleCard51= findViewById(R.id.middleCard51);
        middleCard52= findViewById(R.id.middleCard52);

        imageViews = new ArrayList<>(asList(middleCard,middleCard2,middleCard3,middleCard4,middleCard5,middleCard6,middleCard7,middleCard8,middleCard9,
                middleCard10,middleCard11,middleCard12, middleCard13, middleCard14, middleCard15, middleCard16, middleCard17, middleCard18, middleCard19, middleCard20,
                middleCard21, middleCard22, middleCard23, middleCard24, middleCard25,middleCard26, middleCard27, middleCard28, middleCard29, middleCard30, middleCard31,
                middleCard32, middleCard33, middleCard34, middleCard35, middleCard36, middleCard37, middleCard38, middleCard39, middleCard40, middleCard41, middleCard42,
                middleCard43, middleCard44, middleCard45, middleCard46, middleCard47,middleCard48, middleCard49,middleCard50, middleCard51, middleCard52));


        XAndY = new ArrayList<>();


        //


        XAndY.add(new float[] {665, 70});
        XAndY.add(new float[] {770, 70});
        XAndY.add(new float[] {875, 70});
        XAndY.add(new float[] {980, 70});
        XAndY.add(new float[] {1085, 70});
        XAndY.add(new float[] {1190, 70});
        XAndY.add(new float[] {1295, 70});
        XAndY.add(new float[] {1400, 70});
        XAndY.add(new float[] {1505, 70});
        XAndY.add(new float[] {1610, 70});
        XAndY.add(new float[] {1715, 70});
        XAndY.add(new float[] {1820, 70});
        XAndY.add(new float[] {1925, 70});

        XAndY.add(new float[] {2463, 140});
        XAndY.add(new float[] {2463, 210});
        XAndY.add(new float[] {2463, 280});
        XAndY.add(new float[] {2463, 350});
        XAndY.add(new float[] {2463, 420});
        XAndY.add(new float[] {2463, 490});
        XAndY.add(new float[] {2463, 560});
        XAndY.add(new float[] {2463, 630});
        XAndY.add(new float[] {2463, 700});
        XAndY.add(new float[] {2463, 770});
        XAndY.add(new float[] {2463, 840});
        XAndY.add(new float[] {2463, 910});
        XAndY.add(new float[] {2463, 980});

        XAndY.add(new float[] {665, 980});
        XAndY.add(new float[] {770, 980});
        XAndY.add(new float[] {875, 980});
        XAndY.add(new float[] {980, 980});
        XAndY.add(new float[] {1085, 980});
        XAndY.add(new float[] {1190, 980});
        XAndY.add(new float[] {1295, 980});
        XAndY.add(new float[] {1400, 980});
        XAndY.add(new float[] {1505, 980});
        XAndY.add(new float[] {1610, 980});
        XAndY.add(new float[] {1715, 980});
        XAndY.add(new float[] {1820, 980});
        XAndY.add(new float[] {1925, 980});

        XAndY.add(new float[] {119, 140});
        XAndY.add(new float[] {119, 210});
        XAndY.add(new float[] {119, 280});
        XAndY.add(new float[] {119, 350});
        XAndY.add(new float[] {119, 420});
        XAndY.add(new float[] {119, 490});
        XAndY.add(new float[] {119, 560});
        XAndY.add(new float[] {119, 630});
        XAndY.add(new float[] {119, 700});
        XAndY.add(new float[] {119, 770});
        XAndY.add(new float[] {119, 840});
        XAndY.add(new float[] {119, 910});
        XAndY.add(new float[] {119, 980});





        cardIntegers = new ArrayList<>();
        for (int i=101; i<=113; i++) {
            cardIntegers.add(i);
        }
        for (int i=201; i<=213; i++) {
            cardIntegers.add(i);
        }
        for (int i=301; i<=313; i++) {
            cardIntegers.add(i);
        }
        for (int i=401; i<=413; i++) {
            cardIntegers.add(i);
        }

        //Collections.reverse(imageViews);

        /*final ArrayList<Integer> playerCards = new ArrayList<>();
        for (int i=26;i<39;i++) {
            playerCards.add(cardIntegers.get(i));
        }*/

        Collections.shuffle(cardIntegers);
        Collections.sort(cardIntegers.subList(26, 39));

        //SHUFFLE ANIMATION:

        imageViews.get(1).animate().setDuration(200).translationYBy(300).withEndAction(new Runnable() {
            @Override
            public void run() {
                imageViews.get(1).animate().setDuration(200).translationYBy(-300);
                imageViews.get(7).animate().setDuration(200).translationYBy(300).withEndAction(new Runnable() {
                    @Override
                    public void run() {
                        imageViews.get(7).animate().setDuration(200).translationYBy(-300);
                        imageViews.get(9).animate().setDuration(200).translationYBy(300).withEndAction(new Runnable() {
                            @Override
                            public void run() {
                                imageViews.get(9).animate().setDuration(200).translationYBy(-300);
                                imageViews.get(11).animate().setDuration(200).translationYBy(300).withEndAction(new Runnable() {
                                    @Override
                                    public void run() {
                                        imageViews.get(11).animate().setDuration(200).translationYBy(-300);
                                        imageViews.get(1).animate().setDuration(200).translationYBy(300).withEndAction(new Runnable() {
                                            @Override
                                            public void run() {
                                                imageViews.get(1).animate().setDuration(200).translationYBy(-300);
                                                imageViews.get(7).animate().setDuration(200).translationYBy(300).withEndAction(new Runnable() {
                                                    @Override
                                                    public void run() {
                                                        imageViews.get(7).animate().setDuration(200).translationYBy(-300);
                                                        imageViews.get(9).animate().setDuration(200).translationYBy(300).withEndAction(new Runnable() {
                                                            @Override
                                                            public void run() {
                                                                imageViews.get(9).animate().setDuration(200).translationYBy(-300);
                                                                imageViews.get(11).animate().setDuration(200).translationYBy(300).withEndAction(new Runnable() {
                                                                    @Override
                                                                    public void run() {
                                                                        imageViews.get(11).animate().setDuration(200).translationYBy(-300);

                                                                        //DISTRIBUTE ANIMATION:
                                                                        CountDownTimer timer = new CountDownTimer(7000, 100) {
                                                                            @Override
                                                                            public void onTick(long millisUntilFinished) {

                                                                                if (j<=50) {
                                                                                    j++;

                                                                                    imageViews.get(j).animate()
                                                                                            .x(XAndY.get(j)[0])
                                                                                            .y(XAndY.get(j)[1])
                                                                                            .setDuration(1000)
                                                                                            .rotationBy(360)
                                                                                            .start();
                                                                                }

                                                                            }

                                                                            @Override
                                                                            public void onFinish() {
                                                                                CountDownTimer timer2 = new CountDownTimer(3500, 100) {
                                                                                    @Override
                                                                                    public void onTick(long millisUntilFinished) {

                                                                                        //SHOWING PLAYER'S CARDS ANIMATION:

                                                                                        if (k<=37) {
                                                                                            k++;
                                                                                            assignImage(imageViews.get(k), cardIntegers.get(k));
                                                                                        }

                                                                                    }

                                                                                    @Override
                                                                                    public void onFinish() {

                                                                                        //Toast.makeText(MainActivity.this, "LET'S GO!", Toast.LENGTH_SHORT).show();

                                                                                    }
                                                                                }.start();

                                                                            }
                                                                        }.start();
                                                                    }
                                                                });
                                                            }
                                                        });
                                                    }
                                                });

                                            }
                                        });
                                    }
                                });
                            }
                        });
                    }
                });

            }
        });



    }
}



















