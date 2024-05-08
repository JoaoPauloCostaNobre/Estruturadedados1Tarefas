import java.util.Scanner;
import java.util.Stack;

public class CalculatorWithMenu {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Escolha uma operação:");
            System.out.println("1. Avaliar expressão infixa");
            System.out.println("2. Converter expressão infixa para pós-fixa e pré-fixa");
            System.out.println("3. Converter expressão pós-fixa para infixa e pré-fixa");
            System.out.println("4. Converter expressão pré-fixa para infixa e pós-fixa");
            System.out.println("5. Sair");
            System.out.print("Opção: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha
            
            switch (choice) {
                case 1:
                    evaluateInfixExpression(scanner);
                    break;
                case 2:
                    infixToPostfixAndPrefixConversion(scanner);
                    break;
                case 3:
                    postfixToInfixAndPrefixConversion(scanner);
                    break;
                case 4:
                    prefixToInfixAndPostfixConversion(scanner);
                    break;
                case 5:
                    System.out.println("Encerrando o programa.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
    
    // Método para avaliar uma expressão infixa
    public static void evaluateInfixExpression(Scanner scanner) {
        System.out.print("Digite a expressão infixa: ");
        String infix = scanner.nextLine();
        
        String postfix = infixToPostfix(infix);
        System.out.println("Expressão pós-fixa: " + postfix);
        
        String prefix = infixToPrefix(infix);
        System.out.println("Expressão pré-fixa: " + prefix);
        
        double result = evaluateExpression(infix);
        System.out.println("Resultado: " + result);
    }
    
    // Método para converter uma expressão infixa para pós-fixa e pré-fixa
    public static void infixToPostfixAndPrefixConversion(Scanner scanner) {
        System.out.print("Digite a expressão infixa: ");
        String infix = scanner.nextLine();
        
        String postfix = infixToPostfix(infix);
        System.out.println("Expressão pós-fixa: " + postfix);
        
        String prefix = infixToPrefix(infix);
        System.out.println("Expressão pré-fixa: " + prefix);
    }
    
    // Método para converter uma expressão pós-fixa para infixa e pré-fixa
    public static void postfixToInfixAndPrefixConversion(Scanner scanner) {
        System.out.print("Digite a expressão pós-fixa: ");
        String postfix = scanner.nextLine();
        
        String infix = postfixToInfix(postfix);
        System.out.println("Expressão infixa: " + infix);
        
        String prefix = postfixToPrefix(postfix);
        System.out.println("Expressão pré-fixa: " + prefix);
        
        double result = evaluateExpression(infix);
        System.out.println("Resultado: " + result);
    }
    
    // Método para converter uma expressão pré-fixa para infixa e pós-fixa
    public static void prefixToInfixAndPostfixConversion(Scanner scanner) {
        System.out.print("Digite a expressão pré-fixa: ");
        String prefix = scanner.nextLine();
        
        String infix = prefixToInfix(prefix);
        System.out.println("Expressão infixa: " + infix);
        
        String postfix = prefixToPostfix(prefix);
        System.out.println("Expressão pós-fixa: " + postfix);
        
        double result = evaluateExpression(infix);
        System.out.println("Resultado: " + result);
    }
    
    // Método para avaliar uma expressão infixa
    public static double evaluateExpression(String expression) {
        String postfix = infixToPostfix(expression);
        Stack<Double> stack = new Stack<>();
        
        for (int i = 0; i < postfix.length(); i++) {
            char c = postfix.charAt(i);
            
            if (Character.isDigit(c)) {
                stack.push((double)(c - '0'));
            } else {
                double operand2 = stack.pop();
                double operand1 = stack.pop();
                
                switch (c) {
                    case '+':
                        stack.push(operand1 + operand2);
                        break;
                    case '-':
                        stack.push(operand1 - operand2);
                        break;
                    case '*':
                        stack.push(operand1 * operand2);
                        break;
                    case '/':
                        stack.push(operand1 / operand2);
                        break;
                }
            }
        }
        
        return stack.pop();
    }
    
    // Método para converter uma expressão infixa para pós-fixa
    public static String infixToPostfix(String infix) {
        StringBuilder postfix = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < infix.length(); i++) {
            char c = infix.charAt(i);
            
            if (Character.isDigit(c)) {
                postfix.append(c);
            } else if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfix.append(stack.pop());
                }
                stack.pop(); // Remover '(' da pilha
            } else {
                while (!stack.isEmpty() && precedence(stack.peek()) >= precedence(c)) {
                    postfix.append(stack.pop());
                }
                stack.push(c);
            }
        }
        
        while (!stack.isEmpty()) {
            postfix.append(stack.pop());
        }
        
        return postfix.toString();
    }
    
    // Método para converter uma expressão pós-fixa para infixa
    public static String postfixToInfix(String postfix) {
        Stack<String> stack = new Stack<>();
        
        for (int i = 0; i < postfix.length(); i++) {
            char c = postfix.charAt(i);
            
            if (Character.isDigit(c)) {
                stack.push(String.valueOf(c));
            } else {
                String operand2 = stack.pop();
                String operand1 = stack.pop();
                String newOperand = "(" + operand1 + c + operand2 + ")";
                stack.push(newOperand);
            }
        }
        
        return stack.pop();
    }
    
    // Método para converter uma expressão infixa para pré-fixa
    public static String infixToPrefix(String infix) {
        StringBuilder prefix = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        String reversedInfix = new StringBuilder(infix).reverse().toString();
        
        for (int i = 0; i < reversedInfix.length(); i++) {
            char c = reversedInfix.charAt(i);
            
            if (Character.isDigit(c)) {
                prefix.append(c);
            } else if (c == ')') {
                stack.push(c);
            } else if (c == '(') {
                while (!stack.isEmpty() && stack.peek() != ')') {
                    prefix.append(stack.pop());
                }
                stack.pop(); // Remover ')' da pilha
            } else {
                while (!stack.isEmpty() && precedence(stack.peek()) > precedence(c)) {
                    prefix.append(stack.pop());
                }
                stack.push(c);
            }
        }
        
        while (!stack.isEmpty()) {
            prefix.append(stack.pop());
        }
        
        return prefix.reverse().toString();
    }
    
    // Método para converter uma expressão pós-fixa para pré-fixa
    public static String postfixToPrefix(String postfix) {
        Stack<String> stack = new Stack<>();
        
        for (int i = 0; i < postfix.length(); i++) {
            char c = postfix.charAt(i);
            
            if (Character.isDigit(c)) {
                stack.push(String.valueOf(c));
            } else {
                String operand2 = stack.pop();
                String operand1 = stack.pop();
                String newOperand = c + operand1 + operand2;
                stack.push(newOperand);
            }
        }
        
        return stack.pop();
    }
    
    // Método para converter uma expressão pré-fixa para infixa
    public static String prefixToInfix(String prefix) {
        Stack<String> stack = new Stack<>();
        
        for (int i = prefix.length() - 1; i >= 0; i--) {
            char c = prefix.charAt(i);
            
            if (Character.isDigit(c)) {
                stack.push(String.valueOf(c));
            } else {
                String operand1 = stack.pop();
                String operand2 = stack.pop();
                String newOperand = "(" + operand1 + c + operand2 + ")";
                stack.push(newOperand);
            }
        }
        
        return stack.pop();
    }
    
    // Método para converter uma expressão pré-fixa para pós-fixa
    public static String prefixToPostfix(String prefix) {
        Stack<String> stack = new Stack<>();
        
        for (int i = prefix.length() - 1; i >= 0; i--) {
            char c = prefix.charAt(i);
            
            if (Character.isDigit(c)) {
                stack.push(String.valueOf(c));
            } else {
                String operand1 = stack.pop();
                String operand2 = stack.pop();
                String newOperand = operand1 + operand2 + c;
                stack.push(newOperand);
            }
        }
        
        return stack.pop();
    }
    
    // Método para definir a precedência dos operadores
    public static int precedence(char operator) {
        switch (operator) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            default:
                return 0;
        }
    }
}
