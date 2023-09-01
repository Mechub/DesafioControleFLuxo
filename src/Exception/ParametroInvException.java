
package Exception;

class ParametroInvException extends Exception {
    public ParametroInvException(String message) {
        super(message);
    }
}

class Contador {
    public static void contar(int parametroUm, int parametroDois) throws ParametroInvException {
        if (parametroUm >= parametroDois) {
            throw new ParametroInvException("O segundo parâmetro deve ser maior que o primeiro!");
        }

        for (int i = parametroUm; i <= parametroDois; i++) {
            System.out.println("Imprimindo o número: " + i);
        } 
    }
}