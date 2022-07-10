## Software Engineering Problem-solving and Enterprise Web Application Development skills:

*Note: For the tasks in this question, you are expected to take screenshot(s) of your result(s), save each into a .png or .jpg image file(s) and include these in your project in github. From your own solution, you are required to take each of the set of 3+1 evidential sample screenshots, which have been included below.*

**Implementing an end-to-end, full-stack, data-driven web application
(Time it took to complete while teaching/finalexam-revision coding: 10:30 – 11:45)**

### Problem Statement


A popular city hospital, named **HolyCross Medical Center (HCMC)**, has hired you to design and develop a simple web-based software solution for them, which they will be using to run part of their hospital operations. Specifically, the system will be used in collecting and managing data about their **Patient**s. They want you to implement a basic web application for this purpose. Especially important to the Chief Medical Director of HCMC is the data that provides information about their Elderly Patients.

An Elderly Patient is any patient who is of age, 65 or older.

Here are the attributes and sample data for Patients:

**Patient:**
```
patientId:long, (Primary Key)
patientNumber, REQUIRED, Unique (e.g. P1000001, EP1000002, EP1000003 etc.)
isAnOutPatient: REQUIRED (values: “Yes” or “No”)
fullNames, REQUIRED (e.g. John H. Smith, Ann-Marie Washington, Diego A. Ortiz etc.)
emailAddress, OPTIONAL (e.g. jhsmith@globalmail.net, awashington@hcmc.org, etc.)
contactPhoneNumber, OPTIONAL (e.g. (641) 001-0012, (641) 002-0034, etc.)
dateOfBirth, REQUIRED (e.g. 1959-5-21, 1949-12-3, etc.)
```

For this question, you are required to do the following:

Using the set of tools, technologies and frameworks which will be taught in this `CS425-Software Engineering` course, including `Spring Boot`, `Spring Web MVC`, `Spring Data JPA` etc., (or some other Enterprise Web application development platform/tool(s) that you prefer and are familiar/experienced in), implement a working web application for HCMC. You may use any database of your choice.


You are expected to implement only the following *3 features* and use-cases:

**1.**	Display a homepage which presents a menu (or hyperlink) of options for selection.

**2.**	Display list of Patients (Allows the user to view a list of all the Patients registered in the system). The hospital requires this list to be displayed sorted in ascending order of the Patients’ fullnames (see sample screen below).

**3.**	Implement a RESTful Web API which returns the list of Patients data in JSON format, when invoked at the following URL endpoint: http://localhost:8080/hcmcpatientmgmt/api/patient/list

### Solution [screenshots]

<img width="1512" alt="1" src="https://user-images.githubusercontent.com/7867129/178126884-4c15af7e-ec35-40cf-a407-1383ea8a5d69.png">

<img width="1512" alt="2" src="https://user-images.githubusercontent.com/7867129/178126890-c2638262-ce06-48ff-afb1-46fee0114aeb.png">

<img width="1512" alt="3" src="https://user-images.githubusercontent.com/7867129/178126895-98633061-f22b-48f4-9a78-f971f9a88571.png">

<img width="1512" alt="4" src="https://user-images.githubusercontent.com/7867129/178126899-3995920b-ee0c-40a1-898e-9bec978eaa48.png">


## Happy Coding!
