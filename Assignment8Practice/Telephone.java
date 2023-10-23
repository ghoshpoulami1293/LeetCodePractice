package Assignment8Practice;

import java.util.Arrays;

public class Telephone {
    private TelephoneType type ;
    private long phoneNumber;
    private static int sequence = 5550001;
    private boolean callInProgress;
    private long dialledNumber;
    private long[] dialList = new long[10];
    private int numberOfdials=0;

    Telephone(TelephoneType type){
        this.callInProgress= false;
        this.phoneNumber=sequence++; 
        this.type= type;
    }

    Telephone(long phoneNumber,TelephoneType type){
        this.callInProgress= false;
        this.phoneNumber=phoneNumber;
        this.type= type;        
    }
    

    public void dial(long dialNumber){
        if(dialNumber ==this.phoneNumber){
            System.out.println("Dialled number is same as own phone number. Error.");
        }
        else if(this.callInProgress==true){
            System.out.println("Call in progress");
        }
        else{
            this.callInProgress=true;
            this.dialledNumber = dialNumber;            
            if(this.numberOfdials<dialList.length-1){
                dialList[this.numberOfdials]=dialNumber;
            } else{
                this.dialList = Arrays.copyOfRange(dialList,1,8);
                this.dialList[dialList.length-1]=dialNumber;
            }
            this.numberOfdials++;        
            System.out.println("Starting call with " + dialNumber);
        }
    }
   public void disconnect(){
    if(this.callInProgress==false){
        System.out.println("Call is not in progress. Error");
    }
    else{
        this.callInProgress=false;
         System.out.println("Ending call with " + this.dialledNumber);
        }
    }

    public void redial(){
        if(this.callInProgress==false){
            dial(dialledNumber);
        }else if(this.callInProgress==true)
             System.out.println("call in progress");  
        }
    public void displayDialList(){
        System.out.println("DialledNumbers");
        for(int i=this.numberOfdials;i<=0;i--){
            System.out.println(dialList[i]);
        }
    }
    public boolean isSamePhone(long phoneNumber){
        if(this.phoneNumber == phoneNumber){
            System.out.println("Same phone");
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Telephone [type=" + this.type + 
                ", phoneNumber=" + this.phoneNumber + 
                ", callInProgress=" + this.callInProgress
                + ", dialledNumber=" + this.dialledNumber + 
                ", dialList=" + Arrays.toString(this.dialList) + 
                ", numberOfdials="+ this.numberOfdials +
                ", Last dialled number ="+ this.dialList[this.numberOfdials-1] +"]";
    }

    public TelephoneType getType() {
        return type;
    }

    public void setType(TelephoneType type) {
        this.type = type;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public static int getSequence() {
        return sequence;
    }

    public static void setSequence(int sequence) {
        Telephone.sequence = sequence;
    }

    public boolean isCallInProgress() {
        return callInProgress;
    }

    public void setCallInProgress(boolean callInProgress) {
        this.callInProgress = callInProgress;
    }

    public long getDialledNumber() {
        return dialledNumber;
    }

    public void setDialledNumber(long dialledNumber) {
        this.dialledNumber = dialledNumber;
    }

    public long[] getDialList() {
        return dialList;
    }

    public void setDialList(long[] dialList) {
        this.dialList = dialList;
    }

    public int getNumberOfdials() {
        return numberOfdials;
    }

    public void setNumberOfdials(int numberOfdials) {
        this.numberOfdials = numberOfdials;
    }
    
}
