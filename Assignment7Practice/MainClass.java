package Assignment7Practice;

public class MainClass {
    public static void main(String args[]){
        Elements element1 = new Elements("Hydrogen", "H", 1, 1);
        Elements element2 = new Elements("Hydrogen", "He", 2, 1);
        Elements element3 = new Elements("Hydrogen", "Li", 3, 1);
        Elements element4 = new Elements("Hydrogen", "Be", 4, 1);
        Elements element5 = new Elements("Hydrogen", "B", 5, 1);
        Elements element6 = new Elements("Hydrogen", "C", 6, 1);
        Elements element7 = new Elements("Hydrogen", "N", 7, 1);
        Elements element8 = new Elements("Hydrogen", "O", 8, 1);
        Elements element9 = new Elements("Hydrogen", "F", 9, 1);
        Elements element10 = new Elements("Hydrogen", "Ne", 10, 1);

        System.out.println(element1);
        System.out.println(element2);
        System.out.println(element3);
        System.out.println(element4);
        System.out.println(element5);
        System.out.println(element6);
        System.out.println(element7);
        System.out.println(element8);
        System.out.println(element9);
        System.out.println(element10);


        Thermometer thermometer1 = new Thermometer();
        System.out.println(thermometer1.getTemperature());
        System.out.println(thermometer1.toString());

        Thermometer thermometer2 = new Thermometer();
        Thermometer thermometer3 = new Thermometer();
        Thermometer thermometer4 = new Thermometer();        

        thermometer2.setTempInCelsius(78.9);
        System.out.println(thermometer2.getTempInCelsius());
        System.out.println(thermometer2.getTempInFahrenheit());
        System.out.println(thermometer2.getTempInKelvin());
        System.out.println(thermometer2.toString());

        thermometer3.setTempInFahrenheit(456.8);
        System.out.println(thermometer3.getTempInCelsius());
        System.out.println(thermometer3.getTempInFahrenheit());
        System.out.println(thermometer3.getTempInKelvin());
        System.out.println(thermometer3.toString());
        
        thermometer4.setTempInKelvin(696.8);
        System.out.println(thermometer4.getTempInCelsius());
        System.out.println(thermometer4.getTempInFahrenheit());
        System.out.println(thermometer4.getTempInKelvin());
        System.out.println(thermometer4.toString());


        Professor professor1 = new Professor("Bobby", "St.Jacques", "RIT", "Soft Con",4,5);
        System.out.println(professor1.toString());
        
        Professor professor2 = new Professor("Travis", "Desell", "RIT", "Advisor");
        professor2.addRating(4, 3.4);
        System.out.println(professor2.toString());
        professor2.addRating(5, 2.3);
        System.out.println(professor2.toString());
        professor2.addRating(4.2, 3.4);
        System.out.println(professor2.toString());
        
        Professor professor3 = new Professor("Zhe", "Yu", "RIT", "DSCI");
        professor3.addRating(4, 3.4);
        System.out.println(professor3.toString());
         professor3.addRating(5, 2.3);
        System.out.println(professor3.toString());
        professor3.addRating(4.2, 3.4);
        System.out.println(professor3.toString());
        
        Professor professor4 = new Professor("Carly", "Metcalfe", "RIT", "Applied Stats");
        professor4.addRating(4, 3.4);
        System.out.println(professor4.toString());
        professor4.addRating(5, 2.3);
        System.out.println(professor4.toString());
        professor4.addRating(4.2, 3.4);
        System.out.println(professor4.toString());
    }
}
