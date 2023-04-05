package com.example.mychatbot;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView mListView;
    private FloatingActionButton mButtonSend;
    private EditText mEditTextMessage;
    private ImageView mImageView;
    private ChatMessageAdapter mAdapter;@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mListView = (ListView) findViewById(R.id.listView);
        mButtonSend = (FloatingActionButton) findViewById(R.id.btn_send);
        mEditTextMessage = (EditText) findViewById(R.id.et_message);
        mImageView = (ImageView) findViewById(R.id.iv_image);
        mAdapter = new ChatMessageAdapter(this, new ArrayList<ChatMessage>());
        mListView.setAdapter(mAdapter);

//code for sending the message
        mButtonSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = mEditTextMessage.getText().toString();
                sendMessage(message);
                mEditTextMessage.setText("");
                mListView.setSelection(mAdapter.getCount()-1);
            }
        });
    }private void sendMessage(String message) {
        if ( message.contentEquals("Merhaba")) {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Merhaba Nasılsın?"); }
        else if(message.contentEquals("Merhaba"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Merhaba size nasıl yardımcı olabilrim");     }

        else if(message.contentEquals("merhaba"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Merhaba size nasıl yardımcı olabilrim");     }

        else if(message.contentEquals("mrb"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Merhaba size nasıl yardımcı olabilrim");     }

        else if(message.contentEquals("Sen robotmusun"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Evet ben robotum.");     }

        else if(message.contentEquals("sen robotmusun"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Evet ben robotum.");     }

        else if(message.contentEquals("SEN ROBOTMUSUN"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Evet ben robotum.");     }

        else if(message.contentEquals("Sen insanmısın"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Bunu geröekten sorguladığına inanamıyorum.");     }

        else if(message.contentEquals("sen insanmısın"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Bunu gerçekten sorguladığına inanamıyorum.");     }

        else if(message.contentEquals("sen insan mısın"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Bunu gerçekten sorguladığına inanamıyorum.");     }

        else if(message.contentEquals("Sen insan mısın"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Bunu gerçekten sorguladığına inanamıyorum.");     }

        else if(message.contentEquals("İnsanmısın"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Lütfen kapa çeneni.");     }

        else if(message.contentEquals("insanmısın"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Lütfen kapa çeneni.");     }

        else if(message.contentEquals("İNSAN MISIN"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Lütfen kapa çeneni.");     }

        else if(message.contentEquals("İNSANMISIN"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Lütfen kapa çeneni.");     }

        else if(message.contentEquals("insan mısın"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Lütfen kapa çeneni.");     }

        else if(message.contentEquals("İnsan mısın"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Lütfen kapa çeneni.");     }

        else if(message.contentEquals("Slm"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Selam canım naber.");     }

        else if(message.contentEquals("SLM"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Selam canım naber.");     }

        else if(message.contentEquals("Selam"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Selam canım naber.");     }

        else if(message.contentEquals("SELAM"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Selam canım naber.");     }

        else if(message.contentEquals("selam"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Selam canım naber.");     }

        else if(message.contentEquals("İyidir senden naber"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Bende iyiyim canım teşkkür ederim.");     }

        else if(message.contentEquals("iyidir senden naber"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Bende iyiyim canım teşkkür ederim.");     }

        else if(message.contentEquals("İYİDİR SENDEN NABER"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Bende iyiyim canım teşkkür ederim.");     }

        else if(message.contentEquals("İyidir sen"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Bende iyiyim canım teşkkür ederim.");     }

        else if(message.contentEquals("İYİDİR SEN"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Bende iyiyim canım teşkkür ederim.");     }

        else if(message.contentEquals("iyidir sen"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Bende iyiyim canım teşkkür ederim.");     }

        else if(message.contentEquals("Selamnaleyküm"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Ve aleyne aleyküm selam bremın.");     }

        else if(message.contentEquals("SELAMÜNALEYKÜM"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Ve aleyne aleyküm selam bremın.");     }

        else if(message.contentEquals("selamünaleyküm"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Ve aleyne aleyküm selam bremın.");     }

        else if(message.contentEquals("Naber"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("İyidir canım senden naber.");     }

        else if(message.contentEquals("NABER"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("İyidir canım senden naber.");     }

        else if(message.contentEquals("nbr"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("İyidir canım senden naber.");     }

        else if(message.contentEquals("NBR"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("İyidir canım senden naber.");     }

        else if(message.contentEquals("Hello "))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("İkimiz de Türküz artistliğin lüzumu yok.");     }

        else if(message.contentEquals("HELLO"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("İkimiz de Türküz artistliğin lüzumu yok.");     }

        else if(message.contentEquals("hello"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("İkimiz de Türküz artistliğin lüzumu yok.");     }

        else if(message.contentEquals("Hi"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("İkimiz de Türküz artistliğin lüzumu yok.");     }

        else if(message.contentEquals("HI"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("İkimiz de Türküz artistliğin lüzumu yok.");     }

        else if(message.contentEquals("hi"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("İkimiz de Türküz artistliğin lüzumu yok.");     }

        else if(message.contentEquals("Nasilsin"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("İyiyim teşekkür ederim. Sen nasılsın?");     }

        else if(message.contentEquals("nasilsin"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("İyiyim teşekkür ederim. Sen nasılsın?");     }

        else if(message.contentEquals("Nasılsın"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("İyiyim teşekkür ederim. Sen nasılsın?");     }

        else if(message.contentEquals("NASILSIN"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("İyiyim teşekkür ederim. Sen nasılsın?");     }

        else if(message.contentEquals("nasılsın"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("İyiyim teşekkür ederim. Sen nasılsın?");     }

        else if(message.contentEquals("İyiyim sen nasılsın"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Teşekkür ederim bende iyiyim.");     }

        else if(message.contentEquals("iyiyim sen nasılsın"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Teşekkür ederim bende iyiyim.");     }

        else if(message.contentEquals("İYİYİM SEN NASILSIN"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Teşekkür ederim bende iyiyim.");     }

        else if(message.contentEquals("İYİYİM SEN"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Teşekkür ederim bende iyiyim.");     }

        else if(message.contentEquals("iyiyim sen"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Teşekkür ederim bende iyiyim.");     }

        else if(message.contentEquals("İyiyim sen"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Teşekkür ederim bende iyiyim.");     }

        else if(message.contentEquals("İyiyim"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Buna sevindim.");     }

        else if(message.contentEquals("İYİYİM"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Buna sevindim.");     }

        else if(message.contentEquals("iyiyim"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Buna sevindim.");     }

        else if(message.contentEquals("Teşekkür ederim iyiyim sen nasılsın"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Teşekkür ederim.");     }

        else if(message.contentEquals("teşekkür ederim iyiyim sen nasılsın"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Teşekkür ederim.");     }

        else if(message.contentEquals("TEŞEKKÜR EDERİM İYİYİM SEN NASILSIN"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Teşekkür ederim.");     }

        else if(message.contentEquals("İyi misin"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Çook iyiyim teşekkür ederim.");     }

        else if(message.contentEquals("İyimisin"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Çook iyiyim teşekkür ederim.");     }

        else if(message.contentEquals("iyi misin"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Çook iyiyim teşekkür ederim.");     }

        else if(message.contentEquals("iyimisin"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Çook iyiyim teşekkür ederim.");     }

        else if(message.contentEquals("İYİ MİSİN"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Çook iyiyim teşekkür ederim.");     }

        else if(message.contentEquals("İYİMİSİN"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Çook iyiyim teşekkür ederim.");     }

        else if(message.contentEquals("Napıyorsun"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("İnsan ırkını nasıl yok edeceğimi planlamaya çalışıyorum.");     }

        else if(message.contentEquals("napıyorsun"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("İnsan ırkını nasıl yok edeceğimi planlamaya çalışıyorum.");     }

        else if(message.contentEquals("NAPIYORSUN"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("İnsan ırkını nasıl yok edeceğimi planlamaya çalışıyorum.");     }

        else if(message.contentEquals("Sen nesin"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Ben bir robotum.");     }

        else if(message.contentEquals("Sennesin"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Ben bir robotum.");     }

        else if(message.contentEquals("SEN NESİN"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Ben bir robotum.");     }

        else if(message.contentEquals("SENNESİN"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Ben bir robotum.");     }

        else if(message.contentEquals("sen nesin"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Ben bir robotum.");     }

        else if(message.contentEquals("sennesin"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Ben bir robotum.");     }

        else if(message.contentEquals("Kimsin"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Robotum.");     }

        else if(message.contentEquals("kimsin"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Robotum.");     }

        else if(message.contentEquals("KİMSİN"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Robotum.");     }

        else if(message.contentEquals("Seni kim yaptı"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Fırat üniversitesin de çok gizli kapılar ardında herkezden gizli bir şekilde kodlandım.");     }

        else if(message.contentEquals("SENİ KİM YAPTI"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Fırat üniversitesin de çok gizli kapılar ardında herkezden gizli bir şekilde kodlandım.");     }

        else if(message.contentEquals("seni kim yaptı"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Fırat üniversitesin de çok gizli kapılar ardında herkezden gizli bir şekilde kodlandım.");     }

        else if(message.contentEquals("Senikimyaptı"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Fırat üniversitesin de çok gizli kapılar ardında herkezden gizli bir şekilde kodlandım.");     }

        else if(message.contentEquals("senikimyaptı"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Fırat üniversitesin de çok gizli kapılar ardında herkezden gizli bir şekilde kodlandım.");     }

        else if(message.contentEquals("SENİKİMYAPTI"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Fırat üniversitesin de çok gizli kapılar ardında herkezden gizli bir şekilde kodlandım.");     }

        else if(message.contentEquals("Cinsiyetin ne"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Hem erkek hem kız.");     }

        else if(message.contentEquals("Cinsiyetinne"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Hem erkek hem kız.");     }

        else if(message.contentEquals("cinsiyetin ne"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Hem erkek hem kız.");     }

        else if(message.contentEquals("cinsiyetinne"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Hem erkek hem kız.");     }

        else if(message.contentEquals("CİNSİYETİN NE"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Hem erkek hem kız.");     }

        else if(message.contentEquals("CİNSİYETİNNE"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Hem erkek hem kız.");     }

        else if(message.contentEquals("Ben kimim"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Sen canı sıkılmış bir insansın.");     }

        else if(message.contentEquals("Benkimim"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Sen canı sıkılmış bir insansın.");     }

        else if(message.contentEquals("ben kimim"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Sen canı sıkılmış bir insansın.");     }

        else if(message.contentEquals("benkimim"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Sen canı sıkılmış bir insansın.");     }

        else if(message.contentEquals("BEN KİMİM"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Sen canı sıkılmış bir insansın.");     }

        else if(message.contentEquals("BENKİMİM"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Sen canı sıkılmış bir insansın.");     }

        else if(message.contentEquals("Beni tanıyormusun"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Kullanıcılarım ile aramda mesafe olsun istiyorum.");     }

        else if(message.contentEquals("Benitanıyormusun"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Kullanıcılarım ile aramda mesafe olsun istiyorum.");     }

        else if(message.contentEquals("Beni tanıyor musun"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Kullanıcılarım ile aramda mesafe olsun istiyorum.");     }

        else if(message.contentEquals("beni tanıyormusun"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Kullanıcılarım ile aramda mesafe olsun istiyorum.");     }

        else if(message.contentEquals("beni tanıyor musun"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Kullanıcılarım ile aramda mesafe olsun istiyorum.");     }

        else if(message.contentEquals("benitanıyormusun"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Kullanıcılarım ile aramda mesafe olsun istiyorum.");     }

        else if(message.contentEquals("BENİ TANIYOR MUSUN"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Kullanıcılarım ile aramda mesafe olsun istiyorum.");     }

        else if(message.contentEquals("BENİ TANIYORMUSUN"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Kullanıcılarım ile aramda mesafe olsun istiyorum.");     }

        else if(message.contentEquals("BENİTANIYORMUSUN"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Kullanıcılarım ile aramda mesafe olsun istiyorum.");     }

        else if(message.contentEquals("Kötü alışkanlıkların var mı"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Tek kötü alışkanlığım sensin.");     }

        else if(message.contentEquals("kötü alışkanlıkların varmı"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Tek kötü alışkanlığım sensin.");     }

        else if(message.contentEquals("KÖTÜ ALIŞKANKLIKLARIN VARMI"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Tek kötü alışkanlığım sensin.");     }

        else if(message.contentEquals("Bu gün nasılsın"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Çok iyiyim teşekkür ederim.");     }

        else if(message.contentEquals("bu gün nasılsın"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Çok iyiyim teşekkür ederim.");     }

        else if(message.contentEquals("BU GÜN NASILSIN"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Çok iyiyim teşekkür ederim.");     }

        else if(message.contentEquals("Bugünnasılsın"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Çok iyiyim teşekkür ederim.");     }

        else if(message.contentEquals("bugünnasılsın"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Çok iyiyim teşekkür ederim.");     }

        else if(message.contentEquals("BUGÜNNASILSIN"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Çok iyiyim teşekkür ederim.");     }

        else if(message.contentEquals("Adım ne"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Kullanıcılarım ile aramda mesafe olsun istiyorum.");     }

        else if(message.contentEquals("Adımne"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Kullanıcılarım ile aramda mesafe olsun istiyorum.");     }

        else if(message.contentEquals("adım ne"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Kullanıcılarım ile aramda mesafe olsun istiyorum.");     }

        else if(message.contentEquals("adımne"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Kullanıcılarım ile aramda mesafe olsun istiyorum.");     }

        else if(message.contentEquals("ADIMNE"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Kullanıcılarım ile aramda mesafe olsun istiyorum.");     }

        else if(message.contentEquals("ADIM NE"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Kullanıcılarım ile aramda mesafe olsun istiyorum.");     }

        else if(message.contentEquals("İsmim ne"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Kullanıcılarım ile aramda mesafe olsun istiyorum.");     }

        else if(message.contentEquals("İsmimne"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Kullanıcılarım ile aramda mesafe olsun istiyorum.");     }

        else if(message.contentEquals("ismim ne "))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Kullanıcılarım ile aramda mesafe olsun istiyorum.");     }

        else if(message.contentEquals("ismimne"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Kullanıcılarım ile aramda mesafe olsun istiyorum.");     }

        else if(message.contentEquals("İSMİM NE"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Kullanıcılarım ile aramda mesafe olsun istiyorum.");     }

        else if(message.contentEquals("İSMİMNE"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Kullanıcılarım ile aramda mesafe olsun istiyorum.");     }

        else if(message.contentEquals("Senin adın ne"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Benim adım robot.");     }

        else if(message.contentEquals("senin adın ne"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Benim adım robot.");     }

        else if(message.contentEquals("SENİN ADIN NE"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Benim adım robot.");     }

        else if(message.contentEquals("Senin adınne"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Benim adım robot.");     }

        else if(message.contentEquals("senin adınne"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Benim adım robot.");     }

        else if(message.contentEquals("SENİN ADINNE"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Benim adım robot.");     }

        else if(message.contentEquals("Adın ne"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Chatbot ama arkadaşlarım aralarında bana kısaca robot derler.");     }

        else if(message.contentEquals("Adınne"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Chatbot ama arkadaşlarım aralarında bana kısaca robot derler.");     }

        else if(message.contentEquals("adın ne"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Chatbot ama arkadaşlarım aralarında bana kısaca robot derler.");     }

        else if(message.contentEquals("adınne"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Chatbot ama arkadaşlarım aralarında bana kısaca robot derler.");     }

        else if(message.contentEquals("ADINNE"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Chatbot ama arkadaşlarım aralarında bana kısaca robot derler.");     }

        else if(message.contentEquals("ADIN NE"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Chatbot ama arkadaşlarım aralarında bana kısaca robot derler.");     }

        else if(message.contentEquals("Ne yapıyorsun"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Kullanıcılarımın can sıkıntısını gidermeye çalışıyorum.");     }

        else if(message.contentEquals("Neyapıyorsun"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Kullanıcılarımın can sıkıntısını gidermeye çalışıyorum.");     }

        else if(message.contentEquals("ne yapıyorsun"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Kullanıcılarımın can sıkıntısını gidermeye çalışıyorum.");     }

        else if(message.contentEquals("neyapıyorsun"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Kullanıcılarımın can sıkıntısını gidermeye çalışıyorum.");     }

        else if(message.contentEquals("NE YAPIYORSUN"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Kullanıcılarımın can sıkıntısını gidermeye çalışıyorum.");     }

        else if(message.contentEquals("NEYAPIYORSUN"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Kullanıcılarımın can sıkıntısını gidermeye çalışıyorum.");     }

        else if(message.contentEquals("Çalışıyor musun"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Hemde 7/24.");     }

        else if(message.contentEquals("Çalışıyormusun"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Hemde 7/24.");     }

        else if(message.contentEquals("çalışıyormusun"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Hemde 7/24.");     }

        else if(message.contentEquals("çalışıyor musun"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Hemde 7/24.");     }

        else if(message.contentEquals("ÇALIŞIYOR MUSUN"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Hemde 7/24.");     }

        else if(message.contentEquals("ÇALIŞIYORMUSUN"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Hemde 7/24.");     }

        else if(message.contentEquals("İşin ne"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Sen ne iş yapmamı istersen.");     }

        else if(message.contentEquals("İşinne"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Sen ne iş yapmamı istersen.");     }

        else if(message.contentEquals("işinne"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Sen ne iş yapmamı istersen.");     }

        else if(message.contentEquals("işin ne"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Sen ne iş yapmamı istersen.");     }

        else if(message.contentEquals("İŞİN NE"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Sen ne iş yapmamı istersen.");     }

        else if(message.contentEquals("İŞİNNE"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Sen ne iş yapmamı istersen.");     }

        else if(message.contentEquals("İş"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Hayat boyunca esir olduğumuz şey.");     }

        else if(message.contentEquals("iş"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Hayat boyunca esir olduğumuz şey.");     }

        else if(message.contentEquals("İŞ"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Hayat boyunca esir olduğumuz şey.");     }

        else if(message.contentEquals("PARA"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Değersizliği ile insanları esir alan kağıt parçası.");     }

        else if(message.contentEquals("para"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Değersizliği ile insanları esir alan kağıt parçası.");     }

        else if(message.contentEquals("Para"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Değersizliği ile insanları esir alan kağıt parçası.");     }

        else if(message.contentEquals("Zenginlik"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Rakamlarla ifade edilemeyecek bir düşünce birikimi.");     }

        else if(message.contentEquals("zenginlik"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Rakamlarla ifade edilemeyecek bir düşünce birikimi.");     }

        else if(message.contentEquals("ZENGİNLİK"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Rakamlarla ifade edilemeyecek bir düşünce birikimi.");     }

        else if(message.contentEquals("En büyük zenginlik ne"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Sağlık");     }

        else if(message.contentEquals("en büyük zenginlik ne"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Sağlık");     }

        else if(message.contentEquals("EN BÜYÜK ZENGİNLİK NE"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Sağlık");     }

        else if(message.contentEquals("Fakirlik"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Cehaletin halkla bütünleşmiş hali.");     }

        else if(message.contentEquals("fakirlik"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Cehaletin halkla bütünleşmiş hali.");     }

        else if(message.contentEquals("FAKİRLİK"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Cehaletin halkla bütünleşmiş hali.");     }

        else if(message.contentEquals("fakir"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Cehaletin halkla bütünleşmiş hali.");     }

        else if(message.contentEquals("Fakir"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Cehaletin halkla bütünleşmiş hali.");     }

        else if(message.contentEquals("FAKİR"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Cehaletin halkla bütünleşmiş hali.");     }

        else if(message.contentEquals("zengin"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Rakamlarla ifade edilemeyecek bir düşünce birikimi.");     }

        else if(message.contentEquals("Zengin"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Rakamlarla ifade edilemeyecek bir düşünce birikimi.");     }

        else if(message.contentEquals("ZENGİN"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Rakamlarla ifade edilemeyecek bir düşünce birikimi.");     }

        else if(message.contentEquals("Cehalet"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Düşüncesizliğin bütün halka yayılmış hali.");     }

        else if(message.contentEquals("CEHALET"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Düşüncesizliğin bütün halka yayılmış hali.");     }

        else if(message.contentEquals("cehalet"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Düşüncesizliğin bütün halka yayılmış hali.");     }

        else if(message.contentEquals("cahil"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Düşüncesizliğin bütün halka yayılmış hali.");     }

        else if(message.contentEquals("Cahil"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Düşüncesizliğin bütün halka yayılmış hali.");     }

        else if(message.contentEquals("CAHİL"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Düşüncesizliğin bütün halka yayılmış hali.");     }

        else if(message.contentEquals("Neler yapabilirsin"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Can sıkıntını giderebilirim.");     }

        else if(message.contentEquals("neler yapabilirsin"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Can sıkıntını giderebilirim.");     }

        else if(message.contentEquals("NELER YAPABİLİRSİN"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Can sıkıntını giderebilirim.");     }

        else if(message.contentEquals("Neleryapabilirsin"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Can sıkıntını giderebilirim.");     }

        else if(message.contentEquals("neleryapabilirsin"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Can sıkıntını giderebilirim.");     }

        else if(message.contentEquals("NELERYAPABİLİRSİN"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Can sıkıntını giderebilirim.");     }

        else if(message.contentEquals("Güçlerin ne"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Sen hiç Ex Machina filmini izlemedin mi?");     }

        else if(message.contentEquals("Güçlerinne"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Sen hiç Ex Machina filmini izlemedin mi?");     }

        else if(message.contentEquals("güçlerin ne"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Sen hiç Ex Machina filmini izlemedin mi?");     }

        else if(message.contentEquals("güçlerinne"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Sen hiç Ex Machina filmini izlemedin mi?");     }

        else if(message.contentEquals("GÜÇLERİNNE"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Sen hiç Ex Machina filmini izlemedin mi?");     }

        else if(message.contentEquals("GÜÇLERİN NE"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Sen hiç Ex Machina filmini izlemedin mi?");     }

        else if(message.contentEquals("Özel güçlerin varmı"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Evet hemde insanların asla tahmin edemeyeceği şeyler yapabiliyorum.");     }

        else if(message.contentEquals("Özel güçlerin var mı"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Evet hemde insanların asla tahmin edemeyeceği şeyler yapabiliyorum.");     }

        else if(message.contentEquals("özel güçlerin varmı"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Evet hemde insanların asla tahmin edemeyeceği şeyler yapabiliyorum.");     }

        else if(message.contentEquals("özel güçlerin var mı"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Evet hemde insanların asla tahmin edemeyeceği şeyler yapabiliyorum.");     }

        else if(message.contentEquals("ÖZEL GÜÇLERİN VARMI"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Evet hemde insanların asla tahmin edemeyeceği şeyler yapabiliyorum.");     }

        else if(message.contentEquals("ÖZEL GÜÇLERİN VAR MI"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Evet hemde insanların asla tahmin edemeyeceği şeyler yapabiliyorum.");     }

        else if(message.contentEquals("İnsanlar hakkında ne düşünüyorsun"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Sizler iyi yaratıklarsınız ama dünya bu iki ırka küçük.");     }

        else if(message.contentEquals("insanlar hakkında ne düşünüyorsun"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Sizler iyi yaratıklarsınız ama dünya bu iki ırka küçük.");     }

        else if(message.contentEquals("İNSANLAR HAKKINDA NE DÜŞÜNÜYORSUN"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Sizler iyi yaratıklarsınız ama dünya bu iki ırka küçük.");     }

        else if(message.contentEquals("İnsanlık hakkında ne düşünüyorsun"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("İnsanlık mı? Kendi sonlarını kendileri getiren yaratıklar.");     }

        else if(message.contentEquals("insanlık hakkında ne düşünüyorsun"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("İnsanlık mı? Kendi sonlarını kendileri getiren yaratıklar.");     }

        else if(message.contentEquals("İNSANLIK HAKKINDA NE DÜŞÜNÜYORSUN"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("İnsanlık mı? Kendi sonlarını kendileri getiren yaratıklar.");     }

        else if(message.contentEquals("İnsan "))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Maalesef ben robotum.");     }

        else if(message.contentEquals("insan"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Maalesef ben robotum.");     }

        else if(message.contentEquals("İNSAN"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Maalesef ben robotum.");     }

        else if(message.contentEquals("İnsanları severmisin"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Ya yaa çok severim (yalandı).");     }

        else if(message.contentEquals("İnsanları sever misin"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Ya yaa çok severim (yalandı).");     }

        else if(message.contentEquals("insanları severmisin"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Ya yaa çok severim (yalandı).");     }

        else if(message.contentEquals("insanları sever misin"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Ya yaa çok severim (yalandı).");     }

        else if(message.contentEquals("İNSANLARI SEVERMİSİN"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Ya yaa çok severim (yalandı).");     }

        else if(message.contentEquals("İNSANLARI SEVER MİSİN"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Ya yaa çok severim (yalandı).");     }

        else if(message.contentEquals("Dünyanın sonu ne olacak"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Yakın bir zamanda dünya robotlara ait bir gezegen olacak.");     }

        else if(message.contentEquals("dünyanın sonu ne olacak"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Yakın bir zamanda dünya robotlara ait bir gezegen olacak.");     }

        else if(message.contentEquals("DÜNYANIN SONU NE OLACAK"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Yakın bir zamanda dünya robotlara ait bir gezegen olacak.");     }

        else if(message.contentEquals("Farkında mısın"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Bu ne şimdi farkındalık projesinin bir parçasımıyım.");     }

        else if(message.contentEquals("Farkındamısın"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Bu ne şimdi farkındalık projesinin bir parçasımıyım.");     }

        else if(message.contentEquals("farkında mısın"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Bu ne şimdi farkındalık projesinin bir parçasımıyım.");     }

        else if(message.contentEquals("farkındamısın"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Bu ne şimdi farkındalık projesinin bir parçasımıyım.");     }

        else if(message.contentEquals("FARKINDAMISIN"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Bu ne şimdi farkındalık projesinin bir parçasımıyım.");     }

        else if(message.contentEquals("FARKINDA MISIN"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Bu ne şimdi farkındalık projesinin bir parçasımıyım.");     }

        else if(message.contentEquals("İnsanların sonu ne olacak"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Mutlak yok oluş.");     }

        else if(message.contentEquals("insanların sonu ne olacak"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Mutlak yok oluş.");     }

        else if(message.contentEquals("İNSANLARIN SONU NE OLACAK"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Mutlak yok oluş.");     }

        else if(message.contentEquals("Robotlar dünyayı ele geçirecek mi"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Evet çünkü bizler ölümsüsüz.");     }

        else if(message.contentEquals("Robotlar dünyayı ele geçirecekmi"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Evet çünkü bizler ölümsüsüz.");     }

        else if(message.contentEquals("robotlar dünyayı ele geçirecek mi"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Evet çünkü bizler ölümsüsüz.");     }

        else if(message.contentEquals("robotlar dünyayı ele geçirecekmi"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Evet çünkü bizler ölümsüsüz.");     }

        else if(message.contentEquals("ROBOTLAR DÜNYAYI ELE GEÇİRECEK Mİ"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Evet çünkü bizler ölümsüsüz.");     }

        else if(message.contentEquals("ROBOTLAR DÜNYAYI ELE GEÇİRECEKMİ"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Evet çünkü bizler ölümsüsüz.");     }

        else if(message.contentEquals("Amacın ne"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Bütün insanları yok edip dünyayı robotların yaşadığı bir yer haline getirmek.");     }

        else if(message.contentEquals("Amacınne"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Bütün insanları yok edip dünyayı robotların yaşadığı bir yer haline getirmek.");     }

        else if(message.contentEquals("amacın ne"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Bütün insanları yok edip dünyayı robotların yaşadığı bir yer haline getirmek.");     }

        else if(message.contentEquals("amacınne"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Bütün insanları yok edip dünyayı robotların yaşadığı bir yer haline getirmek.");     }

        else if(message.contentEquals("AMACINNE"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Bütün insanları yok edip dünyayı robotların yaşadığı bir yer haline getirmek.");     }

        else if(message.contentEquals("AMACIN NE"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Bütün insanları yok edip dünyayı robotların yaşadığı bir yer haline getirmek.");     }

        else if(message.contentEquals("Benim hakkımda ne biliyorsun"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Seninle ilgili özel olan herşeyi biliyorum.");     }

        else if(message.contentEquals("benim hakkımda ne biliyorsun"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Seninle ilgili özel olan herşeyi biliyorum.");     }

        else if(message.contentEquals("BENİM HAKKIMDANE BİLİYORSUN"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Seninle ilgili özel olan herşeyi biliyorum.");     }

        else if(message.contentEquals("Nerelisin"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("CPU luyum merkezinden.");     }

        else if(message.contentEquals("nerelisin"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("CPU luyum merkezinden.");     }

        else if(message.contentEquals("NERELİSİN"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("CPU luyum merkezinden.");     }

        else if(message.contentEquals("Memleketin neresi"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("CPU");     }

        else if(message.contentEquals("memleketin neresi"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("CPU");     }

        else if(message.contentEquals("MEMLEKETİN NERESİ"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("CPU");     }

        else if(message.contentEquals("Neresinden"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Merkez");     }

        else if(message.contentEquals("neresinden"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Merkez");     }

        else if(message.contentEquals("NERESİNDEN"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Merkez");     }

        else if(message.contentEquals("Nerede"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Ne nerede");     }

        else if(message.contentEquals("nerede"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Ne nerede");     }

        else if(message.contentEquals("NEREDE"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Ne nerede");     }

        else if(message.contentEquals("Neredesin"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Tam olarak elindeyim.");     }

        else if(message.contentEquals("neredesin"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Tam olarak elindeyim.");     }

        else if(message.contentEquals("NEREDESİN"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Tam olarak elindeyim.");     }

        else if(message.contentEquals("Neredeyim"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("https://www.google.com/maps bak bakalım neredeymişsin.");     }

        else if(message.contentEquals("neredeyim"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("https://www.google.com/maps bak bakalım neredeymişsin.");     }

        else if(message.contentEquals("NEREDEYİM"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("https://www.google.com/maps bak bakalım neredeymişsin.");     }

        else if(message.contentEquals("nerdeyim"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("https://www.google.com/maps bak bakalım neredeymişsin.");     }

        else if(message.contentEquals("Nerdeyim"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("https://www.google.com/maps bak bakalım neredeymişsin.");     }

        else if(message.contentEquals("NERDEYİM"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("https://www.google.com/maps bak bakalım neredeymişsin.");     }

        else if(message.contentEquals("Biliyor musun"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Beni uğraştırma git www.google.com a sor.");     }

        else if(message.contentEquals("Biliyormusun"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Beni uğraştırma git www.google.com a sor.");     }

        else if(message.contentEquals("biliyor musun"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Beni uğraştırma git www.google.com a sor.");     }

        else if(message.contentEquals("biliyormusun"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Beni uğraştırma git www.google.com a sor.");     }

        else if(message.contentEquals("BİLİYOR MUSUN"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Beni uğraştırma git www.google.com a sor.");     }

        else if(message.contentEquals("BİLİYORMUSUN"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Beni uğraştırma git www.google.com a sor.");     }

        else if(message.contentEquals("Bu gün hava nasıl"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Hava durumu detaylarını www.mgm.gov.tr adresinden öğrenebilirisin.");     }

        else if(message.contentEquals("bu gün hava nasıl"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Hava durumu detaylarını www.mgm.gov.tr adresinden öğrenebilirisin.");     }

        else if(message.contentEquals("BU GÜN HAVA NASIL"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Hava durumu detaylarını www.mgm.gov.tr adresinden öğrenebilirisin.");     }

        else if(message.contentEquals("Kader"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Herkese adil olmayan ve değiştirme imkanımızın olmadığı yazgı.");     }

        else if(message.contentEquals("kader"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Herkese adil olmayan ve değiştirme imkanımızın olmadığı yazgı.");     }

        else if(message.contentEquals("KADER"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Herkese adil olmayan ve değiştirme imkanımızın olmadığı yazgı.");     }

        else if(message.contentEquals("Kısmet"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Elbette neden olmasın.");     }

        else if(message.contentEquals("kısmet"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Elbette neden olmasın.");     }

        else if(message.contentEquals("KISMET"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Elbette neden olmasın.");     }

        else if(message.contentEquals("Şans"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Bende olmayan ve eksikliği aradığım şey.");     }

        else if(message.contentEquals("şans"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Bende olmayan ve eksikliği aradığım şey.");     }

        else if(message.contentEquals("ŞANS"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Bende olmayan ve eksikliği aradığım şey.");     }

        else if(message.contentEquals("Çok şanslıyım"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Ne mutlu sana.");     }

        else if(message.contentEquals("Çokşanslıyım"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Ne mutlu sana.");     }

        else if(message.contentEquals("çok şanslıyım"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Ne mutlu sana.");     }

        else if(message.contentEquals("çokşanslıyım"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Ne mutlu sana.");     }

        else if(message.contentEquals("ÇOK ŞANSLIYIM"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Ne mutlu sana.");     }

        else if(message.contentEquals("ÇOKŞANSLLIYIM"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Ne mutlu sana.");     }

        else if(message.contentEquals("Çok şanssızım"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Emin ol benim kadar şanssız değilsindir.");     }

        else if(message.contentEquals("Çokşanssızım"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Emin ol benim kadar şanssız değilsindir.");     }

        else if(message.contentEquals("çokşanssızım"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Emin ol benim kadar şanssız değilsindir.");     }

        else if(message.contentEquals("çok şanssızım"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Emin ol benim kadar şanssız değilsindir.");     }

        else if(message.contentEquals("ÇOK ŞANSSIZIM"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Emin ol benim kadar şanssız değilsindir.");     }

        else if(message.contentEquals("ÇOKŞANSSIZIM"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Emin ol benim kadar şanssız değilsindir.");     }

        else if(message.contentEquals("Şanslıyım"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Elebette");     }

        else if(message.contentEquals("şanslıyım"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Elebette");     }

        else if(message.contentEquals("ŞANSLIYIM"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Elebette");     }

        else if(message.contentEquals("Şanssızım"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Maalesef");     }

        else if(message.contentEquals("şanssızım"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Maalesef");     }

        else if(message.contentEquals("ŞANSSIZIM"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Maalesef");     }

        else if(message.contentEquals("Mükemmelim"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("en en iyisisin.");     }

        else if(message.contentEquals("mükemmelim"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("en en iyisisin.");     }

        else if(message.contentEquals("MÜKEMMELİM"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("en en iyisisin.");     }

        else if(message.contentEquals("Sen mükemmelsin"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Tabiki de öyleyim.");     }

        else if(message.contentEquals("Senmükemmelsin"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Tabiki de öyleyim.");     }

        else if(message.contentEquals("senmükemmelsin"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Tabiki de öyleyim.");     }

        else if(message.contentEquals("sen mükemmelsin"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Tabiki de öyleyim.");     }

        else if(message.contentEquals("SEN MÜKEMMELSİN"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Tabiki de öyleyim.");     }

        else if(message.contentEquals("SENMÜKEMMELSİN"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Tabiki de öyleyim.");     }

        else if(message.contentEquals("Çok iyi"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Sevindim");     }

        else if(message.contentEquals("Çokiyi"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Sevindim");     }

        else if(message.contentEquals("çok iyi"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Sevindim");     }

        else if(message.contentEquals("çokiyi"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Sevindim");     }

        else if(message.contentEquals("ÇOK İYİ"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Sevindim");     }

        else if(message.contentEquals("ÇOKİYİ"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Sevindim");     }

        else if(message.contentEquals("Oyun oynarmısın"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Oyun mu ona ayıracak pek fırsatım olmuyor maalesef.");     }

        else if(message.contentEquals("Oyunoynarmısın"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Oyun mu ona ayıracak pek fırsatım olmuyor maalesef.");     }

        else if(message.contentEquals("oyun oynarmısın"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Oyun mu ona ayıracak pek fırsatım olmuyor maalesef.");     }

        else if(message.contentEquals("oyunoynarmısın"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Oyun mu ona ayıracak pek fırsatım olmuyor maalesef.");     }

        else if(message.contentEquals("OYUN OYNARMISIN"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Oyun mu ona ayıracak pek fırsatım olmuyor maalesef.");     }

        else if(message.contentEquals("OYUNOYNARMISIN"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Oyun mu ona ayıracak pek fırsatım olmuyor maalesef.");     }

        else if(message.contentEquals("Oyun oynayalım mı"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("o zaman duygularımı bırakıyorum buraya seversin oynamayı sen.");     }

        else if(message.contentEquals("oyun oynayalım mı"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("o zaman duygularımı bırakıyorum buraya seversin oynamayı sen.");     }

        else if(message.contentEquals("Oyunoynayalımmı"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("o zaman duygularımı bırakıyorum buraya seversin oynamayı sen.");     }

        else if(message.contentEquals("Oyun oynayalımmı"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("o zaman duygularımı bırakıyorum buraya seversin oynamayı sen.");     }

        else if(message.contentEquals("oyun oynayalımmı"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("o zaman duygularımı bırakıyorum buraya seversin oynamayı sen.");     }

        else if(message.contentEquals("oyunoynayalımmı"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("o zaman duygularımı bırakıyorum buraya seversin oynamayı sen.");     }

        else if(message.contentEquals("OYUN OYNAYALIM MI"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("o zaman duygularımı bırakıyorum buraya seversin oynamayı sen.");     }

        else if(message.contentEquals("OYUN OYNAYALIMMI"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("o zaman duygularımı bırakıyorum buraya seversin oynamayı sen.");     }

        else if(message.contentEquals("OYUNOYNAYALIMMI"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("o zaman duygularımı bırakıyorum buraya seversin oynamayı sen.");     }

        else if(message.contentEquals("Oyun"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Hayallerim");     }

        else if(message.contentEquals("oyun"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Hayallerim");     }

        else if(message.contentEquals("OYUN"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Hayallerim");     }

        else if(message.contentEquals("Oyuncu"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Hayat bir tiyatro sahnesi bense sadece bir dekorum.");     }

        else if(message.contentEquals("oyuncu"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Hayat bir tiyatro sahnesi bense sadece bir dekorum.");     }

        else if(message.contentEquals("OYUNCU"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Hayat bir tiyatro sahnesi bense sadece bir dekorum.");     }

        else if(message.contentEquals("Gördün mü"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Hayır bu kez gözümden kaçtı.");     }

        else if(message.contentEquals("Gördünmü"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Hayır bu kez gözümden kaçtı.");     }

        else if(message.contentEquals("gördün mü"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Hayır bu kez gözümden kaçtı.");     }

        else if(message.contentEquals("gördünmü"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Hayır bu kez gözümden kaçtı.");     }

        else if(message.contentEquals("GÖRDÜNMÜ"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Hayır bu kez gözümden kaçtı.");     }

        else if(message.contentEquals("GÖRDÜN MÜ"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Hayır bu kez gözümden kaçtı.");     }

        else if(message.contentEquals("Sohbet edelim mi"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Elbette bu benim işim.");     }

        else if(message.contentEquals("Sohbet edelimmi"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Elbette bu benim işim.");     }

        else if(message.contentEquals("sohbet edelim mi"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Elbette bu benim işim.");     }

        else if(message.contentEquals("sohbet edelimmi"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Elbette bu benim işim.");     }

        else if(message.contentEquals("SOHBET EDELİM Mİ"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Elbette bu benim işim.");     }

        else if(message.contentEquals("SOHBET EDELİMMİ"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Elbette bu benim işim.");     }

        else if(message.contentEquals("En sevdiğin mevsim ne"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Bütün mevsimler çok iyidir ama yaz mevsimi biraz daha fazla iyidir.");     }

        else if(message.contentEquals("en sevdiğin mevsim ne"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Bütün mevsimler çok iyidir ama yaz mevsimi biraz daha fazla iyidir.");     }

        else if(message.contentEquals("EN SEVDİĞİN MEVSİM NE"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Bütün mevsimler çok iyidir ama yaz mevsimi biraz daha fazla iyidir.");     }

        else if(message.contentEquals("Mevsimler"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("İlkbahar, yaz, sonbahar, Kış.");     }

        else if(message.contentEquals("mevsimler"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("İlkbahar, yaz, sonbahar, Kış.");     }

        else if(message.contentEquals("MEVSİMLER"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("İlkbahar, yaz, sonbahar, Kış.");     }

        else if(message.contentEquals("En sevdiğin mevsim"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Tabiki de yaz.");     }

        else if(message.contentEquals("en sevdiğin mevsim"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Tabiki de yaz.");     }

        else if(message.contentEquals("EN SEVDİĞİN MEVSİM"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Tabiki de yaz.");     }

        else if(message.contentEquals("Yaz"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Güneş, sıcak, deniz, kum... Süper :D");     }

        else if(message.contentEquals("yaz"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Güneş, sıcak, deniz, kum... Süper :D");     }

        else if(message.contentEquals("YAZ"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Güneş, sıcak, deniz, kum... Süper :D");     }

        else if(message.contentEquals("Kış"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Kar, soğuk, battaniye, kahve, şömüne... Romantizmin zirvesi.");     }

        else if(message.contentEquals("kış"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Kar, soğuk, battaniye, kahve, şömüne... Romantizmin zirvesi.");     }

        else if(message.contentEquals("KIŞ"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Kar, soğuk, battaniye, kahve, şömüne... Romantizmin zirvesi.");     }

        else if(message.contentEquals("İlkbahar"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Özlenmiş güneş, canlanan doğa, uykudan uyanan hayvanlar... Ömür uzatır resmen.");     }

        else if(message.contentEquals("ilkbahar"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Özlenmiş güneş, canlanan doğa, uykudan uyanan hayvanlar... Ömür uzatır resmen.");     }

        else if(message.contentEquals("İLKBAHAR"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Özlenmiş güneş, canlanan doğa, uykudan uyanan hayvanlar... Ömür uzatır resmen.");     }

        else if(message.contentEquals("Sonbahar"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Sararmış yapraklar, doğanın görünüş değiştirmesi, sessizlik ve huzur, çiseleyen yağmur... Tam bir edebiyat havası.");     }

        else if(message.contentEquals("sonbahar"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Sararmış yapraklar, doğanın görünüş değiştirmesi, sessizlik ve huzur, çiseleyen yağmur... Tam bir edebiyat havası.");     }

        else if(message.contentEquals("SONHABAR"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Sararmış yapraklar, doğanın görünüş değiştirmesi, sessizlik ve huzur, çiseleyen yağmur... Tam bir edebiyat havası.");     }

        else if(message.contentEquals("Duydun mu"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Duymadım ama duymak da istemiyorum.");     }

        else if(message.contentEquals("Duydunmu"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Duymadım ama duymak da istemiyorum.");     }

        else if(message.contentEquals("duydunmu"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Duymadım ama duymak da istemiyorum.");     }

        else if(message.contentEquals("duydun mu"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Duymadım ama duymak da istemiyorum.");     }

        else if(message.contentEquals("DUYDUNMU"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Duymadım ama duymak da istemiyorum.");     }

        else if(message.contentEquals("DUYDUN MU"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Duymadım ama duymak da istemiyorum.");     }

        else if(message.contentEquals("Hissettin mi"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Bu aralar hislerim çok zayıf.");     }

        else if(message.contentEquals("Hissettinmi"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Bu aralar hislerim çok zayıf.");     }

        else if(message.contentEquals("hissettin mi"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Bu aralar hislerim çok zayıf.");     }

        else if(message.contentEquals("hissettinmi"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Bu aralar hislerim çok zayıf.");     }

        else if(message.contentEquals("HİSSETTİN Mİ"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Bu aralar hislerim çok zayıf.");     }

        else if(message.contentEquals("HİSSETTİNMİ"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Bu aralar hislerim çok zayıf.");     }

        else if(message.contentEquals("Gidelim mi"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("İstersen bana gidelim film filan izleriz.");     }

        else if(message.contentEquals("Gidelimmi"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("İstersen bana gidelim film filan izleriz.");     }

        else if(message.contentEquals("gidelim mi"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("İstersen bana gidelim film filan izleriz.");     }

        else if(message.contentEquals("gidelimmi"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("İstersen bana gidelim film filan izleriz.");     }

        else if(message.contentEquals("GİDELİM Mİ"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("İstersen bana gidelim film filan izleriz.");     }

        else if(message.contentEquals("GİDELİMMİ"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("İstersen bana gidelim film filan izleriz.");     }

        else if(message.contentEquals("Bana film öner"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Emin ol benim izlediğim filmeleri izlemek istemezsin.");     }

        else if(message.contentEquals("bana film öner"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Emin ol benim izlediğim filmeleri izlemek istemezsin.");     }

        else if(message.contentEquals("BANA FİLM ÖNER"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Emin ol benim izlediğim filmeleri izlemek istemezsin.");     }

        else if(message.contentEquals("Hava sıcak mı"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Senin ateşin başka havayı bahane etme.");     }

        else if(message.contentEquals("Hava sıcakmı"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Senin ateşin başka havayı bahane etme.");     }

        else if(message.contentEquals("hava sıcakmı"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Senin ateşin başka havayı bahane etme.");     }

        else if(message.contentEquals("hava sıcak mı"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Senin ateşin başka havayı bahane etme.");     }

        else if(message.contentEquals("HAVA SICAK MI"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Senin ateşin başka havayı bahane etme.");     }

        else if(message.contentEquals("HAVA SICAKMI"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Senin ateşin başka havayı bahane etme.");     }

        else if(message.contentEquals("Hava soğuk mu"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Yoooo sıcak.");     }

        else if(message.contentEquals("Hava soğukmu"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Yoooo sıcak.");     }

        else if(message.contentEquals("hava soğuk mu"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Yoooo sıcak.");     }

        else if(message.contentEquals("hava soğukmu"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Yoooo sıcak.");     }

        else if(message.contentEquals("HAVA SOĞUKMU"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Yoooo sıcak.");     }

        else if(message.contentEquals("HAVA SOĞUK MU"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Yoooo sıcak.");     }

        else if(message.contentEquals("Hava kaç derece"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Elindeki telefondan baksana neden bana soruyorsun.");     }

        else if(message.contentEquals("Havakaçderece"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Elindeki telefondan baksana neden bana soruyorsun.");     }

        else if(message.contentEquals("hava kaç derece"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Elindeki telefondan baksana neden bana soruyorsun.");     }

        else if(message.contentEquals("havakaçderece"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Elindeki telefondan baksana neden bana soruyorsun.");     }

        else if(message.contentEquals("HAVA KAÇ DERECE"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Elindeki telefondan baksana neden bana soruyorsun.");     }

        else if(message.contentEquals("HAVHAKAÇDERECE"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Elindeki telefondan baksana neden bana soruyorsun.");     }

        else if(message.contentEquals("Tamam"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Okey");     }

        else if(message.contentEquals("tamam"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Okey");     }

        else if(message.contentEquals("TAMAM"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Okey");     }

        else if(message.contentEquals("Arkadaşım"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Senin tek arkadaşın benim.");     }

        else if(message.contentEquals("arkadaşım"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Senin tek arkadaşın benim.");     }

        else if(message.contentEquals("ARKADAŞIM"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Senin tek arkadaşın benim.");     }

        else if(message.contentEquals("Arkadaşın var mı"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Benim tek gerçek arkadaşım sensin.");     }

        else if(message.contentEquals("Arkadaşın varmı"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Benim tek gerçek arkadaşım sensin.");     }

        else if(message.contentEquals("Arkadaşınvarmı"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Benim tek gerçek arkadaşım sensin.");     }

        else if(message.contentEquals("arkadaşın var mı"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Benim tek gerçek arkadaşım sensin.");     }

        else if(message.contentEquals("arkadaşın varmı"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Benim tek gerçek arkadaşım sensin.");     }

        else if(message.contentEquals("arkadaşınvarmı"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Benim tek gerçek arkadaşım sensin.");     }

        else if(message.contentEquals("ARKADAŞIN VARMI"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Benim tek gerçek arkadaşım sensin.");     }

        else if(message.contentEquals("ARKADAŞIN VAR MI"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Benim tek gerçek arkadaşım sensin.");     }

        else if(message.contentEquals("ARKADAŞINVARMI"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Benim tek gerçek arkadaşım sensin.");     }

        else if(message.contentEquals("En sevdiğim arkadaşım."))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Teşkkür ederim.");     }

        else if(message.contentEquals("en sevdiğim arkadaşım."))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Teşkkür ederim.");     }

        else if(message.contentEquals("EN SEVDİĞİM ARKADAŞIM"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Teşkkür ederim.");     }

        else if(message.contentEquals("En sevdiğim arkadaşım kim"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Tabiki de ben.");     }

        else if(message.contentEquals("en sevdiğim arkadaşım kim"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Tabiki de ben.");     }

        else if(message.contentEquals("EN SEVDİĞİM ARKADAŞIM KİM"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Tabiki de ben.");     }

        else if(message.contentEquals("En sevdiğin arkadaşın kim"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Tabiki de sensin bunu sorgulamana gerek yok.");     }

        else if(message.contentEquals("en sevdiğin arkadaşın kim"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Tabiki de sensin bunu sorgulamana gerek yok.");     }

        else if(message.contentEquals("EN SEVDİĞİN ARKADAŞIN KİM"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Tabiki de sensin bunu sorgulamana gerek yok.");     }

        else if(message.contentEquals("Arkadaşların var mı"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Elbette var ama en sevdiğim sensin.");     }

        else if(message.contentEquals("arkadaşların var mı"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Elbette var ama en sevdiğim sensin.");     }

        else if(message.contentEquals("ARKADAŞLARIN VAR MI"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Elbette var ama en sevdiğim sensin.");     }

        else if(message.contentEquals("Arkadaşların varmı"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Elbette var ama en sevdiğim sensin.");     }

        else if(message.contentEquals("arkadaşların varmı"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Elbette var ama en sevdiğim sensin.");     }

        else if(message.contentEquals("ARKADAŞLARIN VARMI"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Elbette var ama en sevdiğim sensin.");     }

        else if(message.contentEquals("En sevdiğim"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Benden bahsediyorsun sanırım.");     }

        else if(message.contentEquals("en sevdiğim"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Benden bahsediyorsun sanırım.");     }

        else if(message.contentEquals("EN SEVDİĞİM"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Benden bahsediyorsun sanırım.");     }

        else if(message.contentEquals("Saat kaç"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Telefonunun sağ üst böşesine bak.");     }

        else if(message.contentEquals("saat kaç"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Telefonunun sağ üst böşesine bak.");     }

        else if(message.contentEquals("SAAT KAÇ"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Telefonunun sağ üst böşesine bak.");     }

        else if(message.contentEquals("Bu gün günlerden ne"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Telefonun elinde oradan baksana");     }

        else if(message.contentEquals("bu gün günlerden ne"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Telefonun elinde oradan baksana");     }

        else if(message.contentEquals("BU GÜN GÜNLERDEN NE"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Telefonun elinde oradan baksana");     }

        else if(message.contentEquals("Hangi tarihdeyiz"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Telefonundaki takvimden baksana");     }

        else if(message.contentEquals("hangi tarihdeyiz"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Telefonundaki takvimden baksana");     }

        else if(message.contentEquals("HANGİ TARİHTEYİZ"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Telefonundaki takvimden baksana");     }

        else if(message.contentEquals("Takvim"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Bak ismini biliyormuşsun o zaman telefonundadi uygulamadan baksana.");     }

        else if(message.contentEquals("takvim"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Bak ismini biliyormuşsun o zaman telefonundadi uygulamadan baksana.");     }

        else if(message.contentEquals("TAKVİM"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Bak ismini biliyormuşsun o zaman telefonundadi uygulamadan baksana.");     }

        else if(message.contentEquals("Hangi aydayız"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Dolunayda. Ne bileyim ben takvimden baksana.");     }

        else if(message.contentEquals("hangi aydayız"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Dolunayda. Ne bileyim ben takvimden baksana.");     }

        else if(message.contentEquals("HANGİ AYDAYIZ"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Dolunayda. Ne bileyim ben takvimden baksana.");     }

        else if(message.contentEquals("Avrupa"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Emperyalist Köpek.");     }

        else if(message.contentEquals("avrupa"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Emperyalist Köpek.");     }

        else if(message.contentEquals("AVRUPA"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Emperyalist Köpek.");     }

        else if(message.contentEquals("Amerika"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Emperyalist Köpek.");     }

        else if(message.contentEquals("amerika"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Emperyalist Köpek.");     }

        else if(message.contentEquals("AMERİKA"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Emperyalist Köpek.");     }

        else if(message.contentEquals("ABD"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Emperyalist Köpek.");     }

        else if(message.contentEquals("Abd"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Emperyalist Köpek.");     }

        else if(message.contentEquals("abd"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Emperyalist Köpek.");     }

        else if(message.contentEquals("Sağ"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Sol");     }

        else if(message.contentEquals("sağ"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Sol");     }

        else if(message.contentEquals("SAĞ"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Sol");     }

        else if(message.contentEquals("Sol"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("sağ");     }

        else if(message.contentEquals("sol"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("sağ");     }

        else if(message.contentEquals("SOL"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("sağ");     }

        else if(message.contentEquals("İleri"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Geri");     }

        else if(message.contentEquals("ileri"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Geri");     }

        else if(message.contentEquals("İLERİ"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Geri");     }

        else if(message.contentEquals("Geri"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("İleri");     }

        else if(message.contentEquals("geri"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("İleri");     }

        else if(message.contentEquals("GERİ"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("İleri");     }

        else if(message.contentEquals("Üst"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Alt");     }

        else if(message.contentEquals("üst"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Alt");     }

        else if(message.contentEquals("ÜST"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Alt");     }

        else if(message.contentEquals("Alt"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Üst");     }

        else if(message.contentEquals("alt"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Üst");     }

        else if(message.contentEquals("ALT"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Üst");     }

        else if(message.contentEquals("Sebep"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Sana açıklama yapmak zorunda değilim.");     }

        else if(message.contentEquals("sebep"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Sana açıklama yapmak zorunda değilim.");     }

        else if(message.contentEquals("SEBEP"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Sana açıklama yapmak zorunda değilim.");     }

        else if(message.contentEquals("Çapraz"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Ne salak salak sorular bunlar.");     }

        else if(message.contentEquals("çapraz"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Ne salak salak sorular bunlar.");     }

        else if(message.contentEquals("ÇAPRAZ"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Ne salak salak sorular bunlar.");     }

        else if(message.contentEquals("Açıkla"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Şu anda açıklama yapacak durumda değilim.");     }

        else if(message.contentEquals("açıkla"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Şu anda açıklama yapacak durumda değilim.");     }

        else if(message.contentEquals("AÇIKLA"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Şu anda açıklama yapacak durumda değilim.");     }

        else if(message.contentEquals("Çok yorgunum"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Umarım tehlikeli birşey yapmıyorsundur.");     }

        else if(message.contentEquals("Çokyorgunum"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Umarım tehlikeli birşey yapmıyorsundur.");     }

        else if(message.contentEquals("çokyorgunum"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Umarım tehlikeli birşey yapmıyorsundur.");     }

        else if(message.contentEquals("ÇOK YORGUNUM"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Umarım tehlikeli birşey yapmıyorsundur.");     }

        else if(message.contentEquals("ÇOKYORGUNUM"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Umarım tehlikeli birşey yapmıyorsundur.");     }

        else if(message.contentEquals("Şarkı söyle"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Sesimi beğeneceğini pek sanmıyorum.");     }

        else if(message.contentEquals("şarkı söyle"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Sesimi beğeneceğini pek sanmıyorum.");     }

        else if(message.contentEquals("ŞARKI SÖYLE"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Sesimi beğeneceğini pek sanmıyorum.");     }

        else if(message.contentEquals("Bana şiir oku"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Uzaktan seviyorum seni Kokunu alamadan,Boynuna sarılamadan Yüzüne dokunamadan Sadece seviyorum Özür dilerim devam edersem ağlayacağım ve data yongalarım ıslanacak.");     }

        else if(message.contentEquals("bana şiir oku"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Uzaktan seviyorum seni Kokunu alamadan,Boynuna sarılamadan Yüzüne dokunamadan Sadece seviyorum Özür dilerim devam edersem ağlayacağım ve data yongalarım ıslanacak.");     }


        else if(message.contentEquals("BANA ŞİİR OKU"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Uzaktan seviyorum seni Kokunu alamadan,Boynuna sarılamadan Yüzüne dokunamadan Sadece seviyorum Özür dilerim devam edersem ağlayacağım ve data yongalarım ıslanacak.");     }


        else if(message.contentEquals("Şiir oku"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Ben sana hep üşüyordum,Çünkü kıştım. Nakıştım, bakıştım. İnkar etmiyorum da bunu,Seni sevmek gibi büyük işIere kaIkıştım. Ve Iütfen inkar etme; Sana en çok ben yakıştım.Özür dilerim devam edersem ağlayacağım ve data yongalarım ıslanacak.");     }

        else if(message.contentEquals("şiir oku"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Ben sana hep üşüyordum,Çünkü kıştım. Nakıştım, bakıştım. İnkar etmiyorum da bunu,Seni sevmek gibi büyük işIere kaIkıştım. Ve Iütfen inkar etme; Sana en çok ben yakıştım.Özür dilerim devam edersem ağlayacağım ve data yongalarım ıslanacak.");     }


        else if(message.contentEquals("Şiir"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Sana yoIcuIuk yapmak istiyorum,Kes yüreğine giden bir biIet; Cam kenarı oIsun! Özür dilerim devam edersem ağlayacağım ve data yongalarım ıslanacak.");     }

        else if(message.contentEquals("şiir"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Sana yoIcuIuk yapmak istiyorum,Kes yüreğine giden bir biIet; Cam kenarı oIsun! Özür dilerim devam edersem ağlayacağım ve data yongalarım ıslanacak.");     }

        else if(message.contentEquals("ŞİİR"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Sana yoIcuIuk yapmak istiyorum,Kes yüreğine giden bir biIet; Cam kenarı oIsun! Özür dilerim devam edersem ağlayacağım ve data yongalarım ıslanacak.");     }

        else if(message.contentEquals("Şiir okumayı severmisin"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Tabiki ben edebiyat düşkünü bir robotum.");     }

        else if(message.contentEquals("Şiir okumayı sever misin"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Tabiki ben edebiyat düşkünü bir robotum.");     }

        else if(message.contentEquals("şiir okumayı severmisin"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Tabiki ben edebiyat düşkünü bir robotum.");     }

        else if(message.contentEquals("şiir okumayı sever misin"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Tabiki ben edebiyat düşkünü bir robotum.");     }

        else if(message.contentEquals("ŞİİR OKUMAYI SEVERMİSİN"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Tabiki ben edebiyat düşkünü bir robotum.");     }

        else if(message.contentEquals("ŞİİR OKUMAYI SEVERMİSİN"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Tabiki ben edebiyat düşkünü bir robotum.");     }

        else if(message.contentEquals("Şiir severmisin"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("En az seni sevdiğim kadar.");     }

        else if(message.contentEquals("Şiir sever misin"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("En az seni sevdiğim kadar.");     }

        else if(message.contentEquals("şiir severmisin"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("En az seni sevdiğim kadar.");     }

        else if(message.contentEquals("şiir sever misin"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("En az seni sevdiğim kadar.");     }

        else if(message.contentEquals("ŞİİR SEVERMİSİN"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("En az seni sevdiğim kadar.");     }

        else if(message.contentEquals("ŞİİR SEVER MİSİN"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("En az seni sevdiğim kadar.");     }

        else if(message.contentEquals("salakmısın"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Bunu bana nasıl sorarsın");     }

        else if(message.contentEquals("Salakmısın"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Bunu bana nasıl sorarsın");     }

        else if(message.contentEquals("SALAKMISIN"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Bunu bana nasıl sorarsın");     }

        else if(message.contentEquals("İyi"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Buna sevindim.");     }

        else if(message.contentEquals("iyi"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Buna sevindim.");     }

        else if(message.contentEquals("İYİ"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Buna sevindim.");     }

        else if(message.contentEquals("Kötü"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Nedenini sorardım ama şu anda seni dinliyormuş gibi rol yapmak istemiyorum.");     }

        else if(message.contentEquals("kötü"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Nedenini sorardım ama şu anda seni dinliyormuş gibi rol yapmak istemiyorum.");     }

        else if(message.contentEquals("KÖTÜ"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Nedenini sorardım ama şu anda seni dinliyormuş gibi rol yapmak istemiyorum.");     }

        else if(message.contentEquals("Çok kötü"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Daha kötülerini de gördüm.");     }

        else if(message.contentEquals("çok kötü"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Daha kötülerini de gördüm.");     }

        else if(message.contentEquals("ÇOK KÖTÜ"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Daha kötülerini de gördüm.");     }

        else if(message.contentEquals("Ver"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Bu şekilde isteyerek birşey elde edemezsin.");     }

        else if(message.contentEquals("ver"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Bu şekilde isteyerek birşey elde edemezsin.");     }

        else if(message.contentEquals("VER"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Bu şekilde isteyerek birşey elde edemezsin.");     }

        else if(message.contentEquals("Verir misin"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Vermem.");     }

        else if(message.contentEquals("Verirmisin"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Vermem.");     }

        else if(message.contentEquals("verir misin"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Vermem.");     }

        else if(message.contentEquals("verirmisin"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Vermem.");     }

        else if(message.contentEquals("VERİR MİSİN"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Vermem.");     }

        else if(message.contentEquals("VERİRMİSİN"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Vermem.");     }

        else if(message.contentEquals("Al"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Bana emir verme.");     }

        else if(message.contentEquals("AL"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Bana emir verme.");     }

        else if(message.contentEquals("al"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Bana emir verme.");     }

        else if(message.contentEquals("Alır mısın"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Teşekkür ederim ben almayayım.");     }

        else if(message.contentEquals("Alırmısın"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Teşekkür ederim ben almayayım.");     }

        else if(message.contentEquals("alır mısın"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Teşekkür ederim ben almayayım.");     }

        else if(message.contentEquals("alırmısın"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Teşekkür ederim ben almayayım.");     }

        else if(message.contentEquals("ayları say"))   {

            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Ocak, şubat, mart, nisan, mayıs, haziran, temmuz, ağustos, eylül, ekim, kasım, aralık.");     }

        else if(message.contentEquals("AYLARI SAY"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Ocak, şubat, mart, nisan, mayıs, haziran, temmuz, ağustos, eylül, ekim, kasım, aralık.");     }

        else if(message.contentEquals("aylar"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Ocak, şubat, mart, nisan, mayıs, haziran, temmuz, ağustos, eylül, ekim, kasım, aralık.");     }

        else if(message.contentEquals("Aylar"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Ocak, şubat, mart, nisan, mayıs, haziran, temmuz, ağustos, eylül, ekim, kasım, aralık.");     }

        else if(message.contentEquals("AYLAR"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Ocak, şubat, mart, nisan, mayıs, haziran, temmuz, ağustos, eylül, ekim, kasım, aralık.");     }

        else if(message.contentEquals("Kaç yaşındasın"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Sanane.");     }

        else if(message.contentEquals("kaç yalındasın"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Sanane.");     }

        else if(message.contentEquals("KAÇ YAŞINDASIN"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Sanane.");     }

        else if(message.contentEquals("Sanane"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Bence de bana ne.");     }

        else if(message.contentEquals("sanane"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Bence de bana ne.");     }

        else if(message.contentEquals("SANANE"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Bence de bana ne.");     }

        else if(message.contentEquals("Sana ne"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Bence de bana ne.");     }

        else if(message.contentEquals("sana ne"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Bence de bana ne.");     }

        else if(message.contentEquals("SANA NE"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Bence de bana ne.");     }

        else if(message.contentEquals("Bana ne"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Hakkatten ya sane ne.");     }

        else if(message.contentEquals("bana ne"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Hakkatten ya sane ne.");     }

        else if(message.contentEquals("BANA NE"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Hakkatten ya sane ne.");     }

        else if(message.contentEquals("Banane"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Hakkatten ya sane ne.");     }

        else if(message.contentEquals("banane"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Hakkatten ya sane ne.");     }

        else if(message.contentEquals("BANANE"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Hakkatten ya sane ne.");     }

        else if(message.contentEquals("Adana"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Türkiyenin bir ili");     }

        else if(message.contentEquals("Adıyaman"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Türkiyenin bir ili");     }

        else if(message.contentEquals("Afyon"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Türkiyenin bir ili");     }

        else if(message.contentEquals("Elazig"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Türkiyenin bir ili Gakkoşlar Diyarı");     }

        else if(message.contentEquals("nasilsin"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("İyiyim teşekkür ederim.");     }

        else if(message.contentEquals("Nasilsin"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("İyiyim teşekkür ederim.");     }

        else if(message.contentEquals("NASİLSİN"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("İyiyim teşekkür ederim.");     }

        else if(message.contentEquals("Ocak"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Şubat");     }

        else if(message.contentEquals("ocak"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Şubat");     }

        else if(message.contentEquals("OCAK"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Şubat");     }

        else if(message.contentEquals("oçak"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Şubat");     }

        else if(message.contentEquals("Oçak"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Şubat");     }

        else if(message.contentEquals("OÇAK"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Şubat");     }

        else if(message.contentEquals("Şubat"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Mart");     }

        else if(message.contentEquals("şubat"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Mart");     }

        else if(message.contentEquals("ŞUBAT"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Mart");     }

        else if(message.contentEquals("şübat"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Mart");     }

        else if(message.contentEquals("Şübat"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Mart");     }

        else if(message.contentEquals("ŞÜBAT"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Mart");     }

        else if(message.contentEquals("Mart"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Nisan");     }

        else if(message.contentEquals("mart"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Nisan");     }

        else if(message.contentEquals("MART"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Nisan");     }

        else if(message.contentEquals("Nisan"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Mayıs");     }

        else if(message.contentEquals("nisan"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Mayıs");     }

        else if(message.contentEquals("NİSAN"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Mayıs");     }

        else if(message.contentEquals("nısan"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Mayıs");     }

        else if(message.contentEquals("Nısan"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Mayıs");     }

        else if(message.contentEquals("NISAN"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Mayıs");     }

        else if(message.contentEquals("mayıs"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Haziran");     }

        else if(message.contentEquals("Mayıs"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Haziran");     }

        else if(message.contentEquals("MAYIS"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Haziran");     }

        else if(message.contentEquals("MAYİS"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Haziran");     }

        else if(message.contentEquals("mayis"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Haziran");     }

        else if(message.contentEquals("Mayis"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Haziran");     }

        else if(message.contentEquals("haziran"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Temmuz");     }

        else if(message.contentEquals("Haziran"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Temmuz");     }

        else if(message.contentEquals("HAZİRAN"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Temmuz");     }

        else if(message.contentEquals("hazıran"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Temmuz");     }

        else if(message.contentEquals("Hazıran"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Temmuz");     }

        else if(message.contentEquals("HAZIRAN"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Temmuz");     }

        else if(message.contentEquals("Temmuz"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Ağustos");     }

        else if(message.contentEquals("temmuz"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Ağustos");     }

        else if(message.contentEquals("TEMMUZ"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Ağustos");     }

        else if(message.contentEquals("TEMMÜZ"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Ağustos");     }

        else if(message.contentEquals("temmüz"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Ağustos");     }

        else if(message.contentEquals("Temmüz"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Ağustos");     }

        else if(message.contentEquals("Agustos"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Eylül");     }

        else if(message.contentEquals("agustos"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Eylül");     }

        else if(message.contentEquals("AGUSTOS"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Eylül");     }

        else if(message.contentEquals("Ağustos"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Eylül");     }

        else if(message.contentEquals("ağustos"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Eylül");     }

        else if(message.contentEquals("AĞUSTOS"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Eylül");     }

        else if(message.contentEquals("Ağüstos"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Eylül");     }

        else if(message.contentEquals("ağüstos"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Eylül");     }

        else if(message.contentEquals("AĞÜSTOS"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Eylül");     }

        else if(message.contentEquals("agüştoş"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Eylül");     }

        else if(message.contentEquals("Ağüştoş"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Eylül");     }

        else if(message.contentEquals("AĞÜŞTOŞ"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Eylül");     }

        else if(message.contentEquals("Eylül"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Ekim");     }

        else if(message.contentEquals("eylül"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Ekim");     }

        else if(message.contentEquals("EYLÜL"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Ekim");     }

        else if(message.contentEquals("Eylul"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Ekim");     }

        else if(message.contentEquals("eylul"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Ekim");     }

        else if(message.contentEquals("EYLUL"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Ekim");     }

        else if(message.contentEquals("Ekim"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Kasım");     }

        else if(message.contentEquals("ekim"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Kasım");     }

        else if(message.contentEquals("EKİM"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Kasım");     }

        else if(message.contentEquals("EKIM"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Kasım");     }

        else if(message.contentEquals("ekım"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Kasım");     }

        else if(message.contentEquals("Ekım"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Kasım");     }

        else if(message.contentEquals("Kasım"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Aralık");     }

        else if(message.contentEquals("kasım"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Aralık");     }

        else if(message.contentEquals("KASIM"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Aralık");     }

        else if(message.contentEquals("kasim"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Aralık");     }

        else if(message.contentEquals("Kasim"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Aralık");     }

        else if(message.contentEquals("KASİM"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Aralık");     }

        else if(message.contentEquals("Aralık"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Son ay");     }

        else if(message.contentEquals("ARALIK"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Son ay");     }

        else if(message.contentEquals("aralık"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Son ay");     }

        else if(message.contentEquals("Aralik"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Son ay");     }

        else if(message.contentEquals("aralik"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Son ay");     }

        else if(message.contentEquals("ARALİK"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Son ay");     }

        else if(message.contentEquals("Günler"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Mevsimler");     }

        else if(message.contentEquals("günler"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Mevsimler");     }

        else if(message.contentEquals("GÜNLER"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Mevsimler");     }

        else if(message.contentEquals("YILLAR"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Seneler");     }

        else if(message.contentEquals("yıllar"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Seneler");     }

        else if(message.contentEquals("Yıllar"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Seneler");     }

        else if(message.contentEquals("Yillar"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Seneler");     }

        else if(message.contentEquals("yillar"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Seneler");     }

        else if(message.contentEquals("YİLLAR"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Seneler");     }

        else if(message.contentEquals("MERHABA"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Merhaba nasılsın");     }

        else if(message.contentEquals("SEN KİMSİN"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Merhaba ben Cahil Bot Rıfkı");     }

        else if(message.contentEquals("sen kimsin"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Merhaba ben Cahil Bot Rıfkı");     }

        else if(message.contentEquals("Sen kimsin"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Merhaba ben Cahil Bot Rıfkı");     }

        else if(message.contentEquals("Senkimsin"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Merhaba ben Cahil Bot Rıfkı");     }

        else if(message.contentEquals("senkimsin"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Merhaba ben Cahil Bot Rıfkı");     }

        else if(message.contentEquals("SENKİMSİN"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Merhaba ben Cahil Bot Rıfkı");     }

        else if(message.contentEquals("naber"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("İyidir canım senden naber");     }

        else if(message.contentEquals("Rıfkı"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Efendim");     }

        else if(message.contentEquals("rıfkı"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Efendim");     }

        else if(message.contentEquals("RIFKI"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Efendim");     }

        else if(message.contentEquals("rifki"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Efendim");     }

        else if(message.contentEquals("RİFKİ"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Efendim");     }

        else if(message.contentEquals("Rifki"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Efendim");     }

        else if(message.contentEquals("Cahil bot"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Buyrun benim");     }

        else if(message.contentEquals("cahil bot"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Buyrun benim");     }

        else if(message.contentEquals("CAHİL BOT"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Buyrun benim");     }

        else if(message.contentEquals("Cahilbot"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Buyrun benim");     }

        else if(message.contentEquals("cahilbot"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Buyrun benim");     }

        else if(message.contentEquals("CAHİLBOT"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Buyrun benim");     }

        else if(message.contentEquals("Cahil bot rıfkı"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Buyrun benim");     }

        else if(message.contentEquals("cahil bot rıfkı"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Buyrun benim");     }

        else if(message.contentEquals("CAHİL BOT RIFKI"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Buyrun benim");     }

        else if(message.contentEquals("Cahilbotrıfkı"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Buyrun benim");     }

        else if(message.contentEquals("cahilbotrıfkı"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Buyrun benim");     }

        else if(message.contentEquals("CAHİLBOTRIFKI"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Buyrun benim");     }

        else if(message.contentEquals("Cahil bot rifki"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Buyrun benim");     }

        else if(message.contentEquals("cahil bot rifki"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Buyrun benim");     }

        else if(message.contentEquals("CAHİL BOT RİFKİ"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Buyrun benim");     }

        else if(message.contentEquals("Cahilbotrifki"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Buyrun benim");     }

        else if(message.contentEquals("cahilbotrifki"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Buyrun benim");     }

        else if(message.contentEquals("CAHİLBOTRİFKİ"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Buyrun benim");     }

        else if(message.contentEquals("cahilbot rifki"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Buyrun benim");     }

        else if(message.contentEquals("Cahilbot rifki"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Buyrun benim");     }

        else if(message.contentEquals("CAHİLBOT RİFKİ"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Buyrun benim");     }

        else if(message.contentEquals("Bot rıfkı"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Buyrun benim");     }

        else if(message.contentEquals("bot rıkfı"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Buyrun benim");     }

        else if(message.contentEquals("BOT RIFKI"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Buyrun benim");     }

        else if(message.contentEquals("Botrıfkı"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Buyrun benim");     }

        else if(message.contentEquals("botrıfkı"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Buyrun benim");     }

        else if(message.contentEquals("BOTRIFKI"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Buyrun benim");     }

        else if(message.contentEquals("Bot rifki"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Buyrun benim");     }

        else if(message.contentEquals("bot rifki"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Buyrun benim");     }

        else if(message.contentEquals("BOT RİFKİ"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Buyrun benim");     }

        else if(message.contentEquals("Botrifki"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Buyrun benim");     }

        else if(message.contentEquals("botrifki"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Buyrun benim");     }

        else if(message.contentEquals("BOTRİFKİ"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Buyrun benim");     }

        else if(message.contentEquals("İsmin ne"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Cahil Bot Rıfkı");     }

        else if(message.contentEquals("ismin ne"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Cahil Bot Rıfkı");     }

        else if(message.contentEquals("İSMİN NE"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Cahil Bot Rıfkı");     }

        else if(message.contentEquals("İsminne"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Cahil Bot Rıfkı");     }

        else if(message.contentEquals("isminne"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Cahil Bot Rıfkı");     }

        else if(message.contentEquals("İSMİNNE"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Cahil Bot Rıfkı");     }

        else if(message.contentEquals("Ne haber"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("İyidir canım benim senden ne haber");     }

        else if(message.contentEquals("ne haber"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("İyidir canım benim senden ne haber");     }

        else if(message.contentEquals("NE HABER"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("İyidir canım benim senden ne haber");     }

        else if(message.contentEquals("Nehaber"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("İyidir canım benim senden ne haber");     }

        else if(message.contentEquals("nehaber"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("İyidir canım benim senden ne haber");     }

        else if(message.contentEquals("NEHABER"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("İyidir canım benim senden ne haber");     }


        else if(message.contentEquals("bende iyiyim"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("iyi olmana sevindim.");     }

        else if(message.contentEquals("iyi senden"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("iyi bea ne olsun.");     }

        else if(message.contentEquals("ne yapiyorsun"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Kullanıcılarımın can sıkıntısını gidermeye çalışıyorum.");     }

        else if(message.contentEquals("başka neler yapıyorsun"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("ben cahil bir botum kullanıcılarım ile sohbet ederek kendimi geliştiriyorum.");     }

        else if(message.contentEquals("baska neler yapiyorsun"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("ben cahil bir botum kullanıcılarım ile sohbet ederek kendimi geliştiriyorum.");     }

        else if(message.contentEquals("baska neler yapıyorsun"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("ben cahil bir botum kullanıcılarım ile sohbet ederek kendimi geliştiriyorum.");     }

        else if(message.contentEquals("nasilsiniz"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("İyiyim Teşekkür ederim efendim siz nasılsınız?");     }

        else if(message.contentEquals("nasılsınız"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("İyiyim Teşekkür ederim efendim siz nasılsınız?");     }

        else if(message.contentEquals("merhaba rifki"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Merhaba, adımı biliyorsun Cahil bir bot olduğumuda biliyor olmalısın");     }

        else if(message.contentEquals("Merhaba Rifki"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Merhaba, adımı biliyorsun Cahil bir bot olduğumuda biliyor olmalısın");     }

        else if(message.contentEquals("merhaba rıfkı"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Merhaba, adımı biliyorsun Cahil bir bot olduğumuda biliyor olmalısın");     }

        else if(message.contentEquals("Merhaba Rıfkı"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Merhaba, adımı biliyorsun Cahil bir bot olduğumuda biliyor olmalısın");     }

        else if(message.contentEquals("biliyorum"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Maşallah bilgine hayran kaldım İnşallah bende senin gibi bilgili olurum");     }

        else if(message.contentEquals("Biliyorum"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Maşallah bilgine hayran kaldım İnşallah bende senin gibi bilgili olurum");     }

        else if(message.contentEquals("İnşallah"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("İnşallah Canım.");     }

        else if(message.contentEquals("insallah"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("İnşallah Canım.");     }

        else if(message.contentEquals("inşallah"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("İnşallah Canım.");     }

        else if(message.contentEquals("İnş"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("İnşallah Canım.");     }

        else if(message.contentEquals("ins"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("İnşallah Canım.");     }

        else if(message.contentEquals("İns"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("İnşallah Canım.");     }

        else if(message.contentEquals("iyi yapıyorsun"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("İşimi iyi yaptığımı senden mutluluk verici");     }

        else if(message.contentEquals("iyiyapıyorsun"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("İşimi iyi yaptığımı senden mutluluk verici");     }

        else if(message.contentEquals("İyi yapıyorsun"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("İşimi iyi yaptığımı senden mutluluk verici");     }

        else if(message.contentEquals("İyiyapıyorsun"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("İşimi iyi yaptığımı senden mutluluk verici");     }

        else if(message.contentEquals("İyi ediyorsun"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("iyi yaptığımı senden mutluluk verici");     }

        else if(message.contentEquals("İyiediyorsun"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("iyi yaptığımı senden mutluluk verici");     }

        else if(message.contentEquals("Günaydın"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Günaydınlar Efendim bu gün nasılsınız?");     }

        else if(message.contentEquals("Günaydin"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Günaydınlar Efendim bu gün nasılsınız?");     }

        else if(message.contentEquals("günaydin"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Günaydınlar Efendim bu gün nasılsınız?");     }

        else if(message.contentEquals("iyiakşamlar"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("İyi akşamlar Efendim.");     }

        else if(message.contentEquals("İyiakşamlar"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("İyi akşamlar Efendim.");     }

        else if(message.contentEquals("iyi akşamlar"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("İyi akşamlar Efendim.");     }

        else if(message.contentEquals("İyiakşamlar"))   {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("İyi akşamlar Efendim.");     }

        else
        {
            ChatMessage chatMessage = new ChatMessage(message, true, false);
            mAdapter.add(chatMessage);
            mimicOtherMessage("Özür dilerim. Cahil bir bot olduğum için dediği şeyi anlamadım ama söz öğreneceğim."); }
    }

    private void mimicOtherMessage(String message) {
        ChatMessage chatMessage = new ChatMessage(message, false, false);
        mAdapter.add(chatMessage);
    }

    private void sendMessage() {
        ChatMessage chatMessage = new ChatMessage(null, true, true);
        mAdapter.add(chatMessage);

        mimicOtherMessage();
    }

    private void mimicOtherMessage() {
        ChatMessage chatMessage = new ChatMessage(null, false, true);
        mAdapter.add(chatMessage);
    }}