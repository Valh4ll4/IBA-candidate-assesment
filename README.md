# IBA-candidate-assesment
This repository contains assessment tasks for Java developer position in company IBA CZ
There are 11 tasks/levels total to complete.

Progress:   Level 4 out of 11 completed
Hotfix:     None
Comment:    Maven project encoding set to UTF-8. Added Spring MVC dependency due to new implementation.
            JSP for multiple hello print moved to WEB-INF for more Spring friendly layout.
            Controller package (cz.xvano1.controller) created, populated and set in Spring configuration
            for component scan. Added Spring configuration (spring-web-servlet.xml)
            and Controller (HelloController.java) for the already created view.
            MVC URL: /vano-java-webapp/hello?x=[positive integer number]
            nonMVC URL (previous implementation): /vano-java-webapp/hello2?x=[positive integer number]