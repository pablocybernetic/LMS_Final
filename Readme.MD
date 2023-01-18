./mongod --dbpath ~/Mongodata/

./mongo

use lms_db;

db.createUser({user : "root", pwd : "12345", roles : [{role : "readWrite", db : "lms_db"}]});

Exit

./mongod --auth --dbpath ~/Mongodata/

./mongo localhost/lms_db -u 'root' -p '12345';

db.createCollection("user")

db.user.insert({"email" : "example1@gmail.com", "password": "123", "name": "Name1", "role": "TEACHER", "regdate" : "2023-01-010"});

db.user.insert({"email" : "example2@gmail.com", "password": "admin", "name": "Name2", "role": "TEACHER", "regdate" : "2023-01-10"});