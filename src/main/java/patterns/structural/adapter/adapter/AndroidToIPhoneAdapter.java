package patterns.structural.adapter.adapter;

import patterns.structural.adapter.android.AndroidPhone;
import patterns.structural.adapter.iphone.IPhone;

public class AndroidToIPhoneAdapter implements IPhone {

    AndroidPhone androidPhone;

    public AndroidToIPhoneAdapter(AndroidPhone androidPhone){
        this.androidPhone = androidPhone;
    }

    @Override
    public void charge() {
        androidPhone.charge();
    }

}
