# spring-restcontroller
Spring 4 Rest Controller Scaffold

Example project showing Spring 4's RestController to serve both XML and JSON.  Note the Jackson version used in the pom file, as Spring seems to be particular about the Jackson version.

Sample uses:

`curl -v -i -H "Accept: application/json" http://localhost:8080/test/hello/foo.json`
`curl -v -i -H "Accept: application/xml" http://localhost:8080/test/hello/foo.xml`
