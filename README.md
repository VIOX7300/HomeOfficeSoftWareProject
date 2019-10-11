 "#HomeOfficeSoftWareProject Demo - Senior Test Engineer " 
  Pre-requisites - Docker, Maven, Git, Real VNC viewer
  1.Import this project to a local folder using Git clone.
  2.To run the project - Go to the command line inside the HomeOfficeSoftWareTestProject folder and issue the following command in one line.
  > docker-compose up -d && mvn test
  
  Note:Please look in my setUp function, their is are two project initialise options, use  initialise(no VNC viewer required), or intialiseRemote(browserType) (VNC viewer required).
       Make this configuration before issueing the above commands.  
            

  
