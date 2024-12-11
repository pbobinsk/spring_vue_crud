package clients;


import auto.spring.*;

public class TestServiceClient2 {
    public static void main(String[] argv) {

        CountriesPort service = new CountriesPortService().getCountriesPortSoap11();
        GetCountryRequest gcr = new GetCountryRequest();
        gcr.setName("Poland");
        String s = service.getCountry(gcr).getCountry().getCurrency().name();
        System.out.println(s);

    }
}
