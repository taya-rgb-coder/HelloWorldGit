import socket

client_socket = socket.socket(socket.AF_INET,socket.SOCK_STREAM)
client_socket.connect(('localhost',65432))


guess = input("Enter your guess number: ")
client_socket.sendall(str(guess).encode("utf-8"))

data = client_socket.recv(1024)
print("The answer of server:", data.decode())