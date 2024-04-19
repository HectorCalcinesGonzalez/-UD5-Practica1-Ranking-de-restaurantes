# -UD5-Practica1-Ranking-de-restaurantes

En la clase menu creamos un metodo "mostarMenu en el cual crearemos el menu para despues poder mostrarlo en la clase ejecutable"

![alt](images\Menu.png)

En la clase restaurante creamos varias cosas primero creamos las variables necesarias para poder trabajar con nuestro proyecto las cuales son: nombre, localización, horario y puntuación, indicando su estado que es privado y el tipo de dato.
A continuación creamos el constructor de estos atributos para asi poder crear los getters y los setter.

![alt](images\Restaurante.png)

![alt text](images\getter-setters.png)

Aquí concluyen los getter y los setters y podemos apreciar el metodo @override con el toString que nos sirve para poder mostrar nuestros restaurantes de la estructura que nosotros coloquemos

![alt text](images\toString.png)

En la clase GestorRestaurantes es donde crearemos los metodos pa añadir, eliminar, editar y mostrar los Restaurantes.
En esta clase creamos el arrayList que va a guardar todos los restaurantes.
En el primer metodo añadir para que añada el nuevo restaurante usamos un .add en la lista para introducir el nuevo restaurante.
En el segundo metodo eliminar lo mismo pero con remove para eliminar el restaurante que seleccionemos según el indice introducido.
En el tercer metodo mostrar usamos un fori para que si la i se encuentra dentro de la longitud del arrayList muestre cada restaurante que hay dentro de la lista con sus datos debido al toSString todo esto como mensaje informativo en el panel.

![alt text](images\Gestor1.png)

En el metodo editar primero pide que restaurante quieres editar indicando el indice, si esta entre 0 y el max rango del arraylist entonces cambiara cada dato del array segun lo que pongas y mostrara un mensaje de que se ha realizado con exito y si no esta entre los parametros de la lista saldra un mensaje de error.

![alt text](images\gestor2.png)

Empezando por la app creamos el main para que se pueda ejecutar, creamos un booleano que nos va a servir para que el programa se repita hasta que este se convierta en false, creamos un String llamado opcion para poder marcar la elección y creamos el while con dicho menu para que cada vez que se repita el proceso el menu aparezca continuamente.

![alt text](images\app1.png)

Como la primera opción es añadir un restaurante pues igualamos las variables a lo que responda el usuario por los JOptionPane en todos los casos, establecemos el tamañano de la puntuación del 1 al 10 y por ultimo llamamos al metodo para que se guarden los datos adquiridos

![alt text](images\app2.png)

En estos 3 metodos es mas de lo mismo en el 2 y 4, pregunta por el indice el cual iguala a la respuesta del usuario para borrar o editar los restaurantes, en el 2 igualamos los nuevos atributos para el nuevo restaurante que edita, en mostrar solo llamamos al metodo y el cuaro pide el indice y lo busca en la lista para poder borrarlo y por ultimo la Q para salir que cambia el atributo seguir a false por lo tanto se cierra el programa

![alt text](images\app3.png)

Y por ultimo tenemos las excepciones: la primera sirve para que solo se pueda salir del programa con la letra Q por lo tanto si pulsas cancel saldra el mensaje correspondiente, el segundo sirve para que en la puntuación no pueda poner otra cosa que numeros ya que si escribe letras por ejemplo saldra el siguiente texto y el ultimo sirve tanto para cuando escribes un String en un int por ejemplo como si lo dejas vacio saliendo su correspondiente mensaje

![alt text](images\app4.png)
