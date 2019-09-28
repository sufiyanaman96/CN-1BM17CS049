  
from socket import *
serverName = '172.17.0.1'
serverPort = 12000
clientSocket = socket(AF_INET,SOCK_DGRAM)
sentence = input("Enter file name : ")
clientSocket.sendto(bytes(sentence,"utf-8"),(serverName,serverPort))
filecontents,aerverAddress = clientSocket.recvfrom(2048)
print("from server : ",filecontents)
clientSocket.close()
1#72.17.0.1
