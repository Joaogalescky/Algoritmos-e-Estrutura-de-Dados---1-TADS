import java.util.HashMap;

/*Links úteis:
https://www.devmedia.com.br/hashmap-java-trabalhando-com-listas-key-value/29811
https://pt.stackoverflow.com/questions/96603/como-utilizar-hashmap-nesse-caso
https://cursos.alura.com.br/forum/topico-quando-utilizar-map-hashmap-71011
*/

class aula_23_10_2023{
    public static void main(String [] args){
        HashMap<String, String> capitais = new HashMap<String, String>();

        capitais.put("Paraná", "Curitiba");
        capitais.put("Santa Catarina", "Florianopólis");
        capitais.put("Rio Grande do Sul", "Porto Alegre");
        capitais.put("Rio de Janeiro", "Rio de Janeiro");
        capitais.put("Amazonas", "Manaus");
        capitais.put("Goiás", "Goiânia");
        capitais.put("Amapá", "Macapá");
        capitais.put("Mato Grosso", "Cuiabá");
        capitais.put("Mato Grosso do Sul", "Campo Grande");
        capitais.put("Roraima", "Boa Vista");
        capitais.put("Rondônia", "Porto Velho");

        // System.out.println(capitais.get("Santa Catarina"));

        for(String i : capitais.keySet()){
            System.out.println(i + ": " + capitais.get(i));
        }
    }
}