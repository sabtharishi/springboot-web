# Simple Spring boot app (No Tracing / No Spring cloud dependency)

### Versions
* Springboot - 1.5.10.RELEASE

# Prerequisite
* Nothing

# Endpoints
Simple endpoint exposed by this app can be consumed by other services

Default port of this app is **8090**

1.http://localhost:8090/v1/subjects?exception=false will work fine. You will see simple massage saying subject as "English".
2.  http://localhost:8090/v1/subjects?exception=true will throw runtime exception. 


# Known Consumers :)
 * https://github.com/sabtharishi/springboot-tracing
