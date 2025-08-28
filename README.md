# Tugas Praktikum Minggu Ke-5


## Summary

Project ini merupakan Automation testing menggunakan Cucumber BDD untuk menguji fungsionalitas dari web Booking Appointment [CURA_Healthcare](https://katalon-demo-cura.herokuapp.com). Fokus utama pada pengujian ini meliputi module:
- Authentication: 
    - SignIn Feature
- Booking:
    - Booking Appointment Feature
    
Test Case Yang Akan Diuji pada project ini adalah:
- SignIn With Valid Credential
- SignIn With Invalid Username
- SignIn With Invalid Password
- Booking Appointment With Valid value

[Link Excel Untuk TestCase](https://docs.google.com/spreadsheets/d/1x-clYJGd3HLChAganrc6SlPqFn-XxLtq/edit?usp=sharing&ouid=109266558038495260492&rtpof=true&sd=true)

## 🛠️ System Requirements 🛠️

- Java Version 17.0.12 or above
- Maven Version 3.9.0 or above
- Selenium Version 4.34.0
- Cucumber Version 7.15.0
- Text Editor like Intellij IDEA or VsCode
- Browser(Firefox)
  
[![My Skills](https://skillicons.dev/icons?i=java,maven,selenium,idea,vscode,gherkin)](https://skillicons.dev)

## ⚙️ Quick Installation ⚙️

Please Clone This Project with the following Command below:

```
gh repo clone AdhityaArd/CURA_Healthcare
```
Running test with the following Command below:
```
mvn clean test
```

## Jenkins Integration
- Before Integration Cucumber to jenkins, we must install Jenkin and Setup First:
[Link Download Jenkins](https://www.jenkins.io/download/)
- Module Authentication Test Case:
![](https://github.com/Adhitya2808/Tugas-Praktikum-Selenium/blob/master/src/Screenshoot/Authentication.png)
- Copy your project link in github and paste in this field:
![](https://github.com/AdhityaArd/CURA_Healthcare/blob/master/Screenshoot/img.png)
- In Post-Build Action, choose Cucumber Report and insert name of Cucumber Report:
![](https://github.com/AdhityaArd/CURA_Healthcare/blob/master/Screenshoot/Screenshot%202025-08-28%20105819.png)

```bash
# Sample Jenkins pipeline command
mvn clean test
```


