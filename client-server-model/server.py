import socket

server_socket = socket.socket(socket.AF_INET,socket.SOCK_STREAM)
server_socket.setsockopt(socket.SOL_SOCKET,socket.SO_REUSEADDR,1)
server_socket.bind(('localhost',65432))
server_socket.listen()
print(f"Server is listening...")
conn, addr = server_socket.accept()
print(f"Client connected from address: {addr}")


import random

secret_number = random.randint(1, 10)
print(f"The imaginary number is: {secret_number}")

data = conn.recv(1024)
try:
    guess = int(data.decode())
    print(f"The client sent the number: {guess}")

    if guess == secret_number:
        response = "You guessed it!"
    else:
        response = f"You didn't guess. The imaginary number was {secret_number}."
except ValueError:
        response = "You did not submit a valid number."

conn.sendall(str(response).encode("utf-8"))