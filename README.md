Create database empdir;
Use empdir;

create table employee ( id int not null auto_increment, first_name varchar(30), last_name varchar(30), email varchar(40), primary key (id) );

insert into employee (first_name, last_name, email) values ("pallavi","savant","abc@gmail.com")

GET - localhost:8080/api/employees

GET – localhost:8080/api/employees/1

POST – localhost:8080/api/employees
Body – { 
“firstName”: “pallavi”,
“lastName”: “savant”,
“email”: test@gmail.com
}

PUT – localhost:8080/api/employees
BODY - { 
“id”: 8,
“firstName”: “pallavi”,
“lastName”: “S”,
“email”: test@gmail.com
}

DELETE – localhost:8080/api/employees/8





![image](https://github.com/user-attachments/assets/4dbc094e-8968-4ba0-b0ef-2e6a7feff7de)
