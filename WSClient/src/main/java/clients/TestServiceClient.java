package clients;


import auto.testservice.ITestService;
import auto.testservice.ITestService_Service;

import javax.xml.namespace.QName;

public class TestServiceClient {
    public static void main(String[] argv) {
        QName name = new QName("http://demows03.example.com/","TestServicePort");
        ITestService service = new ITestService_Service().getPort(name, ITestService.class);
        //invoke business method
        String s = service.sayHelloWorldFrom("PBo");
        System.out.println(s);
        int i = service.add(3, 5);
        System.out.println(i);


        abc.ITestService service2 = new abc.ITestService_Service().getTestServicePort();
        String s2 = service2.sayHelloWorldFrom("PBo");
        System.out.println(s2);
        int i2 = service.add(3, 5);
        System.out.println(i2);
    }
}
