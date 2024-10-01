import java.util.Queue;
import java.util.ArrayDeque;

public class EjecutarColas {
    public static void main(String[] args) {        
        //Colas con la clase Dequeue
        Queue<String> persona = new ArrayDeque<>();
        System.out.println(persona.isEmpty());

        persona.add("pipe");
        persona.add("peter");
        persona.add("checho");

        System.out.println(persona); // pipe, peter, checho
        System.out.println(persona.peek()); // pipe
        System.out.println(persona.isEmpty());//false
        //Eliminar el primer elimento
        System.out.println(persona.poll());//pipe

        System.out.println(persona); // pipe, peter, checho
    }
}