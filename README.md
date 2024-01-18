# ⛵ MAKAI Boat Rental System ⚓

The MAKAI company specializes in the rental of boats and requires a system to manage them. Each boat must have a captain with the following details: name, surname, and navigation license. A constructor is provided to assign these attributes when creating the captain object.

In addition to having an associated captain, a boat has a base price, an additional value, a year of manufacture, and the length in meters known as "eslora."

There are two variations of boats rented by MAKAI. Both have the aforementioned characteristics, but each has additional features. Sailboats have the number of masts, and yachts have the number of cabins.

## Features 🚤

### Calculate Rental Amount 🌐
Given any boat, the system allows the calculation of the rental amount. The rental amount is the base value, and if the year of manufacture is greater than 2020, an additional value of 20,000 is added.

### Purchase Yachts 💰
For yachts, the system provides the ability to purchase them. A yacht is considered more luxurious if it has more than 7 cabins.

### Evaluate Sailboats ⛵
It is essential to evaluate whether a sailboat is large. Large sails are those that exceed 4 masts.

# Parqueadero Project 🅿️

This is a simple Java project that simulates a parking system using matrices to represent parking spaces and follows the principles of object-oriented programming. It includes classes for Carro (Car) and Parqueadero (Parking Lot) with functionalities to park cars, calculate parking costs, and display the current parking lot status.

## Classes 🚗

### Carro (Car)
**Attributes:**
- `placa` (String): License plate of the car.
- `marca` (String): Brand of the car.
- `modelo` (String): Model of the car.

**Methods:**
- `Carro(placa, marca, modelo)`: Constructor to initialize the car object.

### Parqueadero (Parking Lot)
**Attributes:**
- `espacios` (Carro[][]): Matrix of Car objects representing parking spaces.
- `tarifaPorHora` (double): Hourly parking rate.

**Methods:**
- `Parqueadero(filas, columnas, tarifa)`: Constructor to initialize the parking lot with a fixed matrix size.
- `parquearCarro(carro, fila, columna)`: Parks a car at a specific position in the matrix. Returns true if successful, false if the space is occupied or out of bounds.
- `cobrarPorTiempo(carro, horas)`: Calculates and returns the parking cost for the given car and duration.
- `mostrarEstadoParqueadero()`: Displays the current status of the parking lot, indicating occupied spaces with "X" and empty spaces with a blank.

## Usage 🚦

1. Create an instance of the Parqueadero class.
2. Create several instances of the Carro class with different license plates, brands, and models.
3. Park some cars in different positions of the parking lot, checking if the parking was successful.
4. Attempt to park a car in an already occupied space and display the corresponding message.
5. Calculate the parking cost for some cars and display the result.
6. Display the current status of the parking lot after performing some operations.

Feel free to customize and expand this project based on your specific requirements and use case. If you have any questions or suggestions, please feel free to open an issue or contribute to the project. Happy sailing with MAKAI! ⛵🌊
