# mongodb-Autogenerated-id

When we're using MongoDB as the database for a Spring Boot application, we can't use @GeneratedValue annotation in our models as it's not available. Hence we need a method to produce the same effect as we'll have if we're using JPA and an SQL database.

The general solution to this problem is simple. We'll create a collection (table) that'll store the generated sequence for other collections. During the creation of a new record, we'll use it to fetch the next value.

Video for understanding :  https://www.youtube.com/watch?v=x980d_aFJ2s

Article: https://www.baeldung.com/spring-boot-mongodb-auto-generated-field
