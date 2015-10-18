# evose-service
EVOSE Web Service 


# Token Generation:

Method: POST

URL: evose-services/oauth/token

Body: grant_type=password&client_id=my-trusted-client-with-secret&client_secret=somesecret&username=admin&password=admin123

Content-type: application/x-www-form-urlencoded 




# Test API:

Method: GET

URL: evose-services/evose_api/say_hello

Header: Authorization: Bearer <Generated_Token>


