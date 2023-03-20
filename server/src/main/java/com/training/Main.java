package com.training;

import io.grpc.ServerBuilder;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {
        var server = ServerBuilder.forPort(8080)
                .addService(new PingPongServer())
                .build();
        server.start();
        server.awaitTermination();
    }
}
