# databasy
my idea was Hierarchical Database  
there is a directory for the db -> DB  
inside DB subdirectory for schemas -> Schemas  
inside Schemas subdirectory for tables -> Tables  
plus a file for info on our tables:   path, column names.. -> info.txt/json/xml...
inside Tables file for index -> indexes.txt/json/xml....  
inside Tables files for records -> records.txt/json/xml....  
each record file contains N amount of records 

# inside the ETL 
with the ETL Pipeline from the previous project I will:
* extract the data and parse it into Records -> an object that contains a List of Cells
* transform action on my data to get the wanted result -> show, update, delete a table and selects
  plus updating the indexes file
* load the new data into the relevant files


# inside the objects
the class Table will store a list of the files with the records
plus a file of indexes the table has
by reading the indexes file we can find exactly where the record we want is
so we won't have to go over all of the files

## improvement
to save the changes in the local file and once in X time to update the actual files of the DB
save the time of I/O but can lose data in case of corruption


