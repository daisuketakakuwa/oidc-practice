# oidc-practice
## How to test verifying JWT signature.
1. Run spring boot.
```
mvn clean install spring-boot:run
```

2. Run jwks server.
```
cd jwks-provider
npm install
node index.js
```

3. Create JWT in https://jwt.io/. ※Be sure to add `kid` in header.

4. Convert a public key from PEM to JWK in https://irrte.ch/jwt-js-decode/pem2jwk.html.

5. Update `jwks-provider/keyPairs.json` with JWK which created in step 5.

6. Open SwaggerUI. Visit http://localhost:8080/swagger-ui/index.html.

7. Use JWT created in step 3. Call api with JWT in Authorization header.
 