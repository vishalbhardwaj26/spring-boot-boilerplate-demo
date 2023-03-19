
### Learning Goals
* Running Multiple spring boot service at Localhost: - DONE
* Use Components: API GAteway (Spring Cloud),  load balancer (ribbon and GW), circuit breaker(resillience4j; hysterix), feign clients - DONE
* docerize all environments + use docker -compose  - DONE
* Aceess all APIs using containers - DONE
* Actuator + ELK STack for monitoring
* Oauth2 for auth
* Docker volument & * MongoDB configuration on cloud

### server
* Eurkea
- http://localhost:8761/


### APIs

## Using GAteway
* API GW to NoticeService to User Service
- http://localhost:4000/noticsmgmts/noticeboards/HelloWorldFromUserFromShop
> Hello world From User5003 : 6001 notice-mnagement-service-instace: 1

* API GW to Notice service
- http://localhost:4000/noticsmgmts/noticeboards/Hello
> Hello world:60012

* API GW to user service
- http://localhost:4000/usermgmts/helloboards/Hello
> Hello world:5003

## Directly
* http://localhost:6001/noticsmgmts/noticeboards/Hello
* http://localhost:5003/usermgmts/helloboards/Hello


### Docker Command
* Complete compose file
- docker-compose -f docker-compose.yml -f docker-compose.dev.yml up
* one service in compose file
- docker-compose -f docker-compose.yml -f docker-compose.dev.yml up notice-management-service


## check commit "containerization" for journey from localhost to docker