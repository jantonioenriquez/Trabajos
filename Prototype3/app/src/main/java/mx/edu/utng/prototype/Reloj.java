package mx.edu.utng.prototype;

/**
 * Created by Jose Antonio Enrique on 14/09/2016.
 */

public class Reloj implements Clonable {
        private String marca;
        private String color;

        public Reloj(){
            this.marca = "";
            this.color = "";
        }

        public Reloj(String marca, String color) {
            this.marca = marca;
            this.color = color;
        }

        @Override
        public Clonable clonar() {
            Reloj clon = new Reloj(marca, color);
            return clon;
        }

        public String getMarca() {
            return marca;
        }

        public void setMarca(String marca) {
            this.marca = marca;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

    }
