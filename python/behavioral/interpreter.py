from abc import ABC, abstractmethod


# AbstractExpression
class Expression(ABC):

    @abstractmethod
    def interpret(self, context):
        pass


# TerminalExpression
class Number(Expression):
    def __init__(self, number):
        self.number = number

    def interpret(self, context):
        return self.number


# NonTerminalExpression for addition
class Add(Expression):
    def __init__(self, left, right):
        self.left = left
        self.right = right

    def interpret(self, context):
        return self.left.interpret(context) + self.right.interpret(context)


# NonTerminalExpression for subtraction
class Subtract(Expression):
    def __init__(self, left, right):
        self.left = left
        self.right = right

    def interpret(self, context):
        return self.left.interpret(context) - self.right.interpret(context)


# Context (Stores global information needed for interpretation. In this simple example, it’s an empty class.)
class Context:
    def __init__(self):
        self.variables = {}


# Client
def main():
    # Example expression: (5 + 3) - (2 + 1)
    context = Context()

    # Building the syntax tree
    expr = Subtract(
        Add(Number(5), Number(3)),
        Add(Number(2), Number(1))
    )

    # Interpreting the expression
    result = expr.interpret(context)
    print(f"The result of the expression is: {result}")


if __name__ == "__main__":
    main()
