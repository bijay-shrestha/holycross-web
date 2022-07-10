A popular city hospital, named **HolyCross Medical Center (HCMC)**, has hired you to design and develop a simple web-based software solution for them, which they will be using to run part of their hospital operations. Specifically, the system will be used in collecting and managing data about their Patients. They want you to implement a basic web application for this purpose. Especially important to the Chief Medical Director of HCMC is the data that provides information about their Elderly Patients.

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


