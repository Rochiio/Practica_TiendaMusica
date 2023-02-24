package es.tiendamusica.dtos

import es.tiendamusica.models.Pedido
import kotlinx.serialization.Serializable
import serializer.LocalDateSerializer
import serializer.UUIDSerializer
import java.time.LocalDate
import java.util.*

@Serializable
data class PedidoDto(
    val id: String,
    @Serializable(UUIDSerializer::class)

    val uuid: UUID,
    val price: Double,
    val user: UserDto,
    val status: Pedido.Status,
    @Serializable(LocalDateSerializer::class)
    val createdAt: LocalDate,
    @Serializable(LocalDateSerializer::class)
    val deliveredAt: LocalDate?
)

@Serializable
data class PedidoCreateDto(
    val price: Double,
    val productos: List<LineaVenta>,
    val userId: String
)

@Serializable
data class UpdatePedidoDto(
    val precio: Double? = null,
    val status: Pedido.Status? = null
)
