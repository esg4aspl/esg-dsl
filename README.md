# Recherche ESG-DSL
Domain Specific Language for ESGs

## Description
  Recherche Domain Specific Language(DSL) developed for Event Sequence Graph(ESG) drawing with a json file. To do so, DSL converts domain specific models into json.

<p float="left">
<img width="1200" alt="ESG DSL" src="https://user-images.githubusercontent.com/38656031/159059629-e23f77ad-f719-45be-b44a-bd46261d58f8.png">
</p>   
   
## Tech Stack
* Java
* Xtext

### Dependenciessd
* Eclipse Xtext [Setup Xtext](https://www.eclipse.org/Xtext/download.html)
* Graphviz [Setup Graphviz](https://graphviz.org/download/)
* Eclipse & Java 11+

## Setup
1. Clone Project from Github Repository.
2. If any error occurs on the modules ui, ui.tests, tests and ide then follow the road map given below:
  * For Windows => Window -> Preferences
  * For Mac => Click Eclipse -> Preferences
  * Java -> Expand Java's props -> Compiler -> Expand Build Path Problems -> Change Incomplete Build Path from Error to Warning!
3. Then you should run the Eclipse Xtext Workflow. To do so:
  * Open com.mert.recherche, src/com.mertrecherche/MkDsl.xtext file
  * On this file right click and select Run As -> Generate Xtext Artifacts.
  * Wait until "Done." output on the console.
4. Run Recherche DSL project as Eclipse Application.
  * On the parent folder(com.mert.recherche) right click and select Run As -> Run as Eclipse Application.

# Sample
On the root of project you can find following samples.

* For Simple ESG: simple_esg.mkdsl  --> Output: simple_esg.json
* For Refined ESG: refined_esg.mkdsl  --> Output: refined_esg.json
* For Simple ESG: decision_table.mkdsl  --> Output: decision_table.json

## Authors
Mert Kalecik
* contact: mert.kalecik@hotmail.com
[@Linkedin](https://www.linkedin.com/in/mert-kalecik-129202b5)
[@Twitter](https://twitter.com/mertkalecik)

## Advisor
Associate Professor Dr. Tuğkan Tuğlular
* contact: tugkantuglular@iyte.edu.tr

## Version History

* 0.1
  * Initial Release
