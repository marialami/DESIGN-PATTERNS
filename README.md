# DESIGN-PATTERNS

## COMPORTAMIENTO (Strategy)
### Problemática:
Para ese patrón de diseño, se encontró un escenario en una tienda de malteadas donde cierta cantidad de clientes se encontraban descontentos debido a que únicamente se realizaban las malteadas a base de leche entera y no se tenía en cuenta las diferentes preferencias de los demás consumidores. Sin embargo, los trabajadores de la tienda se les dificultaba mantener una organización a la hora de tomar los pedidos generando confusiones al momento de realizar dichas malteadas debido a que debían tener en cuenta otras solicitudes por parte de los clientes. 

### Solución: 
Generar un programa donde el usuario tenga la capacidad de elegir entre cómo realizar su malteada según sus preferencias entre si realizarla con leche entera, leche de almendras o simplemente a base de agua. Con lo antes mencionado, se estarían tomando en cuenta diferentes alternativas para cada cliente que entre a la tienda. Además, de incrementar la eficiencia por parte de los trabajadores al tener mayor control y organización en sus pedidos. 

## ESTRUCTURAL (Decorate)
### Problemática
Si una pastelería decide usar una plataforma para que las personas hagan los pedidos en los puntos de venta, al inicio venden un tipo de pastel fijo, sin embargo decidieron implementar una función para que los usuarios pudieran personalizar sus pasteles, pero esto lleva a la problemática que actualmente solo tengo una clase pastel, o pastel crema, pero que pasa si la persona quiere pastel, crema y fruta, o pastal y fruta y si en algún momento decido añadir más topins me tocaría generar muchas clases combinando todo el tipo de opciones.

### Solución
Con Decorate podemos decorar los mismos objetos entre sí, ya que lo que hacemos es definir una interfaz de pastel y una para cada opción las cuales como constructor reciben a objeto tipo pastel, por lo que es como si metiera un objeto dentro de otro, para añadir su cualidad, lo que nos permite construir un objeto por capas en cualquier tipo de orden.


## CREACIONAL (Abstract Factory)
### Problemática:
Para este patrón, se encuentran varias familias de objetos, cada uno con una variedad de categorías. En este caso tomamos el ejemplo de una repostería, en la que tienen distintos tipos de postres y cada uno con variedad de temáticas. Si fuesemos a crear estos objetos por aparte, tendríamos que buscar una forma de que las variantes de cada postre se relacionen con las variantes de las demás postres, además cuando fuésemos a actualizar nuestra "tienda" se violaría el principio de open/close al editar esta clase cuando un objeto cambie.

### Solución:
Abstract Factory nos permite, siendo un patrón creacional, crear abstracciones de las familias de objetos, así como sus variantes que serían las "factories". De esta forma, creamos clases abstractas para cada tipo de postre y factories para las variaciones de cada postre. Así, cuando nuestro código cliente vaya a generar un pedido, este podrá completarse sin afectar como tal su código y con mayor facilidad para crear los postres de un solo tipo dependendiendo de la necesidad

