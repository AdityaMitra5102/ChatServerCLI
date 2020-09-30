# ChatServerCLI
A simple chatserver with Java. Added feature: The Server will be able to run CLI and Bash commands on the client machine. 
Can be used to control the client machine if the server is well versed in CLI.

For example if the client machine is a Windows machine,
if the server enters "StartCLI shutdown -s -f -t 0" it will force shutdown the client machine
if the server enters "StartCLI notepad" it will open notepad in the client machine.
If the server doesnt use the "StartCLI" command, the program will run as a generic chat server.

ClientTest and ServerTest functions in the respective folders are Initial classes.
If PortForwarding is set to port 80, this can also be used over the internet and not only on local network.
