# Lab Professor: Ms.Laily Ajellu


# Lab 9 - import module os and sys
import os
import sys
import platform
import socket

# Lab 9 - Practicing System Operations
print("- Practicing System Operations - ")
print("Current machine type")
print(platform.machine())
print("---------------------------------")
print("Current processor type")
print(platform.processor())
print("---------------------------------")

# Question 3
print("Current version of python")
print(platform.version())
print("---------------------------------")

# Question 4
print("Current system")
print(platform.system())
print("---------------------------------")

print("Set timeout time of Socket in seconds")
print(socket.setdefaulttimeout(50))
print("---------------------------------")
print("Default timeout of Socket ")
print(socket.getdefaulttimeout())
print("---------------------------------")
print("Operating system name: ")
print(os.name)
print("---------------------------------")
print("Current process ID (different for each person): ")
print(os.getpid())
print("---------------------------------")
print("Current process's child's process id ")
print(os.fork())
print("---------------------------------")


# Lab 9 - Using File Descriptor open
fd = os.open("fdpractice.txt", os.O_RDWR | os.O_CREAT)
print("File Descriptor number for fdpractice.txt: " + str(fd))
print("---------------------------------")

# Lab 9 - Read and Write to a file object
fo = os.fdopen(fd, "w+")
print("File Object for fdpractice.txt: " + str(fd))
print("Current I/O pointer position :%d" % fo.tell())
fo.write("Some string to write to a file object")
fo.flush()
os.lseek(fd, 0, 0)
read_string = os.read(fd, 100)  # Should read Some string to write to a file object
print(read_string)
fo.close()
print("---------------------------------")

# Lab 9 - The code block runs twice because we have forked the process, and the child is also running the same code
sys.exit()