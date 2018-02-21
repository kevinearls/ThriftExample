package io.kearls.thriftexample.server;

import org.apache.thrift.TException;

public class AdditionServiceHandler implements AdditionService.Iface {

    @Override
    public int add(int n1, int n2) throws TException {
        System.out.println("Adding " + n1 + " and " + n2);
        return n1 + n2;
    }

}
