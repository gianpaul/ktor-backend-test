package pe.exirium.plugins

import io.ktor.server.application.*
import io.ktor.server.routing.*
import pe.exirium.routes.customerRouting
import pe.exirium.routes.getOrderRoute
import pe.exirium.routes.listOrdersRoute
import pe.exirium.routes.totalizeOrderRoute

fun Application.configureRouting() {
    routing {
        customerRouting()
        listOrdersRoute()
        getOrderRoute()
        totalizeOrderRoute()
    }
}
