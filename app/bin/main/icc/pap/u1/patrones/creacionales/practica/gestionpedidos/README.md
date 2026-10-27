# Gestion de Pedidos

## Patrones utilizados

### 1. Singleton

Se utiliza en `ConfiguracionSistema` para tener una sola instancia que guarda el porcentaje de impuesto. Asi todos los pedidos usan la misma configuracion.

### 2. Factory Method

Se utiliza para crear pedidos presenciales y en linea sin tener q cambiar mucho el codigo principal. Esto facilita agregar nuevos tipos de pedidos.

## Clases

- `Pedido`: contiene los datos y calculos.
- `PedidoPresencial`: genera el comprobante en tienda.
- `PedidoEnLinea`: genera la confirmacion digital.
- `ConfiguracionSistema`: guarda el impuesto.
- `CreadorPedido`: define como crear pedidos.
- `CreadorPedidoPresencial`: crea pedidos presenciales.
- `CreadorPedidoEnLinea`: crea pedidos en linea.
- `Main`: ejecuta el programa.

## Funcionamiento
el patron creacional se refiere a
El impuesto es del 15%.

- Pedido presencial: $100 + $15 = $115.
- Pedido en linea: $200 + $30 = $230.

Al final aparece `true`, lo q demuestra q la configuracion es compartida.

## Tecnologias

- Java
- Gradle
- VS Code