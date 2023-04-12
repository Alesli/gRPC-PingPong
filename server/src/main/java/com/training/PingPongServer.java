package com.training;

import com.training.grpc.PingPongServiceGrpc;
import com.training.grpc.PingRequest;
import com.training.grpc.PongResponse;
import io.grpc.stub.StreamObserver;

public class PingPongServer extends PingPongServiceGrpc.PingPongServiceImplBase {

    @Override
    public void getPingPong(PingRequest request, StreamObserver<PongResponse> responseObserver) {

        var message = request.getMessage();
        System.out.println("Received massage from pingRequest " + message);
        var response = PongResponse.newBuilder()
                                                            .setMessage("Pong")
                                                            .setTimestamp(System.currentTimeMillis())
                                                            .build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
