# Property-Based Testing


The tutorial covers **property-based testing** with [jqwik](https://jqwik.net/) and **design by contract** with Java `assert`s.

## Contents

| Class | What it shows | Tests |
|---|---|---|
| `PassingGrade` | Checks whether a grade (1–10) passes | `PassingGradePBTest` |
| `Triangle` | Checks whether three sides make a valid triangle | `TriangleTest` |
| `ArrayUtils` | `indexOf` with a start index | `ArrayUtilsTest` |
| `MathArrays` | `unique` returns distinct values, sorted descending | `MathArraysPBTest` |
| `Basket` / `Product` | Shopping basket with pre/postconditions and an invariant | `BasketTest`, `BasketPBTest` |
| `BasketSkeleton` | `Basket` with the contracts only, as an exercise | – |
| `Book` | Simple value class | `BookTest` |

## Requirements

- Java 11+
- Maven 3

## Running the tests

```bash
mvn test
```

Surefire is set up with `enableAssertions`, so the `assert` contracts in `Basket` are checked during tests.

## Dependencies

- JUnit 5.6 (Jupiter + params)
- jqwik 1.5.3
- AssertJ 3.15
