# gRPC-PingPong
### gRPC client-server application

**Description**

- Create a simple `gRPC server` application
  - that listens on port 8080 for a request like this `{ "message": "Ping" }` 
  - and responses with something like this: `{ "message": "Pong" }`

- Create a simple `Java gRPC client` application that sends a request to the simple server (share the same proto file), gets a response, and prints it.
- Create a simple `gRPC client` application in any other language (`Python`) that sends a request to the simple server, gets a response, and prints it.
  Use the same proto file.
``` 
python -m grpc_tools.protoc --proto_path=protos/src/main/proto --python_out=client-python --pyi_out=client-python --grpc_python_out=client-python protos/src/main/proto/ping-pong.proto
```
- Start a server and try to communicate with it using the clients you just wrote.