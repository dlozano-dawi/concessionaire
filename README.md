Se va a crear un proyecto sobre un concesionario que vende distintos tipos de vehiculos.  
El conesionario pide poder dividir estos tipos de vehiculos en distintas clases, 
también pide poder almacenarlos en listas para cada tipo.  


### Se dividirá en:

#### Una clase abstracta de vehiculos y una clase abstracta para cada grupo de vehiculos (coches y motos)
#### La clase abstracta de vehiculos tendrá
- Arrancar
- Apagar
- Marca
- Modelo
#### La clase abstracta de coches tendrá
- Caballos
#### Las clases que extenderán esta serán:
- Coches
  - Puertas
  - Categoria (Coupé, Sedan, etc...)
  - KMs
- F1
  - Carreras ganadas
  - Mundiales ganados
  - Velocidad punta
#### La clase abstracta de motos tendrá
- Cilindrada
- Categoria (Scooter, etc...)
- Ruedas
- KMs
#### Las clases que extenderán esta serán:
- Motos
  - Caballos
- Motocicleta
