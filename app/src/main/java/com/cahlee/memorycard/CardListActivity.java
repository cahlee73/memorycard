package com.cahlee.memorycard;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class CardListActivity extends AppCompatActivity {
    LinearLayout cardSetList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_list);
        cardSetList = (LinearLayout) findViewById(R.id.card_set_list);

        LayoutInflater inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);

     //   LinearLayout cardSet = (LinearLayout) inflater.inflate(R.layout.card_set, cardSetList, true);
     //   cardSet.findViewById(R.id.card_set_name);

        ArrayList<String> cardList = new ArrayList<>();
        cardList.add("[한자] 한자암기박사1");
        cardList.add("[영단어] 나니아연대기 1권");
        cardList.add("[일본어] 가타가나");
        cardList.add("[한문] 한문공부");
        cardList.add("[영단어] 왕좌의 게임 1권");
        cardList.add("[일본어] 히라가나");

        CheckBox cardSetName;
        for (String cardName : cardList) {
            inflater.inflate(R.layout.card_set, cardSetList, true);
            cardSetName = (CheckBox) cardSetList.findViewById(R.id.card_set_name);
            cardSetName.setText(cardName);
        }
        /*
        CheckBox cardSetName = (CheckBox) cardSetList.findViewById(R.id.card_set_name);
        cardSetName.setText("[한자] 한자암기박사1");

        inflater.inflate(R.layout.card_set, cardSetList, true);
        cardSetName = (CheckBox) cardSetList.findViewById(R.id.card_set_name);
        cardSetName.setText("[한문] 한문공부");

        inflater.inflate(R.layout.card_set, cardSetList, true);
        inflater.inflate(R.layout.card_set, cardSetList, true);
        inflater.inflate(R.layout.card_set, cardSetList, true);*/
    }

    public void onCardStartBtnClick(View view) {
        Intent intent = new Intent(getApplicationContext(), MemoryCardActivity.class);
        startActivity(intent);
    }
}
