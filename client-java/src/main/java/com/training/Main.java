package com.training;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class Main {
    public static void main(String[] args) {

        ManagedChannel managedChannel = ManagedChannelBuilder.forTarget("localhost:8080")
                                                        .usePlaintext()
                                                        .build();

        var client = new PingPongClient(managedChannel);
        for (int i = 0; i < 10; i++) {
            client.sendMessage();
        }
    }
}
