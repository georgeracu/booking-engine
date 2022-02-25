package com.georgeracu.booking.resource

import com.codahale.metrics.annotation.Timed
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.core.Response

@Path("/api/v1/bookings")
class BookingsResource {
    private val logger: Logger = LoggerFactory.getLogger("BookingsResource")

    @GET
    @Timed
    fun getBookings(): Response {
        logger.info("Received GET [/api/v1/bookings]")
        return Response.ok().build()
    }
}