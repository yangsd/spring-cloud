# Spring Cloud

### Eureka

>Service Discovery is one of the key tenets of a microservice based architecture. Trying to hand configure each client or some form of convention can be very difficult to do and can be very brittle. Eureka is the Netflix Service Discovery Server and Client. The server can be configured and deployed to be highly available, with each server replicating state about the registered services to the others.

### Hystrix
>Netflix has created a library called Hystrix that implements the circuit breaker pattern. In a microservice architecture it is common to have multiple layers of service calls.

### Ribbon
>Ribbon is a client side load balancer which gives you a lot of control over the behaviour of HTTP and TCP clients.

### Feign
>Feign is a declarative web service client. It makes writing web service clients easier. To use Feign create an interface and annotate it. It has pluggable annotation support including Feign annotations and JAX-RS annotations. Feign also supports pluggable encoders and decoders. Spring Cloud adds support for Spring MVC annotations and for using the same HttpMessageConverters used by default in Spring Web. Spring Cloud integrates Ribbon and Eureka to provide a load balanced http client when using Feign.

### Zuul
>Netflix uses Zuul for the following:

- **Authentication**
- **Insights**
- **Stress Testing**
- **Canary Testing**
- **Dynamic Routing**
- **Service Migration**
- **Load Shedding**
- **Security**
- **Static Response handling**
- **Active/Active traffic management**

  
