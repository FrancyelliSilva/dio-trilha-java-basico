public class Calculadora {
    
            public double add(double num1, double num2) {
                return num1 + num2;
            }
        
            public double subtract(double num1, double num2) {
                return num1 - num2;
            }
        
            public double multiply(double num1, double num2) {
                return num1 * num2;
            }
        
            public double divide(double num1, double num2) {
                if (num2 == 0) {
                    throw new IllegalArgumentException("Cannot divide by zero!");
                }
                return num1 / num2;
            }
        
            public static void main(String[] args) {
                Calculadora calculator = new Calculadora();
        
                // Exemplo de uso
                double num1 = 10;
                double num2 = 5;
                
                System.out.println(" ");
                System.out.println("Adição: " + calculator.add(num1, num2));
                System.out.println("Subtração: " + calculator.subtract(num1, num2));
                System.out.println("Multiplicação: " + calculator.multiply(num1, num2));
                System.out.println("Divisão: " + calculator.divide(num1, num2));
            }
        }
        
    

