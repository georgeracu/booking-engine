package com.georgeracu.booking.resource

import io.dropwizard.testing.junit5.DropwizardExtensionsSupport
import io.dropwizard.testing.junit5.ResourceExtension
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(DropwizardExtensionsSupport::class)
internal class BookingsResourceTest {
    private val resources: ResourceExtension = ResourceExtension.builder()
        .addResource(BookingsResource())
        .build()

    @Test
    fun shouldGetAllBookings() {
        // act
        val response = resources.target("/api/v1/bookings").request().get()

        // assert
        assertThat(response.status).isEqualTo(200)
    }
}