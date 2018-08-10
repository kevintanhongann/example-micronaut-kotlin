package example.micronaut.kotlin

import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Produces

class HelloController {
  @Get("/")
  @Produces(MediaType.TEXT_PLAIN)
  fun index(): String {
    return "Hello World"
  }
}
