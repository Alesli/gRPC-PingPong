package com.training;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) throws InterruptedException {
        Server server = null;
        try {
            server = ServerBuilder.forPort(8080)
                    .addService(new PingPongServer())
                    .build()
                    .start();
            server.awaitTermination();
        } catch (IOException e) {
            logger.log(Level.SEVERE, "Server didn't start", e);
        }
    }
}
