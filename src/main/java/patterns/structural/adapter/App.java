package patterns.structural.adapter;

import patterns.structural.adapter.adapter.AndroidToIPhoneAdapter;
import patterns.structural.adapter.android.AndroidCharger;
import patterns.structural.adapter.android.AndroidPhone;
import patterns.structural.adapter.android.OnePlus5;
import patterns.structural.adapter.iphone.IPhone;
import patterns.structural.adapter.iphone.IPhoneCharger;
import patterns.structural.adapter.iphone.IPhoneX;

public class App {

    public static void main(String[] args) {

        //İki uyumsuz interface’i beraber kullanmamızı sağlar.Daha önce yazılmış olan kodları düzenlemek zorunda kalmayız.

        AndroidCharger androidCharger = new AndroidCharger();
        AndroidPhone androidPhone = new OnePlus5();
        androidCharger.charge(androidPhone);

        IPhoneCharger iPhoneCharger = new IPhoneCharger();
        IPhone iPhone = new IPhoneX();
        iPhoneCharger.charge(iPhone);

        AndroidToIPhoneAdapter adapter = new AndroidToIPhoneAdapter(androidPhone);
        iPhoneCharger.charge(adapter);

    }
}
