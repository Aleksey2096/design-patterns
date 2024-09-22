from abc import ABC, abstractmethod


# Product class to be filtered
class Product:
    def __init__(self, name: str, color: str, category: str, price: float):
        self.name = name
        self.color = color
        self.category = category
        self.price = price


# Specification interface (abstract class)
class Specification(ABC):
    @abstractmethod
    def is_satisfied(self, item: Product) -> bool:
        pass

    # Composite specifications
    def __and__(self, other):
        return AndSpecification(self, other)

    def __or__(self, other):
        return OrSpecification(self, other)

    def __not__(self):
        return NotSpecification(self)


# Concrete specifications


class ColorSpecification(Specification):
    def __init__(self, color: str):
        self.color = color

    def is_satisfied(self, item: Product) -> bool:
        return item.color == self.color


class CategorySpecification(Specification):
    def __init__(self, category: str):
        self.category = category

    def is_satisfied(self, item: Product) -> bool:
        return item.category == self.category


class PriceSpecification(Specification):
    def __init__(self, max_price: float):
        self.max_price = max_price

    def is_satisfied(self, item: Product) -> bool:
        return item.price <= self.max_price


# Composite specification (AND)
class AndSpecification(Specification):
    def __init__(self, spec1: Specification, spec2: Specification):
        self.spec1 = spec1
        self.spec2 = spec2

    def is_satisfied(self, item: Product) -> bool:
        return self.spec1.is_satisfied(item) and self.spec2.is_satisfied(item)


# Composite specification (OR)
class OrSpecification(Specification):
    def __init__(self, spec1: Specification, spec2: Specification):
        self.spec1 = spec1
        self.spec2 = spec2

    def is_satisfied(self, item: Product) -> bool:
        return self.spec1.is_satisfied(item) or self.spec2.is_satisfied(item)


# Composite specification (NOT)
class NotSpecification(Specification):
    def __init__(self, spec: Specification):
        self.spec = spec

    def is_satisfied(self, item: Product) -> bool:
        return not self.spec.is_satisfied(item)


# Client code
if __name__ == "__main__":
    # Sample products
    products = [
        Product("Laptop", "Silver", "Electronics", 1500),
        Product("Smartphone", "Black", "Electronics", 800),
        Product("T-shirt", "Red", "Clothing", 20),
        Product("Sneakers", "White", "Clothing", 60)
    ]

    # Specifications
    color_spec = ColorSpecification("Silver")
    category_spec = CategorySpecification("Clothing")
    price_spec = PriceSpecification(61)

    # Composite specifications (Clothing and price <= 61)
    spec = category_spec & price_spec

    # Filter products based on the specification
    filtered_products = [p for p in products if spec.is_satisfied(p)]

    for p in filtered_products:
        print(f"Product: {p.name}, Color: {p.color}, Category: {p.category}, Price: {p.price}")
