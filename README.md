# DESIGN-PATTERNS

## COMPORTAMIENTO (Strategy)
### Problemática:
Para ese patrón de diseño, se encontró un escenario en una tienda de malteadas donde cierta cantidad de clientes se encontraban descontentos debido a que únicamente se realizaban las malteadas a base de leche entera y no se tenía en cuenta las diferentes preferencias de los demás consumidores. Sin embargo, los trabajadores de la tienda se les dificultaba mantener una organización a la hora de tomar los pedidos generando confusiones al momento de realizar dichas malteadas debido a que debían tener en cuenta otras solicitudes por parte de los clientes. 

### Solución: 
Generar un programa donde el usuario tenga la capacidad de elegir entre cómo realizar su malteada según sus preferencias entre si realizarla con leche entera, leche de almendras o simplemente a base de agua. Con lo antes mencionado, se estarían tomando en cuenta diferentes alternativas para cada cliente que entre a la tienda. Además, de incrementar la eficiencia por parte de los trabajadores al tener mayor control y organización en sus pedidos. 

## ESTRUCTURAL (Decorate)
### Problemática


## CREACIONAL (Abstract Factory)
### Problemática:
Para este patrón, se encuentran varias familias de objetos, cada uno con una variedad de categorías. Si fuesemos a crear estos objetos por aparte, tendríamos que buscar una forma de que las variantes de cada familia se relaciones con las variantes de las demás familias, además cuando fuésemos a actualizar nuestras clases se violaría el principio de open/close ya que si cambian las familias cambiaría la clase donde se estén utilizando los objetos.

### Solución:
Abstract Factory nos permite, siendo un patrón creacional, crear abstracciones de las familias de objetos, así como sus variantes que serían las "factories". De esta forma, cambiar atributos de cada familia o agregar variantes no afecta a otras clases aparte de los objetos creados. El código "cliente" utiliza tanto las familias de objetos como las factories de cada variante, y así podemos escoger que familia o factory le pasamos al cliente sin afectar como tal su código.
