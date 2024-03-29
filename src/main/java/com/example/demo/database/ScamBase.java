package com.example.demo.database;

import com.example.demo.model.StreamingService;
import com.example.demo.model.Customers;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Component
public class ScamBase {



    List<Customers> customers = new ArrayList<>();
    List<StreamingService> streamingServices = new ArrayList<>();

    public ScamBase() {
        streamingServices.add(new StreamingService(1, "Netflix", "HD", "99kr"));
        streamingServices.add(new StreamingService(2, "HBO", "HD", "99kr"));
        streamingServices.add(new StreamingService(3, "Amazon", "HD", "99kr"));

        customers.add(new Customers(1, "Kalle", "Karlsson", "merebanglo@yahoo. com", streamingServices.get(0) ));
        customers.add(new Customers(2, "Alex", "Karlsson", "alexanglo@yahoo. com", streamingServices.get(1) ));
        customers.add(new Customers(3, "hana", "Karlsson", "hanaanglo@yahoo. com", streamingServices.get(2) ));


    }

    public List<Customers> getCustomers() {

        return customers;
    }



    public Customers addCustomer(Customers customer) {
        customers.add(customer);
        return customer;
    }


    public Customers getCustomersById(int id) {

        for (Customers customer : customers) {

            if (customer.getId() == id) {
                return customer;
            }

        }
        return null;
    }



    public StreamingService getStreamingById(int id) {
        for (StreamingService streamingService : streamingServices) {
            if (streamingService.getId() == id) {
                return streamingService;
            }
        }
        return null;
    }


    public List<StreamingService> getStreaming() {

        return streamingServices;
    }




    public Customers deleteCustomer(int id) {

        Iterator<Customers> customersIterator = customers.iterator();

        while (customersIterator.hasNext()) {
            Customers customer = customersIterator.next();
            if (customer.getId() == id) {
                customersIterator.remove();
                return customer;
            }
        }
        return null;
    }

    public StreamingService addStreamingService(StreamingService streamingService) {
        streamingServices.add(streamingService);
        return streamingService;
    }


    public StreamingService deleteStreamingService(int id) {
        Iterator<StreamingService> streamingServiceIterator = streamingServices.iterator();
        while (streamingServiceIterator.hasNext()) {
            StreamingService streamingService = streamingServiceIterator.next();
            if (streamingService.getId() == id) {
                streamingServiceIterator.remove();
                return streamingService;
            }
        }
        return null;
    }

}
