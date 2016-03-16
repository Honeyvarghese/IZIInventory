# IZIInventory
IZI Inventory system created as part of Ancestry Interview

INPUT FORMATS

Animal Database: animalId,zooId,speciesName,foodId

Feed Record Database: animalId,zooId,foodId,quantity,date

OUTPUT FILES

AnimalAverageReport.txt
SpeciesAverageReport.txt

RUNNING INSTRUCTIONS

1. Download and use the entire repository as a source folder for a java project.
2. Add the jarlibs package to build path.
3. Run Controller.java from the testcontroller package.
4. Output files will be generated to the package textfiles.

COMMENTS AND OBSERVATIONS

Could only implement the first two requirements. However, the basic
infrastructure is laid out to expand this model for further
requirements.

Ideal way to implement this project is using a database query model and a web
interface with a MVC architecture. However,  since you wanted to
evaluate the programming skills and the time is too short, I did this as a basic core java
application and ignored the persistence and UI. The model is compatible
with web apps and persistance layers. Web based UI can access the reportFactory api
and databases can be replaced by writing a new DAO conforming to the DataAccessObject api.

FUTURE WORK:

1. Implement the remaining requirements by expanding the DAO and report API
2. Create a new batch update module to add employee inventory updates and feed records to the database through DAO
3. Implement a new DAO to replace the existing one to connect with a persistance layer.
4. Modify the controller and connect to a web based UI layer.
