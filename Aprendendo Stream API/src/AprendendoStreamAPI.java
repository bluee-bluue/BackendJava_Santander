import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.stream.Stream;

class AprendendoStreamAPI {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        
        //consumer_lambda_stream(numeros);
        //supplier_lambda_stream(numeros);
        //function_lambda_stream(numeros);
        //predicate_lambda_stream(numeros);
        binaryOperator_lambda_stream(numeros);
    }
    
    public static void consumer_lambda_stream(List<Integer> numeros) {
        /*
         * Representa uma operação que aceita um argumento do tipo T e não retorna nenhum resultado.
         * É utilizada principalmente para realizar ações ou efeitos colaterais nos elementos do Stream
         * sem modificar, ou retornar um valor.
         */

        // imprimindo números
        // consumer com lambda
        Consumer<Integer> numeroPar = numero -> {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
        };

        numeros.forEach(numeroPar);
    
        // consumer com stream
        numeros.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer n) {
                if (n % 2 == 0) {
                    System.out.println(n);
                }
            }
        });
    
        // consumer com stream e lambda
        numeros.forEach(n ->  {
                if (n % 2 == 0) {
                    System.out.println(n);
                }
            }
        );
    }

    public static void supplier_lambda_stream(List<Integer> numeros) {
        /*
         * Representa uma operação que não aceita nenhum argumento e retorna um resultado do tipo T.
         * É utilizada para criar ou fornecer novos objetos de determinado tipo.
         */

        // saudação personalizada
        // supplier com lambda
        Supplier<String> saudacao = () -> "Olá, seja bem-vindo!";

        // supplier para obter lista com 5 saudações
        List<String> listaSudacoes = Stream.generate(saudacao).limit(5).toList();

        // imprimindo com method reference
        listaSudacoes.forEach(System.out::println);
        /*
         * sem method reference
         * listaSudacoes.forEach(n -> System.out.println(n));
         */
    }

    public static void function_lambda_stream(List<Integer> numeros) {
        /*
         * Representa uma função que aceita um argumento do tipo T e retorna um resultado do tipo R.
         * É utilizada para transformar ou mapear os elementos do Stream e outros valores ou tipos.
         */

         // lista de números inteiros
         List<Integer> numerosInt = Arrays.asList(1, 2, 3, 4, 5);

         // com lambda para dobrar todos os números
         Function<Integer, Integer> dobrar = numero -> numero * 2;

         // dobrar todos os números no Stream e armazená-los em outra lista
         List<Integer> numerosDobrados = numerosInt.stream().map(dobrar).toList();

         // imprimindo
         numerosDobrados.forEach(System.out::println);
         /*
         * sem method reference
         * numerosDobrados.forEach(n -> System.out.println(n));
         */
    }

    public static void predicate_lambda_stream(List<Integer> numeros) {
        /*
         * Representa uma função que aceita um argumento do tipo T e retorna um valor boolean (true ou false).
         * É usada para filtrar os elementos do Stream com base em alguma condição.
         */

        // lista de palavras
        List<String> palavras = Arrays.asList("java", "kotlin", "python", "javascript", "c#", "go", "ruby");

        // verifica se a palavra tem mais de 5 caracteres
        Predicate<String> maisDeCinco = palavra -> palavra.length() > 5;

        // verifica se a palavra tem mais de 5 caracteres e, em seguida, imprimir cada palavra
        palavras.stream().filter(maisDeCinco).forEach(System.out::println);
    }

    public static void binaryOperator_lambda_stream(List<Integer> numeros) {
        /*
         * Representa uma operação que combina dois argumentos do tipo T e retorna um resultado do mesmo tipo T.
         * É usada para realizar operações de redução em pares de elementos, como somar números ou combinar objetos.
         */

        // com lambda para somar dois números inteiros
        // BinaryOperator<Integer> somar = (num1, num2) -> num1 + num2;
        // BinaryOperator<Integer> somar = Integer::sum;

        // somar todos os números no Stream
        // int resultado = numeros.stream().reduce(0, soma);
        int resultado = numeros.stream().reduce(0, Integer::sum);

        // imprimindo o resultado
        System.out.println("A soma dos números é: " + resultado);
    }
}