# Java School

A Java 21 project showcasing algorithms and data structures with hands-on implementations.

## Prerequisites

- **Java 21**
- **Maven 3.6+**

## Project Structure

```
java-school/
├── pom.xml
├── README.md
└── src/
    ├── main/java/
    │   ├── com/example/
    │   │   └── Main.java              # Application entry point
    │   └── com/backto/school/
    │       ├── algo/sorting/          # Sorting algorithms
    │       │   └── QuickSortAlgo.java
    │       └── datastructure/         # Data structures
    │           ├── FixedSizeQueue.java
    │           ├── FixedSizeStack.java
    │           └── SinglyLinkedList.java
    └── test/java/
        └── com/backto/school/
            ├── algo/sorting/
            │   └── QuickSortAlgoTest.java
            └── datastructure/
                └── SinglyLinkedListTest.java
```

## Build & Run

```bash
# Compile
mvn compile

# Run the application
mvn exec:java

# Run all tests
mvn test

# Package as JAR
mvn clean package
```

## What's Included

| Module | Description |
|--------|-------------|
| **QuickSortAlgo** | In-place quicksort implementation |
| **SinglyLinkedList** | Linked list with add, addFirst, addLast, remove, get |
| **FixedSizeStack** | Fixed-capacity stack |
| **FixedSizeQueue** | Fixed-capacity queue |

## License

MIT
