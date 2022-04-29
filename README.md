# Simple User Registration Service

This service is meant to act as an example REST API.

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

Happy registering!