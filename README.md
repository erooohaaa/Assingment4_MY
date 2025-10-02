# Bridge Pattern Implementation - Vehicle & Engine System

## Overview
This project demonstrates the **Bridge Design Pattern** using a vehicle and engine system.  
It shows how to separate **abstraction** (vehicles) from **implementation** (engines) to create a flexible and extensible architecture.

## Project Architecture

src/
├── engines/ # Implementations Layer
│ ├── Engine.java # Engine interface
│ ├── GasolineEngine.java # Gasoline engine implementation
│ ├── DieselEngine.java # Diesel engine implementation
│ └── ElectricEngine.java # Electric engine implementation
├── vehicles/ # Abstractions Layer
│ ├── Vehicle.java # Abstract vehicle class
│ ├── Car.java # Car implementation
│ ├── Truck.java # Truck implementation
│ └── Bike.java # Bike implementation
└── Main.java # Demo class
## Implemented Components

### Vehicles (Abstractions)
- **Vehicle** – abstract base class for all vehicles  
- **Car** – passenger car implementation  
- **Truck** – truck implementation  
- **Bike** – motorcycle implementation  

### Engines (Implementations)
- **Engine** – engine interface  
- **GasolineEngine** – gasoline engine implementation 🚗  
- **DieselEngine** – diesel engine implementation 🚚  
- **ElectricEngine** – electric engine implementation ⚡  

## Bridge Pattern in Action
The **Bridge Pattern** separates two independent hierarchies:

**Abstraction (Vehicle)**
**Implementation (Engine)**
