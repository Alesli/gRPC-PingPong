import grpc
import time
import ping_pong_pb2
import ping_pong_pb2_grpc


def run():
    channel = grpc.insecure_channel('localhost:8080')
    stub = ping_pong_pb2_grpc.PingPongServiceStub(channel)
    for i in range(10):
        message = ping_pong_pb2.PingRequest(message="Ping", timestamp=int(time.time()))
        pong_response = stub.getPingPong(message)
        print(pong_response)


if __name__ == '__main__':
    run()
