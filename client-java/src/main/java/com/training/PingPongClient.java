package com.training;

import com.training.grpc.PingPongServiceGrpc;
import com.training.grpc.PingRequest;
import io.grpc.Channel;


public class PingPongClient {

    private final PingPongServiceGrpc.PingPongServiceBlockingStub blockingStub;


    public PingPongClient(Channel channel) {
        this.blockingStub = PingPongServiceGrpc.newBlockingStub(channel);
    }

    public void sendMessage() {
        var message = PingRequest.newBuilder()
                                                    .setMessage("Ping")
                                                    .setTimestamp(System.currentTimeMillis())
                                                    .build();

        var pongResponse = blockingStub.getPingPong(message);
        System.out.println(pongResponse);

    }
}
