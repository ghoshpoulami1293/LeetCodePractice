package Assignment8Practice;

public class TelephoneTester {
    public static void main(String[] args) {
        Telephone tel1 = new Telephone(6550007,TelephoneType.LANDLINE);
        Telephone tel2 = new Telephone(TelephoneType.MOBILE);
        Telephone tel3 = new Telephone(TelephoneType.SATELLITE);
        Telephone tel4 = new Telephone(TelephoneType.LANDLINE);
        Telephone tel5 = new Telephone(6550001,TelephoneType.MOBILE);
        Telephone tel6 = new Telephone(TelephoneType.SATELLITE);      
        Telephone tel7 = new Telephone(TelephoneType.LANDLINE);
        Telephone tel8 = new Telephone(6550001,TelephoneType.MOBILE);
        Telephone tel9 = new Telephone(TelephoneType.SATELLITE);
        Telephone tel10 = new Telephone(6550009,TelephoneType.LANDLINE);

        tel1.dial(tel2.getPhoneNumber());
        tel1.disconnect();
        tel1.dial(tel3.getPhoneNumber());
        tel1.disconnect();
        tel1.dial(tel4.getPhoneNumber());
        tel1.disconnect();
        tel1.dial(tel5.getPhoneNumber());
        tel1.disconnect();
        tel1.dial(tel6.getPhoneNumber());
        tel1.disconnect();
        tel1.dial(tel7.getPhoneNumber());
        tel1.disconnect();
        tel1.redial();
        tel1.dial(tel8.getPhoneNumber());//call in progress
        tel1.redial(); //call in progress
        tel1.dial(tel9.getPhoneNumber());//call in progress
        tel1.disconnect();
        tel1.dial(tel10.getPhoneNumber());
        tel1.disconnect();
        
        System.out.println(tel5.isSamePhone(tel8.getPhoneNumber()));//true

        System.out.println(tel1.toString());
    }
}
