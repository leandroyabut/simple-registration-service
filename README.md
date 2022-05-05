# Simple User Registration Service

This service is meant to act as an example REST API.

**App CORS allows http://localhost:4200 to access.**

To run from source code:
```bash
git clone https://github.com/leandroyabut/simple-registration-service.git
cd simple-registration-service
mvn clean install
mvn spring-boot:run
```

The REST API can be accessed locally at port `8888`.
http://localhost:8888/

To register a user, `POST` the following JSON to the `/users/registration` endpoint. Edit the values as necessary.

```json
{
  "username": "testboy",
  "password": "P@ssword123",
  "email": "testboy@test.com",
  "firstName": "Test",
  "lastName": "Boy",
  "dateOfBirth": "1998-01-01",
  "addressLine1": "123 Test Lane",
  "city": "Test City",
  "state": "TX",
  "zipcode": "12345"
}
```

__NOTE:__ Passwords should always be hashed when persisting to a database. I persist the passwords to an in-memory database that is erased at the end of the servers session, however, still be very cautious with the passwords you store in the in-memory database.

## In-Memory SQL Database
I used H2 for the in-memory database. To access it go to:
http://localhost:8888/h2-console

__Credentials__:

Username: `sa`

Password: `password`

In this database, you can access all the data that was persisted in the current session.

**ALL DATA WILL BE ERASED WHEN THE SERVER IS STOPPED**

----------------------------------------------------------

Happy registering!