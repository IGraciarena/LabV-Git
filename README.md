# LabV-Git

TP Cerveceria :
  Se necesita solo 1 consumidor para que el stock llegue a 0, mientras se implemente adecuadamente, se le puede dar forma de distintos clientes al mismo consumidor.
  Los bloques deben ser synchronized para que no acceda mas de un proceso a la vez ya que los hilos comparten su memoria. Si no se encuentra gestionado el acceso se pueden perder datos durante la sobreescritura. 
  El recurso compartido el que tienen acceso los distintos hilos que tengamos ejecutandose, ya que los hilos comparten la misma memoria.
  Se puede instanciar un Thread de las siguientes formas:
    1-Extendiendo de la clase Thread. 
    2-Mediante la imprementación de la Interfaz Runnable que tiene los mismos metodos que la clase Thread. 
    3-Creando un objeto Thread (Thread t = new Thread();)
