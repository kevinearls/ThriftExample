package io.kearls.thriftexample.client;

import static io.kearls.thriftexample.server.MyServer.PORT;

import io.kearls.thriftexample.server.AdditionService;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;

import java.util.Random;

public class AdditionClient {

    public static void main(String[] args) {
        Random random = new Random(System.currentTimeMillis());

        try (TTransport transport= new TSocket("localhost", PORT);) {
            transport.open();
            TProtocol protocol = new TBinaryProtocol(transport);
            AdditionService.Client client = new AdditionService.Client(protocol);

            int iteration = 0;
            while(iteration < 1000) {
                iteration++;
                int n1 = random.nextInt(1000);
                int n2 = random.nextInt(5000);
                int result = client.add(n1, n2);
                System.out.println(n1 + " + " + n2 + " = " + result);
                //System.out.println(client.add(100, 200));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        } catch (TException e ) {
            e.printStackTrace();
        }
    }

}